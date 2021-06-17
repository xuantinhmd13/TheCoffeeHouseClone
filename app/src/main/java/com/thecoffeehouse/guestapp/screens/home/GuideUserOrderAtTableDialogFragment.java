package com.thecoffeehouse.guestapp.screens.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/GuideUserOrderAtTableDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "onClickOrderAtTable", "Lkotlin/Function0;", "", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GuideUserOrderAtTableDialogFragment.kt */
public final class GuideUserOrderAtTableDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Function0<Unit> onClickOrderAtTable = GuideUserOrderAtTableDialogFragment$onClickOrderAtTable$1.INSTANCE;

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
        return R.layout.fragment_guide_user_order_at_table;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/GuideUserOrderAtTableDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/home/GuideUserOrderAtTableDialogFragment;", "onOrderAtTableListener", "Lkotlin/Function0;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: GuideUserOrderAtTableDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GuideUserOrderAtTableDialogFragment newInstance(Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "onOrderAtTableListener");
            GuideUserOrderAtTableDialogFragment guideUserOrderAtTableDialogFragment = new GuideUserOrderAtTableDialogFragment();
            guideUserOrderAtTableDialogFragment.onClickOrderAtTable = function0;
            return guideUserOrderAtTableDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        CardView cardView = (CardView) _$_findCachedViewById(R.id.btn_order_at_table);
        Intrinsics.checkNotNullExpressionValue(cardView, "btn_order_at_table");
        ContextExtsKt.setOnSafeClickListener$default(cardView, 0, new GuideUserOrderAtTableDialogFragment$initViews$1(this), 1, null);
        ((ImageView) _$_findCachedViewById(R.id.img_close)).setOnClickListener(new GuideUserOrderAtTableDialogFragment$initViews$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_list_stores_applied_order_at_table);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_list_stores_applied_order_at_table");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new GuideUserOrderAtTableDialogFragment$initViews$3(this), 1, null);
    }
}
