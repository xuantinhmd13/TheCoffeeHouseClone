package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.Hashtable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter$CouponCodeViewHolder;", "mCoupons", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Coupon;", "onClickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CouponCodeViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CouponCodeRecyclerViewAdapter.kt */
public final class CouponCodeRecyclerViewAdapter extends RecyclerView.Adapter<CouponCodeViewHolder> {
    private final List<Coupon> mCoupons;
    private final Function1<Coupon, Unit> onClickListener;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public CouponCodeRecyclerViewAdapter(List<Coupon> list, Function1<? super Coupon, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "mCoupons");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.mCoupons = list;
        this.onClickListener = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter$CouponCodeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mImgQrCode", "Landroid/widget/ImageView;", "mTxtCopy", "Landroid/widget/TextView;", "mTxtQrCode", "bind", "", FirebaseAnalytics.Param.COUPON, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Coupon;", "onClickListener", "Lkotlin/Function1;", "createBarcodeBitmap", "Landroid/graphics/Bitmap;", "data", "", "widthImage", "", "heightImage", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CouponCodeRecyclerViewAdapter.kt */
    public static final class CouponCodeViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final ImageView mImgQrCode;
        private final TextView mTxtCopy;
        private final TextView mTxtQrCode;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CouponCodeViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.img_qr_code);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.img_qr_code)");
            this.mImgQrCode = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.txt_qr_code);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.txt_qr_code)");
            this.mTxtQrCode = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.txt_copy);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.txt_copy)");
            this.mTxtCopy = (TextView) findViewById3;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter$CouponCodeViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CouponCodeRecyclerViewAdapter.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CouponCodeViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_coupon_code, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new CouponCodeViewHolder(inflate);
            }
        }

        public final void bind(Coupon coupon, Function1<? super Coupon, Unit> function1) {
            Intrinsics.checkNotNullParameter(coupon, FirebaseAnalytics.Param.COUPON);
            Intrinsics.checkNotNullParameter(function1, "onClickListener");
            String barcode = coupon.getBarcode();
            if (barcode != null) {
                this.mTxtQrCode.setText(barcode);
                this.mImgQrCode.post(new CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$$inlined$let$lambda$1(barcode, this, function1, coupon));
                ContextExtsKt.setOnSafeClickListener$default(this.mTxtCopy, 0, new CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$$inlined$let$lambda$2(this, function1, coupon), 1, null);
            }
        }

        /* access modifiers changed from: private */
        public final Bitmap createBarcodeBitmap(String str, int i, int i2) throws WriterException {
            try {
                Hashtable hashtable = new Hashtable();
                hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i2, hashtable);
                Intrinsics.checkNotNullExpressionValue(encode, "codeWriter.encode(\n     …hintMap\n                )");
                return new BarcodeEncoder().createBitmap(encode);
            } catch (WriterException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public CouponCodeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return CouponCodeViewHolder.Companion.from(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mCoupons.size();
    }

    public void onBindViewHolder(CouponCodeViewHolder couponCodeViewHolder, int i) {
        Intrinsics.checkNotNullParameter(couponCodeViewHolder, "p0");
        couponCodeViewHolder.setIsRecyclable(false);
        couponCodeViewHolder.bind(this.mCoupons.get(i), this.onClickListener);
    }
}
