package com.thecoffeehouse.guestapp.screens.more;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.feedbackandrating.FeedbackResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/MoreViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "sendFeedback", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackResponse;", "edtFeedback", "", "userProfile", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MoreViewModel.kt */
public final class MoreViewModel extends BaseViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final Profile userProfile() {
        return getApplication().requireClientManager().getUserProfile();
    }

    public final LiveData<Resource<FeedbackResponse>> sendFeedback(String str) {
        Intrinsics.checkNotNullParameter(str, "edtFeedback");
        return getApplication().requireClientManager().sendFeedback(str);
    }
}
