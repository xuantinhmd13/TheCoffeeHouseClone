package com.thecoffeehouse.guestapp.views;

import android.view.View;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: CustomRadioGroup.kt */
final class CustomRadioGroup$PassThroughHierarchyChangeListener$onChildViewAdded$1 implements View.OnClickListener {
    final /* synthetic */ CustomRadioGroup.PassThroughHierarchyChangeListener this$0;

    CustomRadioGroup$PassThroughHierarchyChangeListener$onChildViewAdded$1(CustomRadioGroup.PassThroughHierarchyChangeListener passThroughHierarchyChangeListener) {
        this.this$0 = passThroughHierarchyChangeListener;
    }

    public final void onClick(View view) {
        Function1<Integer, Unit> childOnClickListener = CustomRadioGroup.this.getChildOnClickListener();
        Intrinsics.checkNotNullExpressionValue(view, "it");
        childOnClickListener.invoke(Integer.valueOf(view.getId()));
    }
}
