package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderCategoryView.kt */
public final class RatingOrderCategoryView$updateData$1$1$selectedView$1 extends Lambda implements Function1<View, Boolean> {
    public static final RatingOrderCategoryView$updateData$1$1$selectedView$1 INSTANCE = new RatingOrderCategoryView$updateData$1$1$selectedView$1();

    RatingOrderCategoryView$updateData$1$1$selectedView$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(View view) {
        return Boolean.valueOf(invoke(view));
    }

    public final boolean invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        return view instanceof RatingHintTextView;
    }
}
