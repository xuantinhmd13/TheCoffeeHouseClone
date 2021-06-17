package com.thecoffeehouse.guestapp.configs;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

public class LocaleManager {
    public static final String ENGLISH = "en";
    private static final String LANGUAGE_KEY = "language_key";
    public static final String VIETNAMESE = "vi";

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocaleDef {
        public static final String[] SUPPORTED_LOCALES = {"en", "vi"};
    }

    public static Context setLocale(Context context) {
        return updateResources(context, getLanguagePref(context));
    }

    public static Context setNewLocale(Context context, String str) {
        setLanguagePref(context, str);
        return updateResources(context, str);
    }

    private static String getLanguagePref(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(LANGUAGE_KEY, "vi");
    }

    public static String getLanguageCode(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(LANGUAGE_KEY, "vi");
    }

    private static void setLanguagePref(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(LANGUAGE_KEY, str).apply();
    }

    private static Context updateResources(Context context, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            Locale locale = new Locale(str);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration);
        }
        Locale.setDefault(new Locale(str));
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration2 = resources.getConfiguration();
        configuration2.locale = new Locale(str);
        resources.updateConfiguration(configuration2, displayMetrics);
        return context;
    }

    public static Locale getLocale(Resources resources) {
        Configuration configuration = resources.getConfiguration();
        return Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }
}
