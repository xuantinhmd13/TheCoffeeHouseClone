package com.thecoffeehouse.guestapp.screens.stores.interaction;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.actions.SearchIntents;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.stores.StoresFragment;
import com.thecoffeehouse.guestapp.screens.stores.StoresViewModel;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002J\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\u0006\u0010!\u001a\u00020\u0006J\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\u000e\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchLayoutInteraction;", "", "storeFragment", "Lcom/thecoffeehouse/guestapp/screens/stores/StoresFragment;", "(Lcom/thecoffeehouse/guestapp/screens/stores/StoresFragment;)V", "isSubmitted", "", "mPreviousSearch", "", "mQueryDelayTime", "", "mQueryHandler", "Landroid/os/Handler;", "mSearchStoreLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMSearchStoreLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMSearchStoreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "toggleMarginTop", "getToggleMarginTop", "()Z", "setToggleMarginTop", "(Z)V", "changeCloseButtonToToggleButton", "", "changeToggleButtonToCloseButton", "hideShowClearTextSearch", "newText", "initSearchStoreLayout", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initSearchStoreLayout$app_liveRelease", "isSearching", "queryStoreByAddress", "queryTextListener", "resetSearchView", "searchViewHasFocusListener", "searchViewLostFocusListener", "setRecentlySearchForSearchView", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "submitSearchQuery", SearchIntents.EXTRA_QUERY, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchLayoutInteraction.kt */
public final class SearchLayoutInteraction {
    private boolean isSubmitted;
    private String mPreviousSearch = "";
    private final long mQueryDelayTime = 500;
    private Handler mQueryHandler = new Handler();
    public ConstraintLayout mSearchStoreLayout;
    private final StoresFragment storeFragment;
    private boolean toggleMarginTop = true;

    public SearchLayoutInteraction(StoresFragment storesFragment) {
        Intrinsics.checkNotNullParameter(storesFragment, "storeFragment");
        this.storeFragment = storesFragment;
    }

    public final ConstraintLayout getMSearchStoreLayout() {
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        return constraintLayout;
    }

    public final void setMSearchStoreLayout(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.mSearchStoreLayout = constraintLayout;
    }

    public final boolean getToggleMarginTop() {
        return this.toggleMarginTop;
    }

    public final void setToggleMarginTop(boolean z) {
        this.toggleMarginTop = z;
    }

    public final void initSearchStoreLayout$app_liveRelease(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        View findViewById = view.findViewById(R.id.searchStore);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.searchStore)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        this.mSearchStoreLayout = constraintLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        SearchView searchView = (SearchView) constraintLayout.findViewById(R.id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "mSearchStoreLayout.searchView");
        searchView.setQueryHint(this.storeFragment.getString(R.string.str_search_store_hint));
        changeCloseButtonToToggleButton();
    }

    public final boolean isSearching() {
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        SearchView searchView = (SearchView) constraintLayout.findViewById(R.id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "mSearchStoreLayout.searchView");
        return !StringsKt.isBlank(searchView.getQuery().toString());
    }

    public final void queryTextListener() {
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((SearchView) constraintLayout.findViewById(R.id.searchView)).setOnQueryTextFocusChangeListener(new SearchLayoutInteraction$queryTextListener$1(this));
        ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((SearchView) constraintLayout2.findViewById(R.id.searchView)).setOnQueryTextListener(new SearchLayoutInteraction$queryTextListener$2(this));
        ConstraintLayout constraintLayout3 = this.mSearchStoreLayout;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ImageView imageView = (ImageView) constraintLayout3.findViewById(R.id.imgSearchClose);
        Intrinsics.checkNotNullExpressionValue(imageView, "mSearchStoreLayout.imgSearchClose");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new SearchLayoutInteraction$queryTextListener$3(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void searchViewLostFocusListener() {
        if (this.toggleMarginTop) {
            ConstraintLayout constraintLayout = this.mSearchStoreLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            ViewExtsKt.marginTop(constraintLayout, 0);
        }
        changeCloseButtonToToggleButton();
        this.storeFragment.changeViewsToShowMode$app_liveRelease();
    }

    /* access modifiers changed from: private */
    public final void searchViewHasFocusListener() {
        if (this.toggleMarginTop) {
            ConstraintLayout constraintLayout = this.mSearchStoreLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            ViewExtsKt.marginTop(constraintLayout, ViewExtsKt.DPtoPX(10.0f));
        }
        changeToggleButtonToCloseButton();
        this.storeFragment.changeViewsToSearchMode$app_liveRelease();
        ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        SearchView searchView = (SearchView) constraintLayout2.findViewById(R.id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "mSearchStoreLayout.searchView");
        queryStoreByAddress(searchView.getQuery().toString());
    }

    private final void changeToggleButtonToCloseButton() {
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txtClose);
        Intrinsics.checkNotNullExpressionValue(textView, "mSearchStoreLayout.txtClose");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
        ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        String string = constraintLayout2.getContext().getString(R.string.str_close);
        Intrinsics.checkNotNullExpressionValue(string, "mSearchStoreLayout.conte…tring(R.string.str_close)");
        textViewAttributeArr[0] = new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorC5671B), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
        ConstraintLayout constraintLayout3 = this.mSearchStoreLayout;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((TextView) constraintLayout3.findViewById(R.id.txtClose)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        ConstraintLayout constraintLayout4 = this.mSearchStoreLayout;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        TextView textView2 = (TextView) constraintLayout4.findViewById(R.id.txtClose);
        Intrinsics.checkNotNullExpressionValue(textView2, "mSearchStoreLayout.txtClose");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new SearchLayoutInteraction$changeToggleButtonToCloseButton$1(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void changeCloseButtonToToggleButton() {
        int mViewMode = this.storeFragment.getMViewMode();
        int list = this.storeFragment.getLIST();
        Integer valueOf = Integer.valueOf((int) R.font.sfpd_semibold);
        Integer valueOf2 = Integer.valueOf((int) R.color.color333333);
        Integer valueOf3 = Integer.valueOf((int) R.dimen._12sp);
        if (mViewMode == list) {
            ConstraintLayout constraintLayout = this.mSearchStoreLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            TextView textView = (TextView) constraintLayout.findViewById(R.id.txtClose);
            Intrinsics.checkNotNullExpressionValue(textView, "mSearchStoreLayout.txtClose");
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
            ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            String string = constraintLayout2.getContext().getString(R.string.str_map);
            Intrinsics.checkNotNullExpressionValue(string, "mSearchStoreLayout.conte…tString(R.string.str_map)");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
            String upperCase = string.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            textViewAttributeArr[0] = new TextViewAttribute(upperCase, valueOf3, valueOf2, valueOf);
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            ConstraintLayout constraintLayout3 = this.mSearchStoreLayout;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            TextView textView2 = (TextView) constraintLayout3.findViewById(R.id.txtClose);
            ConstraintLayout constraintLayout4 = this.mSearchStoreLayout;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(constraintLayout4.getContext(), R.drawable.ic_map), (Drawable) null, (Drawable) null, (Drawable) null);
            ConstraintLayout constraintLayout5 = this.mSearchStoreLayout;
            if (constraintLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            TextView textView3 = (TextView) constraintLayout5.findViewById(R.id.txtClose);
            Intrinsics.checkNotNullExpressionValue(textView3, "mSearchStoreLayout.txtClose");
            ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new SearchLayoutInteraction$changeCloseButtonToToggleButton$1(this), 1, null);
        } else if (mViewMode == this.storeFragment.getMAP()) {
            ConstraintLayout constraintLayout6 = this.mSearchStoreLayout;
            if (constraintLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            TextView textView4 = (TextView) constraintLayout6.findViewById(R.id.txtClose);
            Intrinsics.checkNotNullExpressionValue(textView4, "mSearchStoreLayout.txtClose");
            TextViewAttribute[] textViewAttributeArr2 = new TextViewAttribute[1];
            ConstraintLayout constraintLayout7 = this.mSearchStoreLayout;
            if (constraintLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            String string2 = constraintLayout7.getContext().getString(R.string.str_list);
            Intrinsics.checkNotNullExpressionValue(string2, "mSearchStoreLayout.conte…String(R.string.str_list)");
            Locale locale2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale2, "Locale.ROOT");
            Objects.requireNonNull(string2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = string2.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            textViewAttributeArr2[0] = new TextViewAttribute(upperCase2, valueOf3, valueOf2, valueOf);
            TLTextViewKt.setTextMultipleFonts(textView4, textViewAttributeArr2);
            ConstraintLayout constraintLayout8 = this.mSearchStoreLayout;
            if (constraintLayout8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            TextView textView5 = (TextView) constraintLayout8.findViewById(R.id.txtClose);
            ConstraintLayout constraintLayout9 = this.mSearchStoreLayout;
            if (constraintLayout9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(constraintLayout9.getContext(), R.drawable.ic_list_store), (Drawable) null, (Drawable) null, (Drawable) null);
            ConstraintLayout constraintLayout10 = this.mSearchStoreLayout;
            if (constraintLayout10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
            }
            TextView textView6 = (TextView) constraintLayout10.findViewById(R.id.txtClose);
            Intrinsics.checkNotNullExpressionValue(textView6, "mSearchStoreLayout.txtClose");
            ContextExtsKt.setOnSafeClickListener$default(textView6, 0, new SearchLayoutInteraction$changeCloseButtonToToggleButton$2(this), 1, null);
        }
    }

    public final void resetSearchView() {
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((SearchView) constraintLayout.findViewById(R.id.searchView)).setQuery("", false);
        ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ImageView imageView = (ImageView) constraintLayout2.findViewById(R.id.imgSearchClose);
        Intrinsics.checkNotNullExpressionValue(imageView, "mSearchStoreLayout.imgSearchClose");
        imageView.setVisibility(8);
    }

    public final void setRecentlySearchForSearchView(Store store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.isSubmitted = true;
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((SearchView) constraintLayout.findViewById(R.id.searchView)).setQuery(store.getFullAddress(), false);
        ((StoresViewModel) this.storeFragment.getViewModel()).searchStore(store.getFullAddress());
        ((StoresViewModel) this.storeFragment.getViewModel()).updateSearchedStores();
        ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((SearchView) constraintLayout2.findViewById(R.id.searchView)).clearFocus();
    }

    public final void submitSearchQuery(String str) {
        this.isSubmitted = true;
        this.mPreviousSearch = String.valueOf(str);
        hideShowClearTextSearch(str);
        queryStoreByAddress(str);
        ConstraintLayout constraintLayout = this.mSearchStoreLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ((SearchView) constraintLayout.findViewById(R.id.searchView)).clearFocus();
        ((StoresViewModel) this.storeFragment.getViewModel()).updateSearchedStores();
    }

    /* access modifiers changed from: private */
    public final void hideShowClearTextSearch(String str) {
        String str2 = str;
        boolean z = true;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                ConstraintLayout constraintLayout = this.mSearchStoreLayout;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
                }
                ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.imgSearchClose);
                Intrinsics.checkNotNullExpressionValue(imageView, "mSearchStoreLayout.imgSearchClose");
                imageView.setVisibility(0);
                return;
            }
        }
        ConstraintLayout constraintLayout2 = this.mSearchStoreLayout;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchStoreLayout");
        }
        ImageView imageView2 = (ImageView) constraintLayout2.findViewById(R.id.imgSearchClose);
        Intrinsics.checkNotNullExpressionValue(imageView2, "mSearchStoreLayout.imgSearchClose");
        imageView2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void queryStoreByAddress(String str) {
        this.mQueryHandler.removeCallbacksAndMessages(null);
        this.mQueryHandler.postDelayed(new SearchLayoutInteraction$queryStoreByAddress$1(this, str), this.mQueryDelayTime);
    }
}
