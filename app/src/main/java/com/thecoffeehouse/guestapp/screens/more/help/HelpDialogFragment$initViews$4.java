package com.thecoffeehouse.guestapp.screens.more.help;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HelpDialogFragment.kt */
public final class HelpDialogFragment$initViews$4 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ HelpDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpDialogFragment$initViews$4(HelpDialogFragment helpDialogFragment) {
        super(1);
        this.this$0 = helpDialogFragment;
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
        WebViewDialogFragment newInstance$default = WebViewDialogFragment.Companion.newInstance$default(WebViewDialogFragment.Companion, new PostsItem(null, null, "https://feed.thecoffeehouse.com/moi-25-cho-nhom-minh/?mobile=1", null, null, "Membership Package", "https://feed.thecoffeehouse.com/moi-25-cho-nhom-minh/?mobile=1", null, 155, null), false, 2, null);
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
    }
}
