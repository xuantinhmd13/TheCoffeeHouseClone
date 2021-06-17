package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ReceiverInfoDialogFragment.kt */
final class ReceiverInfoDialogFragment$initViews$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ ReceiverInfoDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReceiverInfoDialogFragment$initViews$1(ReceiverInfoDialogFragment receiverInfoDialogFragment) {
        super(1);
        this.this$0 = receiverInfoDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        EditText editText;
        EditText editText2;
        Intrinsics.checkNotNullParameter(view, "it");
        ViewGroup viewGroup = this.this$0.mLayoutReceiverName;
        Editable editable = null;
        String valueOf = String.valueOf((viewGroup == null || (editText2 = (EditText) viewGroup.findViewById(R.id.edt_info)) == null) ? null : editText2.getText());
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj = StringsKt.trim((CharSequence) valueOf).toString();
        ViewGroup viewGroup2 = this.this$0.mLayoutReceiverPhoneNumber;
        if (!(viewGroup2 == null || (editText = (EditText) viewGroup2.findViewById(R.id.edt_info)) == null)) {
            editable = editText.getText();
        }
        String valueOf2 = String.valueOf(editable);
        Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type kotlin.CharSequence");
        this.this$0.onChangeReceiverInfoListener.invoke(obj, StringsKt.trim((CharSequence) valueOf2).toString());
        this.this$0.dismiss();
    }
}
