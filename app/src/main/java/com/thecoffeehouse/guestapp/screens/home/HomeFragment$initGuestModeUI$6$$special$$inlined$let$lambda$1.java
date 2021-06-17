package com.thecoffeehouse.guestapp.screens.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "isSuccess", "", "invoke", "com/thecoffeehouse/guestapp/screens/home/HomeFragment$initGuestModeUI$6$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$initGuestModeUI$6$$special$$inlined$let$lambda$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ HomeFragment$initGuestModeUI$6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$initGuestModeUI$6$$special$$inlined$let$lambda$1(HomeFragment$initGuestModeUI$6 homeFragment$initGuestModeUI$6) {
        super(1);
        this.this$0 = homeFragment$initGuestModeUI$6;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.this$0.resetData();
        }
    }
}
