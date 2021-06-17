package com.thecoffeehouse.guestapp.screens.more.help;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/help/HelpDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "initFrequentlyQuestions", "", "initGroupQuestions", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HelpDialogFragment.kt */
public class HelpDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
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

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_help;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        initGroupQuestions();
        initFrequentlyQuestions();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_help_account);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_help_account");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById, 0, new HelpDialogFragment$initViews$1(this), 1, null);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_help_gift_card);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_help_gift_card");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById2, 0, new HelpDialogFragment$initViews$2(this), 1, null);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_help_subscription);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_help_subscription");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById3, 0, new HelpDialogFragment$initViews$3(this), 1, null);
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_help_membership);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_help_membership");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById4, 0, new HelpDialogFragment$initViews$4(this), 1, null);
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_help));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new HelpDialogFragment$initToolbar$1(this), 1, null);
    }

    private final void initGroupQuestions() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_help_account);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_help_account");
        ((ImageView) _$_findCachedViewById.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_account);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_help_account);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_help_account");
        TextView textView = (TextView) _$_findCachedViewById2.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView, "layout_help_account.txt_title_tools");
        textView.setText(getString(R.string.str_title_account_more));
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_help_gift_card);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_help_gift_card");
        ((ImageView) _$_findCachedViewById3.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_gift);
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_help_gift_card);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_help_gift_card");
        TextView textView2 = (TextView) _$_findCachedViewById4.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView2, "layout_help_gift_card.txt_title_tools");
        textView2.setText(getString(R.string.str_gift_card_title));
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.layout_help_subscription);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "layout_help_subscription");
        ((ImageView) _$_findCachedViewById5.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_star);
        View _$_findCachedViewById6 = _$_findCachedViewById(R.id.layout_help_subscription);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById6, "layout_help_subscription");
        TextView textView3 = (TextView) _$_findCachedViewById6.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView3, "layout_help_subscription.txt_title_tools");
        textView3.setText(getString(R.string.str_subscription_title));
        View _$_findCachedViewById7 = _$_findCachedViewById(R.id.layout_help_membership);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById7, "layout_help_membership");
        ((ImageView) _$_findCachedViewById7.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_membership_package);
        View _$_findCachedViewById8 = _$_findCachedViewById(R.id.layout_help_membership);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById8, "layout_help_membership");
        TextView textView4 = (TextView) _$_findCachedViewById8.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView4, "layout_help_membership.txt_title_tools");
        textView4.setText(getString(R.string.str_membership_package));
    }

    private final void initFrequentlyQuestions() {
        PlaceHolderView placeHolderView = (PlaceHolderView) _$_findCachedViewById(R.id.phv_frequently_questions);
        Intrinsics.checkNotNullExpressionValue(placeHolderView, "phv_frequently_questions");
        RecyclerView.ItemAnimator itemAnimator = placeHolderView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        int i = 0;
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        while (true) {
            ((PlaceHolderView) _$_findCachedViewById(R.id.phv_frequently_questions)).addView(new ItemRowFrequentlyQuestion("Tôi có thể mua nhiều “Gói tiết kiệm” cùng 1 lúc không?", "Bạn có thể mua nhiều Gói một lúc trên cùng 1 tài khoản. Tuy nhiên, hạn sử dụng mỗi gói là có giới hạn.", new HelpDialogFragment$initFrequentlyQuestions$itemRowFrequentlyQuestion$1(this)));
            if (i != 10) {
                i++;
            } else {
                return;
            }
        }
    }
}
