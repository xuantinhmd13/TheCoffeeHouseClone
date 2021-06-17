package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.content.Intent;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/thecoffeehouse/guestapp/screens/rewards/coupons/ScanQRActivity$onCreate$2", "Lcom/journeyapps/barcodescanner/BarcodeCallback;", "barcodeResult", "", "result", "Lcom/journeyapps/barcodescanner/BarcodeResult;", "possibleResultPoints", "resultPoints", "", "Lcom/google/zxing/ResultPoint;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ScanQRActivity.kt */
public final class ScanQRActivity$onCreate$2 implements BarcodeCallback {
    final /* synthetic */ ScanQRActivity this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ScanQRActivity$onCreate$2(ScanQRActivity scanQRActivity) {
        this.this$0 = scanQRActivity;
    }

    @Override // com.journeyapps.barcodescanner.BarcodeCallback
    public void barcodeResult(BarcodeResult barcodeResult) {
        String str = null;
        GeneralKt.log("result?.text: " + (barcodeResult != null ? barcodeResult.getText() : null));
        Intent intent = new Intent();
        String result_scan_code = ScanQRActivity.Companion.getRESULT_SCAN_CODE();
        if (barcodeResult != null) {
            str = barcodeResult.getText();
        }
        intent.putExtra(result_scan_code, str);
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
    }

    @Override // com.journeyapps.barcodescanner.BarcodeCallback
    public void possibleResultPoints(List<ResultPoint> list) {
        super.possibleResultPoints(list);
    }
}
