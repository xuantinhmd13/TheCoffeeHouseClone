package com.thecoffeehouse.guestapp.utility;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ%\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\fJ$\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u000bJ\"\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bJ \u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004J&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bJ,\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ*\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ(\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/SharePrefs;", "", "()V", "getBoolean", "", "context", "Landroid/content/Context;", "filename", "", "key", "getInt", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "getString", "putBoolean", "", "fileName", "value", "putInt", "putString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SharePrefs.kt */
public final class SharePrefs {
    public static final SharePrefs INSTANCE = new SharePrefs();

    private SharePrefs() {
    }

    public final void putString(Context context, int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor edit = context.getSharedPreferences(context.getString(i), 0).edit();
        edit.putString(context.getString(i2), str);
        edit.apply();
    }

    public final void putString(Context context, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "key");
        SharedPreferences.Editor edit = context.getSharedPreferences(context.getString(i), 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final void putString(Context context, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(str2, "key");
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    public final void putInt(Context context, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(str2, "key");
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putInt(str2, i);
        edit.apply();
    }

    public final void putBoolean(Context context, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(str2, "key");
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, z);
        edit.apply();
    }

    public final String getString(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(context.getString(i), 0).getString(context.getString(i2), null);
    }

    public final String getString(Context context, int i, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "key");
        return context.getSharedPreferences(context.getString(i), 0).getString(str, null);
    }

    public final String getString(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "filename");
        Intrinsics.checkNotNullParameter(str2, "key");
        return context.getSharedPreferences(str, 0).getString(str2, null);
    }

    public final Integer getInt(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "filename");
        Intrinsics.checkNotNullParameter(str2, "key");
        return Integer.valueOf(context.getSharedPreferences(str, 0).getInt(str2, 0));
    }

    public final boolean getBoolean(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "filename");
        Intrinsics.checkNotNullParameter(str2, "key");
        return context.getSharedPreferences(str, 0).getBoolean(str2, false);
    }
}
