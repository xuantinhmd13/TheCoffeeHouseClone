package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\r\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tJ\b\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/InputTextCharCountView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxChar", "textWatcher", "com/thecoffeehouse/guestapp/screens/order/menudetail/views/InputTextCharCountView$textWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/InputTextCharCountView$textWatcher$1;", "getEditTextInput", "Landroid/widget/EditText;", "getRemainingCharCount", "", "onDetachedFromWindow", "", "setMaxChars", "count", "setRemainingCharTextView", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: InputTextCharCountView.kt */
public final class InputTextCharCountView extends FrameLayout {
    private HashMap _$_findViewCache;
    private int maxChar = 100;
    private InputTextCharCountView$textWatcher$1 textWatcher = new InputTextCharCountView$textWatcher$1(this);

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
    public InputTextCharCountView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_input_text_char_count_view, (ViewGroup) this, true);
        ((EditText) _$_findCachedViewById(R.id.edt_input_text)).addTextChangedListener(this.textWatcher);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputTextCharCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_input_text_char_count_view, (ViewGroup) this, true);
        ((EditText) _$_findCachedViewById(R.id.edt_input_text)).addTextChangedListener(this.textWatcher);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputTextCharCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_input_text_char_count_view, (ViewGroup) this, true);
        ((EditText) _$_findCachedViewById(R.id.edt_input_text)).addTextChangedListener(this.textWatcher);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((EditText) _$_findCachedViewById(R.id.edt_input_text)).removeTextChangedListener(this.textWatcher);
    }

    public final EditText getEditTextInput() {
        return (EditText) _$_findCachedViewById(R.id.edt_input_text);
    }

    public final void setMaxChars(int i) {
        this.maxChar = i;
        EditText editText = (EditText) _$_findCachedViewById(R.id.edt_input_text);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_input_text");
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.maxChar)});
        setRemainingCharTextView();
    }

    /* access modifiers changed from: private */
    public final void setRemainingCharTextView() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_char_count);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_char_count");
        textView.setText(getRemainingCharCount() + '/' + this.maxChar);
    }

    private final String getRemainingCharCount() {
        int i = this.maxChar;
        EditText editText = (EditText) _$_findCachedViewById(R.id.edt_input_text);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_input_text");
        return String.valueOf(i - editText.getText().length());
    }
}
