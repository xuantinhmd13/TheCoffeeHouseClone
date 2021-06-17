package com.thecoffeehouse.guestapp.screens.imageslider;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.github.chrisbanes.photoview.PhotoView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/imageslider/ImageSliderViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "images", "", "", "onFlingListener", "Lkotlin/Function2;", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "", "obj", "", "getCount", "instantiateItem", "isViewFromObject", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ImageSliderViewPagerAdapter.kt */
public final class ImageSliderViewPagerAdapter extends PagerAdapter {
    private final List<String> images;
    private final Function2<Float, Float, Unit> onFlingListener;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageSliderViewPagerAdapter(List<String> list, Function2<? super Float, ? super Float, Unit> function2) {
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(function2, "onFlingListener");
        this.images = list;
        this.onFlingListener = function2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Intrinsics.areEqual(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        int size = i % this.images.size();
        PhotoView photoView = new PhotoView(viewGroup.getContext());
        photoView.setOnSingleFlingListener(new ImageSliderViewPagerAdapter$instantiateItem$1(this));
        viewGroup.addView(photoView);
        Glide.with(photoView.getContext()).load(this.images.get(size)).into(photoView);
        return photoView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "obj");
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.images.size() == 1 ? 1 : Integer.MAX_VALUE;
    }
}
