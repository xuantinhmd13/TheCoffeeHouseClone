package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/EventCard;", "", "deeplink", "", "description", MessengerShareContentUtility.MEDIA_IMAGE, "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getDescription", "getImage", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class EventCard {
    @SerializedName("deeplink")
    private final String deeplink;
    @SerializedName("description")
    private final String description;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private final String image;
    @SerializedName("title")
    private final String title;

    public EventCard() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EventCard copy$default(EventCard eventCard, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventCard.deeplink;
        }
        if ((i & 2) != 0) {
            str2 = eventCard.description;
        }
        if ((i & 4) != 0) {
            str3 = eventCard.image;
        }
        if ((i & 8) != 0) {
            str4 = eventCard.title;
        }
        return eventCard.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.deeplink;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.image;
    }

    public final String component4() {
        return this.title;
    }

    public final EventCard copy(String str, String str2, String str3, String str4) {
        return new EventCard(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventCard)) {
            return false;
        }
        EventCard eventCard = (EventCard) obj;
        return Intrinsics.areEqual(this.deeplink, eventCard.deeplink) && Intrinsics.areEqual(this.description, eventCard.description) && Intrinsics.areEqual(this.image, eventCard.image) && Intrinsics.areEqual(this.title, eventCard.title);
    }

    public int hashCode() {
        String str = this.deeplink;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.image;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.title;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "EventCard(deeplink=" + this.deeplink + ", description=" + this.description + ", image=" + this.image + ", title=" + this.title + ")";
    }

    public EventCard(String str, String str2, String str3, String str4) {
        this.deeplink = str;
        this.description = str2;
        this.image = str3;
        this.title = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventCard(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }
}
