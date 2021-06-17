package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u00020\u0018R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R \u0010,\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001e\u0010/\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00063"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "", "()V", "categoryType", "", "getCategoryType", "()I", "setCategoryType", "(I)V", "editable", "", "getEditable", "()Z", "setEditable", "(Z)V", "extra", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Extra;", "Lkotlin/collections/ArrayList;", "getExtra", "()Ljava/util/ArrayList;", "setExtra", "(Ljava/util/ArrayList;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "name", "getName", "setName", "note", "getNote", "setNote", "originPrice", "getOriginPrice", "()Ljava/lang/Integer;", "setOriginPrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", FirebaseAnalytics.Param.PRICE, "getPrice", "setPrice", "priceStr", "getPriceStr", "setPriceStr", FirebaseAnalytics.Param.QUANTITY, "getQuantity", "setQuantity", "getUniqueId", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class OrderLine {
    @SerializedName("category_type")
    private int categoryType;
    @SerializedName("editable")
    private boolean editable = true;
    @SerializedName("extra")
    private ArrayList<Extra> extra = new ArrayList<>();
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("note")
    private String note = "";
    @SerializedName("origin_price")
    private Integer originPrice;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private Integer price;
    @SerializedName("price_str")
    private String priceStr;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private int quantity = 1;

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final ArrayList<Extra> getExtra() {
        return this.extra;
    }

    public final void setExtra(ArrayList<Extra> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.extra = arrayList;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final void setPrice(Integer num) {
        this.price = num;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final void setPriceStr(String str) {
        this.priceStr = str;
    }

    public final Integer getOriginPrice() {
        return this.originPrice;
    }

    public final void setOriginPrice(Integer num) {
        this.originPrice = num;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final int getCategoryType() {
        return this.categoryType;
    }

    public final void setCategoryType(int i) {
        this.categoryType = i;
    }

    public final String getUniqueId() {
        String str = this.id;
        ArrayList<Extra> arrayList = this.extra;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getName());
        }
        return Intrinsics.stringPlus(str, CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null)) + this.note;
    }
}
