package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/SignUpWithFacebookRequest;", "", "facebookId", "", "facebookToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getFacebookId", "()Ljava/lang/String;", "setFacebookId", "(Ljava/lang/String;)V", "getFacebookToken", "setFacebookToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class SignUpWithFacebookRequest {
    @SerializedName("facebook_id")
    private String facebookId;
    @SerializedName("facebook_token")
    private String facebookToken;

    public static /* synthetic */ SignUpWithFacebookRequest copy$default(SignUpWithFacebookRequest signUpWithFacebookRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpWithFacebookRequest.facebookId;
        }
        if ((i & 2) != 0) {
            str2 = signUpWithFacebookRequest.facebookToken;
        }
        return signUpWithFacebookRequest.copy(str, str2);
    }

    public final String component1() {
        return this.facebookId;
    }

    public final String component2() {
        return this.facebookToken;
    }

    public final SignUpWithFacebookRequest copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "facebookId");
        Intrinsics.checkNotNullParameter(str2, "facebookToken");
        return new SignUpWithFacebookRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpWithFacebookRequest)) {
            return false;
        }
        SignUpWithFacebookRequest signUpWithFacebookRequest = (SignUpWithFacebookRequest) obj;
        return Intrinsics.areEqual(this.facebookId, signUpWithFacebookRequest.facebookId) && Intrinsics.areEqual(this.facebookToken, signUpWithFacebookRequest.facebookToken);
    }

    public int hashCode() {
        String str = this.facebookId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.facebookToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SignUpWithFacebookRequest(facebookId=" + this.facebookId + ", facebookToken=" + this.facebookToken + ")";
    }

    public SignUpWithFacebookRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "facebookId");
        Intrinsics.checkNotNullParameter(str2, "facebookToken");
        this.facebookId = str;
        this.facebookToken = str2;
    }

    public final String getFacebookId() {
        return this.facebookId;
    }

    public final void setFacebookId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.facebookId = str;
    }

    public final String getFacebookToken() {
        return this.facebookToken;
    }

    public final void setFacebookToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.facebookToken = str;
    }
}
