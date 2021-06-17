package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.configs.trackingevents.CheckoutEvents;
import kotlin.Metadata;
import vn.zalopay.sdk.responses.PaymentResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\u001cR \u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\u001cR\"\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R \u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\u001cR \u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\u001cR \u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "", "()V", "AIRPAY", "", "getAIRPAY", "()Ljava/lang/String;", "MOMO", "getMOMO", "ONETWOTHREEPAY", "getONETWOTHREEPAY", "PENDING", "", "getPENDING", "()I", "SUCCESS", "getSUCCESS", "ZALOPAY", "getZALOPAY", "amount", "getAmount", "()Ljava/lang/Integer;", "setAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "deeplink", "getDeeplink", "setDeeplink", "(Ljava/lang/String;)V", MessengerShareContentUtility.MEDIA_IMAGE, "getImage", "setImage", FirebaseAnalytics.Param.METHOD, "getMethod", "setMethod", "payUrl", "getPayUrl", "setPayUrl", "status", "getStatus", "setStatus", ViewHierarchyConstants.TEXT_KEY, "getText", "setText", PaymentResponse.TRANSACTION_ID, "getTransactionId", "setTransactionId", "zaloPayTransactionToken", "getZaloPayTransactionToken", "setZaloPayTransactionToken", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Payment {
    private final transient String AIRPAY = "AirPay";
    private final transient String MOMO = CheckoutEvents.EventStartCheckout.Value.Momo;
    private final transient String ONETWOTHREEPAY = "123pay";
    private final transient int PENDING;
    private final transient int SUCCESS = 1;
    private final transient String ZALOPAY = CheckoutEvents.EventStartCheckout.Value.ZaloPay;
    @SerializedName("amount")
    private Integer amount;
    @SerializedName("deeplink")
    private String deeplink;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private String image;
    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private String method;
    @SerializedName("payUrl")
    private String payUrl;
    @SerializedName("status")
    private Integer status;
    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    private String text;
    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;
    @SerializedName("transaction_token")
    private String zaloPayTransactionToken;

    public final String getMOMO() {
        return this.MOMO;
    }

    public final String getONETWOTHREEPAY() {
        return this.ONETWOTHREEPAY;
    }

    public final String getZALOPAY() {
        return this.ZALOPAY;
    }

    public final String getAIRPAY() {
        return this.AIRPAY;
    }

    public final int getSUCCESS() {
        return this.SUCCESS;
    }

    public final int getPENDING() {
        return this.PENDING;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final String getMethod() {
        return this.method;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final String getPayUrl() {
        return this.payUrl;
    }

    public final void setPayUrl(String str) {
        this.payUrl = str;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final void setTransactionId(String str) {
        this.transactionId = str;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final void setAmount(Integer num) {
        this.amount = num;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final String getImage() {
        return this.image;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final String getZaloPayTransactionToken() {
        return this.zaloPayTransactionToken;
    }

    public final void setZaloPayTransactionToken(String str) {
        this.zaloPayTransactionToken = str;
    }
}
