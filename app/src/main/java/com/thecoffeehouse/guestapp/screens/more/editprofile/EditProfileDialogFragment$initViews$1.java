package com.thecoffeehouse.guestapp.screens.more.editprofile;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileRequest;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileResponse;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: EditProfileDialogFragment.kt */
public final class EditProfileDialogFragment$initViews$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ EditProfileDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EditProfileDialogFragment$initViews$1(EditProfileDialogFragment editProfileDialogFragment) {
        super(1);
        this.this$0 = editProfileDialogFragment;
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
        UpdateProfileRequest updateProfileRequest = this.this$0.mUpdateProfileRequest;
        EditText editText = (EditText) this.this$0._$_findCachedViewById(R.id.edt_first_name);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_first_name");
        String obj = editText.getText().toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        updateProfileRequest.setFirstName(StringsKt.trim((CharSequence) obj).toString());
        UpdateProfileRequest updateProfileRequest2 = this.this$0.mUpdateProfileRequest;
        EditText editText2 = (EditText) this.this$0._$_findCachedViewById(R.id.edt_last_name);
        Intrinsics.checkNotNullExpressionValue(editText2, "edt_last_name");
        String obj2 = editText2.getText().toString();
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
        updateProfileRequest2.setLastName(StringsKt.trim((CharSequence) obj2).toString());
        UpdateProfileRequest updateProfileRequest3 = this.this$0.mUpdateProfileRequest;
        EditText editText3 = (EditText) this.this$0._$_findCachedViewById(R.id.edt_email);
        Intrinsics.checkNotNullExpressionValue(editText3, "edt_email");
        String obj3 = editText3.getText().toString();
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
        updateProfileRequest3.setEmail(StringsKt.trim((CharSequence) obj3).toString());
        UpdateProfileRequest updateProfileRequest4 = this.this$0.mUpdateProfileRequest;
        EditProfileDialogFragment editProfileDialogFragment = this.this$0;
        TextView textView = (TextView) editProfileDialogFragment._$_findCachedViewById(R.id.edt_user_gender);
        Intrinsics.checkNotNullExpressionValue(textView, "edt_user_gender");
        updateProfileRequest4.setGender(Integer.valueOf(editProfileDialogFragment.formatIntGender(textView.getText().toString())));
        Bitmap bitmap = this.this$0.mBitmapAvatar;
        if (bitmap != null) {
            EditProfileDialogFragment editProfileDialogFragment2 = this.this$0;
            TLImageView tLImageView = (TLImageView) editProfileDialogFragment2._$_findCachedViewById(R.id.img_avatar);
            Intrinsics.checkNotNullExpressionValue(tLImageView, "img_avatar");
            this.this$0.mUpdateProfileRequest.setImage(this.this$0.encodeToBase64(editProfileDialogFragment2.getResizedBitmap(bitmap, tLImageView.getWidth())));
        }
        this.this$0.getViewModel().updateProfile(this.this$0.mUpdateProfileRequest).observe(this.this$0, new BaseFullScreenDialogFragment.ObserverBaseResource(this.this$0, new Function1<UpdateProfileResponse, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.editprofile.EditProfileDialogFragment$initViews$1.AnonymousClass2 */
            final /* synthetic */ EditProfileDialogFragment$initViews$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpdateProfileResponse updateProfileResponse) {
                invoke(updateProfileResponse);
                return Unit.INSTANCE;
            }

            public final void invoke(UpdateProfileResponse updateProfileResponse) {
                Intrinsics.checkNotNullParameter(updateProfileResponse, "it");
                Toast.makeText(this.this$0.this$0.requireContext(), this.this$0.this$0.getString(R.string.str_update_profile_successfully), 0).show();
            }
        }, null, false, false, 14, null));
    }
}
