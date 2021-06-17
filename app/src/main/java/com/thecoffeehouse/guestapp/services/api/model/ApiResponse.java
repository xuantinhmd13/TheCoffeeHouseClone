package com.thecoffeehouse.guestapp.services.api.model;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Companion", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiEmptyResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiSuccessResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiErrorResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ApiResponse.kt */
public abstract class ApiResponse<T> {
    public static final Companion Companion = new Companion(null);
    private static final ReadOnlyProperty application$delegate = new ApiResponse$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0001\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse$Companion;", "", "()V", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "getApplication", "()Lcom/thecoffeehouse/guestapp/TCHApplication;", "application$delegate", "Lkotlin/properties/ReadOnlyProperty;", "create", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiErrorResponse;", ExifInterface.GPS_DIRECTION_TRUE, "error", "", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "response", "Lretrofit2/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ApiResponse.kt */
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Companion.class, "application", "getApplication()Lcom/thecoffeehouse/guestapp/TCHApplication;", 0))};

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: kotlin.properties.ReadOnlyProperty */
        /* JADX WARN: Multi-variable type inference failed */
        private final TCHApplication getApplication() {
            return (TCHApplication) ApiResponse.application$delegate.getValue(ApiResponse.Companion, $$delegatedProperties[0]);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> ApiErrorResponse<T> create(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            Companion companion = this;
            String string = companion.getApplication().getString(R.string.str_error);
            String string2 = companion.getApplication().getString(R.string.str_error_socket_timeout);
            Intrinsics.checkNotNullExpressionValue(string2, "application.getString(R.…str_error_socket_timeout)");
            return new ApiErrorResponse<>(null, new ServerErrorResponse(new ServerError(string, string2)));
        }

        public final <T> ApiResponse<T> create(Response<T> response) {
            ServerErrorResponse serverErrorResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.isSuccessful()) {
                T body = response.body();
                if (body == null || response.code() == 204) {
                    return new ApiEmptyResponse();
                }
                return new ApiSuccessResponse(body, response.headers().get("link"));
            }
            ResponseBody errorBody = response.errorBody();
            try {
                serverErrorResponse = (ServerErrorResponse) new Gson().fromJson(errorBody != null ? errorBody.string() : null, (Class) ServerErrorResponse.class);
            } catch (Exception unused) {
                Companion companion = this;
                String string = companion.getApplication().getString(R.string.str_error);
                String string2 = companion.getApplication().getString(R.string.str_error_data);
                Intrinsics.checkNotNullExpressionValue(string2, "application.getString(R.string.str_error_data)");
                serverErrorResponse = new ServerErrorResponse(new ServerError(string, string2));
            }
            GeneralKt.log(serverErrorResponse);
            Integer valueOf = Integer.valueOf(response.code());
            if (serverErrorResponse == null) {
                Companion companion2 = this;
                String string3 = companion2.getApplication().getString(R.string.str_error);
                String string4 = companion2.getApplication().getString(R.string.str_error_socket_timeout);
                Intrinsics.checkNotNullExpressionValue(string4, "application.getString(R.…str_error_socket_timeout)");
                serverErrorResponse = new ServerErrorResponse(new ServerError(string3, string4));
            }
            return new ApiErrorResponse(valueOf, serverErrorResponse);
        }
    }

    private ApiResponse() {
    }

    public /* synthetic */ ApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
