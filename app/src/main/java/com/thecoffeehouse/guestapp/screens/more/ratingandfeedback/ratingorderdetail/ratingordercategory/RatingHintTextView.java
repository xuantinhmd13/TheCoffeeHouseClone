package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.ShortFeedback;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\rJ\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingordercategory/RatingHintTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mShortFeedback", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ShortFeedback;", "onClickListener", "Lkotlin/Function0;", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "getShortFeedback", "onClick", "v", "Landroid/view/View;", "setSelectHint", "b", "", "toggleSelectTextStyle", "updateData", "shortFeedback", "selected", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingHintTextView.kt */
public final class RatingHintTextView extends AppCompatTextView implements View.OnClickListener {
    private HashMap _$_findViewCache;
    private ShortFeedback mShortFeedback = new ShortFeedback();
    private Function0<Unit> onClickListener = RatingHintTextView$onClickListener$1.INSTANCE;

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
    public RatingHintTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setTextColor(ContextCompat.getColor(getContext(), R.color.colorTextContent));
        setPadding(ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f), ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f));
        setOnClickListener(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingHintTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setTextColor(ContextCompat.getColor(getContext(), R.color.colorTextContent));
        setPadding(ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f), ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f));
        setOnClickListener(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingHintTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setTextColor(ContextCompat.getColor(getContext(), R.color.colorTextContent));
        setPadding(ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f), ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f));
        setOnClickListener(this);
    }

    public final Function0<Unit> getOnClickListener() {
        return this.onClickListener;
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClickListener = function0;
    }

    public static /* synthetic */ void updateData$default(RatingHintTextView ratingHintTextView, ShortFeedback shortFeedback, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        ratingHintTextView.updateData(shortFeedback, z);
    }

    public final void updateData(ShortFeedback shortFeedback, boolean z) {
        Intrinsics.checkNotNullParameter(shortFeedback, "shortFeedback");
        this.mShortFeedback = shortFeedback;
        setSelected(z);
        setText(this.mShortFeedback.getTitle());
        toggleSelectTextStyle();
    }

    public final ShortFeedback getShortFeedback() {
        return this.mShortFeedback;
    }

    private final void toggleSelectTextStyle() {
        if (isSelected()) {
            setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_cancel_order_enable));
            setTextColor(ContextCompat.getColor(getContext(), R.color.colorWhite));
            return;
        }
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setTextColor(ContextCompat.getColor(getContext(), R.color.colorTextContent));
    }

    public void onClick(View view) {
        setSelected(!isSelected());
        toggleSelectTextStyle();
        this.onClickListener.invoke();
    }

    public final void setSelectHint(boolean z) {
        setSelected(z);
        toggleSelectTextStyle();
    }
}
