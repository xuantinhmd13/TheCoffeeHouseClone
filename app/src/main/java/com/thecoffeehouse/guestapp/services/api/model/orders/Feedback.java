package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Feedback;", "", "()V", "categories", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderCategory;", "Lkotlin/collections/ArrayList;", "getCategories", "()Ljava/util/ArrayList;", "setCategories", "(Ljava/util/ArrayList;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Feedback {
    @SerializedName("categories")
    private ArrayList<RatingOrderCategory> categories;
    @SerializedName("type")
    private String type;

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final ArrayList<RatingOrderCategory> getCategories() {
        return this.categories;
    }

    public final void setCategories(ArrayList<RatingOrderCategory> arrayList) {
        this.categories = arrayList;
    }
}
