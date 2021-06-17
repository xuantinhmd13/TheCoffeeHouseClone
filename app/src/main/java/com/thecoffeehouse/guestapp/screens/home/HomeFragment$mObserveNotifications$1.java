package com.thecoffeehouse.guestapp.screens.home;

import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.TabHomeEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.GetNotificationsResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationPayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/GetNotificationsResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$mObserveNotifications$1 extends Lambda implements Function1<GetNotificationsResponse, Unit> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$mObserveNotifications$1(HomeFragment homeFragment) {
        super(1);
        this.this$0 = homeFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetNotificationsResponse getNotificationsResponse) {
        invoke(getNotificationsResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetNotificationsResponse getNotificationsResponse) {
        Intrinsics.checkNotNullParameter(getNotificationsResponse, "it");
        RecyclerView recyclerView = (RecyclerView) this.this$0.getRootView().findViewById(R.id.rcv_notification);
        this.this$0.mNotifications.clear();
        if (!getNotificationsResponse.getData().isEmpty()) {
            this.this$0.mNotifications.add(0, new Notification(null, null, null, null, null, null, 0, this.this$0.getString(R.string.str_new_notifications), 127, null));
            this.this$0.mNotifications.addAll(getNotificationsResponse.getData());
            this.this$0.mAdapterNotification = new NotificationRecyclerViewAdapter(this.this$0.mNotifications, new Function2<Object, Integer, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.home.HomeFragment$mObserveNotifications$1.AnonymousClass1 */
                final /* synthetic */ HomeFragment$mObserveNotifications$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object obj, Integer num) {
                    invoke(obj, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Object obj, int i) {
                    Intrinsics.checkNotNullParameter(obj, "selectNotification");
                    if (obj instanceof Notification) {
                        Notification notification = (Notification) obj;
                        if (Intrinsics.areEqual((Object) notification.getRead(), (Object) false)) {
                            this.this$0.this$0.readNotification(notification, i);
                        }
                        MainActivity mainActivity = this.this$0.this$0.getMainActivity();
                        if (mainActivity != null) {
                            mainActivity.handleNotificationPayload(new NotificationPayload(notification.getPopup(), notification.getDescription(), notification.getId(), notification.getTitle(), notification.getDeeplink()));
                        }
                        TrackingEventService.Companion.updateSourceTrackingEvent(TabHomeEvents.EventNotificationAccessed.name, "Notification");
                        TrackingEventService.Companion.collectParamWithEventName(TabHomeEvents.EventNotificationAccessed.name, new TrackingData(TabHomeEvents.EventNotificationAccessed.Param.notifIndex, Integer.valueOf(i - 1)), new TrackingData(TabHomeEvents.EventNotificationAccessed.Param.deeplinkName, notification.getDeeplink()));
                        TrackingEventService.Companion.triggerSendTrackingEvent(TabHomeEvents.EventNotificationAccessed.name);
                    }
                }
            });
            if (recyclerView != null) {
                recyclerView.setAdapter(HomeFragment.access$getMAdapterNotification$p(this.this$0));
            }
        } else if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }
}
