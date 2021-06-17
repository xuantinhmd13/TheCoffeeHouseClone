package com.thecoffeehouse.guestapp.startup;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vn.zalopay.sdk.Environment;
import vn.zalopay.sdk.ZaloPaySDK;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b0\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/startup/ZaloPaySDKInitializer;", "Landroidx/startup/Initializer;", "", "()V", "ZALO_APP_ID", "", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ZaloPaySDKInitializer.kt */
public final class ZaloPaySDKInitializer implements Initializer<Unit> {
    private final int ZALO_APP_ID = 99;

    @Override // androidx.startup.Initializer
    public void create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ZaloPaySDK.init(this.ZALO_APP_ID, Environment.PRODUCTION);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }
}
