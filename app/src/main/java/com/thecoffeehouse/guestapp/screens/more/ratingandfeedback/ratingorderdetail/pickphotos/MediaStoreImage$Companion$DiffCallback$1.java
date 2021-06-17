package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage$Companion$DiffCallback$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MediaStoreImage.kt */
public final class MediaStoreImage$Companion$DiffCallback$1 extends DiffUtil.ItemCallback<MediaStoreImage> {
    MediaStoreImage$Companion$DiffCallback$1() {
    }

    public boolean areItemsTheSame(MediaStoreImage mediaStoreImage, MediaStoreImage mediaStoreImage2) {
        Intrinsics.checkNotNullParameter(mediaStoreImage, "oldItem");
        Intrinsics.checkNotNullParameter(mediaStoreImage2, "newItem");
        return mediaStoreImage.getId() == mediaStoreImage2.getId();
    }

    public boolean areContentsTheSame(MediaStoreImage mediaStoreImage, MediaStoreImage mediaStoreImage2) {
        Intrinsics.checkNotNullParameter(mediaStoreImage, "oldItem");
        Intrinsics.checkNotNullParameter(mediaStoreImage2, "newItem");
        return Intrinsics.areEqual(mediaStoreImage, mediaStoreImage2);
    }
}
