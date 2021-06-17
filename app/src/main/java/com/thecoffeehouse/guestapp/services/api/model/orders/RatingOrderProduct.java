package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderProduct;", "", "()V", "comment", "", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "like", "", "getLike", "()Ljava/lang/Integer;", "setLike", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "getName", "setName", "productId", "getProductId", "setProductId", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class RatingOrderProduct {
    @SerializedName("comment")
    private String comment;
    @SerializedName("like")
    private Integer like;
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String productId;

    public final String getProductId() {
        return this.productId;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final Integer getLike() {
        return this.like;
    }

    public final void setLike(Integer num) {
        this.like = num;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        this.comment = str;
    }
}
