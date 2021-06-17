package com.thecoffeehouse.guestapp.services.local;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/local/UserConfigs;", "", "()V", "favouriteProductIds", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getFavouriteProductIds", "()Ljava/util/HashSet;", "setFavouriteProductIds", "(Ljava/util/HashSet;)V", "favouriteStoreIds", "", "getFavouriteStoreIds", "setFavouriteStoreIds", "firstTimeUsingOrderAtTable", "", "getFirstTimeUsingOrderAtTable", "()Z", "setFirstTimeUsingOrderAtTable", "(Z)V", "showPopupShowPopupOrderAtTableCount", "getShowPopupShowPopupOrderAtTableCount", "()I", "setShowPopupShowPopupOrderAtTableCount", "(I)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: User.kt */
public final class UserConfigs {
    private HashSet<String> favouriteProductIds = new HashSet<>();
    private HashSet<Integer> favouriteStoreIds = new HashSet<>();
    private boolean firstTimeUsingOrderAtTable = true;
    private int showPopupShowPopupOrderAtTableCount = -1;

    public final HashSet<Integer> getFavouriteStoreIds() {
        return this.favouriteStoreIds;
    }

    public final void setFavouriteStoreIds(HashSet<Integer> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.favouriteStoreIds = hashSet;
    }

    public final HashSet<String> getFavouriteProductIds() {
        return this.favouriteProductIds;
    }

    public final void setFavouriteProductIds(HashSet<String> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.favouriteProductIds = hashSet;
    }

    public final boolean getFirstTimeUsingOrderAtTable() {
        return this.firstTimeUsingOrderAtTable;
    }

    public final void setFirstTimeUsingOrderAtTable(boolean z) {
        this.firstTimeUsingOrderAtTable = z;
    }

    public final int getShowPopupShowPopupOrderAtTableCount() {
        return this.showPopupShowPopupOrderAtTableCount;
    }

    public final void setShowPopupShowPopupOrderAtTableCount(int i) {
        this.showPopupShowPopupOrderAtTableCount = i;
    }
}
