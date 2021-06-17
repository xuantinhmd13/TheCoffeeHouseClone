package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingordercategory;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.chip.ChipGroup;
import com.thecoffeehouse.guestapp.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingordercategory/RatingOrderCategoryView$updateData$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderCategoryView.kt */
public final class RatingOrderCategoryView$updateData$$inlined$forEach$lambda$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ RatingOrderCategoryView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RatingOrderCategoryView$updateData$$inlined$forEach$lambda$1(RatingOrderCategoryView ratingOrderCategoryView) {
        super(0);
        this.this$0 = ratingOrderCategoryView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        Object obj;
        ChipGroup chipGroup = (ChipGroup) this.this$0._$_findCachedViewById(R.id.layout_hints_rating);
        Intrinsics.checkNotNullExpressionValue(chipGroup, "layout_hints_rating");
        Iterator it = SequencesKt.filter(ViewGroupKt.getChildren(chipGroup), RatingOrderCategoryView$updateData$1$1$selectedView$1.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj).isSelected()) {
                break;
            }
        }
        if (((View) obj) != null) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.this$0._$_findCachedViewById(R.id.chb_hint_text);
            Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "chb_hint_text");
            appCompatCheckBox.setChecked(true);
        }
    }
}
