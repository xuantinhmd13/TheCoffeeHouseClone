package com.thecoffeehouse.guestapp.screens.login;

import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.login.LoginActivity;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.MergeProfilesDialog;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.SignUpDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.profile.MergeProfile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "mergeProfilesDialog", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/MergeProfilesDialog;", "mergeProfile", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/MergeProfile;", "invoke", "com/thecoffeehouse/guestapp/screens/login/LoginActivity$checkProfileStatus$1$1$mergeProfile$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1 extends Lambda implements Function2<MergeProfilesDialog, MergeProfile, Unit> {
    final /* synthetic */ Resource $resourceMergeProfile$inlined;
    final /* synthetic */ LoginActivity$checkProfileStatus$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1(LoginActivity$checkProfileStatus$1 loginActivity$checkProfileStatus$1, Resource resource) {
        super(2);
        this.this$0 = loginActivity$checkProfileStatus$1;
        this.$resourceMergeProfile$inlined = resource;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MergeProfilesDialog mergeProfilesDialog, MergeProfile mergeProfile) {
        invoke(mergeProfilesDialog, mergeProfile);
        return Unit.INSTANCE;
    }

    public final void invoke(final MergeProfilesDialog mergeProfilesDialog, MergeProfile mergeProfile) {
        Intrinsics.checkNotNullParameter(mergeProfilesDialog, "mergeProfilesDialog");
        Intrinsics.checkNotNullParameter(mergeProfile, "mergeProfile");
        LoginActivity.access$getViewModel$p(this.this$0.this$0).callMergeProfileRequest(this.this$0.$resource.getToken(), mergeProfile).observe(this.this$0.this$0, new LoginActivity.ObserverBaseResource(this.this$0.this$0, new Function1<AuthResponse, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1.AnonymousClass1 */
            final /* synthetic */ LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthResponse authResponse) {
                invoke(authResponse);
                return Unit.INSTANCE;
            }

            public final void invoke(final AuthResponse authResponse) {
                Intrinsics.checkNotNullParameter(authResponse, "mergeProfileResponse");
                mergeProfilesDialog.dismiss();
                if (authResponse.getProfileStatus() != 0) {
                    this.this$0.this$0.this$0.checkProfileStatus(authResponse);
                    return;
                }
                SignUpDialogFragment newInstance = SignUpDialogFragment.Companion.newInstance(authResponse, new Function5<SignUpDialogFragment, String, String, String, Integer, Unit>(this) {
                    /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1.AnonymousClass1.AnonymousClass1 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function5
                    public /* bridge */ /* synthetic */ Unit invoke(SignUpDialogFragment signUpDialogFragment, String str, String str2, String str3, Integer num) {
                        invoke(signUpDialogFragment, str, str2, str3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(SignUpDialogFragment signUpDialogFragment, String str, String str2, String str3, int i) {
                        Intrinsics.checkNotNullParameter(signUpDialogFragment, "signUpDialog");
                        Intrinsics.checkNotNullParameter(str, "firstName");
                        Intrinsics.checkNotNullParameter(str2, "lastName");
                        Intrinsics.checkNotNullParameter(str3, "birthDay");
                        LoginActivity.access$getViewModel$p(this.this$0.this$0.this$0.this$0).callSignUpToServer(authResponse.getToken(), this.this$0.this$0.this$0.this$0.mPhoneNumber, null, str, str2, str3, i).observe(this.this$0.this$0.this$0.this$0, new LoginActivity.ObserverBaseResource(this.this$0.this$0.this$0.this$0, new Function1<AuthResponse, Unit>(this) {
                            /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1.AnonymousClass1.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AuthResponse authResponse) {
                                invoke(authResponse);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AuthResponse authResponse) {
                                Intrinsics.checkNotNullParameter(authResponse, "it");
                                this.this$0.this$0.this$0.this$0.this$0.checkProfileStatus(authResponse);
                            }
                        }, null, 2, null));
                    }
                });
                FragmentManager supportFragmentManager = this.this$0.this$0.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                newInstance.show(supportFragmentManager, (String) null);
            }
        }, null, 2, null));
    }
}
