package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/SignUpWithGoogleRequest;", "", "googleId", "", "googleToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getGoogleId", "()Ljava/lang/String;", "setGoogleId", "(Ljava/lang/String;)V", "getGoogleToken", "setGoogleToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class SignUpWithGoogleRequest {
    @SerializedName("google_id")
    private String googleId;
    @SerializedName("google_token")
    private String googleToken;

    public static /* synthetic */ SignUpWithGoogleRequest copy$default(SignUpWithGoogleRequest signUpWithGoogleRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpWithGoogleRequest.googleId;
        }
        if ((i & 2) != 0) {
            str2 = signUpWithGoogleRequest.googleToken;
        }
        return signUpWithGoogleRequest.copy(str, str2);
    }

    public final String component1() {
        return this.googleId;
    }

    public final String component2() {
        return this.googleToken;
    }

    public final SignUpWithGoogleRequest copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "googleId");
        Intrinsics.checkNotNullParameter(str2, "googleToken");
        return new SignUpWithGoogleRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpWithGoogleRequest)) {
            return false;
        }
        SignUpWithGoogleRequest signUpWithGoogleRequest = (SignUpWithGoogleRequest) obj;
        return Intrinsics.areEqual(this.googleId, signUpWithGoogleRequest.googleId) && Intrinsics.areEqual(this.googleToken, signUpWithGoogleRequest.googleToken);
    }

    public int hashCode() {
        String str = this.googleId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.googleToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SignUpWithGoogleRequest(googleId=" + this.googleId + ", googleToken=" + this.googleToken + ")";
    }

    public SignUpWithGoogleRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "googleId");
        Intrinsics.checkNotNullParameter(str2, "googleToken");
        this.googleId = str;
        this.googleToken = str2;
    }

    public final String getGoogleId() {
        return this.googleId;
    }

    public final void setGoogleId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.googleId = str;
    }

    public final String getGoogleToken() {
        return this.googleToken;
    }

    public final void setGoogleToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.googleToken = str;
    }
}
