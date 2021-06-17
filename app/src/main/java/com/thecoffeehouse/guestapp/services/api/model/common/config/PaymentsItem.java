package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PaymentsItem;", "", FirebaseAnalytics.Param.METHOD, "", MessengerShareContentUtility.MEDIA_IMAGE, ViewHierarchyConstants.TEXT_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getMethod", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class PaymentsItem {
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private final String image;
    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private final String method;
    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    private final String text;

    public static /* synthetic */ PaymentsItem copy$default(PaymentsItem paymentsItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentsItem.method;
        }
        if ((i & 2) != 0) {
            str2 = paymentsItem.image;
        }
        if ((i & 4) != 0) {
            str3 = paymentsItem.text;
        }
        return paymentsItem.copy(str, str2, str3);
    }

    public final String component1() {
        return this.method;
    }

    public final String component2() {
        return this.image;
    }

    public final String component3() {
        return this.text;
    }

    public final PaymentsItem copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Param.METHOD);
        Intrinsics.checkNotNullParameter(str3, ViewHierarchyConstants.TEXT_KEY);
        return new PaymentsItem(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentsItem)) {
            return false;
        }
        PaymentsItem paymentsItem = (PaymentsItem) obj;
        return Intrinsics.areEqual(this.method, paymentsItem.method) && Intrinsics.areEqual(this.image, paymentsItem.image) && Intrinsics.areEqual(this.text, paymentsItem.text);
    }

    public int hashCode() {
        String str = this.method;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.image;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PaymentsItem(method=" + this.method + ", image=" + this.image + ", text=" + this.text + ")";
    }

    public PaymentsItem(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Param.METHOD);
        Intrinsics.checkNotNullParameter(str3, ViewHierarchyConstants.TEXT_KEY);
        this.method = str;
        this.image = str2;
        this.text = str3;
    }

    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentsItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getText() {
        return this.text;
    }
}
