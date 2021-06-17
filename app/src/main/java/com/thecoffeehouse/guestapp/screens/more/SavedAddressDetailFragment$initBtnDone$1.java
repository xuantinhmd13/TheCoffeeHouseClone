package com.thecoffeehouse.guestapp.screens.more;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SavedAddressDetailFragment.kt */
public final class SavedAddressDetailFragment$initBtnDone$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ SavedAddressDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavedAddressDetailFragment$initBtnDone$1(SavedAddressDetailFragment savedAddressDetailFragment) {
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
        View findViewById;
        EditText editText;
        View findViewById2;
        EditText editText2;
        Intrinsics.checkNotNullParameter(view, "it");
        String fullAddress = SavedAddressDetailFragment.access$getPreFillAddress$p(this.this$0).getFullAddress();
        LinearLayout access$getLayoutUserInfo$p = SavedAddressDetailFragment.access$getLayoutUserInfo$p(this.this$0);
        Editable editable = null;
        Editable text = (access$getLayoutUserInfo$p == null || (findViewById2 = access$getLayoutUserInfo$p.findViewById(R.id.row_address_user_name)) == null || (editText2 = (EditText) findViewById2.findViewById(R.id.edt_info)) == null) ? null : editText2.getText();
        LinearLayout access$getLayoutUserInfo$p2 = SavedAddressDetailFragment.access$getLayoutUserInfo$p(this.this$0);
        if (!(access$getLayoutUserInfo$p2 == null || (findViewById = access$getLayoutUserInfo$p2.findViewById(R.id.row_address_user_phone)) == null || (editText = (EditText) findViewById.findViewById(R.id.edt_info)) == null)) {
            editable = editText.getText();
        }
        boolean z = true;
        if (!(fullAddress.length() == 0)) {
            Editable editable2 = text;
            if (!(editable2 == null || editable2.length() == 0)) {
                Editable editable3 = editable;
                if (!(editable3 == null || editable3.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    SavedAddressDetailFragment.access$prepareDataUpsert(this.this$0);
                    SavedAddressDetailFragment.access$getPickLocationViewModel$p(this.this$0).upsertUserAddress(SavedAddressDetailFragment.access$getPreFillAddress$p(this.this$0)).observe(this.this$0, new BaseFullScreenDialogFragment.ObserverBaseResource(this.this$0, new Function1<ServerErrorResponse, Unit>(this) {
                        /* class com.thecoffeehouse.guestapp.screens.more.SavedAddressDetailFragment$initBtnDone$1.AnonymousClass1 */
                        final /* synthetic */ SavedAddressDetailFragment$initBtnDone$1 this$0;

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
                            if (SavedAddressDetailFragment.access$isCreateNewAddress(this.this$0.this$0)) {
                                SavedAddressDetailFragment.access$sendEventTrackingCreateNewAddresses(this.this$0.this$0);
                            }
                            SavedAddressDetailFragment.access$getOnCompleteListener$p(this.this$0.this$0).invoke();
                            this.this$0.this$0.dismiss();
                            Toast.makeText(this.this$0.this$0.getContext(), this.this$0.this$0.getString(R.string.str_save_address_completed), 0).show();
                        }
                    }, null, false, false, 14, null));
                    return;
                }
            }
        }
        MainActivity access$getMainActivity = SavedAddressDetailFragment.access$getMainActivity(this.this$0);
        if (access$getMainActivity != null) {
            String string = this.this$0.getString(R.string.str_missing_required_fields);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_missing_required_fields)");
            String string2 = this.this$0.getString(R.string.str_please_fill_required_address_info);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_p…ll_required_address_info)");
            ContextExtsKt.showOneButtonAlertDialog$default(access$getMainActivity, string, string2, null, false, null, 24, null);
        }
    }
}
