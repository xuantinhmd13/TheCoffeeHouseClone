package com.thecoffeehouse.guestapp.services.api.model.feedbackandrating;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackRequest;", "", "email", "", "feedback", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFeedback", "setFeedback", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Feedback.kt */
public final class FeedbackRequest {
    @SerializedName("email")
    private String email;
    @SerializedName("feedback")
    private String feedback;

    public FeedbackRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FeedbackRequest copy$default(FeedbackRequest feedbackRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = feedbackRequest.feedback;
        }
        return feedbackRequest.copy(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.feedback;
    }

    public final FeedbackRequest copy(String str, String str2) {
        return new FeedbackRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackRequest)) {
            return false;
        }
        FeedbackRequest feedbackRequest = (FeedbackRequest) obj;
        return Intrinsics.areEqual(this.email, feedbackRequest.email) && Intrinsics.areEqual(this.feedback, feedbackRequest.feedback);
    }

    public int hashCode() {
        String str = this.email;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.feedback;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "FeedbackRequest(email=" + this.email + ", feedback=" + this.feedback + ")";
    }

    public FeedbackRequest(String str, String str2) {
        this.email = str;
        this.feedback = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final void setFeedback(String str) {
        this.feedback = str;
    }
}
