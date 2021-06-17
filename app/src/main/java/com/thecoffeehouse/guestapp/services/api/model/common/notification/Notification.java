package com.thecoffeehouse.guestapp.services.api.model.common.notification;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;", "", "popup", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;", "read", "", "deeplink", "", "icon", "description", "id", "time", "", "title", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getDescription", "getIcon", "getId", "getPopup", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;", "getRead", "()Ljava/lang/Boolean;", "setRead", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTime", "()J", "getTitle", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Notification.kt */
public final class Notification {
    @SerializedName("deeplink")
    private final String deeplink;
    @SerializedName("description")
    private final String description;
    @SerializedName("icon")
    private final String icon;
    @SerializedName("id")
    private final String id;
    @SerializedName("popup")
    private final Popup popup;
    @SerializedName("read")
    private Boolean read;
    @SerializedName("time")
    private final long time;
    @SerializedName("title")
    private final String title;

    public Notification() {
        this(null, null, null, null, null, null, 0, null, 255, null);
    }

    public Notification(Popup popup2, Boolean bool, String str, String str2, String str3, String str4, long j, String str5) {
        Intrinsics.checkNotNullParameter(str4, "id");
        this.popup = popup2;
        this.read = bool;
        this.deeplink = str;
        this.icon = str2;
        this.description = str3;
        this.id = str4;
        this.time = j;
        this.title = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Notification(Popup popup2, Boolean bool, String str, String str2, String str3, String str4, long j, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : popup2, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? 0 : j, (i & 128) != 0 ? null : str5);
    }

    public final Popup getPopup() {
        return this.popup;
    }

    public final Boolean getRead() {
        return this.read;
    }

    public final void setRead(Boolean bool) {
        this.read = bool;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getTitle() {
        return this.title;
    }
}
