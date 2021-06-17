package com.thecoffeehouse.guestapp.screens.more;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SavedAddressDetailFragment.kt */
final class SavedAddressDetailFragment$initDeleteAddress$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ SavedAddressDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavedAddressDetailFragment$initDeleteAddress$1(SavedAddressDetailFragment savedAddressDetailFragment) {
        super(1);
        this.this$0 = savedAddressDetailFragment;
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
        Context context = this.this$0.getContext();
        if (context != null) {
            new AlertDialog.Builder(context).setTitle(this.this$0.getString(R.string.str_delete_this_address)).setMessage(this.this$0.getString(R.string.str_are_you_sure_you_want_to_delete_this_address)).setNegativeButton(this.this$0.getString(R.string.str_cancel), SavedAddressDetailFragment$initDeleteAddress$1$1$1.INSTANCE).setPositiveButton(this.this$0.getString(R.string.str_delete_address), new SavedAddressDetailFragment$initDeleteAddress$1$$special$$inlined$let$lambda$1(this)).show();
        }
    }
}
