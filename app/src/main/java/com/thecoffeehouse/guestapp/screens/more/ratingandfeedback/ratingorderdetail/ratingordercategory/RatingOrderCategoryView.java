package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory;

import android.content.Context;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.chip.ChipGroup;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderOption;
import com.thecoffeehouse.guestapp.services.api.model.orders.ShortFeedback;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingordercategory/RatingOrderCategoryView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isExpanded", "", "mRatingOrderOption", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderOption;", "getOptionWithSelectedShortFeedback", "onClick", "", "v", "Landroid/view/View;", "toggleExpandCollapse", "updateData", "option", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderCategoryView.kt */
public final class RatingOrderCategoryView extends FrameLayout implements View.OnClickListener {
    private HashMap _$_findViewCache;
    private boolean isExpanded;
    private RatingOrderOption mRatingOrderOption = new RatingOrderOption();

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderCategoryView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_category_view, (ViewGroup) this, true);
        setOnClickListener(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderCategoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_category_view, (ViewGroup) this, true);
        setOnClickListener(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderCategoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_category_view, (ViewGroup) this, true);
        setOnClickListener(this);
    }

    public final void updateData(RatingOrderOption ratingOrderOption) {
        Intrinsics.checkNotNullParameter(ratingOrderOption, "option");
        this.mRatingOrderOption = ratingOrderOption;
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_rating_order_category_header);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_rating_order_category_header");
        textView.setText(StringExtsKt.toStringOrEmpty(this.mRatingOrderOption.getTitle()));
        ArrayList<ShortFeedback> shortFeedBacks = this.mRatingOrderOption.getShortFeedBacks();
        if (shortFeedBacks != null) {
            Iterator<T> it = shortFeedBacks.iterator();
            while (it.hasNext()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                RatingHintTextView ratingHintTextView = new RatingHintTextView(context);
                RatingHintTextView.updateData$default(ratingHintTextView, it.next(), false, 2, null);
                ratingHintTextView.setOnClickListener(new RatingOrderCategoryView$updateData$$inlined$forEach$lambda$1(this));
                ((ChipGroup) _$_findCachedViewById(R.id.layout_hints_rating)).addView(ratingHintTextView);
            }
        }
        ((FrameLayout) _$_findCachedViewById(R.id.layout_chb_short_feedback)).setOnClickListener(new RatingOrderCategoryView$updateData$2(this));
    }

    public final RatingOrderOption getOptionWithSelectedShortFeedback() {
        ArrayList<ShortFeedback> shortFeedBacks;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(R.id.chb_hint_text);
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "chb_hint_text");
        if (!appCompatCheckBox.isChecked()) {
            return null;
        }
        RatingOrderOption ratingOrderOption = new RatingOrderOption();
        ratingOrderOption.setId(this.mRatingOrderOption.getId());
        ratingOrderOption.setTitle(this.mRatingOrderOption.getTitle());
        ratingOrderOption.setShortFeedBacks(new ArrayList<>());
        ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.layout_hints_rating);
        Intrinsics.checkNotNullExpressionValue(chipGroup, "layout_hints_rating");
        for (View view : ViewGroupKt.getChildren(chipGroup)) {
            if (view instanceof RatingHintTextView) {
                RatingHintTextView ratingHintTextView = (RatingHintTextView) view;
                if (ratingHintTextView.isSelected() && (shortFeedBacks = ratingOrderOption.getShortFeedBacks()) != null) {
                    shortFeedBacks.add(ratingHintTextView.getShortFeedback());
                }
            }
        }
        return ratingOrderOption;
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int id = getId();
        if (valueOf != null && valueOf.intValue() == id) {
            this.isExpanded = !this.isExpanded;
            toggleExpandCollapse();
        }
    }

    private final void toggleExpandCollapse() {
        ArrayList<ShortFeedback> shortFeedBacks;
        if (!this.isExpanded || (shortFeedBacks = this.mRatingOrderOption.getShortFeedBacks()) == null || !(!shortFeedBacks.isEmpty())) {
            ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.layout_hints_rating);
            Intrinsics.checkNotNullExpressionValue(chipGroup, "layout_hints_rating");
            chipGroup.setVisibility(8);
            TransitionManager.beginDelayedTransition(this);
            return;
        }
        ChipGroup chipGroup2 = (ChipGroup) _$_findCachedViewById(R.id.layout_hints_rating);
        Intrinsics.checkNotNullExpressionValue(chipGroup2, "layout_hints_rating");
        chipGroup2.setVisibility(0);
        TransitionManager.beginDelayedTransition(this);
    }
}
