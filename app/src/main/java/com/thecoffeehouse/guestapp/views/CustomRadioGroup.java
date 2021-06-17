package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u0001:\u000489:;B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\fJ\u0006\u0010*\u001a\u00020\u0017J\b\u0010+\u001a\u00020\u0017H\u0002J\b\u0010,\u001a\u00020\u0017H\u0014J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010#\u001a\u00020/H\u0002J\u001a\u00100\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u00010$2\u0006\u00102\u001a\u00020\u001fH\u0002J\u0012\u00103\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u00104\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010!J\u0010\u00106\u001a\u00020\u00172\u0006\u00105\u001a\u000207H\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Landroid/widget/CompoundButton;", "checkedItem", "getCheckedItem", "()Landroid/widget/CompoundButton;", "checkedItemId", "getCheckedItemId", "()I", "childOnCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "childOnClickListener", "Lkotlin/Function1;", "", "getChildOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setChildOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "mPassThroughListener", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$PassThroughHierarchyChangeListener;", "mProtectFromCheckedChange", "", "onCheckedChangeListener", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$OnCheckedChangeListener;", "addView", "child", "Landroid/view/View;", FirebaseAnalytics.Param.INDEX, NativeProtocol.WEB_DIALOG_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "check", ViewHierarchyConstants.VIEW_KEY, "clearCheck", "init", "onFinishInflate", "parseChild", "parseChildren", "Landroid/view/ViewGroup;", "setCheckedStateForView", "checkedView", "checked", "setCheckedView", "setOnCheckedChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHierarchyChangeListener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "CheckedStateTracker", "Companion", "OnCheckedChangeListener", "PassThroughHierarchyChangeListener", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CustomRadioGroup.kt */
public final class CustomRadioGroup extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);
    private HashMap _$_findViewCache;
    private CompoundButton checkedItem;
    private CompoundButton.OnCheckedChangeListener childOnCheckedChangeListener;
    private Function1<? super Integer, Unit> childOnClickListener = CustomRadioGroup$childOnClickListener$1.INSTANCE;
    private PassThroughHierarchyChangeListener mPassThroughListener;
    private boolean mProtectFromCheckedChange;
    private OnCheckedChangeListener onCheckedChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$OnCheckedChangeListener;", "", "onCheckedChanged", "", "group", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup;", "checkedId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CustomRadioGroup.kt */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(CustomRadioGroup customRadioGroup, int i);
    }

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

    public final CompoundButton getCheckedItem() {
        return this.checkedItem;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getChildOnClickListener() {
        return this.childOnClickListener;
    }

    public final void setChildOnClickListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.childOnClickListener = function1;
    }

    public CustomRadioGroup(Context context) {
        super(context);
        setOrientation(0);
        init();
    }

    public CustomRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CustomRadioGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private final void init() {
        this.childOnCheckedChangeListener = new CheckedStateTracker();
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.mPassThroughListener = passThroughHierarchyChangeListener;
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        Intrinsics.checkNotNullParameter(onHierarchyChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = this.mPassThroughListener;
        Intrinsics.checkNotNull(passThroughHierarchyChangeListener);
        passThroughHierarchyChangeListener.setMOnHierarchyChangeListener(onHierarchyChangeListener);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        CompoundButton compoundButton = this.checkedItem;
        if (compoundButton != null) {
            this.mProtectFromCheckedChange = true;
            setCheckedStateForView(compoundButton, true);
            this.mProtectFromCheckedChange = false;
            setCheckedView(this.checkedItem);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "child");
        Intrinsics.checkNotNullParameter(layoutParams, NativeProtocol.WEB_DIALOG_PARAMS);
        parseChild(view);
        super.addView(view, i, layoutParams);
    }

    private final void parseChild(View view) {
        if (view instanceof CompoundButton) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                this.mProtectFromCheckedChange = true;
                CompoundButton compoundButton2 = this.checkedItem;
                if (compoundButton2 != null) {
                    setCheckedStateForView(compoundButton2, false);
                }
                this.mProtectFromCheckedChange = false;
                setCheckedView(compoundButton);
            }
        } else if (view instanceof ViewGroup) {
            parseChildren((ViewGroup) view);
        }
    }

    private final void parseChildren(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "child.getChildAt(i)");
            parseChild(childAt);
        }
    }

    public final void check(CompoundButton compoundButton) {
        CompoundButton compoundButton2 = this.checkedItem;
        if (compoundButton2 != null) {
            setCheckedStateForView(compoundButton2, false);
        }
        if (compoundButton != null) {
            setCheckedStateForView(compoundButton, true);
        }
        setCheckedView(compoundButton);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setCheckedView(CompoundButton compoundButton) {
        this.checkedItem = compoundButton;
        OnCheckedChangeListener onCheckedChangeListener2 = this.onCheckedChangeListener;
        if (onCheckedChangeListener2 != null) {
            Intrinsics.checkNotNull(onCheckedChangeListener2);
            CompoundButton compoundButton2 = this.checkedItem;
            Intrinsics.checkNotNull(compoundButton2);
            onCheckedChangeListener2.onCheckedChanged(this, compoundButton2.getId());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setCheckedStateForView(View view, boolean z) {
        if (view != null && (view instanceof CompoundButton)) {
            ((CompoundButton) view).setChecked(z);
        }
    }

    public final int getCheckedItemId() {
        CompoundButton compoundButton = this.checkedItem;
        Intrinsics.checkNotNull(compoundButton);
        return compoundButton.getId();
    }

    public final void clearCheck() {
        check(null);
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener2) {
        this.onCheckedChangeListener = onCheckedChangeListener2;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$CheckedStateTracker;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "(Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup;)V", "onCheckedChanged", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/CompoundButton;", "b", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CustomRadioGroup.kt */
    public final class CheckedStateTracker implements CompoundButton.OnCheckedChangeListener {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CheckedStateTracker() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(compoundButton, ViewHierarchyConstants.VIEW_KEY);
            if (!CustomRadioGroup.this.mProtectFromCheckedChange) {
                CustomRadioGroup.this.mProtectFromCheckedChange = true;
                if (CustomRadioGroup.this.getCheckedItem() != null) {
                    CustomRadioGroup customRadioGroup = CustomRadioGroup.this;
                    customRadioGroup.setCheckedStateForView(customRadioGroup.getCheckedItem(), false);
                }
                CustomRadioGroup.this.mProtectFromCheckedChange = false;
                compoundButton.getId();
                CustomRadioGroup.this.setCheckedView(compoundButton);
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$PassThroughHierarchyChangeListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "(Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup;)V", "mOnHierarchyChangeListener", "getMOnHierarchyChangeListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "setMOnHierarchyChangeListener", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "onChildViewAdded", "", "parent", "Landroid/view/View;", "child", "onChildViewRemoved", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CustomRadioGroup.kt */
    public final class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PassThroughHierarchyChangeListener() {
        }

        public final ViewGroup.OnHierarchyChangeListener getMOnHierarchyChangeListener() {
            return this.mOnHierarchyChangeListener;
        }

        public final void setMOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            this.mOnHierarchyChangeListener = onHierarchyChangeListener;
        }

        public void onChildViewAdded(View view, View view2) {
            Intrinsics.checkNotNullParameter(view, "parent");
            Intrinsics.checkNotNullParameter(view2, "child");
            if (view2 instanceof CompoundButton) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT < 17) {
                        view2.setId(CustomRadioGroup.Companion.generateViewId());
                    } else {
                        view2.setId(View.generateViewId());
                    }
                }
                ((CompoundButton) view2).setOnCheckedChangeListener(CustomRadioGroup.this.childOnCheckedChangeListener);
                view2.setOnClickListener(new CustomRadioGroup$PassThroughHierarchyChangeListener$onChildViewAdded$1(this));
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.mOnHierarchyChangeListener;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
            } else if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "child.getChildAt(i)");
                    onChildViewAdded(view2, childAt);
                }
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            Intrinsics.checkNotNullParameter(view, "parent");
            Intrinsics.checkNotNullParameter(view2, "child");
            if (view2 instanceof RadioButton) {
                ((CompoundButton) view2).setOnCheckedChangeListener(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$Companion;", "", "()V", "sNextGeneratedId", "Ljava/util/concurrent/atomic/AtomicInteger;", "generateViewId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CustomRadioGroup.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int generateViewId() {
            int i;
            int i2;
            do {
                i = CustomRadioGroup.sNextGeneratedId.get();
                i2 = i + 1;
                if (i2 > 16777215) {
                    i2 = 1;
                }
            } while (!CustomRadioGroup.sNextGeneratedId.compareAndSet(i, i2));
            return i;
        }
    }
}
