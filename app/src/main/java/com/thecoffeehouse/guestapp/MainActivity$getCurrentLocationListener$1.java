package com.thecoffeehouse.guestapp;

import android.location.Location;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "lastLocation", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$getCurrentLocationListener$1<TResult> implements OnSuccessListener<Location> {
    final /* synthetic */ Function2 $onCompleted;
    final /* synthetic */ Long $threadHoldDistanceInMeters;
    final /* synthetic */ MainActivity this$0;

    MainActivity$getCurrentLocationListener$1(MainActivity mainActivity, Long l, Function2 function2) {
        this.this$0 = mainActivity;
        this.$threadHoldDistanceInMeters = l;
        this.$onCompleted = function2;
    }

    public final void onSuccess(Location location) {
        if (location == null) {
            this.this$0.getDefaultLocation(new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.MainActivity$getCurrentLocationListener$1.AnonymousClass3 */
                final /* synthetic */ MainActivity$getCurrentLocationListener$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
                    invoke(addressSuggestion);
                    return Unit.INSTANCE;
                }

                public final void invoke(AddressSuggestion addressSuggestion) {
                    Intrinsics.checkNotNullParameter(addressSuggestion, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    this.this$0.this$0.addressSuggestion = addressSuggestion;
                    this.this$0.$onCompleted.invoke(addressSuggestion, null);
                }
            });
        } else if (this.$threadHoldDistanceInMeters == null || this.this$0.getAddressSuggestion() == null) {
            this.this$0.getAddressSuggestion(new LatLng(location.getLatitude(), location.getLongitude()), new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.MainActivity$getCurrentLocationListener$1.AnonymousClass2 */
                final /* synthetic */ MainActivity$getCurrentLocationListener$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
                    invoke(addressSuggestion);
                    return Unit.INSTANCE;
                }

                public final void invoke(AddressSuggestion addressSuggestion) {
                    Intrinsics.checkNotNullParameter(addressSuggestion, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    this.this$0.this$0.addressSuggestion = addressSuggestion;
                    this.this$0.$onCompleted.invoke(addressSuggestion, null);
                }
            });
        } else {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            AddressSuggestion addressSuggestion = this.this$0.getAddressSuggestion();
            Intrinsics.checkNotNull(addressSuggestion);
            if (OrderExtsKt.getDistanceByTwoLocation(latLng, addressSuggestion.getLatLng()) < ((double) this.$threadHoldDistanceInMeters.longValue())) {
                Function2 function2 = this.$onCompleted;
                AddressSuggestion addressSuggestion2 = this.this$0.getAddressSuggestion();
                Intrinsics.checkNotNull(addressSuggestion2);
                function2.invoke(addressSuggestion2, false);
                return;
            }
            this.this$0.getAddressSuggestion(new LatLng(location.getLatitude(), location.getLongitude()), new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.MainActivity$getCurrentLocationListener$1.AnonymousClass1 */
                final /* synthetic */ MainActivity$getCurrentLocationListener$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
                    invoke(addressSuggestion);
                    return Unit.INSTANCE;
                }

                public final void invoke(AddressSuggestion addressSuggestion) {
                    Intrinsics.checkNotNullParameter(addressSuggestion, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    this.this$0.this$0.addressSuggestion = addressSuggestion;
                    this.this$0.$onCompleted.invoke(addressSuggestion, true);
                }
            });
        }
    }
}
