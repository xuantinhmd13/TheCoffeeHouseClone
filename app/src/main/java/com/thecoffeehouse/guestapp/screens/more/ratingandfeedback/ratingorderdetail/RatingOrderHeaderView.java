package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J*\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oneItemName", "", "orderLines", "", "", "twoItemsName", "twoItemsNameAndOthers", "updateData", "shippingType", "orderDate", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderHeaderView.kt */
public final class RatingOrderHeaderView extends FrameLayout {
    private HashMap _$_findViewCache;

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
    public RatingOrderHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_header_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_header_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_header_view, (ViewGroup) this, true);
    }

    public final void updateData(String str, Object obj, List<String> list) {
        String str2;
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_shipping_method_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_shipping_method_title");
        textView.setText(StringExtsKt.toStringOrEmpty(str));
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_order_time);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_order_time");
        if (obj instanceof String) {
            str2 = (CharSequence) obj;
        } else {
            str2 = obj instanceof Long ? RewardExtsKt.convertSecondToTimeFormat(((Number) obj).longValue(), StringDateUtilsKt.DF_hh_mm_dd_MM_yyyy) : "";
        }
        textView2.setText(str2);
        if (list == null) {
            return;
        }
        if (list.size() > 2) {
            twoItemsNameAndOthers(list);
        } else if (list.size() == 2) {
            twoItemsName(list);
        } else if (!list.isEmpty()) {
            oneItemName(list);
        }
    }

    private final void oneItemName(List<String> list) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_order_items");
        textView.setText((String) CollectionsKt.first((List) list));
    }

    private final void twoItemsName(List<String> list) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_order_items");
        textView.setText((((String) CollectionsKt.first((List) list)) + ", ") + list.get(1));
    }

    private final void twoItemsNameAndOthers(List<String> list) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_order_items");
        textView.setText((((((String) CollectionsKt.first((List) list)) + ", ") + list.get(1)) + " ") + getContext().getString(R.string.str_no_other_items, String.valueOf(list.size() - 2)));
    }
}
