package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DeliveriesItem;", "", "id", "", ViewHierarchyConstants.TEXT_KEY, "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DeliveriesItem;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class DeliveriesItem {
    @SerializedName("id")
    private final Integer id;
    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    private final String text;

    public DeliveriesItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DeliveriesItem copy$default(DeliveriesItem deliveriesItem, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = deliveriesItem.id;
        }
        if ((i & 2) != 0) {
            str = deliveriesItem.text;
        }
        return deliveriesItem.copy(num, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final DeliveriesItem copy(Integer num, String str) {
        return new DeliveriesItem(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveriesItem)) {
            return false;
        }
        DeliveriesItem deliveriesItem = (DeliveriesItem) obj;
        return Intrinsics.areEqual(this.id, deliveriesItem.id) && Intrinsics.areEqual(this.text, deliveriesItem.text);
    }

    public int hashCode() {
        Integer num = this.id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.text;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DeliveriesItem(id=" + this.id + ", text=" + this.text + ")";
    }

    public DeliveriesItem(Integer num, String str) {
        this.id = num;
        this.text = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveriesItem(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }
}
