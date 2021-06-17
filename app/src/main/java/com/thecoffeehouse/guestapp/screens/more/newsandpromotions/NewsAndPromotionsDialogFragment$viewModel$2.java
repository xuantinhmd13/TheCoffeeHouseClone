package com.thecoffeehouse.guestapp.screens.more.newsandpromotions;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/NewsAndPromotionViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: NewsAndPromotionsDialogFragment.kt */
public final class NewsAndPromotionsDialogFragment$viewModel$2 extends Lambda implements Function0<NewsAndPromotionViewModel> {
    final /* synthetic */ NewsAndPromotionsDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewsAndPromotionsDialogFragment$viewModel$2(NewsAndPromotionsDialogFragment newsAndPromotionsDialogFragment) {
        super(0);
        this.this$0 = newsAndPromotionsDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NewsAndPromotionViewModel invoke() {
        return (NewsAndPromotionViewModel) new ViewModelProvider(this.this$0, new NewsAndPromotionViewModelFactory(this.this$0, null)).get(NewsAndPromotionViewModel.class);
    }
}
