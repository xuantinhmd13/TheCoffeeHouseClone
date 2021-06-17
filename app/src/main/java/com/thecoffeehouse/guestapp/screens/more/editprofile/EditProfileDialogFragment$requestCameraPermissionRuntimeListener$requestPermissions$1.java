package com.thecoffeehouse.guestapp.screens.more.editprofile;

import androidx.activity.result.ActivityResultCallback;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "result", "", "", "kotlin.jvm.PlatformType", "", "", "onActivityResult"}, k = 3, mv = {1, 4, 0})
/* compiled from: EditProfileDialogFragment.kt */
public final class EditProfileDialogFragment$requestCameraPermissionRuntimeListener$requestPermissions$1<O> implements ActivityResultCallback<Map<String, Boolean>> {
    final /* synthetic */ Function1 $onRequestSuccess;
    final /* synthetic */ EditProfileDialogFragment this$0;

    EditProfileDialogFragment$requestCameraPermissionRuntimeListener$requestPermissions$1(EditProfileDialogFragment editProfileDialogFragment, Function1 function1) {
        this.this$0 = editProfileDialogFragment;
        this.$onRequestSuccess = function1;
    }

    public final void onActivityResult(Map<String, Boolean> map) {
        boolean z;
        EditProfileDialogFragment editProfileDialogFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(map, "result");
        if (editProfileDialogFragment.grantedCameraPermissions(map)) {
            GeneralKt.log("Granted Location permission");
            z = true;
        } else {
            GeneralKt.log("Not Granted Location permission");
            z = false;
        }
        editProfileDialogFragment.isRequestCameraPermissionSuccess = z;
        this.$onRequestSuccess.invoke(Boolean.valueOf(this.this$0.isRequestCameraPermissionSuccess));
    }
}
