package com.thecoffeehouse.guestapp.screens.home;

import androidx.lifecycle.CoroutineLiveDataKt;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
final class HomeFragment$initViews$1 implements Runnable {
    final /* synthetic */ HomeFragment this$0;

    HomeFragment$initViews$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    public final void run() {
        this.this$0.handler.postDelayed(HomeFragment.access$getPeriodicUpdate$p(this.this$0), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        this.this$0.autoScrollRecycleView();
    }
}
