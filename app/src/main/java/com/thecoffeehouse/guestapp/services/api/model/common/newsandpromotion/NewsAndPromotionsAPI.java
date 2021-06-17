package com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import retrofit2.http.GET;
import retrofit2.http.Tag;

public interface NewsAndPromotionsAPI {
    @GET("news/newsfeed")
    LiveData<ApiResponse<NewsAndPromotionResponse>> getNewsAndPromotion(@Tag Object obj);

    public static final class DefaultImpls {
        public static /* synthetic */ LiveData getNewsAndPromotion$default(NewsAndPromotionsAPI newsAndPromotionsAPI, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return newsAndPromotionsAPI.getNewsAndPromotion(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewsAndPromotion");
        }
    }
}
