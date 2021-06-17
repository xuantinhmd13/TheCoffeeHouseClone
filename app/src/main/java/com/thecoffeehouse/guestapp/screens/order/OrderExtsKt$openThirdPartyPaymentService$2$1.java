package com.thecoffeehouse.guestapp.screens.order;

import kotlin.Metadata;
import vn.zalopay.sdk.ZaloPayError;
import vn.zalopay.sdk.listeners.PayOrderListener;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/OrderExtsKt$openThirdPartyPaymentService$2$1", "Lvn/zalopay/sdk/listeners/PayOrderListener;", "onPaymentCanceled", "", "p0", "", "p1", "onPaymentError", "Lvn/zalopay/sdk/ZaloPayError;", "p2", "onPaymentSucceeded", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderExts.kt */
public final class OrderExtsKt$openThirdPartyPaymentService$2$1 implements PayOrderListener {
    @Override // vn.zalopay.sdk.listeners.PayOrderListener
    public void onPaymentCanceled(String str, String str2) {
    }

    @Override // vn.zalopay.sdk.listeners.PayOrderListener
    public void onPaymentError(ZaloPayError zaloPayError, String str, String str2) {
    }

    @Override // vn.zalopay.sdk.listeners.PayOrderListener
    public void onPaymentSucceeded(String str, String str2, String str3) {
    }

    OrderExtsKt$openThirdPartyPaymentService$2$1() {
    }
}
