package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: AccumulatePointsFragment.kt */
final class AccumulatePointsFragment$initButtonCards$4 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ AccumulatePointsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AccumulatePointsFragment$initButtonCards$4(AccumulatePointsFragment accumulatePointsFragment) {
        super(1);
        this.this$0 = accumulatePointsFragment;
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
        String yourInterestUrl = ((AccumulatePointsViewModel) this.this$0.getViewModel()).getYourInterestUrl();
        GeneralKt.log("yourInterestUrl:" + yourInterestUrl);
        WebViewDialogFragment newInstance$default = WebViewDialogFragment.Companion.newInstance$default(WebViewDialogFragment.Companion, new PostsItem(null, null, yourInterestUrl, null, null, this.this$0.getString(R.string.str_your_interests), yourInterestUrl, null, 155, null), false, 2, null);
        MainActivity access$getMainActivity = AccumulatePointsFragment.access$getMainActivity(this.this$0);
        if (access$getMainActivity != null) {
            FragmentManager supportFragmentManager = access$getMainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it1.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
        TrackingScreenService.Companion.logScreenViewByViewId(TrackingScreenService.Member_Program_Page, AccumulatePointsFragment.access$getMLayoutYourInterest$p(this.this$0));
    }
}
