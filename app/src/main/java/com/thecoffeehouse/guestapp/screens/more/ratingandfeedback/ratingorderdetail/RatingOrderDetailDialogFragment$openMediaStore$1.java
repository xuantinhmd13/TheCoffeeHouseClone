package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import com.thecoffeehouse.guestapp.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGrantedPermission", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailDialogFragment.kt */
public final class RatingOrderDetailDialogFragment$openMediaStore$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ int $imageCount;
    final /* synthetic */ RatingOrderDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RatingOrderDetailDialogFragment$openMediaStore$1(RatingOrderDetailDialogFragment ratingOrderDetailDialogFragment, int i) {
        super(1);
        this.this$0 = ratingOrderDetailDialogFragment;
        this.$imageCount = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.showPickPhotosBottomSheetDialogFragment(this.$imageCount);
            return;
        }
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.openSettingsApp();
        }
    }
}
