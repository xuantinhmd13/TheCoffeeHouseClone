package com.thecoffeehouse.guestapp.utility;

import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.thecoffeehouse.guestapp.BuildConfig;
import com.thecoffeehouse.guestapp.configs.LocaleManager;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, k = 3, mv = {1, 4, 0})
/* compiled from: Retrofit.kt */
public final class Retrofit$defaultHeaderInterceptor$1 implements Interceptor {
    final /* synthetic */ Retrofit this$0;

    Retrofit$defaultHeaderInterceptor$1(Retrofit retrofit) {
        this.this$0 = retrofit;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        chain.request().url();
        if (chain.request().header(Retrofit.AUTHORIZATION_HEADER) == null) {
            Profile userProfile = this.this$0.application.requireClientManager().getUserProfile();
            String token = userProfile != null ? userProfile.getToken() : null;
            String str = token;
            if (!(str == null || str.length() == 0)) {
                newBuilder.header(Retrofit.AUTHORIZATION_HEADER, "Bearer " + token);
            }
        }
        String string = Settings.Secure.getString(this.this$0.application.getContentResolver(), "android_id");
        newBuilder.header("TCH-APP-VERSION", BuildConfig.VERSION_NAME);
        Intrinsics.checkNotNullExpressionValue(string, "androidHardwareId");
        newBuilder.header("TCH-DEVICE-ID", string);
        newBuilder.header(AbstractSpiCall.HEADER_USER_AGENT, StringsKt.replace$default(Build.MANUFACTURER + '_' + Build.MODEL, " ", "_", false, 4, (Object) null) + ";Android" + Build.VERSION.SDK_INT);
        String languageCode = LocaleManager.getLanguageCode(this.this$0.application);
        Intrinsics.checkNotNullExpressionValue(languageCode, "LocaleManager.getLanguageCode(application)");
        newBuilder.header("Accept-Language", languageCode);
        Profile userProfile2 = this.this$0.application.requireClientManager().getUserProfile();
        if (userProfile2 != null) {
            String jSONObject = this.this$0.addPersonalInfoHeader(userProfile2).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "addPersonalInfoHeader(it).toString()");
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(jSONObject, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = jSONObject.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            newBuilder.header("TCH-PERSONAL-INFO", Base64.encodeToString(bytes, 2).toString());
        }
        return chain.proceed(newBuilder.build());
    }
}
