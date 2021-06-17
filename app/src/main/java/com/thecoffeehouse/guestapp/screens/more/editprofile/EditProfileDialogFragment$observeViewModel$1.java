package com.thecoffeehouse.guestapp.screens.more.editprofile;

import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "userProfile", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: EditProfileDialogFragment.kt */
public final class EditProfileDialogFragment$observeViewModel$1<T> implements Observer<Profile> {
    final /* synthetic */ EditProfileDialogFragment this$0;

    EditProfileDialogFragment$observeViewModel$1(EditProfileDialogFragment editProfileDialogFragment) {
        this.this$0 = editProfileDialogFragment;
    }

    public final void onChanged(Profile profile) {
        if (profile != null) {
            this.this$0.updateUserProfile(profile);
        }
    }
}
