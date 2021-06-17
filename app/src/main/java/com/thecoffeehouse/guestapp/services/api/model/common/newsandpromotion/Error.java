package com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/Error;", "", "errorCode", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetNewsAndPromotions.kt */
public final class Error {
    @SerializedName(NativeProtocol.BRIDGE_ARG_ERROR_CODE)
    private final String errorCode;
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    private final String message;

    public Error() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = error.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = error.message;
        }
        return error.copy(str, str2);
    }

    public final String component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.message;
    }

    public final Error copy(String str, String str2) {
        return new Error(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return Intrinsics.areEqual(this.errorCode, error.errorCode) && Intrinsics.areEqual(this.message, error.message);
    }

    public int hashCode() {
        String str = this.errorCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Error(errorCode=" + this.errorCode + ", message=" + this.message + ")";
    }

    public Error(String str, String str2) {
        this.errorCode = str;
        this.message = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Error(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }
}
