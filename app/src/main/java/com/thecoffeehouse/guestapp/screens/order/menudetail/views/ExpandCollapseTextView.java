package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u001c\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0011H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/ExpandCollapseTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fullText", "", "isExpanding", "", "maxLineCountExpandCollapse", "checkExpandCollapseTextView", "", "getCurrentVisibleText", "maxLineExpandCollapse", "lineCount", "setFullText", "description", "setSpannableString", "Landroid/text/SpannableStringBuilder;", "currentText", "compactText", "setText", ViewHierarchyConstants.TEXT_KEY, "", "type", "Landroid/widget/TextView$BufferType;", "setTextExpandCollapse", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExpandCollapseTextView.kt */
public final class ExpandCollapseTextView extends AppCompatTextView {
    private HashMap _$_findViewCache;
    private String fullText;
    private boolean isExpanding;
    private int maxLineCountExpandCollapse = -1;

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
    public ExpandCollapseTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getLayout() == null) {
            getViewTreeObserver().addOnPreDrawListener(new ExpandCollapseTextView$onPreDrawListener$1(this));
            return;
        }
        checkExpandCollapseTextView();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandCollapseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getLayout() == null) {
            getViewTreeObserver().addOnPreDrawListener(new ExpandCollapseTextView$onPreDrawListener$1(this));
            return;
        }
        checkExpandCollapseTextView();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandCollapseTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getLayout() == null) {
            getViewTreeObserver().addOnPreDrawListener(new ExpandCollapseTextView$onPreDrawListener$1(this));
            return;
        }
        checkExpandCollapseTextView();
    }

    public final void maxLineExpandCollapse(int i) {
        this.maxLineCountExpandCollapse = i;
        setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    /* access modifiers changed from: private */
    public final void checkExpandCollapseTextView() {
        Layout layout = getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        int lineCount = layout.getLineCount();
        int i = this.maxLineCountExpandCollapse;
        if (lineCount < i || i == -1) {
            setOnClickListener(null);
            setMaxLines(Integer.MAX_VALUE);
            return;
        }
        setTextExpandCollapse();
        setOnClickListener(new ExpandCollapseTextView$checkExpandCollapseTextView$1(this));
    }

    /* access modifiers changed from: private */
    public final void setTextExpandCollapse() {
        if (this.isExpanding) {
            setMaxLines(Integer.MAX_VALUE);
            String string = getContext().getString(R.string.str_compact);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.str_compact)");
            setText(setSpannableString(String.valueOf(this.fullText), string));
            return;
        }
        setMaxLines(this.maxLineCountExpandCollapse);
        String string2 = getContext().getString(R.string.str_see_more);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.str_see_more)");
        String currentVisibleText = getCurrentVisibleText();
        String string3 = getContext().getString(R.string.str_compact);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.str_compact)");
        String replace$default = StringsKt.replace$default(currentVisibleText, string3, "", false, 4, (Object) null);
        Objects.requireNonNull(replace$default, "null cannot be cast to non-null type kotlin.CharSequence");
        setText(setSpannableString(StringsKt.trim((CharSequence) replace$default).toString() + "...", string2));
    }

    private final SpannableStringBuilder setSpannableString(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getCurrentTextColor()), 0, str.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.colorC5671B)), str.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private final String getCurrentVisibleText() {
        int lineStart = getLayout().getLineStart(0);
        int lineEnd = getLayout().getLineEnd(getMaxLines() - 1);
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, ViewHierarchyConstants.TEXT_KEY);
        return text.subSequence(lineStart, lineEnd).toString();
    }

    public final void setFullText(String str) {
        this.fullText = str;
        setText(str);
    }
}
