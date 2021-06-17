package com.thecoffeehouse.guestapp.screens.home;

import com.mindorks.placeholderview.PlaceHolderView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
final class HomeFragment$initViews$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$initViews$2(HomeFragment homeFragment) {
        super(0);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        PlaceHolderView placeHolderView = this.this$0.mMediaBoxPlaceHolderView;
        if (placeHolderView != null) {
            placeHolderView.removeAllViews();
        }
        this.this$0.resetData();
    }
}
