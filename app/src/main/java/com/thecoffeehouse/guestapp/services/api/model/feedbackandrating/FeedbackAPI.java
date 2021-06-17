package com.thecoffeehouse.guestapp.services.api.model.feedbackandrating;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackAPI;", "", "sendFeedback", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackResponse;", "feedbackRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackRequest;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: FeedbackAPI.kt */
public interface FeedbackAPI {
    @POST("user/feedback")
    LiveData<ApiResponse<FeedbackResponse>> sendFeedback(@Body FeedbackRequest feedbackRequest);
}
