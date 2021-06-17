package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickPhotosDialogFragment.kt */
final class PickPhotosDialogFragment$initViews$galleryAdapter$1 extends Lambda implements Function1<MediaStoreImage, Unit> {
    final /* synthetic */ RecyclerView $rcvPhotos;
    final /* synthetic */ PickPhotosDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickPhotosDialogFragment$initViews$galleryAdapter$1(PickPhotosDialogFragment pickPhotosDialogFragment, RecyclerView recyclerView) {
        super(1);
        this.this$0 = pickPhotosDialogFragment;
        this.$rcvPhotos = recyclerView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MediaStoreImage mediaStoreImage) {
        invoke(mediaStoreImage);
        return Unit.INSTANCE;
    }

    public final void invoke(MediaStoreImage mediaStoreImage) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(mediaStoreImage, "it");
        if (mediaStoreImage.getSelectedPosition() != null) {
            this.this$0.selectedImages.remove(mediaStoreImage);
            mediaStoreImage.setSelectedPosition(null);
            int i = 0;
            for (Object obj : this.this$0.selectedImages) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((MediaStoreImage) obj).setSelectedPosition(Integer.valueOf(i2));
                i = i2;
            }
        } else if (this.this$0.selectedImages.size() < this.this$0.selectCount) {
            this.this$0.selectedImages.add(mediaStoreImage);
            mediaStoreImage.setSelectedPosition(Integer.valueOf(this.this$0.selectedImages.size()));
        }
        RecyclerView recyclerView = this.$rcvPhotos;
        if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
            adapter.notifyDataSetChanged();
        }
        this.this$0.checkShowButtonSelectPhotos();
    }
}
