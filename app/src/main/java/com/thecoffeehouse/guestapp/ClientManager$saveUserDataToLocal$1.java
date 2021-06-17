package com.thecoffeehouse.guestapp;

import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.EncryptionUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
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
@DebugMetadata(c = "com.thecoffeehouse.guestapp.ClientManager$saveUserDataToLocal$1", f = "ClientManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: ClientManager.kt */
public final class ClientManager$saveUserDataToLocal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Profile $userInfo;
    int label;
    private CoroutineScope p$;
    final /* synthetic */ ClientManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClientManager$saveUserDataToLocal$1(ClientManager clientManager, Profile profile, Continuation continuation) {
        super(2, continuation);
        this.this$0 = clientManager;
        this.$userInfo = profile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        ClientManager$saveUserDataToLocal$1 clientManager$saveUserDataToLocal$1 = new ClientManager$saveUserDataToLocal$1(this.this$0, this.$userInfo, continuation);
        clientManager$saveUserDataToLocal$1.p$ = (CoroutineScope) obj;
        return clientManager$saveUserDataToLocal$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClientManager$saveUserDataToLocal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.initUserProfileObj(this.$userInfo.getToken());
            Profile userProfile = this.this$0.getUserProfile();
            if (userProfile != null) {
                userProfile.setFirstName(this.$userInfo.getFirstName());
            }
            Profile userProfile2 = this.this$0.getUserProfile();
            if (userProfile2 != null) {
                userProfile2.setLastName(this.$userInfo.getLastName());
            }
            Profile userProfile3 = this.this$0.getUserProfile();
            if (userProfile3 != null) {
                userProfile3.setBirthday(this.$userInfo.getBirthday());
            }
            Profile userProfile4 = this.this$0.getUserProfile();
            if (userProfile4 != null) {
                userProfile4.setEmail(this.$userInfo.getEmail());
            }
            Profile userProfile5 = this.this$0.getUserProfile();
            if (userProfile5 != null) {
                userProfile5.setPhone(this.$userInfo.getPhone());
            }
            Profile userProfile6 = this.this$0.getUserProfile();
            if (userProfile6 != null) {
                userProfile6.setAvatar(this.$userInfo.getAvatar());
            }
            Profile userProfile7 = this.this$0.getUserProfile();
            if (userProfile7 != null) {
                userProfile7.setGender(this.$userInfo.getGender());
            }
            Profile userProfile8 = this.this$0.getUserProfile();
            if (userProfile8 != null) {
                userProfile8.setBarcode(this.$userInfo.getBarcode());
            }
            Profile userProfile9 = this.this$0.getUserProfile();
            if (userProfile9 != null) {
                userProfile9.setRankId(this.$userInfo.getRankId());
            }
            String str = this.this$0.USER_DATA_FILE;
            String json = new Gson().toJson(this.$userInfo);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(userInfo)");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            Objects.requireNonNull(json, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = json.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            EncryptionUtils.INSTANCE.writeLocalEncrypted(this.this$0.application, str, bytes);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
