package com.thecoffeehouse.guestapp.screens.imageslider;

import android.view.MotionEvent;
import com.github.chrisbanes.photoview.OnSingleFlingListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/thecoffeehouse/guestapp/screens/imageslider/ImageSliderViewPagerAdapter$instantiateItem$1", "Lcom/github/chrisbanes/photoview/OnSingleFlingListener;", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ImageSliderViewPagerAdapter.kt */
public final class ImageSliderViewPagerAdapter$instantiateItem$1 implements OnSingleFlingListener {
    final /* synthetic */ ImageSliderViewPagerAdapter this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ImageSliderViewPagerAdapter$instantiateItem$1(ImageSliderViewPagerAdapter imageSliderViewPagerAdapter) {
        this.this$0 = imageSliderViewPagerAdapter;
    }

    @Override // com.github.chrisbanes.photoview.OnSingleFlingListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.this$0.onFlingListener.invoke(Float.valueOf(f), Float.valueOf(f2));
        return true;
    }
}
