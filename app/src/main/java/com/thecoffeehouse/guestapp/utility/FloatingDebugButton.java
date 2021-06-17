package com.thecoffeehouse.guestapp.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/FloatingDebugButton;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dX", "", "dY", "downRawX", "downRawY", "init", "", "onTouch", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "motionEvent", "Landroid/view/MotionEvent;", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: FloatingDebugButton.kt */
public final class FloatingDebugButton extends FloatingActionButton implements View.OnTouchListener {
    private static final float CLICK_DRAG_TOLERANCE = 10.0f;
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private float dX;
    private float dY;
    private float downRawX;
    private float downRawY;

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
    public FloatingDebugButton(Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
        init();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingDebugButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNull(context);
        init();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingDebugButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNull(context);
        init();
    }

    private final void init() {
        setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.downRawX = motionEvent.getRawX();
            this.downRawY = motionEvent.getRawY();
            this.dX = view.getX() - this.downRawX;
            this.dY = view.getY() - this.downRawY;
            return true;
        } else if (action == 2) {
            int width = view.getWidth();
            int height = view.getHeight();
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            int width2 = view2.getWidth();
            int height2 = view2.getHeight();
            float coerceAtMost = RangesKt.coerceAtMost(((float) (width2 - width)) - ((float) marginLayoutParams.rightMargin), Math.max((float) marginLayoutParams.leftMargin, motionEvent.getRawX() + this.dX));
            view.animate().x(coerceAtMost).y(RangesKt.coerceAtMost(((float) (height2 - height)) - ((float) marginLayoutParams.bottomMargin), RangesKt.coerceAtLeast((float) marginLayoutParams.topMargin, motionEvent.getRawY() + this.dY))).setDuration(0).start();
            return true;
        } else if (action != 1) {
            return super.onTouchEvent(motionEvent);
        } else {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = rawX - this.downRawX;
            float f2 = rawY - this.downRawY;
            if (Math.abs(f) >= CLICK_DRAG_TOLERANCE || Math.abs(f2) >= CLICK_DRAG_TOLERANCE) {
                return true;
            }
            return performClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/FloatingDebugButton$Companion;", "", "()V", "CLICK_DRAG_TOLERANCE", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: FloatingDebugButton.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
