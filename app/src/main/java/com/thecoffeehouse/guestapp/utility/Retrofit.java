package com.thecoffeehouse.guestapp.utility;

import android.app.Activity;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.Scopes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.services.api.model.authen.RefreshTokenResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.utils.AnnotateTypeAdapterFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.json.JSONObject;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001f\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0003J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/Retrofit;", "", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "baseUrl", "", "(Lcom/thecoffeehouse/guestapp/TCHApplication;Ljava/lang/String;)V", "mInstance", "Lretrofit2/Retrofit;", "mSecondTimeUnit", "Ljava/util/concurrent/TimeUnit;", "mTotalRequestTimeOutSecond", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "addPersonalInfoHeader", "Lorg/json/JSONObject;", Scopes.PROFILE, "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "createService", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "defaultHeaderInterceptor", "Lokhttp3/Interceptor;", "initRetrofit", "context", "Landroid/content/Context;", "unzippingInterceptor", "Companion", "TokenAuthenticator", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Retrofit.kt */
public final class Retrofit {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final Companion Companion = new Companion(null);
    private final TCHApplication application;
    private final String baseUrl;
    private retrofit2.Retrofit mInstance;
    private final TimeUnit mSecondTimeUnit = TimeUnit.SECONDS;
    private final long mTotalRequestTimeOutSecond = 20;
    private OkHttpClient okHttpClient;

    public Retrofit(TCHApplication tCHApplication, String str) {
        Intrinsics.checkNotNullParameter(tCHApplication, "application");
        Intrinsics.checkNotNullParameter(str, "baseUrl");
        this.application = tCHApplication;
        this.baseUrl = str;
        this.mInstance = initRetrofit(tCHApplication);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/Retrofit$Companion;", "", "()V", "AUTHORIZATION_HEADER", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: Retrofit.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final <T> T createService(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        return (T) this.mInstance.create(cls);
    }

    private final Interceptor defaultHeaderInterceptor() {
        return new Retrofit$defaultHeaderInterceptor$1(this);
    }

    /* access modifiers changed from: private */
    public final JSONObject addPersonalInfoHeader(Profile profile) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("first_name", StringExtsKt.toStringOrEmpty(profile.getFirstName()));
        jSONObject.put("last_name", StringExtsKt.toStringOrEmpty(profile.getLastName()));
        return jSONObject;
    }

    private final retrofit2.Retrofit initRetrofit(Context context) {
        this.okHttpClient = new OkHttpClient.Builder().retryOnConnectionFailure(true).callTimeout(this.mTotalRequestTimeOutSecond, this.mSecondTimeUnit).connectTimeout(this.mTotalRequestTimeOutSecond, this.mSecondTimeUnit).readTimeout(this.mTotalRequestTimeOutSecond, this.mSecondTimeUnit).writeTimeout(this.mTotalRequestTimeOutSecond, this.mSecondTimeUnit).addInterceptor(defaultHeaderInterceptor()).authenticator(new TokenAuthenticator()).addInterceptor(unzippingInterceptor()).build();
        Gson create = new GsonBuilder().registerTypeAdapterFactory(new AnnotateTypeAdapterFactory()).create();
        Retrofit.Builder baseUrl2 = new Retrofit.Builder().baseUrl(this.baseUrl);
        OkHttpClient okHttpClient2 = this.okHttpClient;
        if (okHttpClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("okHttpClient");
        }
        retrofit2.Retrofit build = baseUrl2.client(okHttpClient2).addConverterFactory(GsonConverterFactory.create(create)).addCallAdapterFactory(new LiveDataCallAdapterFactory()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Retrofit.Builder()\n     …y())\n            .build()");
        return build;
    }

    private final Interceptor unzippingInterceptor() {
        return new Retrofit$unzippingInterceptor$1();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/Retrofit$TokenAuthenticator;", "Lokhttp3/Authenticator;", "(Lcom/thecoffeehouse/guestapp/utility/Retrofit;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: Retrofit.kt */
    public final class TokenAuthenticator implements Authenticator {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TokenAuthenticator() {
        }

        @Override // okhttp3.Authenticator
        public Request authenticate(Route route, Response response) {
            String token;
            String token2;
            Intrinsics.checkNotNullParameter(response, "response");
            GeneralKt.log("authenticate: " + response);
            Profile userProfile = Retrofit.this.application.requireClientManager().getUserProfile();
            if (!(userProfile == null || (token = userProfile.getToken()) == null)) {
                GeneralKt.log("oldToken: " + token);
                try {
                    retrofit2.Response<RefreshTokenResponse> execute = Retrofit.this.application.requireClientManager().getUserAPIService().getAuthenticationService().refreshToken("Bearer " + token).execute();
                    Intrinsics.checkNotNullExpressionValue(execute, "refreshTokenResponse");
                    if (execute.isSuccessful()) {
                        RefreshTokenResponse body = execute.body();
                        if (body == null || (token2 = body.getToken()) == null) {
                            return null;
                        }
                        GeneralKt.log("newToken: " + token2);
                        Retrofit.this.application.requireClientManager().setNewToken(token2);
                        return response.request().newBuilder().build();
                    }
                    Activity currentActivity = Retrofit.this.application.getCurrentActivity();
                    if (currentActivity != null) {
                        ContextExtsKt.logout(currentActivity, true);
                    }
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                    GeneralKt.log(Unit.INSTANCE);
                }
            }
            return null;
        }
    }
}
