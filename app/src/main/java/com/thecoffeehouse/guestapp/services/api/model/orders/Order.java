package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R \u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderRequest;", "()V", "adjustments", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Adjustment;", "Lkotlin/collections/ArrayList;", "getAdjustments", "()Ljava/util/ArrayList;", "setAdjustments", "(Ljava/util/ArrayList;)V", FirebaseAnalytics.Param.DISCOUNT, "", "getDiscount", "()Ljava/lang/Integer;", "setDiscount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "problems", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Problem;", "getProblems", "()Ljava/util/List;", "setProblems", "(Ljava/util/List;)V", FirebaseAnalytics.Param.QUANTITY, "getQuantity", "setQuantity", "tableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "getTableInfo", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "setTableInfo", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Order extends CalculateOrderRequest {
    @SerializedName("adjustments")
    private ArrayList<Adjustment> adjustments;
    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private Integer discount;
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    private String message;
    @SerializedName("problems")
    private List<Problem> problems;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private Integer quantity;
    @SerializedName("table_info")
    private TableInfo tableInfo;

    public final ArrayList<Adjustment> getAdjustments() {
        return this.adjustments;
    }

    public final void setAdjustments(ArrayList<Adjustment> arrayList) {
        this.adjustments = arrayList;
    }

    public final Integer getDiscount() {
        return this.discount;
    }

    public final void setDiscount(Integer num) {
        this.discount = num;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final void setQuantity(Integer num) {
        this.quantity = num;
    }

    public final List<Problem> getProblems() {
        return this.problems;
    }

    public final void setProblems(List<Problem> list) {
        this.problems = list;
    }

    public final TableInfo getTableInfo() {
        return this.tableInfo;
    }

    public final void setTableInfo(TableInfo tableInfo2) {
        this.tableInfo = tableInfo2;
    }
}
