package com.thecoffeehouse.guestapp;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.EncryptionUtils;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.ClientManager$initUserData$1", f = "ClientManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: ClientManager.kt */
public final class ClientManager$initUserData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    private CoroutineScope p$;
    final /* synthetic */ ClientManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClientManager$initUserData$1(ClientManager clientManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = clientManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        ClientManager$initUserData$1 clientManager$initUserData$1 = new ClientManager$initUserData$1(this.this$0, continuation);
        clientManager$initUserData$1.p$ = (CoroutineScope) obj;
        return clientManager$initUserData$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClientManager$initUserData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String readLocalEncrypted = EncryptionUtils.INSTANCE.readLocalEncrypted(this.this$0.application, this.this$0.USER_DATA_FILE);
            boolean z = true;
            if (readLocalEncrypted.length() == 0) {
                this.this$0.decryptTokenAndFetchUserProfile();
            } else {
                try {
                    this.this$0.userProfile = (Profile) new Gson().fromJson(readLocalEncrypted, Profile.class);
                    String decryptUserToken = EncryptionUtils.INSTANCE.decryptUserToken(this.this$0.application);
                    if (decryptUserToken.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        Profile userProfile = this.this$0.getUserProfile();
                        Intrinsics.checkNotNull(userProfile);
                        userProfile.setToken(decryptUserToken);
                        this.this$0.fetchUserProfile(decryptUserToken);
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    GeneralKt.log(Unit.INSTANCE);
                    this.this$0.decryptTokenAndFetchUserProfile();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
