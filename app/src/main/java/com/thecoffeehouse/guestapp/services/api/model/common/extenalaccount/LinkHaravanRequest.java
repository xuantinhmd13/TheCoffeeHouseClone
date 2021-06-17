package com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vn.zalopay.sdk.responses.PaymentResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanRequest;", "", PaymentResponse.RETURN_CODE, "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExternalAccount.kt */
public final class LinkHaravanRequest {
    @SerializedName(PaymentResponse.RETURN_CODE)
    private final String code;

    public LinkHaravanRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ LinkHaravanRequest copy$default(LinkHaravanRequest linkHaravanRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkHaravanRequest.code;
        }
        return linkHaravanRequest.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final LinkHaravanRequest copy(String str) {
        return new LinkHaravanRequest(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LinkHaravanRequest) && Intrinsics.areEqual(this.code, ((LinkHaravanRequest) obj).code);
        }
        return true;
    }

    public int hashCode() {
        String str = this.code;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "LinkHaravanRequest(code=" + this.code + ")";
    }

    public LinkHaravanRequest(String str) {
        this.code = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkHaravanRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getCode() {
        return this.code;
    }
}
