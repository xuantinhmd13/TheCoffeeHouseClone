package com.thecoffeehouse.guestapp.screens.home;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: GuideUserOrderAtTableDialogFragment.kt */
final class GuideUserOrderAtTableDialogFragment$initViews$3 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ GuideUserOrderAtTableDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GuideUserOrderAtTableDialogFragment$initViews$3(GuideUserOrderAtTableDialogFragment guideUserOrderAtTableDialogFragment) {
        super(1);
        this.this$0 = guideUserOrderAtTableDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(view, "it");
        WebViewDialogFragment newInstance$default = WebViewDialogFragment.Companion.newInstance$default(WebViewDialogFragment.Companion, new PostsItem(null, null, null, null, null, null, "https://tchapp.page.link/listordertable", null, 191, null), false, 2, null);
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it1");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
    }
}
