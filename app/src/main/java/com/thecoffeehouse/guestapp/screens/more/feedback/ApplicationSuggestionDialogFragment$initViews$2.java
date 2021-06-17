package com.thecoffeehouse.guestapp.screens.more.feedback;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.feedbackandrating.FeedbackResponse;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ApplicationSuggestionDialogFragment.kt */
final class ApplicationSuggestionDialogFragment$initViews$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ ApplicationSuggestionDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApplicationSuggestionDialogFragment$initViews$2(ApplicationSuggestionDialogFragment applicationSuggestionDialogFragment) {
        super(1);
        this.this$0 = applicationSuggestionDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        AppCompatEditText appCompatEditText = this.this$0.edtSuggestion;
        LiveData<Resource<FeedbackResponse>> sendFeedback = this.this$0.getMMoreViewModel().sendFeedback(StringExtsKt.toStringOrEmpty(String.valueOf(appCompatEditText != null ? appCompatEditText.getText() : null)));
        ApplicationSuggestionDialogFragment applicationSuggestionDialogFragment = this.this$0;
        sendFeedback.observe(applicationSuggestionDialogFragment, applicationSuggestionDialogFragment.mObserverApplicationSuggestion);
        Toast.makeText(this.this$0.requireContext(), (int) R.string.str_thank_you_for_your_feedback, 0).show();
        this.this$0.dismiss();
    }
}
