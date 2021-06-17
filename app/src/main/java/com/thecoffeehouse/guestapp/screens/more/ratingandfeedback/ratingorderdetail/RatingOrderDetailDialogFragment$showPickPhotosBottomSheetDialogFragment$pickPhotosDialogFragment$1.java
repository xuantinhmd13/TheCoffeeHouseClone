package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos.MediaStoreImage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "selectedImages", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailDialogFragment.kt */
public final class RatingOrderDetailDialogFragment$showPickPhotosBottomSheetDialogFragment$pickPhotosDialogFragment$1 extends Lambda implements Function1<ArrayList<MediaStoreImage>, Unit> {
    final /* synthetic */ RatingOrderDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RatingOrderDetailDialogFragment$showPickPhotosBottomSheetDialogFragment$pickPhotosDialogFragment$1(RatingOrderDetailDialogFragment ratingOrderDetailDialogFragment) {
        super(1);
        this.this$0 = ratingOrderDetailDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<MediaStoreImage> arrayList) {
        invoke(arrayList);
        return Unit.INSTANCE;
    }

    public final void invoke(ArrayList<MediaStoreImage> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "selectedImages");
        ArrayList<MediaStoreImage> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next().getContentUri());
        }
        ArrayList arrayList4 = arrayList3;
        RatingOrderDetailView ratingOrderDetailView = this.this$0.mRatingOrderDetailView;
        if (ratingOrderDetailView != null) {
            ratingOrderDetailView.appendImages(arrayList4);
        }
    }
}
