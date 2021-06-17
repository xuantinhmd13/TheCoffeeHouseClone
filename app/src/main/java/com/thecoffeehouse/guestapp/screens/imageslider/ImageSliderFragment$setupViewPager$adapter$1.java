package com.thecoffeehouse.guestapp.screens.imageslider;

import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "velocityX", "", "velocityY", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ImageSliderFragment.kt */
final class ImageSliderFragment$setupViewPager$adapter$1 extends Lambda implements Function2<Float, Float, Unit> {
    final /* synthetic */ ImageSliderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageSliderFragment$setupViewPager$adapter$1(ImageSliderFragment imageSliderFragment) {
        super(2);
        this.this$0 = imageSliderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
        invoke(f.floatValue(), f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f, float f2) {
        if (f > ((float) ImageSliderFragment.access$getMDefaultSwipeFlingVelocity$p(this.this$0))) {
            ImageViewPager imageViewPager = (ImageViewPager) this.this$0._$_findCachedViewById(R.id.view_pager_images);
            Intrinsics.checkNotNullExpressionValue(imageViewPager, "view_pager_images");
            ((ImageViewPager) this.this$0._$_findCachedViewById(R.id.view_pager_images)).setCurrentItem(imageViewPager.getCurrentItem() - 1, true);
        } else if (f < ((float) (-ImageSliderFragment.access$getMDefaultSwipeFlingVelocity$p(this.this$0)))) {
            ImageViewPager imageViewPager2 = (ImageViewPager) this.this$0._$_findCachedViewById(R.id.view_pager_images);
            Intrinsics.checkNotNullExpressionValue(imageViewPager2, "view_pager_images");
            ((ImageViewPager) this.this$0._$_findCachedViewById(R.id.view_pager_images)).setCurrentItem(imageViewPager2.getCurrentItem() + 1, true);
        } else {
            this.this$0.dismiss();
        }
    }
}
