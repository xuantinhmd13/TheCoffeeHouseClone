package com.thecoffeehouse.guestapp.screens.more.settings;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.WebLinks;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SettingsDialogFragment.kt */
public final class SettingsDialogFragment$initAboutUsSetting$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ SettingsDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsDialogFragment$initAboutUsSetting$1(SettingsDialogFragment settingsDialogFragment) {
        super(1);
        this.this$0 = settingsDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        WebLinks webLinks;
        LiveData<GetMetadataResponse> metadata2;
        GetMetadataResponse value2;
        WebLinks webLinks2;
        Intrinsics.checkNotNullParameter(view, "it");
        WebViewDialogFragment.Companion companion = WebViewDialogFragment.Companion;
        String string = this.this$0.getString(R.string.str_about_us);
        TCHApplication tCHApplication = this.this$0.getTCHApplication();
        String story = (tCHApplication == null || (metadata2 = tCHApplication.m0getMetadata()) == null || (value2 = metadata2.getValue()) == null || (webLinks2 = value2.getWebLinks()) == null) ? null : webLinks2.getStory();
        TCHApplication tCHApplication2 = this.this$0.getTCHApplication();
        WebViewDialogFragment newInstance$default = WebViewDialogFragment.Companion.newInstance$default(companion, new PostsItem(null, null, story, null, null, string, (tCHApplication2 == null || (metadata = tCHApplication2.m0getMetadata()) == null || (value = metadata.getValue()) == null || (webLinks = value.getWebLinks()) == null) ? null : webLinks.getStory(), null, 155, null), false, 2, null);
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it1.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
    }
}
