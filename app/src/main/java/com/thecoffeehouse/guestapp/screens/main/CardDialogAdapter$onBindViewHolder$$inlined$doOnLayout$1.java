package com.thecoffeehouse.guestapp.screens.main;

import android.view.View;
import android.widget.ImageView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.thecoffeehouse.guestapp.screens.main.CardDialogAdapter;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_LEFT_KEY, "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 4, 0})
/* compiled from: View.kt */
public final class CardDialogAdapter$onBindViewHolder$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ CardDialogAdapter.CardInfo $card$inlined;
    final /* synthetic */ CardDialogAdapter.CardViewHolder $holder$inlined;

    public CardDialogAdapter$onBindViewHolder$$inlined$doOnLayout$1(CardDialogAdapter.CardViewHolder cardViewHolder, CardDialogAdapter.CardInfo cardInfo) {
        this.$holder$inlined = cardViewHolder;
        this.$card$inlined = cardInfo;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkParameterIsNotNull(view, ViewHierarchyConstants.VIEW_KEY);
        view.removeOnLayoutChangeListener(this);
        try {
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            ImageView imgBarCode = this.$holder$inlined.getImgBarCode();
            Intrinsics.checkNotNullExpressionValue(imgBarCode, "holder.imgBarCode");
            GeneralKt.log(Integer.valueOf(imgBarCode.getWidth()));
            ImageView imgBarCode2 = this.$holder$inlined.getImgBarCode();
            Intrinsics.checkNotNullExpressionValue(imgBarCode2, "holder.imgBarCode");
            GeneralKt.log(Integer.valueOf(imgBarCode2.getHeight()));
            String barcode = this.$card$inlined.getBarcode();
            BarcodeFormat barcodeFormat = BarcodeFormat.CODE_128;
            ImageView imgBarCode3 = this.$holder$inlined.getImgBarCode();
            Intrinsics.checkNotNullExpressionValue(imgBarCode3, "holder.imgBarCode");
            int width = imgBarCode3.getWidth();
            ImageView imgBarCode4 = this.$holder$inlined.getImgBarCode();
            Intrinsics.checkNotNullExpressionValue(imgBarCode4, "holder.imgBarCode");
            this.$holder$inlined.getImgBarCode().setImageBitmap(barcodeEncoder.encodeBitmap(barcode, barcodeFormat, width, imgBarCode4.getHeight()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
