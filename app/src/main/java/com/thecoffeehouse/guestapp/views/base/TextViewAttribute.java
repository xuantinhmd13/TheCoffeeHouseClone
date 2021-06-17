package com.thecoffeehouse.guestapp.views.base;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "", "()V", ViewHierarchyConstants.TEXT_KEY, "", "font", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "textSize", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "textColor", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFont", "()Ljava/lang/Integer;", "setFont", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getTextColor", "setTextColor", "getTextSize", "setTextSize", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TextView.kt */
public final class TextViewAttribute {
    private Integer font;
    private String text = "";
    private Integer textColor;
    private Integer textSize;

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final Integer getTextSize() {
        return this.textSize;
    }

    public final void setTextSize(Integer num) {
        this.textSize = num;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final void setTextColor(Integer num) {
        this.textColor = num;
    }

    public final Integer getFont() {
        return this.font;
    }

    public final void setFont(Integer num) {
        this.font = num;
    }

    public TextViewAttribute() {
    }

    public TextViewAttribute(String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TEXT_KEY);
        this.text = str;
        this.font = num;
    }

    public TextViewAttribute(String str, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TEXT_KEY);
        this.text = str;
        this.textSize = num;
        this.font = num2;
    }

    public TextViewAttribute(String str, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TEXT_KEY);
        this.text = str;
        this.textSize = num;
        this.textColor = num2;
        this.font = num3;
    }
}
