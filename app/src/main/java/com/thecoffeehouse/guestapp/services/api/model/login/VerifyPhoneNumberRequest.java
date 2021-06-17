package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/VerifyPhoneNumberRequest;", "", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "otp", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "setOtp", "(Ljava/lang/String;)V", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "setPhone", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class VerifyPhoneNumberRequest {
    @SerializedName("otp")
    private String otp;
    @SerializedName("phone")
    private Phone phone;

    public static /* synthetic */ VerifyPhoneNumberRequest copy$default(VerifyPhoneNumberRequest verifyPhoneNumberRequest, Phone phone2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            phone2 = verifyPhoneNumberRequest.phone;
        }
        if ((i & 2) != 0) {
            str = verifyPhoneNumberRequest.otp;
        }
        return verifyPhoneNumberRequest.copy(phone2, str);
    }

    public final Phone component1() {
        return this.phone;
    }

    public final String component2() {
        return this.otp;
    }

    public final VerifyPhoneNumberRequest copy(Phone phone2, String str) {
        Intrinsics.checkNotNullParameter(phone2, "phone");
        return new VerifyPhoneNumberRequest(phone2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPhoneNumberRequest)) {
            return false;
        }
        VerifyPhoneNumberRequest verifyPhoneNumberRequest = (VerifyPhoneNumberRequest) obj;
        return Intrinsics.areEqual(this.phone, verifyPhoneNumberRequest.phone) && Intrinsics.areEqual(this.otp, verifyPhoneNumberRequest.otp);
    }

    public int hashCode() {
        Phone phone2 = this.phone;
        int i = 0;
        int hashCode = (phone2 != null ? phone2.hashCode() : 0) * 31;
        String str = this.otp;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VerifyPhoneNumberRequest(phone=" + this.phone + ", otp=" + this.otp + ")";
    }

    public VerifyPhoneNumberRequest(Phone phone2, String str) {
        Intrinsics.checkNotNullParameter(phone2, "phone");
        this.phone = phone2;
        this.otp = str;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final void setPhone(Phone phone2) {
        Intrinsics.checkNotNullParameter(phone2, "<set-?>");
        this.phone = phone2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyPhoneNumberRequest(Phone phone2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(phone2, (i & 2) != 0 ? null : str);
    }

    public final String getOtp() {
        return this.otp;
    }

    public final void setOtp(String str) {
        this.otp = str;
    }
}
