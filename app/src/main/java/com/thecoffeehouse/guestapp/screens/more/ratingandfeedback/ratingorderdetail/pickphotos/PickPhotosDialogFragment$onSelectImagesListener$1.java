package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickPhotosDialogFragment.kt */
public final class PickPhotosDialogFragment$onSelectImagesListener$1 extends Lambda implements Function1<ArrayList<MediaStoreImage>, Unit> {
    public static final PickPhotosDialogFragment$onSelectImagesListener$1 INSTANCE = new PickPhotosDialogFragment$onSelectImagesListener$1();

    PickPhotosDialogFragment$onSelectImagesListener$1() {
        super(1);
    }

    public final void invoke(ArrayList<MediaStoreImage> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "it");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<MediaStoreImage> arrayList) {
        invoke(arrayList);
        return Unit.INSTANCE;
    }
}
