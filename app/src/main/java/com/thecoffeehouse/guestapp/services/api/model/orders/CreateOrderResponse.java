package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\"\u0010!\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R \u0010$\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR \u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R \u00100\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR$\u00103\u001a\b\u0012\u0004\u0012\u0002040\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR \u00107\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR \u0010:\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR \u0010=\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR.\u0010@\u001a\u0012\u0012\u0004\u0012\u00020B0Aj\b\u0012\u0004\u0012\u00020B`C8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010\u000fR \u0010L\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001a\"\u0004\bN\u0010\u001cR\"\u0010O\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010\u0015R\u001e\u0010R\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001a\"\u0004\bT\u0010\u001cR \u0010U\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001a\"\u0004\bW\u0010\u001cR\"\u0010X\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bY\u0010\u0013\"\u0004\bZ\u0010\u0015R \u0010[\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bb\u0010\u0013\"\u0004\bc\u0010\u0015R \u0010d\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u001a\"\u0004\bf\u0010\u001cR \u0010g\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006m"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "getAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "setAddress", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;)V", "adjustments", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Adjustment;", "getAdjustments", "()Ljava/util/List;", "setAdjustments", "(Ljava/util/List;)V", "afterDiscount", "", "getAfterDiscount", "()Ljava/lang/Integer;", "setAfterDiscount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "afterDiscountStr", "", "getAfterDiscountStr", "()Ljava/lang/String;", "setAfterDiscountStr", "(Ljava/lang/String;)V", "buttonStatus", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderButtonStatus;", "getButtonStatus", "setButtonStatus", FirebaseAnalytics.Param.DISCOUNT, "getDiscount", "setDiscount", "discountStr", "getDiscountStr", "setDiscountStr", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "etaBean", "getEtaBean", "setEtaBean", "etaStr", "getEtaStr", "setEtaStr", "logs", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/LogOrder;", "getLogs", "setLogs", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "note", "getNote", "setNote", "orderType", "getOrderType", "setOrderType", "orderlines", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "Lkotlin/collections/ArrayList;", "getOrderlines", "()Ljava/util/ArrayList;", "setOrderlines", "(Ljava/util/ArrayList;)V", "payments", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "getPayments", "setPayments", "puCode", "getPuCode", "setPuCode", "puQueue", "getPuQueue", "setPuQueue", "ref", "getRef", "setRef", "shippingType", "getShippingType", "setShippingType", "status", "getStatus", "setStatus", "tableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "getTableInfo", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "setTableInfo", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;)V", "total", "getTotal", "setTotal", "totalStr", "getTotalStr", "setTotalStr", "warning", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Warning;", "getWarning", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Warning;", "setWarning", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Warning;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public class CreateOrderResponse {
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private AddressOrder address;
    @SerializedName("adjustments")
    private List<Adjustment> adjustments;
    @SerializedName("after_discount")
    private Integer afterDiscount;
    @SerializedName("after_discount_str")
    private String afterDiscountStr;
    @SerializedName("button_status")
    private List<OrderButtonStatus> buttonStatus = new ArrayList();
    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private Integer discount;
    @SerializedName("discount_str")
    private String discountStr;
    @SerializedName("error")
    private ServerError error;
    @SerializedName("eta_bean")
    private Integer etaBean;
    @SerializedName("eta_str")
    private String etaStr;
    @SerializedName("logs")
    private List<LogOrder> logs = new ArrayList();
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    private String message;
    @SerializedName("note")
    private String note;
    @SerializedName("order_type")
    private String orderType;
    @SerializedName("orderlines")
    private ArrayList<OrderLineCreateOrder> orderlines = new ArrayList<>();
    @SerializedName("payments")
    private List<Payment> payments;
    @SerializedName("pu_code")
    private String puCode;
    @SerializedName("pu_queue")
    private Integer puQueue;
    @SerializedName("ref")
    private String ref = "";
    @SerializedName("type")
    private String shippingType;
    @SerializedName("status")
    private Integer status;
    @SerializedName("table_info")
    private TableInfo tableInfo;
    @SerializedName("total")
    private Integer total;
    @SerializedName("total_str")
    private String totalStr;
    @SerializedName("warning")
    private Warning warning;

    public final String getRef() {
        return this.ref;
    }

    public final void setRef(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ref = str;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final AddressOrder getAddress() {
        return this.address;
    }

    public final void setAddress(AddressOrder addressOrder) {
        this.address = addressOrder;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final List<LogOrder> getLogs() {
        return this.logs;
    }

    public final void setLogs(List<LogOrder> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.logs = list;
    }

    public final ArrayList<OrderLineCreateOrder> getOrderlines() {
        return this.orderlines;
    }

    public final void setOrderlines(ArrayList<OrderLineCreateOrder> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.orderlines = arrayList;
    }

    public final List<Adjustment> getAdjustments() {
        return this.adjustments;
    }

    public final void setAdjustments(List<Adjustment> list) {
        this.adjustments = list;
    }

    public final String getDiscountStr() {
        return this.discountStr;
    }

    public final void setDiscountStr(String str) {
        this.discountStr = str;
    }

    public final String getTotalStr() {
        return this.totalStr;
    }

    public final void setTotalStr(String str) {
        this.totalStr = str;
    }

    public final String getAfterDiscountStr() {
        return this.afterDiscountStr;
    }

    public final void setAfterDiscountStr(String str) {
        this.afterDiscountStr = str;
    }

    public final Integer getDiscount() {
        return this.discount;
    }

    public final void setDiscount(Integer num) {
        this.discount = num;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public final Integer getAfterDiscount() {
        return this.afterDiscount;
    }

    public final void setAfterDiscount(Integer num) {
        this.afterDiscount = num;
    }

    public final String getEtaStr() {
        return this.etaStr;
    }

    public final void setEtaStr(String str) {
        this.etaStr = str;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final List<Payment> getPayments() {
        return this.payments;
    }

    public final void setPayments(List<Payment> list) {
        this.payments = list;
    }

    public final String getShippingType() {
        return this.shippingType;
    }

    public final void setShippingType(String str) {
        this.shippingType = str;
    }

    public final Integer getPuQueue() {
        return this.puQueue;
    }

    public final void setPuQueue(Integer num) {
        this.puQueue = num;
    }

    public final String getPuCode() {
        return this.puCode;
    }

    public final void setPuCode(String str) {
        this.puCode = str;
    }

    public final List<OrderButtonStatus> getButtonStatus() {
        return this.buttonStatus;
    }

    public final void setButtonStatus(List<OrderButtonStatus> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.buttonStatus = list;
    }

    public final Integer getEtaBean() {
        return this.etaBean;
    }

    public final void setEtaBean(Integer num) {
        this.etaBean = num;
    }

    public final Warning getWarning() {
        return this.warning;
    }

    public final void setWarning(Warning warning2) {
        this.warning = warning2;
    }

    public final TableInfo getTableInfo() {
        return this.tableInfo;
    }

    public final void setTableInfo(TableInfo tableInfo2) {
        this.tableInfo = tableInfo2;
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }
}
