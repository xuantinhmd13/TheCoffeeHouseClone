package com.thecoffeehouse.guestapp.configs.trackingevents;

import android.content.Context;
import android.os.Handler;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingEventService;", "", "()V", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingEventService.kt */
public final class TrackingEventService {
    public static final Companion Companion = new Companion(null);
    private static volatile FirebaseAnalytics INSTANCE;
    private static Context mContext;
    private static ArrayList<EventWithTrackingData> mTrackingParams = new ArrayList<>();
    private static ArrayList<EventSource> mTrackingSources = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\n\u0010\u0018\u001a\u00060\u0011j\u0002`\u0019J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J%\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0002¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\"\u001a\u00020\u000e2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\n\u0010#\u001a\u00060\u0001j\u0002`$R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingEventService$Companion;", "", "()V", "INSTANCE", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "mContext", "Landroid/content/Context;", "mTrackingParams", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventWithTrackingData;", "Lkotlin/collections/ArrayList;", "mTrackingSources", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventSource;", "clearTrackingData", "", "collectParamWithEventName", "eventName", "", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventName;", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingData;", "(Ljava/lang/String;[Lcom/thecoffeehouse/guestapp/configs/trackingevents/TrackingData;)V", "getValueTracking", "paramName", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ParamName;", "initialize", "context", "logCustomEventName", "", "(Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;", "setUserId", "barcode", "triggerSendTrackingEvent", "updateSourceTrackingEvent", "source", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ParamValue;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TrackingEventService.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FirebaseAnalytics initialize(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FirebaseAnalytics firebaseAnalytics = TrackingEventService.INSTANCE;
            if (firebaseAnalytics == null) {
                synchronized (this) {
                    TrackingEventService.mContext = context;
                    firebaseAnalytics = TrackingEventService.INSTANCE;
                    if (firebaseAnalytics == null) {
                        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
                        TrackingEventService.INSTANCE = instance;
                        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseAnalytics.getIns…t).also { INSTANCE = it }");
                        firebaseAnalytics = instance;
                    }
                }
            }
            return firebaseAnalytics;
        }

        public final void setUserId(String str) {
            Intrinsics.checkNotNullParameter(str, "barcode");
            FirebaseAnalytics firebaseAnalytics = TrackingEventService.INSTANCE;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.setUserId(str);
            }
        }

        public final void updateSourceTrackingEvent(String str, Object obj) {
            Object obj2;
            Intrinsics.checkNotNullParameter(str, "eventName");
            Intrinsics.checkNotNullParameter(obj, "source");
            ArrayList<EventSource> arrayList = TrackingEventService.mTrackingSources;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (EventSource eventSource : arrayList) {
                arrayList2.add(eventSource.getEventName());
            }
            if (!arrayList2.contains(str)) {
                TrackingEventService.mTrackingSources.add(new EventSource(str, obj));
                return;
            }
            Iterator it = TrackingEventService.mTrackingSources.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((EventSource) obj2).getEventName(), str)) {
                    break;
                }
            }
            EventSource eventSource2 = (EventSource) obj2;
            if (eventSource2 != null) {
                eventSource2.setSource(obj);
            }
        }

        public final Object getValueTracking(String str, String str2) {
            Object obj;
            TrackingData trackingData;
            Object obj2;
            Intrinsics.checkNotNullParameter(str, "eventName");
            Intrinsics.checkNotNullParameter(str2, "paramName");
            if (Intrinsics.areEqual(str2, "source")) {
                Iterator it = TrackingEventService.mTrackingSources.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((EventSource) obj2).getEventName(), str)) {
                        break;
                    }
                }
                EventSource eventSource = (EventSource) obj2;
                if (eventSource != null) {
                    return eventSource.getSource();
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : TrackingEventService.mTrackingParams) {
                if (Intrinsics.areEqual(((EventWithTrackingData) obj3).getEventName(), str)) {
                    arrayList.add(obj3);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((EventWithTrackingData) obj).getTrackingData().getParamName(), str2)) {
                    break;
                }
            }
            EventWithTrackingData eventWithTrackingData = (EventWithTrackingData) obj;
            if (eventWithTrackingData == null || (trackingData = eventWithTrackingData.getTrackingData()) == null) {
                return null;
            }
            return trackingData.getParamValue();
        }

        public final void triggerSendTrackingEvent(String str) {
            Intrinsics.checkNotNullParameter(str, "eventName");
            new Handler().postDelayed(new TrackingEventService$Companion$triggerSendTrackingEvent$1(str), 2000);
        }

        /* access modifiers changed from: private */
        public final Unit logCustomEventName(String str, List<TrackingData> list) {
            return (Unit) BuildersKt.runBlocking(Dispatchers.getIO(), new TrackingEventService$Companion$logCustomEventName$1(str, list, null));
        }

        public final void clearTrackingData() {
            TrackingEventService.mTrackingParams.clear();
            TrackingEventService.mTrackingSources.clear();
        }

        public final void collectParamWithEventName(String str, TrackingData... trackingDataArr) {
            Object obj;
            boolean z;
            Intrinsics.checkNotNullParameter(str, "eventName");
            Intrinsics.checkNotNullParameter(trackingDataArr, NativeProtocol.WEB_DIALOG_PARAMS);
            try {
                for (TrackingData trackingData : trackingDataArr) {
                    Iterator it = TrackingEventService.mTrackingParams.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        EventWithTrackingData eventWithTrackingData = (EventWithTrackingData) obj;
                        if (!Intrinsics.areEqual(eventWithTrackingData.getEventName(), str) || !Intrinsics.areEqual(eventWithTrackingData.getTrackingData().getParamName(), trackingData.getParamName())) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    EventWithTrackingData eventWithTrackingData2 = (EventWithTrackingData) obj;
                    if (eventWithTrackingData2 == null) {
                        TrackingEventService.mTrackingParams.add(new EventWithTrackingData(str, trackingData));
                    } else {
                        eventWithTrackingData2.getTrackingData().setParamValue(trackingData.getParamValue());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
