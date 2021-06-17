package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/ItemRowCoupon;", "", "campaign", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "onClickListener", "Lkotlin/Function1;", "", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;Lkotlin/jvm/functions/Function1;)V", "imgCouponBackground", "Landroid/widget/ImageView;", "getImgCouponBackground", "()Landroid/widget/ImageView;", "setImgCouponBackground", "(Landroid/widget/ImageView;)V", "txtRemainingDay", "Landroid/widget/TextView;", "getTxtRemainingDay", "()Landroid/widget/TextView;", "setTxtRemainingDay", "(Landroid/widget/TextView;)V", "txtVoucherContent", "getTxtVoucherContent", "setTxtVoucherContent", "txtVoucherCount", "getTxtVoucherCount", "setTxtVoucherCount", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowCoupon.kt */
public final class ItemRowCoupon {
    private final Campaign campaign;
    public ImageView imgCouponBackground;
    private final Function1<String, Unit> onClickListener;
    public TextView txtRemainingDay;
    public TextView txtVoucherContent;
    public TextView txtVoucherCount;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowCoupon> {
        public void bindLoadMore(ItemRowCoupon itemRowCoupon) {
        }

        public LoadMoreViewBinder(ItemRowCoupon itemRowCoupon) {
            super(itemRowCoupon);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowCoupon, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCoupon itemRowCoupon, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowCoupon itemRowCoupon, int i) {
        }

        public ViewBinder(ItemRowCoupon itemRowCoupon) {
            super(itemRowCoupon, R.layout.item_row_voucher, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCoupon itemRowCoupon) {
            itemRowCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
            boolean isNullable = isNullable();
            if (itemRowCoupon != null && isNullable) {
                itemRowCoupon.txtVoucherCount = null;
                itemRowCoupon.txtVoucherContent = null;
                itemRowCoupon.txtRemainingDay = null;
                itemRowCoupon.imgCouponBackground = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCoupon itemRowCoupon, View view) {
            itemRowCoupon.txtVoucherCount = (TextView) view.findViewById(R.id.txt_voucher_count);
            itemRowCoupon.txtVoucherContent = (TextView) view.findViewById(R.id.txtVoucherContent);
            itemRowCoupon.txtRemainingDay = (TextView) view.findViewById(R.id.txtRemainingDay);
            itemRowCoupon.imgCouponBackground = (ImageView) view.findViewById(R.id.img_coupon_background);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowCoupon itemRowCoupon, View view) {
            view.findViewById(R.id.layout_item_root_voucher).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCoupon.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowCoupon.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowCoupon, View> {
        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void bindAnimation(int i, int i2, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindChildPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCoupon itemRowCoupon, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowCoupon itemRowCoupon, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowCoupon itemRowCoupon) {
            super(itemRowCoupon, R.layout.item_row_voucher, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCoupon itemRowCoupon) {
            itemRowCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCoupon itemRowCoupon, View view) {
            itemRowCoupon.txtVoucherCount = (TextView) view.findViewById(R.id.txt_voucher_count);
            itemRowCoupon.txtVoucherContent = (TextView) view.findViewById(R.id.txtVoucherContent);
            itemRowCoupon.txtRemainingDay = (TextView) view.findViewById(R.id.txtRemainingDay);
            itemRowCoupon.imgCouponBackground = (ImageView) view.findViewById(R.id.img_coupon_background);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowCoupon itemRowCoupon, View view) {
            view.findViewById(R.id.layout_item_root_voucher).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCoupon.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowCoupon.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowCoupon itemRowCoupon, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCoupon.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    if (ExpandableViewBinder.this.isExpanded()) {
                        ExpandableViewBinder.this.collapse();
                    } else {
                        ExpandableViewBinder.this.expand();
                    }
                }
            });
        }
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowCoupon, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCoupon itemRowCoupon, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowCoupon itemRowCoupon, int i) {
        }

        public SwipeViewBinder(ItemRowCoupon itemRowCoupon) {
            super(itemRowCoupon, R.layout.item_row_voucher, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCoupon itemRowCoupon) {
            itemRowCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
            boolean isNullable = isNullable();
            if (itemRowCoupon != null && isNullable) {
                itemRowCoupon.txtVoucherCount = null;
                itemRowCoupon.txtVoucherContent = null;
                itemRowCoupon.txtRemainingDay = null;
                itemRowCoupon.imgCouponBackground = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCoupon itemRowCoupon, SwipePlaceHolderView.FrameView frameView) {
            itemRowCoupon.txtVoucherCount = (TextView) frameView.findViewById(R.id.txt_voucher_count);
            itemRowCoupon.txtVoucherContent = (TextView) frameView.findViewById(R.id.txtVoucherContent);
            itemRowCoupon.txtRemainingDay = (TextView) frameView.findViewById(R.id.txtRemainingDay);
            itemRowCoupon.imgCouponBackground = (ImageView) frameView.findViewById(R.id.img_coupon_background);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowCoupon itemRowCoupon, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_root_voucher).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCoupon.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowCoupon.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowCoupon(Campaign campaign2, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(campaign2, "campaign");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.campaign = campaign2;
        this.onClickListener = function1;
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowCoupon, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCoupon itemRowCoupon, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeInDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowCoupon itemRowCoupon) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeOutDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeTouch(float f, float f2, float f3, float f4) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipingDirection(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowCoupon itemRowCoupon, int i) {
        }

        public DirectionalViewBinder(ItemRowCoupon itemRowCoupon) {
            super(itemRowCoupon, R.layout.item_row_voucher, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCoupon itemRowCoupon) {
            itemRowCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowCoupon itemRowCoupon = (ItemRowCoupon) getResolver();
            boolean isNullable = isNullable();
            if (itemRowCoupon != null && isNullable) {
                itemRowCoupon.txtVoucherCount = null;
                itemRowCoupon.txtVoucherContent = null;
                itemRowCoupon.txtRemainingDay = null;
                itemRowCoupon.imgCouponBackground = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCoupon itemRowCoupon, SwipePlaceHolderView.FrameView frameView) {
            itemRowCoupon.txtVoucherCount = (TextView) frameView.findViewById(R.id.txt_voucher_count);
            itemRowCoupon.txtVoucherContent = (TextView) frameView.findViewById(R.id.txtVoucherContent);
            itemRowCoupon.txtRemainingDay = (TextView) frameView.findViewById(R.id.txtRemainingDay);
            itemRowCoupon.imgCouponBackground = (ImageView) frameView.findViewById(R.id.img_coupon_background);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowCoupon itemRowCoupon, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_root_voucher).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCoupon.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowCoupon.onClick();
                }
            });
        }
    }

    public final TextView getTxtVoucherCount() {
        TextView textView = this.txtVoucherCount;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtVoucherCount");
        }
        return textView;
    }

    public final void setTxtVoucherCount(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVoucherCount = textView;
    }

    public final TextView getTxtVoucherContent() {
        TextView textView = this.txtVoucherContent;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtVoucherContent");
        }
        return textView;
    }

    public final void setTxtVoucherContent(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVoucherContent = textView;
    }

    public final TextView getTxtRemainingDay() {
        TextView textView = this.txtRemainingDay;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRemainingDay");
        }
        return textView;
    }

    public final void setTxtRemainingDay(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtRemainingDay = textView;
    }

    public final ImageView getImgCouponBackground() {
        ImageView imageView = this.imgCouponBackground;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgCouponBackground");
        }
        return imageView;
    }

    public final void setImgCouponBackground(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgCouponBackground = imageView;
    }

    public final void onClick() {
        Function1<String, Unit> function1 = this.onClickListener;
        String id = this.campaign.getId();
        if (id == null) {
            id = "";
        }
        function1.invoke(id);
    }

    public final void onResolve() {
        ImageView imageView = this.imgCouponBackground;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgCouponBackground");
        }
        Context context = imageView.getContext();
        String image = this.campaign.getImage();
        if (image != null) {
            RequestBuilder requestBuilder = (RequestBuilder) Glide.with(context).load(image).centerCrop();
            ImageView imageView2 = this.imgCouponBackground;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgCouponBackground");
            }
            requestBuilder.into(imageView2);
        }
        if (this.campaign.getCouponCount() == null) {
            TextView textView = this.txtVoucherCount;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtVoucherCount");
            }
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.txtVoucherCount;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtVoucherCount");
            }
            textView2.setVisibility(0);
            TextView textView3 = this.txtVoucherCount;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtVoucherCount");
            }
            StringBuilder append = new StringBuilder().append(String.valueOf(this.campaign.getCouponCount()) + " ");
            TextView textView4 = this.txtVoucherContent;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtVoucherContent");
            }
            String string = textView4.getContext().getString(R.string.str_vouchers);
            Intrinsics.checkNotNullExpressionValue(string, "txtVoucherContent.contex…ng(R.string.str_vouchers)");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            textView3.setText(append.append(lowerCase).toString());
        }
        TextView textView5 = this.txtVoucherContent;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtVoucherContent");
        }
        textView5.setText(this.campaign.getDescription());
        TextView textView6 = this.txtRemainingDay;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRemainingDay");
        }
        ViewExtsKt.formatHtmlCompact(textView6, this.campaign.getTimeLeft());
    }
}
