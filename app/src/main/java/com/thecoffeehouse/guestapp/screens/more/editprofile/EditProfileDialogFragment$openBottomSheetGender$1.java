package com.thecoffeehouse.guestapp.screens.more.editprofile;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: EditProfileDialogFragment.kt */
public final class EditProfileDialogFragment$openBottomSheetGender$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ BottomSheetDialog $shareReportBottomSheetDialog;
    final /* synthetic */ EditProfileDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EditProfileDialogFragment$openBottomSheetGender$1(EditProfileDialogFragment editProfileDialogFragment, BottomSheetDialog bottomSheetDialog) {
        super(1);
        this.this$0 = editProfileDialogFragment;
        this.$shareReportBottomSheetDialog = bottomSheetDialog;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        ((TextView) this.this$0._$_findCachedViewById(R.id.edt_user_gender)).setText(R.string.str_male);
        this.$shareReportBottomSheetDialog.dismiss();
    }
}
