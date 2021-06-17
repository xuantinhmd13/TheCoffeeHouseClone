package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.CaptureManager;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;

import java.util.HashMap;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0014J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/ScanQRActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mCaptureManager", "Lcom/journeyapps/barcodescanner/CaptureManager;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRequestPermissionsResult", NativeProtocol.RESULT_ARGS_PERMISSIONS, "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ScanQRActivity.kt */
public final class ScanQRActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    private static final String RESULT_SCAN_CODE = "result_scan_code";
    private static final String SCAN_COUPON_CODE_KEY = "qr_coupon_code";
    private static final String SCAN_QR_TABLE_CODE_KEY = "qr_table_code";
    private HashMap _$_findViewCache;
    private CaptureManager mCaptureManager;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/ScanQRActivity$Companion;", "", "()V", "RESULT_SCAN_CODE", "", "getRESULT_SCAN_CODE", "()Ljava/lang/String;", "SCAN_COUPON_CODE_KEY", "SCAN_QR_TABLE_CODE_KEY", "createIntentScanCouponCode", "Landroid/content/Intent;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "createIntentScanQRTableCode", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ScanQRActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createIntentScanQRTableCode(AppCompatActivity appCompatActivity) {
            Intrinsics.checkNotNullParameter(appCompatActivity, "activity");
            Intent intent = new Intent(appCompatActivity, ScanQRActivity.class);
            intent.putExtra(ScanQRActivity.SCAN_QR_TABLE_CODE_KEY, ScanQRActivity.SCAN_QR_TABLE_CODE_KEY);
            return intent;
        }

        public final Intent createIntentScanCouponCode(AppCompatActivity appCompatActivity) {
            Intrinsics.checkNotNullParameter(appCompatActivity, "activity");
            Intent intent = new Intent(appCompatActivity, ScanQRActivity.class);
            intent.putExtra(ScanQRActivity.SCAN_COUPON_CODE_KEY, ScanQRActivity.SCAN_COUPON_CODE_KEY);
            return intent;
        }

        public final String getRESULT_SCAN_CODE() {
            return ScanQRActivity.RESULT_SCAN_CODE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_scan_coupon);
        if (getIntent().hasExtra(SCAN_QR_TABLE_CODE_KEY)) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_scan_qr_code_table_title);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_scan_qr_code_table_title");
            textView.setVisibility(0);
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_scan_qr_table_code_instruction);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_scan_qr_table_code_instruction");
            textView2.setVisibility(0);
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_scan_qr_table_code_instruction);
            Intrinsics.checkNotNullExpressionValue(textView3, "txt_scan_qr_table_code_instruction");
            ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new ScanQRActivity$onCreate$1(this), 1, null);
        }
        if (getIntent().hasExtra(SCAN_COUPON_CODE_KEY)) {
            TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_scan_qr_code_table_title);
            Intrinsics.checkNotNullExpressionValue(textView4, "txt_scan_qr_code_table_title");
            textView4.setVisibility(8);
            TextView textView5 = (TextView) _$_findCachedViewById(R.id.txt_scan_qr_table_code_instruction);
            Intrinsics.checkNotNullExpressionValue(textView5, "txt_scan_qr_table_code_instruction");
            textView5.setVisibility(8);
        }
        ViewfinderView viewfinderView = (ViewfinderView) ((DecoratedBarcodeView) _$_findCachedViewById(R.id.layout_scanner)).findViewById(R.id.zxing_viewfinder_view);
        Intrinsics.checkNotNullExpressionValue(viewfinderView, "viewFinder");
        viewfinderView.setVisibility(8);
        TextView textView6 = (TextView) ((DecoratedBarcodeView) _$_findCachedViewById(R.id.layout_scanner)).findViewById(R.id.zxing_status_view);
        Intrinsics.checkNotNullExpressionValue(textView6, "textView");
        textView6.setVisibility(8);
        CaptureManager captureManager = new CaptureManager(this, (DecoratedBarcodeView) _$_findCachedViewById(R.id.layout_scanner));
        this.mCaptureManager = captureManager;
        if (captureManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager.initializeFromIntent(getIntent(), bundle);
        CaptureManager captureManager2 = this.mCaptureManager;
        if (captureManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager2.setShowMissingCameraPermissionDialog(false);
        CaptureManager captureManager3 = this.mCaptureManager;
        if (captureManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager3.decode();
        ((DecoratedBarcodeView) _$_findCachedViewById(R.id.layout_scanner)).decodeSingle(new ScanQRActivity$onCreate$2(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        IntentResult parseActivityResult = IntentIntegrator.parseActivityResult(i, i2, intent);
        if (parseActivityResult != null) {
            GeneralKt.log("result.contents: " + parseActivityResult.getContents());
            if (parseActivityResult.getContents() == null) {
                Toast.makeText(this, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED, 1).show();
            } else {
                Toast.makeText(this, "Scanned: " + parseActivityResult.getContents(), 1).show();
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        CaptureManager captureManager = this.mCaptureManager;
        if (captureManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager.onResume();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        CaptureManager captureManager = this.mCaptureManager;
        if (captureManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        CaptureManager captureManager = this.mCaptureManager;
        if (captureManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        CaptureManager captureManager = this.mCaptureManager;
        if (captureManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager.onSaveInstanceState(bundle);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, NativeProtocol.RESULT_ARGS_PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        CaptureManager captureManager = this.mCaptureManager;
        if (captureManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCaptureManager");
        }
        captureManager.onRequestPermissionsResult(i, strArr, iArr);
    }
}
