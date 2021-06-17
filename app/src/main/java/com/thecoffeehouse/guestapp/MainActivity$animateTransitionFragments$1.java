package com.thecoffeehouse.guestapp;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$animateTransitionFragments$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$animateTransitionFragments$1 implements Animation.AnimationListener {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ MainActivity this$0;

    public void onAnimationRepeat(Animation animation) {
    }

    MainActivity$animateTransitionFragments$1(MainActivity mainActivity, Fragment fragment) {
        this.this$0 = mainActivity;
        this.$fragment = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        Fragment fragment = this.$fragment;
        if (Intrinsics.areEqual(fragment, this.this$0.getMHomeFragment())) {
            MainActivity mainActivity = this.this$0;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) mainActivity._$_findCachedViewById(R.id.fragment_home_container);
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "fragment_home_container");
            mainActivity.setVisibilityShowLayout(fragmentContainerView);
            MainActivity mainActivity2 = this.this$0;
            FrameLayout frameLayout = (FrameLayout) mainActivity2._$_findCachedViewById(R.id.fragment_order_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "fragment_order_container");
            FrameLayout frameLayout2 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "fragment_stores_container");
            FrameLayout frameLayout3 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "fragment_rewards_container");
            FrameLayout frameLayout4 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout4, "fragment_more_container");
            mainActivity2.setVisibilityGoneLayouts(frameLayout, frameLayout2, frameLayout3, frameLayout4);
            ((FragmentContainerView) this.this$0._$_findCachedViewById(R.id.fragment_home_container)).setBackgroundColor(0);
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMOrderFragment())) {
            MainActivity mainActivity3 = this.this$0;
            FrameLayout frameLayout5 = (FrameLayout) mainActivity3._$_findCachedViewById(R.id.fragment_order_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout5, "fragment_order_container");
            mainActivity3.setVisibilityShowLayout(frameLayout5);
            MainActivity mainActivity4 = this.this$0;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) mainActivity4._$_findCachedViewById(R.id.fragment_home_container);
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "fragment_home_container");
            FrameLayout frameLayout6 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout6, "fragment_stores_container");
            FrameLayout frameLayout7 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout7, "fragment_rewards_container");
            FrameLayout frameLayout8 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout8, "fragment_more_container");
            mainActivity4.setVisibilityGoneLayouts(fragmentContainerView2, frameLayout6, frameLayout7, frameLayout8);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_order_container)).setBackgroundColor(0);
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMStoresFragment())) {
            MainActivity mainActivity5 = this.this$0;
            FrameLayout frameLayout9 = (FrameLayout) mainActivity5._$_findCachedViewById(R.id.fragment_stores_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout9, "fragment_stores_container");
            mainActivity5.setVisibilityShowLayout(frameLayout9);
            MainActivity mainActivity6 = this.this$0;
            FragmentContainerView fragmentContainerView3 = (FragmentContainerView) mainActivity6._$_findCachedViewById(R.id.fragment_home_container);
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView3, "fragment_home_container");
            FrameLayout frameLayout10 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_order_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout10, "fragment_order_container");
            FrameLayout frameLayout11 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout11, "fragment_rewards_container");
            FrameLayout frameLayout12 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout12, "fragment_more_container");
            mainActivity6.setVisibilityGoneLayouts(fragmentContainerView3, frameLayout10, frameLayout11, frameLayout12);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container)).setBackgroundColor(0);
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMRewardsAndCouponsFragment())) {
            MainActivity mainActivity7 = this.this$0;
            FrameLayout frameLayout13 = (FrameLayout) mainActivity7._$_findCachedViewById(R.id.fragment_rewards_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout13, "fragment_rewards_container");
            mainActivity7.setVisibilityShowLayout(frameLayout13);
            MainActivity mainActivity8 = this.this$0;
            FragmentContainerView fragmentContainerView4 = (FragmentContainerView) mainActivity8._$_findCachedViewById(R.id.fragment_home_container);
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView4, "fragment_home_container");
            FrameLayout frameLayout14 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_order_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout14, "fragment_order_container");
            FrameLayout frameLayout15 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout15, "fragment_stores_container");
            FrameLayout frameLayout16 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout16, "fragment_more_container");
            mainActivity8.setVisibilityGoneLayouts(fragmentContainerView4, frameLayout14, frameLayout15, frameLayout16);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container)).setBackgroundColor(0);
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMMoreFragment())) {
            MainActivity mainActivity9 = this.this$0;
            FrameLayout frameLayout17 = (FrameLayout) mainActivity9._$_findCachedViewById(R.id.fragment_more_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout17, "fragment_more_container");
            mainActivity9.setVisibilityShowLayout(frameLayout17);
            MainActivity mainActivity10 = this.this$0;
            FragmentContainerView fragmentContainerView5 = (FragmentContainerView) mainActivity10._$_findCachedViewById(R.id.fragment_home_container);
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView5, "fragment_home_container");
            FrameLayout frameLayout18 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_order_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout18, "fragment_order_container");
            FrameLayout frameLayout19 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout19, "fragment_stores_container");
            FrameLayout frameLayout20 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout20, "fragment_rewards_container");
            mainActivity10.setVisibilityGoneLayouts(fragmentContainerView5, frameLayout18, frameLayout19, frameLayout20);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container)).setBackgroundColor(0);
        }
    }

    public void onAnimationStart(Animation animation) {
        Fragment fragment = this.$fragment;
        if (Intrinsics.areEqual(fragment, this.this$0.getMHomeFragment())) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) this.this$0._$_findCachedViewById(R.id.fragment_home_container);
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "fragment_home_container");
            fragmentContainerView.setVisibility(0);
            ((FragmentContainerView) this.this$0._$_findCachedViewById(R.id.fragment_home_container)).setBackgroundColor(ContextCompat.getColor(this.this$0, R.color.colorBackgroundWindow));
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMOrderFragment())) {
            FrameLayout frameLayout = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_order_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "fragment_order_container");
            frameLayout.setVisibility(0);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_order_container)).setBackgroundColor(ContextCompat.getColor(this.this$0, R.color.colorBackgroundWindow));
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMStoresFragment())) {
            FrameLayout frameLayout2 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "fragment_stores_container");
            frameLayout2.setVisibility(0);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_stores_container)).setBackgroundColor(ContextCompat.getColor(this.this$0, R.color.colorBackgroundWindow));
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMRewardsAndCouponsFragment())) {
            FrameLayout frameLayout3 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "fragment_rewards_container");
            frameLayout3.setVisibility(0);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_rewards_container)).setBackgroundColor(ContextCompat.getColor(this.this$0, R.color.colorBackgroundWindow));
        } else if (Intrinsics.areEqual(fragment, this.this$0.getMMoreFragment())) {
            FrameLayout frameLayout4 = (FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container);
            Intrinsics.checkNotNullExpressionValue(frameLayout4, "fragment_more_container");
            frameLayout4.setVisibility(0);
            ((FrameLayout) this.this$0._$_findCachedViewById(R.id.fragment_more_container)).setBackgroundColor(ContextCompat.getColor(this.this$0, R.color.colorBackgroundWindow));
        }
    }
}
