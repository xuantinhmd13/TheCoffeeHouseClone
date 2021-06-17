package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory.RatingOrderCategoriesView;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct.RatingOrderProductsView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.InputTextCharCountView;
import com.thecoffeehouse.guestapp.services.api.model.orders.DataRatingOrderInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.Feedback;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderCategory;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0006\u0010\u001d\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\rH\u0002J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\rH\u0002J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\rH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\rR\u000e\u0010\u000b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006)"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderDetailView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MAX_CHAR_COMMENTS", "dataRatingOrderInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;", "onAddPhotosListener", "Lkotlin/Function1;", "", "getOnAddPhotosListener", "()Lkotlin/jvm/functions/Function1;", "setOnAddPhotosListener", "(Lkotlin/jvm/functions/Function1;)V", "onStarRatingClickListener", "getOnStarRatingClickListener", "setOnStarRatingClickListener", "appendImages", "images", "", "Landroid/net/Uri;", "clearAllChildFocusAndCloseKeyboard", "getDataRating", "initEditTextComment", "setInfoHeader", "ratingOrderInfoResponse", "setInfoRatingCategory", "defaultRating", "setInfoRatingProducts", "setRatingCategoryByStar", "rating", MonitorLogServerProtocol.PARAM_CATEGORY, "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderCategory;", "updateData", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailView.kt */
public final class RatingOrderDetailView extends FrameLayout {
    private final int MAX_CHAR_COMMENTS = 500;
    private HashMap _$_findViewCache;
    private DataRatingOrderInfo dataRatingOrderInfo = new DataRatingOrderInfo();
    private Function1<? super Integer, Unit> onAddPhotosListener = RatingOrderDetailView$onAddPhotosListener$1.INSTANCE;
    private Function1<? super Integer, Unit> onStarRatingClickListener = RatingOrderDetailView$onStarRatingClickListener$1.INSTANCE;

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

    public final void appendImages(List<? extends Uri> list) {
        Intrinsics.checkNotNullParameter(list, "images");
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getOnAddPhotosListener() {
        return this.onAddPhotosListener;
    }

    public final void setOnAddPhotosListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onAddPhotosListener = function1;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getOnStarRatingClickListener() {
        return this.onStarRatingClickListener;
    }

    public final void setOnStarRatingClickListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onStarRatingClickListener = function1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderDetailView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_detail_view, (ViewGroup) this, true);
        initEditTextComment();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_detail_view, (ViewGroup) this, true);
        initEditTextComment();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_detail_view, (ViewGroup) this, true);
        initEditTextComment();
    }

    private final void initEditTextComment() {
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text)).getEditTextInput();
        if (editTextInput != null) {
            editTextInput.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_stroke_light_gray));
        }
        EditText editTextInput2 = ((InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text)).getEditTextInput();
        if (editTextInput2 != null) {
            editTextInput2.setHint(getContext().getString(R.string.str_lets_tch_know_how_your_experience));
        }
        ((InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text)).setMaxChars(this.MAX_CHAR_COMMENTS);
        EditText editTextInput3 = ((InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text)).getEditTextInput();
        if (editTextInput3 != null) {
            editTextInput3.setLines(Integer.MAX_VALUE);
        }
        EditText editTextInput4 = ((InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text)).getEditTextInput();
        if (editTextInput4 != null) {
            editTextInput4.setMinHeight(ViewExtsKt.DPtoPX(100.0f));
        }
    }

    public static /* synthetic */ void updateData$default(RatingOrderDetailView ratingOrderDetailView, int i, DataRatingOrderInfo dataRatingOrderInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        ratingOrderDetailView.updateData(i, dataRatingOrderInfo2);
    }

    public final void updateData(int i, DataRatingOrderInfo dataRatingOrderInfo2) {
        Intrinsics.checkNotNullParameter(dataRatingOrderInfo2, "ratingOrderInfoResponse");
        this.dataRatingOrderInfo = dataRatingOrderInfo2;
        if (i != 0) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_rating_order_category_title);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_rating_order_category_title");
            textView.setVisibility(0);
            RatingOrderCategoriesView ratingOrderCategoriesView = (RatingOrderCategoriesView) _$_findCachedViewById(R.id.rating_order_categories);
            Intrinsics.checkNotNullExpressionValue(ratingOrderCategoriesView, "rating_order_categories");
            ratingOrderCategoriesView.setVisibility(0);
            InputTextCharCountView inputTextCharCountView = (InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text);
            Intrinsics.checkNotNullExpressionValue(inputTextCharCountView, "layout_input_text");
            inputTextCharCountView.setVisibility(0);
        }
        setInfoHeader(dataRatingOrderInfo2);
        setInfoRatingCategory(i, dataRatingOrderInfo2);
        setInfoRatingProducts(i, dataRatingOrderInfo2);
    }

    public final DataRatingOrderInfo getDataRating() {
        DataRatingOrderInfo dataRatingOrderInfo2 = new DataRatingOrderInfo();
        dataRatingOrderInfo2.setRef(this.dataRatingOrderInfo.getRef());
        dataRatingOrderInfo2.setType(this.dataRatingOrderInfo.getType());
        dataRatingOrderInfo2.setOrderType(this.dataRatingOrderInfo.getOrderType());
        dataRatingOrderInfo2.setOrderTypeStr(this.dataRatingOrderInfo.getOrderTypeStr());
        Feedback feedback = new Feedback();
        Feedback feedback2 = this.dataRatingOrderInfo.getFeedback();
        Editable editable = null;
        feedback.setType(feedback2 != null ? feedback2.getType() : null);
        ArrayList<RatingOrderCategory> arrayList = new ArrayList<>();
        arrayList.add(((RatingOrderCategoriesView) _$_findCachedViewById(R.id.rating_order_categories)).getSelectedRatingCategoryWithShortFeedbacks());
        feedback.setCategories(arrayList);
        Unit unit = Unit.INSTANCE;
        dataRatingOrderInfo2.setFeedback(feedback);
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.layout_input_text)).getEditTextInput();
        if (editTextInput != null) {
            editable = editTextInput.getText();
        }
        dataRatingOrderInfo2.setComment(StringExtsKt.toStringOrEmpty(String.valueOf(editable)));
        dataRatingOrderInfo2.setProductRatings(((RatingOrderProductsView) _$_findCachedViewById(R.id.rating_order_products_view)).getRatingProducts());
        return dataRatingOrderInfo2;
    }

    private final void setInfoRatingCategory(int i, DataRatingOrderInfo dataRatingOrderInfo2) {
        ArrayList<RatingOrderCategory> categories;
        boolean z;
        ((StarsRatingView) _$_findCachedViewById(R.id.starts_rating_order)).updateData(i, true);
        Feedback feedback = dataRatingOrderInfo2.getFeedback();
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
            setRatingCategoryByStar(i, ratingOrderCategory);
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_rating_order_category_title);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_rating_order_category_title");
            textView.setText(ratingOrderCategory.getTitle());
        }
        ((StarsRatingView) _$_findCachedViewById(R.id.starts_rating_order)).setOnRatingListener(new RatingOrderDetailView$setInfoRatingCategory$2(this, dataRatingOrderInfo2));
    }

    /* access modifiers changed from: private */
    public final void setInfoRatingProducts(int i, DataRatingOrderInfo dataRatingOrderInfo2) {
        if (i != 5) {
            RatingOrderProductsView ratingOrderProductsView = (RatingOrderProductsView) _$_findCachedViewById(R.id.rating_order_products_view);
            Intrinsics.checkNotNullExpressionValue(ratingOrderProductsView, "rating_order_products_view");
            ratingOrderProductsView.setVisibility(8);
            return;
        }
        RatingOrderProductsView ratingOrderProductsView2 = (RatingOrderProductsView) _$_findCachedViewById(R.id.rating_order_products_view);
        Intrinsics.checkNotNullExpressionValue(ratingOrderProductsView2, "rating_order_products_view");
        ratingOrderProductsView2.setVisibility(0);
        ((RatingOrderProductsView) _$_findCachedViewById(R.id.rating_order_products_view)).updateData(dataRatingOrderInfo2.getProductRatings());
    }

    /* access modifiers changed from: private */
    public final void clearAllChildFocusAndCloseKeyboard() {
        for (T t : ViewExtsKt.getAllChildren(this)) {
            if (t.isFocused() && (t instanceof EditText)) {
                t.clearFocus();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                GeneralKt.forceCloseKeyboard(context, t);
                return;
            }
        }
    }

    private final void setInfoHeader(DataRatingOrderInfo dataRatingOrderInfo2) {
        ArrayList arrayList;
        RatingOrderHeaderView ratingOrderHeaderView = (RatingOrderHeaderView) _$_findCachedViewById(R.id.layout_rating_order_detail_header);
        String orderTypeStr = dataRatingOrderInfo2.getOrderTypeStr();
        String createdAt = dataRatingOrderInfo2.getCreatedAt();
        List<OrderLineCreateOrder> orderlines = dataRatingOrderInfo2.getOrderlines();
        if (orderlines != null) {
            List<OrderLineCreateOrder> list = orderlines;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(String.valueOf(it.next().getName()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        ratingOrderHeaderView.updateData(orderTypeStr, createdAt, arrayList);
    }

    /* access modifiers changed from: private */
    public final void setRatingCategoryByStar(int i, RatingOrderCategory ratingOrderCategory) {
        if (i != 0) {
            RatingOrderCategoriesView ratingOrderCategoriesView = (RatingOrderCategoriesView) _$_findCachedViewById(R.id.rating_order_categories);
            Intrinsics.checkNotNullExpressionValue(ratingOrderCategoriesView, "rating_order_categories");
            ratingOrderCategoriesView.setVisibility(0);
            ((RatingOrderCategoriesView) _$_findCachedViewById(R.id.rating_order_categories)).updateData(ratingOrderCategory);
            return;
        }
        RatingOrderCategoriesView ratingOrderCategoriesView2 = (RatingOrderCategoriesView) _$_findCachedViewById(R.id.rating_order_categories);
        Intrinsics.checkNotNullExpressionValue(ratingOrderCategoriesView2, "rating_order_categories");
        ratingOrderCategoriesView2.setVisibility(8);
    }
}
