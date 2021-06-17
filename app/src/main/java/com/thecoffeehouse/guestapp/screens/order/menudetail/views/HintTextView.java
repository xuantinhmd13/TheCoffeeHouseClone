package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/HintTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "updateData", "", ViewHierarchyConstants.TEXT_KEY, "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HintTextView.kt */
public final class HintTextView extends AppCompatTextView {
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
    public HintTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setPadding(ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f), ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HintTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setPadding(ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f), ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HintTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_solid_light_gray));
        setPadding(ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f), ViewExtsKt.DPtoPX(12.0f), ViewExtsKt.DPtoPX(4.0f));
    }

    public final void updateData(String str) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TEXT_KEY);
        TLTextViewKt.setTextMultipleFonts(this, new TextViewAttribute(str, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), Integer.valueOf((int) R.font.sfpd_regular)));
    }
}
