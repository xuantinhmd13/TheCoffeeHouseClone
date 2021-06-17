package com.thecoffeehouse.guestapp.screens.more.newsandpromotions;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionsAPI;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\nH\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/thecoffeehouse/guestapp/screens/more/newsandpromotions/NewsAndPromotionViewModel$fetchNewsAndPromotionsFromServer$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionResponse;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: NewsAndPromotionViewModel.kt */
public final class NewsAndPromotionViewModel$fetchNewsAndPromotionsFromServer$1 extends NetworkBoundResource<NewsAndPromotionResponse, NewsAndPromotionResponse> {
    private Class<NewsAndPromotionResponse> cachedResponseClass = NewsAndPromotionResponse.class;
    final /* synthetic */ NewsAndPromotionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewsAndPromotionViewModel$fetchNewsAndPromotionsFromServer$1(NewsAndPromotionViewModel newsAndPromotionViewModel, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = newsAndPromotionViewModel;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public Class<NewsAndPromotionResponse> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public void setCachedResponseClass(Class<NewsAndPromotionResponse> cls) {
        this.cachedResponseClass = cls;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<NewsAndPromotionResponse>> createCall() {
        return NewsAndPromotionsAPI.DefaultImpls.getNewsAndPromotion$default(NewsAndPromotionViewModel.access$getApplication$p(this.this$0).requireCommonServiceManager().getCommonApiService().getNewsAndPromotionService(), null, 1, null);
    }
}
