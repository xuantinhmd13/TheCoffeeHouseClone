package com.thecoffeehouse.guestapp;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$navigateTabOrderWithMethod$2", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "onFragmentResumed", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$navigateTabOrderWithMethod$2 extends FragmentManager.FragmentLifecycleCallbacks {
    final /* synthetic */ Uri $url;
    final /* synthetic */ MainActivity this$0;

    MainActivity$navigateTabOrderWithMethod$2(MainActivity mainActivity, Uri uri) {
        this.this$0 = mainActivity;
        this.$url = uri;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(fragment, "f");
        super.onFragmentResumed(fragmentManager, fragment);
        if (fragment instanceof OrderFragment) {
            this.this$0.getMOrderFragment().setOnInitDataDone(new MainActivity$navigateTabOrderWithMethod$2$onFragmentResumed$1(this));
        }
    }
}
