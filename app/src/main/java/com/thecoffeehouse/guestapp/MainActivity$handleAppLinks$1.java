package com.thecoffeehouse.guestapp;

import android.net.Uri;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "pendingDynamicLinkData", "Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
final class MainActivity$handleAppLinks$1<TResult> implements OnSuccessListener<PendingDynamicLinkData> {
    final /* synthetic */ MainActivity this$0;

    MainActivity$handleAppLinks$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final void onSuccess(PendingDynamicLinkData pendingDynamicLinkData) {
        GeneralKt.log("handleAppLinks");
        Uri uri = null;
        if (pendingDynamicLinkData != null) {
            uri = pendingDynamicLinkData.getLink();
        }
        if (uri != null) {
            MainActivity mainActivity = this.this$0;
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "deepLink.toString()");
            mainActivity.parseDeepLink(uri2);
            this.this$0.checkSettingAccessTrade(uri);
        }
    }
}
