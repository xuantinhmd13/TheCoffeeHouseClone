package com.thecoffeehouse.guestapp.services.api.model.signup;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/signup/SignUpRequest;", "", "firstName", "", "lastName", "birthday", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "avatar", "gender", "", "otp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getBirthday", "setBirthday", "getFirstName", "setFirstName", "getGender", "()Ljava/lang/Integer;", "setGender", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLastName", "setLastName", "getOtp", "setOtp", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "setPhone", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/signup/SignUpRequest;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SignUp.kt */
public final class SignUpRequest {
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("otp")
    private String otp;
    @SerializedName("phone")
    private Phone phone;

    public static /* synthetic */ SignUpRequest copy$default(SignUpRequest signUpRequest, String str, String str2, String str3, Phone phone2, String str4, Integer num, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpRequest.firstName;
        }
        if ((i & 2) != 0) {
            str2 = signUpRequest.lastName;
        }
        if ((i & 4) != 0) {
            str3 = signUpRequest.birthday;
        }
        if ((i & 8) != 0) {
            phone2 = signUpRequest.phone;
        }
        if ((i & 16) != 0) {
            str4 = signUpRequest.avatar;
        }
        if ((i & 32) != 0) {
            num = signUpRequest.gender;
        }
        if ((i & 64) != 0) {
            str5 = signUpRequest.otp;
        }
        return signUpRequest.copy(str, str2, str3, phone2, str4, num, str5);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.birthday;
    }

    public final Phone component4() {
        return this.phone;
    }

    public final String component5() {
        return this.avatar;
    }

    public final Integer component6() {
        return this.gender;
    }

    public final String component7() {
        return this.otp;
    }

    public final SignUpRequest copy(String str, String str2, String str3, Phone phone2, String str4, Integer num, String str5) {
        Intrinsics.checkNotNullParameter(str, "firstName");
        Intrinsics.checkNotNullParameter(phone2, "phone");
        return new SignUpRequest(str, str2, str3, phone2, str4, num, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpRequest)) {
            return false;
        }
        SignUpRequest signUpRequest = (SignUpRequest) obj;
        return Intrinsics.areEqual(this.firstName, signUpRequest.firstName) && Intrinsics.areEqual(this.lastName, signUpRequest.lastName) && Intrinsics.areEqual(this.birthday, signUpRequest.birthday) && Intrinsics.areEqual(this.phone, signUpRequest.phone) && Intrinsics.areEqual(this.avatar, signUpRequest.avatar) && Intrinsics.areEqual(this.gender, signUpRequest.gender) && Intrinsics.areEqual(this.otp, signUpRequest.otp);
    }

    public int hashCode() {
        String str = this.firstName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.birthday;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Phone phone2 = this.phone;
        int hashCode4 = (hashCode3 + (phone2 != null ? phone2.hashCode() : 0)) * 31;
        String str4 = this.avatar;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.gender;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.otp;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "SignUpRequest(firstName=" + this.firstName + ", lastName=" + this.lastName + ", birthday=" + this.birthday + ", phone=" + this.phone + ", avatar=" + this.avatar + ", gender=" + this.gender + ", otp=" + this.otp + ")";
    }

    public SignUpRequest(String str, String str2, String str3, Phone phone2, String str4, Integer num, String str5) {
        Intrinsics.checkNotNullParameter(str, "firstName");
        Intrinsics.checkNotNullParameter(phone2, "phone");
        this.firstName = str;
        this.lastName = str2;
        this.birthday = str3;
        this.phone = phone2;
        this.avatar = str4;
        this.gender = num;
        this.otp = str5;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignUpRequest(String str, String str2, String str3, Phone phone2, String str4, Integer num, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, phone2, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str5);
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final void setPhone(Phone phone2) {
        Intrinsics.checkNotNullParameter(phone2, "<set-?>");
        this.phone = phone2;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final void setGender(Integer num) {
        this.gender = num;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final void setOtp(String str) {
        this.otp = str;
    }
}
