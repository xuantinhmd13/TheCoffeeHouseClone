package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.chip.ChipGroup;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderCategoryView.kt */
public final class RatingOrderCategoryView$updateData$2 implements View.OnClickListener {
    final /* synthetic */ RatingOrderCategoryView this$0;

    RatingOrderCategoryView$updateData$2(RatingOrderCategoryView ratingOrderCategoryView) {
        this.this$0 = ratingOrderCategoryView;
    }

    public final void onClick(View view) {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.this$0._$_findCachedViewById(R.id.chb_hint_text);
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "chb_hint_text");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.this$0._$_findCachedViewById(R.id.chb_hint_text);
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox2, "chb_hint_text");
        appCompatCheckBox.setChecked(!appCompatCheckBox2.isChecked());
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.this$0._$_findCachedViewById(R.id.chb_hint_text);
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox3, "chb_hint_text");
        GeneralKt.log(Boolean.valueOf(appCompatCheckBox3.isChecked()));
        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.this$0._$_findCachedViewById(R.id.chb_hint_text);
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox4, "chb_hint_text");
        if (!appCompatCheckBox4.isChecked()) {
            ChipGroup chipGroup = (ChipGroup) this.this$0._$_findCachedViewById(R.id.layout_hints_rating);
            Intrinsics.checkNotNullExpressionValue(chipGroup, "layout_hints_rating");
            for (View view2 : ViewGroupKt.getChildren(chipGroup)) {
                Objects.requireNonNull(view2, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory.RatingHintTextView");
                ((RatingHintTextView) view2).setSelectHint(false);
            }
        }
    }
}
