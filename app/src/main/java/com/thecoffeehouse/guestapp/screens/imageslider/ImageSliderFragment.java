package com.thecoffeehouse.guestapp.screens.imageslider;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/imageslider/ImageSliderFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "defaultPosition", "", "images", "", "", "mDefaultSwipeFlingVelocity", "initViews", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "setupViewPager", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ImageSliderFragment.kt */
public final class ImageSliderFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private int defaultPosition;
    private List<String> images = new ArrayList();
    private final int mDefaultSwipeFlingVelocity = 2000;

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.activity_image_slider;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/imageslider/ImageSliderFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/imageslider/ImageSliderFragment;", "images", "", "", "defaultPosition", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ImageSliderFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ImageSliderFragment newInstance$default(Companion companion, List list, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.newInstance(list, i);
        }

        public final ImageSliderFragment newInstance(List<String> list, int i) {
            Intrinsics.checkNotNullParameter(list, "images");
            ImageSliderFragment imageSliderFragment = new ImageSliderFragment();
            imageSliderFragment.images = list;
            imageSliderFragment.defaultPosition = i;
            return imageSliderFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        if (!this.images.isEmpty()) {
            setupViewPager(view);
        }
    }

    private final void setupViewPager(View view) {
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager_images);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_close_slider);
        ImageSliderViewPagerAdapter imageSliderViewPagerAdapter = new ImageSliderViewPagerAdapter(this.images, new ImageSliderFragment$setupViewPager$adapter$1(this));
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPagerAdapter");
        viewPager.setAdapter(imageSliderViewPagerAdapter);
        viewPager.setCurrentItem(this.defaultPosition + LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
        Intrinsics.checkNotNullExpressionValue(imageView, "imgClose");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ImageSliderFragment$setupViewPager$1(this), 1, null);
    }
}
