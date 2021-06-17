package com.thecoffeehouse.guestapp.screens.stores;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/stores/StoreDetailBottomSheetFragment$initStoreHeader$2", "Landroidx/recyclerview/widget/LinearLayoutManager;", "checkLayoutParams", "", "lp", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoreDetailBottomSheetFragment.kt */
public final class StoreDetailBottomSheetFragment$initStoreHeader$2 extends LinearLayoutManager {
    final /* synthetic */ StoreDetailBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoreDetailBottomSheetFragment$initStoreHeader$2(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment, Context context, int i, boolean z) {
        super(context, i, z);
        this.this$0 = storeDetailBottomSheetFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        Pair<Integer, Integer> screenWidthAndHeight;
        Integer first;
        int i = 0;
        if (StoreDetailBottomSheetFragment.access$getStore$p(this.this$0).getImages().size() <= 1) {
            if (layoutParams != null) {
                layoutParams.setMarginEnd(0);
            }
            return super.checkLayoutParams(layoutParams);
        } else if (layoutParams == null) {
            return true;
        } else {
            MainActivity access$getMainActivity = StoreDetailBottomSheetFragment.access$getMainActivity(this.this$0);
            if (!(access$getMainActivity == null || (screenWidthAndHeight = ViewExtsKt.getScreenWidthAndHeight(access$getMainActivity)) == null || (first = screenWidthAndHeight.getFirst()) == null)) {
                i = first.intValue();
            }
            layoutParams.width = (i * 4) / 5;
            return true;
        }
    }
}
