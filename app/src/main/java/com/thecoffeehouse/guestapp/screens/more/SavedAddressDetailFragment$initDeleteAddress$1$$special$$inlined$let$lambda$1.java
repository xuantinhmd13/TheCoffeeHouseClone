package com.thecoffeehouse.guestapp.screens.more;

import android.content.DialogInterface;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/thecoffeehouse/guestapp/screens/more/SavedAddressDetailFragment$initDeleteAddress$1$1$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: SavedAddressDetailFragment.kt */
public final class SavedAddressDetailFragment$initDeleteAddress$1$$special$$inlined$let$lambda$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ SavedAddressDetailFragment$initDeleteAddress$1 this$0;

    SavedAddressDetailFragment$initDeleteAddress$1$$special$$inlined$let$lambda$1(SavedAddressDetailFragment$initDeleteAddress$1 savedAddressDetailFragment$initDeleteAddress$1) {
        this.this$0 = savedAddressDetailFragment$initDeleteAddress$1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String id = this.this$0.this$0.preFillAddress.getId();
        if (id != null) {
            this.this$0.this$0.getPickLocationViewModel().deleteUserAddress(id).observe(this.this$0.this$0, new BaseFullScreenDialogFragment.ObserverBaseResource(this.this$0.this$0, new Function1<ServerErrorResponse, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.more.SavedAddressDetailFragment$initDeleteAddress$1$$special$$inlined$let$lambda$1.AnonymousClass1 */
                final /* synthetic */ SavedAddressDetailFragment$initDeleteAddress$1$$special$$inlined$let$lambda$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ServerErrorResponse serverErrorResponse) {
                    invoke(serverErrorResponse);
                    return Unit.INSTANCE;
                }

                public final void invoke(ServerErrorResponse serverErrorResponse) {
                    Intrinsics.checkNotNullParameter(serverErrorResponse, "it");
                    this.this$0.this$0.this$0.onCompleteListener.invoke();
                    this.this$0.this$0.this$0.dismiss();
                }
            }, null, false, false, 14, null));
        }
    }
}
