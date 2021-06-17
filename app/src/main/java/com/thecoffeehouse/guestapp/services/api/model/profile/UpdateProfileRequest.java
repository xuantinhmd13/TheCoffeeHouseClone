package com.thecoffeehouse.guestapp.services.api.model.profile;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r¨\u0006%"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileRequest;", "", MessengerShareContentUtility.MEDIA_IMAGE, "", "gender", "", "lastName", "firstName", "email", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getGender", "()Ljava/lang/Integer;", "setGender", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImage", "setImage", "getLastName", "setLastName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileRequest;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Profile.kt */
public final class UpdateProfileRequest {
    @SerializedName("email")
    private String email;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private String image;
    @SerializedName("last_name")
    private String lastName;

    public UpdateProfileRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ UpdateProfileRequest copy$default(UpdateProfileRequest updateProfileRequest, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileRequest.image;
        }
        if ((i & 2) != 0) {
            num = updateProfileRequest.gender;
        }
        if ((i & 4) != 0) {
            str2 = updateProfileRequest.lastName;
        }
        if ((i & 8) != 0) {
            str3 = updateProfileRequest.firstName;
        }
        if ((i & 16) != 0) {
            str4 = updateProfileRequest.email;
        }
        return updateProfileRequest.copy(str, num, str2, str3, str4);
    }

    public final String component1() {
        return this.image;
    }

    public final Integer component2() {
        return this.gender;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.firstName;
    }

    public final String component5() {
        return this.email;
    }

    public final UpdateProfileRequest copy(String str, Integer num, String str2, String str3, String str4) {
        return new UpdateProfileRequest(str, num, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileRequest)) {
            return false;
        }
        UpdateProfileRequest updateProfileRequest = (UpdateProfileRequest) obj;
        return Intrinsics.areEqual(this.image, updateProfileRequest.image) && Intrinsics.areEqual(this.gender, updateProfileRequest.gender) && Intrinsics.areEqual(this.lastName, updateProfileRequest.lastName) && Intrinsics.areEqual(this.firstName, updateProfileRequest.firstName) && Intrinsics.areEqual(this.email, updateProfileRequest.email);
    }

    public int hashCode() {
        String str = this.image;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.gender;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.firstName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.email;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "UpdateProfileRequest(image=" + this.image + ", gender=" + this.gender + ", lastName=" + this.lastName + ", firstName=" + this.firstName + ", email=" + this.email + ")";
    }

    public UpdateProfileRequest(String str, Integer num, String str2, String str3, String str4) {
        this.image = str;
        this.gender = num;
        this.lastName = str2;
        this.firstName = str3;
        this.email = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateProfileRequest(String str, Integer num, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final String getImage() {
        return this.image;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final void setGender(Integer num) {
        this.gender = num;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }
}
