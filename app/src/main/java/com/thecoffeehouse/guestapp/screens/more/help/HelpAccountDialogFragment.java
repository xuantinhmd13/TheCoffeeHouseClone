package com.thecoffeehouse.guestapp.screens.more.help;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/help/HelpAccountDialogFragment;", "Lcom/thecoffeehouse/guestapp/screens/more/help/HelpDialogFragment;", "()V", "initFrequentlyQuestions", "", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HelpAccountDialogFragment.kt */
public final class HelpAccountDialogFragment extends HelpDialogFragment {
    private HashMap _$_findViewCache;

    @Override // com.thecoffeehouse.guestapp.screens.more.help.HelpDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.more.help.HelpDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.thecoffeehouse.guestapp.screens.more.help.HelpDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_help;
    }

    @Override // com.thecoffeehouse.guestapp.screens.more.help.HelpDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.more.help.HelpDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_help_account);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_help_account");
        _$_findCachedViewById.setVisibility(8);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_help_gift_card);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_help_gift_card");
        _$_findCachedViewById2.setVisibility(8);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_help_subscription);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_help_subscription");
        _$_findCachedViewById3.setVisibility(8);
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_help_membership);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_help_membership");
        _$_findCachedViewById4.setVisibility(8);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_frequently_questions_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_frequently_questions_title");
        textView.setVisibility(8);
        initFrequentlyQuestions();
    }

    private final void initFrequentlyQuestions() {
        PlaceHolderView placeHolderView = (PlaceHolderView) _$_findCachedViewById(R.id.phv_frequently_questions);
        Intrinsics.checkNotNullExpressionValue(placeHolderView, "phv_frequently_questions");
        int i = 0;
        ViewExtsKt.marginTop(placeHolderView, 0);
        PlaceHolderView placeHolderView2 = (PlaceHolderView) _$_findCachedViewById(R.id.phv_frequently_questions);
        Intrinsics.checkNotNullExpressionValue(placeHolderView2, "phv_frequently_questions");
        RecyclerView.ItemAnimator itemAnimator = placeHolderView2.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        while (true) {
            ((PlaceHolderView) _$_findCachedViewById(R.id.phv_frequently_questions)).addView(new ItemRowFrequentlyQuestion("Tôi quên mật khẩu thì làm cách nào để lấy lại?", "Bạn có thể mua nhiều Gói một lúc trên cùng 1 tài khoản. Tuy nhiên, hạn sử dụng mỗi gói là có giới hạn.", new HelpAccountDialogFragment$initFrequentlyQuestions$itemRowFrequentlyQuestion$1(this, i)));
            if (i != 10) {
                i++;
            } else {
                return;
            }
        }
    }
}
