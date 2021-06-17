package com.thecoffeehouse.guestapp.screens.login;

import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.ConfirmationOTPDialog;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.RequestOTPPhoneNumberResponse;
import com.thecoffeehouse.guestapp.views.TLButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/login/RequestOTPPhoneNumberResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$callRequestOTPToServer$1 extends Lambda implements Function1<RequestOTPPhoneNumberResponse, Unit> {
    final /* synthetic */ Function1 $completed;
    final /* synthetic */ boolean $loginWithPhone;
    final /* synthetic */ String $token;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$callRequestOTPToServer$1(LoginActivity loginActivity, boolean z, Function1 function1, String str) {
        super(1);
        this.this$0 = loginActivity;
        this.$loginWithPhone = z;
        this.$completed = function1;
        this.$token = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOTPPhoneNumberResponse requestOTPPhoneNumberResponse) {
        invoke(requestOTPPhoneNumberResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(RequestOTPPhoneNumberResponse requestOTPPhoneNumberResponse) {
        Intrinsics.checkNotNullParameter(requestOTPPhoneNumberResponse, "it");
        if (requestOTPPhoneNumberResponse.getError() == null) {
            ConfirmationOTPDialog confirmationOTPDialog = this.this$0.mConfirmationOTPDialog;
            if (confirmationOTPDialog == null || !confirmationOTPDialog.isShowing()) {
                LoginActivity loginActivity = this.this$0;
                LoginActivity loginActivity2 = this.this$0;
                loginActivity.mConfirmationOTPDialog = new ConfirmationOTPDialog(loginActivity2, loginActivity2.mPhoneNumber, new Function2<ConfirmationOTPDialog, String, Unit>(this) {
                    /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$callRequestOTPToServer$1.AnonymousClass1 */
                    final /* synthetic */ LoginActivity$callRequestOTPToServer$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ConfirmationOTPDialog confirmationOTPDialog, String str) {
                        invoke(confirmationOTPDialog, str);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ConfirmationOTPDialog confirmationOTPDialog, String str) {
                        Intrinsics.checkNotNullParameter(confirmationOTPDialog, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(str, "otp");
                        this.this$0.this$0.mOTP = str;
                        if (this.this$0.$loginWithPhone) {
                            this.this$0.this$0.callVerifyOTPPhoneNumberToServer(new Function1<AuthResponse, Unit>(this) {
                                /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$callRequestOTPToServer$1.AnonymousClass1.AnonymousClass1 */
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
                                    this.this$0.this$0.$completed.invoke(authResponse);
                                }
                            });
                            return;
                        }
                        LoginActivity loginActivity = this.this$0.this$0;
                        String str2 = this.this$0.$token;
                        Intrinsics.checkNotNull(str2);
                        loginActivity.callSignUpOTPToServer(str2, new Function1<AuthResponse, Unit>(this) {
                            /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$callRequestOTPToServer$1.AnonymousClass1.AnonymousClass2 */
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
                                this.this$0.this$0.$completed.invoke(authResponse);
                            }
                        });
                    }
                }, new Function0<Unit>(this) {
                    /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$callRequestOTPToServer$1.AnonymousClass2 */
                    final /* synthetic */ LoginActivity$callRequestOTPToServer$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        LoginActivity.callRequestOTPToServer$default(this.this$0.this$0, this.this$0.this$0.mPhoneNumber, this.this$0.this$0.mDefaultCountryCode, null, false, AnonymousClass1.INSTANCE, 12, null);
                    }
                });
                ConfirmationOTPDialog confirmationOTPDialog2 = this.this$0.mConfirmationOTPDialog;
                if (confirmationOTPDialog2 != null) {
                    confirmationOTPDialog2.show();
                }
            } else {
                ConfirmationOTPDialog confirmationOTPDialog3 = this.this$0.mConfirmationOTPDialog;
                Intrinsics.checkNotNull(confirmationOTPDialog3);
                confirmationOTPDialog3.resetUI();
            }
        }
        TLButton tLButton = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_verify_phone_number");
        tLButton.setEnabled(true);
    }
}
