package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "favouriteStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$1 extends Lambda implements Function1<Store, Unit> {
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$1(StoresFragment storesFragment) {
        super(1);
        this.this$0 = storesFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Store store) {
        invoke(store);
        return Unit.INSTANCE;
    }

    public final void invoke(Store store) {
        Intrinsics.checkNotNullParameter(store, "favouriteStore");
        ((StoresViewModel) this.this$0.getViewModel()).saveFavouriteStoreToLocal(store);
        Iterator<Store> it = this.this$0.getMStores().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), store.getId())) {
                break;
            } else {
                i++;
            }
        }
        GeneralKt.log("changedItem: " + i);
        GeneralKt.log("favouriteStore: " + store.isFavourite());
        if (i >= 0) {
            this.this$0.getMapViewInteractions().refreshMarker$app_liveRelease(store);
            List<Object> allViewResolvers = this.this$0.getMPlaceHolderView().getAllViewResolvers();
            Intrinsics.checkNotNullExpressionValue(allViewResolvers, "mPlaceHolderView.allViewResolvers");
            for (T t : allViewResolvers) {
                if (t instanceof ItemRowPickStore) {
                    T t2 = t;
                    if (Intrinsics.areEqual(t2.getStore().getId(), store.getId())) {
                        t2.getStore().setFavourite(store.isFavourite());
                        t2.onResolve();
                        if (!(this.this$0.isRecentStore(t2.getStore().getId()))) {
                            this.this$0.getMPlaceHolderView().removeView(t);
                            if (store.isFavourite()) {
                                if ((!((StoresViewModel) this.this$0.getViewModel()).getFavouriteStoreIds().isEmpty()) && !(this.this$0.mIsAddedFavouriteHeader)) {
                                    this.this$0.getMPlaceHolderView().addViewBefore(StoresFragment.access$getMOtherStoreHeader$p(this.this$0), StoresFragment.access$getMFavouriteStoreHeader$p(this.this$0));
                                    this.this$0.mIsAddedFavouriteHeader = true;
                                }
                                this.this$0.getMPlaceHolderView().addViewBefore(StoresFragment.access$getMOtherStoreHeader$p(this.this$0), t);
                            } else {
                                this.this$0.getMPlaceHolderView().addViewAfter(StoresFragment.access$getMOtherStoreHeader$p(this.this$0), t);
                                Iterator<T> it2 = ((StoresViewModel) this.this$0.getViewModel()).getFavouriteStoreIds().iterator();
                                while (it2.hasNext()) {
                                    GeneralKt.log("favourite: " + it2.next().intValue());
                                }
                                ArrayList arrayList = new ArrayList();
                                for (T t3 : ((StoresViewModel) this.this$0.getViewModel()).getFavouriteStoreIds()) {
                                    if (!this.this$0.isRecentStore(Integer.valueOf(t3.intValue()))) {
                                        arrayList.add(t3);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    this.this$0.getMPlaceHolderView().removeView(StoresFragment.access$getMFavouriteStoreHeader$p(this.this$0));
                                    this.this$0.mIsAddedFavouriteHeader = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
