package com.thecoffeehouse.guestapp.screens.more.newsandpromotions;

import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: NewsAndPromotionsDialogFragment.kt */
final class NewsAndPromotionsDialogFragment$initViews$1 extends Lambda implements Function1<NewsAndPromotionResponse, Unit> {
    final /* synthetic */ NewsAndPromotionsDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewsAndPromotionsDialogFragment$initViews$1(NewsAndPromotionsDialogFragment newsAndPromotionsDialogFragment) {
        super(1);
        this.this$0 = newsAndPromotionsDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NewsAndPromotionResponse newsAndPromotionResponse) {
        invoke(newsAndPromotionResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(NewsAndPromotionResponse newsAndPromotionResponse) {
        Intrinsics.checkNotNullParameter(newsAndPromotionResponse, "it");
        this.this$0.stopAndHideShimmer();
        this.this$0.addItemRowNewsAndPromotions(newsAndPromotionResponse.getNewsAndPromotions());
    }
}
