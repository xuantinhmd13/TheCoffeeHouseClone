package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory.RatingOrderCategoriesView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.InputTextCharCountView;
import com.thecoffeehouse.guestapp.services.api.model.orders.DataRatingOrderInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.Feedback;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderCategory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rating", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailView.kt */
public final class RatingOrderDetailView$setInfoRatingCategory$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ DataRatingOrderInfo $ratingOrderInfoResponse;
    final /* synthetic */ RatingOrderDetailView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RatingOrderDetailView$setInfoRatingCategory$2(RatingOrderDetailView ratingOrderDetailView, DataRatingOrderInfo dataRatingOrderInfo) {
        super(1);
        this.this$0 = ratingOrderDetailView;
        this.$ratingOrderInfoResponse = dataRatingOrderInfo;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ArrayList<RatingOrderCategory> categories;
        boolean z;
        TextView textView = (TextView) this.this$0._$_findCachedViewById(R.id.txt_rating_order_category_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_rating_order_category_title");
        textView.setVisibility(0);
        RatingOrderCategoriesView ratingOrderCategoriesView = (RatingOrderCategoriesView) this.this$0._$_findCachedViewById(R.id.rating_order_categories);
        Intrinsics.checkNotNullExpressionValue(ratingOrderCategoriesView, "rating_order_categories");
        ratingOrderCategoriesView.setVisibility(0);
        InputTextCharCountView inputTextCharCountView = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.layout_input_text);
        Intrinsics.checkNotNullExpressionValue(inputTextCharCountView, "layout_input_text");
        inputTextCharCountView.setVisibility(0);
        this.this$0.getOnStarRatingClickListener().invoke(Integer.valueOf(i));
        this.this$0.clearAllChildFocusAndCloseKeyboard();
        Feedback feedback = this.$ratingOrderInfoResponse.getFeedback();
        RatingOrderCategory ratingOrderCategory = null;
        if (!(feedback == null || (categories = feedback.getCategories()) == null)) {
            Iterator<T> it = categories.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Integer starAllow = next.getStarAllow();
                if (starAllow != null && starAllow.intValue() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    ratingOrderCategory = next;
                    break;
                }
            }
            ratingOrderCategory = ratingOrderCategory;
        }
        if (ratingOrderCategory != null) {
            this.this$0.setRatingCategoryByStar(i, ratingOrderCategory);
            TextView textView2 = (TextView) this.this$0._$_findCachedViewById(R.id.txt_rating_order_category_title);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_rating_order_category_title");
            textView2.setText(ratingOrderCategory.getTitle());
        }
        this.this$0.setInfoRatingProducts(i, this.$ratingOrderInfoResponse);
    }
}
