package com.thecoffeehouse.guestapp.screens.home;

import androidx.cardview.widget.CardView;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.services.api.model.common.config.EventCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/EventCard;", "invoke", "com/thecoffeehouse/guestapp/screens/home/HomeFragment$initEventCard$1$1$itemEventCard$1", "com/thecoffeehouse/guestapp/screens/home/HomeFragment$$special$$inlined$forEach$lambda$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$initEventCard$$inlined$let$lambda$1 extends Lambda implements Function1<EventCard, Unit> {
    final /* synthetic */ CardView $cardViewEvent$inlined;
    final /* synthetic */ EventCard $eventCard;
    final /* synthetic */ PlaceHolderView $phvEventCard$inlined;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$initEventCard$$inlined$let$lambda$1(EventCard eventCard, HomeFragment homeFragment, PlaceHolderView placeHolderView, CardView cardView) {
        super(1);
        this.$eventCard = eventCard;
        this.this$0 = homeFragment;
        this.$phvEventCard$inlined = placeHolderView;
        this.$cardViewEvent$inlined = cardView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EventCard eventCard) {
        invoke(eventCard);
        return Unit.INSTANCE;
    }

    public final void invoke(EventCard eventCard) {
        MainActivity mainActivity;
        Intrinsics.checkNotNullParameter(eventCard, "it");
        if (this.$eventCard.getDeeplink() != null && (mainActivity = this.this$0.getMainActivity()) != null) {
            mainActivity.parseDeepLink(this.$eventCard.getDeeplink());
        }
    }
}
