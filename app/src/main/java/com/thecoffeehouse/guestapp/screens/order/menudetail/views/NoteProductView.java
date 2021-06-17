package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/NoteProductView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getNote", "", "updateData", "", "note", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: NoteProductView.kt */
public final class NoteProductView extends FrameLayout {
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
    public NoteProductView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_note_product, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteProductView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_note_product, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteProductView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_note_product, (ViewGroup) this, true);
    }

    public final void updateData(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_note_product_title);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_note_product_title");
            textView.setText(getContext().getString(R.string.str_product_note));
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_note_product_body);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_note_product_body");
            textView2.setVisibility(8);
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_note_product_body);
            Intrinsics.checkNotNullExpressionValue(textView3, "txt_note_product_body");
            textView3.setText("");
            return;
        }
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_note_product_title);
        Intrinsics.checkNotNullExpressionValue(textView4, "txt_note_product_title");
        textView4.setText(getContext().getString(R.string.str_edit_product));
        TextView textView5 = (TextView) _$_findCachedViewById(R.id.txt_note_product_body);
        Intrinsics.checkNotNullExpressionValue(textView5, "txt_note_product_body");
        textView5.setVisibility(0);
        TextView textView6 = (TextView) _$_findCachedViewById(R.id.txt_note_product_body);
        Intrinsics.checkNotNullExpressionValue(textView6, "txt_note_product_body");
        textView6.setText(str2);
    }

    public final String getNote() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_note_product_body);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_note_product_body");
        return StringExtsKt.toStringOrEmpty(textView.getText().toString());
    }
}
