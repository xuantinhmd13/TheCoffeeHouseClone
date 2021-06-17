package com.thecoffeehouse.guestapp.services.api.model.common.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/NotificationPayload;", "Landroid/os/Parcelable;", "popup", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;", "description", "", "id", "title", "deeplink", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "setDeeplink", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getId", "setId", "getPopup", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;", "setPopup", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;)V", "getTitle", "setTitle", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Notification.kt */
public final class NotificationPayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("deeplink")
    private String deeplink;
    @SerializedName("description")
    private String description;
    @SerializedName("id")
    private String id;
    @SerializedName("popup")
    private Popup popup;
    @SerializedName("title")
    private String title;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new NotificationPayload((Popup) parcel.readParcelable(NotificationPayload.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationPayload[i];
        }
    }

    public NotificationPayload() {
        this(null, null, null, null, null, 31, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.popup, i);
        parcel.writeString(this.description);
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.deeplink);
    }

    public NotificationPayload(Popup popup2, String str, String str2, String str3, String str4) {
        this.popup = popup2;
        this.description = str;
        this.id = str2;
        this.title = str3;
        this.deeplink = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationPayload(Popup popup2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : popup2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final Popup getPopup() {
        return this.popup;
    }

    public final void setPopup(Popup popup2) {
        this.popup = popup2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }
}
