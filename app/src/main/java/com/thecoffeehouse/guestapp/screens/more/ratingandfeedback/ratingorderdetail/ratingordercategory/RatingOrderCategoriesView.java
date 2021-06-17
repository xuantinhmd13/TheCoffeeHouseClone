package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderCategory;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingordercategory/RatingOrderCategoriesView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ratingOrderCategory", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderCategory;", "getSelectedRatingCategoryWithShortFeedbacks", "updateData", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderCategoriesView.kt */
public final class RatingOrderCategoriesView extends FrameLayout {
    private HashMap _$_findViewCache;
    private RatingOrderCategory ratingOrderCategory = new RatingOrderCategory();

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
    public RatingOrderCategoriesView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_categories_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderCategoriesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_categories_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderCategoriesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_categories_view, (ViewGroup) this, true);
    }

    public final void updateData(RatingOrderCategory ratingOrderCategory2) {
        Intrinsics.checkNotNullParameter(ratingOrderCategory2, "ratingOrderCategory");
        this.ratingOrderCategory = ratingOrderCategory2;
        ((LinearLayout) _$_findCachedViewById(R.id.layout_rating_categories)).removeAllViews();
        ArrayList<RatingOrderOption> options = ratingOrderCategory2.getOptions();
        if (options != null) {
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                RatingOrderCategoryView ratingOrderCategoryView = new RatingOrderCategoryView(context);
                ratingOrderCategoryView.updateData(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.layout_rating_categories)).addView(ratingOrderCategoryView);
            }
        }
    }

    public final RatingOrderCategory getSelectedRatingCategoryWithShortFeedbacks() {
        RatingOrderOption optionWithSelectedShortFeedback;
        RatingOrderCategory ratingOrderCategory2 = new RatingOrderCategory();
        ratingOrderCategory2.setStarAllow(this.ratingOrderCategory.getStarAllow());
        ratingOrderCategory2.setTitle(this.ratingOrderCategory.getTitle());
        ArrayList<RatingOrderOption> arrayList = new ArrayList<>();
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.layout_rating_categories);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "layout_rating_categories");
        for (View view : ViewGroupKt.getChildren(linearLayout)) {
            if ((view instanceof RatingOrderCategoryView) && (optionWithSelectedShortFeedback = ((RatingOrderCategoryView) view).getOptionWithSelectedShortFeedback()) != null) {
                arrayList.add(optionWithSelectedShortFeedback);
            }
        }
        ratingOrderCategory2.setOptions(arrayList);
        return ratingOrderCategory2;
    }
}
