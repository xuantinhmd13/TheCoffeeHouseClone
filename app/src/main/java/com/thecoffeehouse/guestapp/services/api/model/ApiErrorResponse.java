package com.thecoffeehouse.guestapp.services.api.model;

import androidx.exifinterface.media.ExifInterface;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/ApiErrorResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "errorCode", "", "serverError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "(Ljava/lang/Integer;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServerError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;)Lcom/thecoffeehouse/guestapp/services/api/model/ApiErrorResponse;", "equals", "", "other", "", "hashCode", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ApiResponse.kt */
public final class ApiErrorResponse<T> extends ApiResponse<T> {
    private final Integer errorCode;
    private final ServerErrorResponse serverError;

    public ApiErrorResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, Integer num, ServerErrorResponse serverErrorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            num = apiErrorResponse.errorCode;
        }
        if ((i & 2) != 0) {
            serverErrorResponse = apiErrorResponse.serverError;
        }
        return apiErrorResponse.copy(num, serverErrorResponse);
    }

    public final Integer component1() {
        return this.errorCode;
    }

    public final ServerErrorResponse component2() {
        return this.serverError;
    }

    public final ApiErrorResponse<T> copy(Integer num, ServerErrorResponse serverErrorResponse) {
        return new ApiErrorResponse<>(num, serverErrorResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorResponse)) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) obj;
        return Intrinsics.areEqual(this.errorCode, apiErrorResponse.errorCode) && Intrinsics.areEqual(this.serverError, apiErrorResponse.serverError);
    }

    public int hashCode() {
        Integer num = this.errorCode;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        ServerErrorResponse serverErrorResponse = this.serverError;
        if (serverErrorResponse != null) {
            i = serverErrorResponse.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApiErrorResponse(errorCode=" + this.errorCode + ", serverError=" + this.serverError + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiErrorResponse(Integer num, ServerErrorResponse serverErrorResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : serverErrorResponse);
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final ServerErrorResponse getServerError() {
        return this.serverError;
    }

    public ApiErrorResponse(Integer num, ServerErrorResponse serverErrorResponse) {
        super(null);
        this.errorCode = num;
        this.serverError = serverErrorResponse;
    }
}
