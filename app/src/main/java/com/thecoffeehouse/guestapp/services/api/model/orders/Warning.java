package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Warning;", "", "()V", MessengerShareContentUtility.BUTTONS, "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/WarningButton;", "getButtons", "()Ljava/util/List;", "setButtons", "(Ljava/util/List;)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Warning {
    @SerializedName(MessengerShareContentUtility.BUTTONS)
    private List<WarningButton> buttons = new ArrayList();
    @SerializedName("description")
    private String description;
    @SerializedName("title")
    private String title;

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final List<WarningButton> getButtons() {
        return this.buttons;
    }

    public final void setButtons(List<WarningButton> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.buttons = list;
    }
}
