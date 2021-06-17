package com.thecoffeehouse.guestapp.screens.order;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import com.airpay.sdk.v2.AirPaySdk;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.maps.android.BuildConfig;
import com.thecoffeehouse.guestapp.screens.order.webviewpayment.WebViewPaymentActivity;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vn.zalopay.sdk.ZaloPaySDK;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0010\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0001\u001a\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0001\u001a\u0016\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\n\u001a\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n\u001a\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0001\u001a\u0016\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 \u001a\u000e\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\n\u001a\u0016\u0010#\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n\u001a\u0011\u0010$\u001a\u00020\u0001*\u0004\u0018\u00010%¢\u0006\u0002\u0010&\u001a\u0014\u0010'\u001a\u00020\r*\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 \u001a\f\u0010(\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"AIRPAY_PACKAGE", "", "MOMO_PACKAGE", "ZALO_PACKAGE", "getDescriptionDeliAddress", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "getDistanceByTwoLocation", "", "latLng1", "Lcom/google/android/gms/maps/model/LatLng;", "latLng2", "openAppByLink", "", "activity", "Landroid/app/Activity;", "link", "openBrowserApp", "context", "Landroid/content/Context;", "url", "openDialApp", "phoneNumber", "openEmailApp", "email", "openExternalDirectionApp", "toLatLng", "fromLatLng", "openFacebookApp", "group", "openPayUrlWebView", "payment", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "uriMapDirectionFromCurrentLocation", "latLng", "uriMapDirectionFromMyLocation", "formatVND", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "openThirdPartyPaymentService", "parseHtmlContent", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: OrderExts.kt */
public final class OrderExtsKt {
    private static final String AIRPAY_PACKAGE = "com.beeasy.toppay";
    private static final String MOMO_PACKAGE = "com.mservice.momotransfer";
    private static final String ZALO_PACKAGE = "vn.com.vng.zalopay";

    public static final String formatVND(Integer num) {
        if (num == null) {
            return "NaN";
        }
        return new DecimalFormat("#,###").format(num) + "đ";
    }

    public static final String parseHtmlContent(String str) {
        if (str == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            String obj = Html.fromHtml(str, 0).toString();
            int trimmedLength = TextUtils.getTrimmedLength(obj);
            if (obj != null) {
                String substring = obj.substring(0, trimmedLength);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return Html.fromHtml(str, 0).toString();
        }
    }

    public static final void openThirdPartyPaymentService(Activity activity, Payment payment) {
        Intrinsics.checkNotNullParameter(activity, "$this$openThirdPartyPaymentService");
        if (payment != null) {
            String method = payment.getMethod();
            if (Intrinsics.areEqual(method, payment.getMOMO())) {
                if (payment.getDeeplink() != null) {
                    if (ContextExtsKt.isAppAvailable(activity, MOMO_PACKAGE)) {
                        String deeplink = payment.getDeeplink();
                        if (deeplink != null) {
                            openAppByLink(activity, deeplink);
                        }
                    } else if (payment.getPayUrl() != null) {
                        openPayUrlWebView(activity, payment);
                    }
                } else if (payment.getPayUrl() != null) {
                    openPayUrlWebView(activity, payment);
                }
            } else if (Intrinsics.areEqual(method, payment.getZALOPAY())) {
                String zaloPayTransactionToken = payment.getZaloPayTransactionToken();
                if (zaloPayTransactionToken != null) {
                    ZaloPaySDK.getInstance().payOrder(activity, zaloPayTransactionToken, "tch://guestapp", new OrderExtsKt$openThirdPartyPaymentService$2$1());
                }
            } else if (Intrinsics.areEqual(method, payment.getONETWOTHREEPAY())) {
                openPayUrlWebView(activity, payment);
            } else if (!Intrinsics.areEqual(method, payment.getAIRPAY())) {
            } else {
                if (payment.getDeeplink() != null) {
                    if (ContextExtsKt.isAppAvailable(activity, AIRPAY_PACKAGE)) {
                        String deeplink2 = payment.getDeeplink();
                        if (deeplink2 != null) {
                            openAppByLink(activity, deeplink2);
                        }
                    } else if (payment.getPayUrl() != null) {
                        openPayUrlWebView(activity, payment);
                    }
                } else if (payment.getPayUrl() != null) {
                    try {
                        String payUrl = payment.getPayUrl();
                        if (payUrl != null) {
                            AirPaySdk.makePaymentInAirPay(activity, payUrl, 100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        GeneralKt.log(Unit.INSTANCE);
                    }
                }
            }
        }
    }

    public static final void openAppByLink(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(str, "link");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        activity.startActivity(intent);
    }

    public static final void openPayUrlWebView(Activity activity, Payment payment) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intent intent = new Intent(activity, WebViewPaymentActivity.class);
        intent.putExtra("payUrl", payment.getPayUrl());
        activity.startActivity(intent);
    }

    public static final String uriMapDirectionFromMyLocation(LatLng latLng, LatLng latLng2) {
        Intrinsics.checkNotNullParameter(latLng, "fromLatLng");
        Intrinsics.checkNotNullParameter(latLng2, "toLatLng");
        return "http://maps.google.com/maps?saddr=" + latLng.latitude + ',' + latLng.longitude + "&daddr=" + latLng2.latitude + ',' + latLng2.longitude;
    }

    public static final String uriMapDirectionFromCurrentLocation(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return "https://www.google.com/maps/dir/Current+Location/" + latLng.latitude + ',' + latLng.longitude;
    }

    public static final void openExternalDirectionApp(Context context, LatLng latLng) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(latLng, "toLatLng");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uriMapDirectionFromCurrentLocation(latLng)));
        intent.setPackage("com.google.android.apps.maps");
        if (ContextExtsKt.isAppAvailable(context, "com.google.android.apps.maps")) {
            context.startActivity(intent);
        } else {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uriMapDirectionFromCurrentLocation(latLng))));
        }
    }

    public static final void openExternalDirectionApp(Context context, LatLng latLng, LatLng latLng2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(latLng, "fromLatLng");
        Intrinsics.checkNotNullParameter(latLng2, "toLatLng");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uriMapDirectionFromMyLocation(latLng, latLng2)));
        intent.setPackage("com.google.android.apps.maps");
        try {
            if (ContextExtsKt.isAppAvailable(context, "com.google.android.apps.maps")) {
                context.startActivity(intent);
            } else {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uriMapDirectionFromMyLocation(latLng, latLng2))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void openDialApp(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        try {
            context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void openEmailApp(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "email");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + str));
        intent.putExtra("android.intent.extra.EMAIL", str);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public static final void openBrowserApp(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public static final void openFacebookApp(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "group");
        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("fb://page/" + str));
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("https://www.facebook.com/" + str));
            if (intent2.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent2);
            }
        }
    }

    public static final double getDistanceByTwoLocation(LatLng latLng, LatLng latLng2) {
        if (latLng == null || latLng2 == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        Location location = new Location("");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);
        Location location2 = new Location("");
        location2.setLatitude(latLng2.latitude);
        location2.setLongitude(latLng2.longitude);
        return (double) location.distanceTo(location2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getDescriptionDeliAddress(com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion r7) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.screens.order.OrderExtsKt.getDescriptionDeliAddress(com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion):java.lang.String");
    }
}
