package com.thecoffeehouse.guestapp;

import androidx.activity.result.ActivityResultCallback;
import com.facebook.appevents.integrity.IntegrityManager;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "result", "", "", "kotlin.jvm.PlatformType", "", "", "onActivityResult"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$performRequestPermission$requestPermissions$1<O> implements ActivityResultCallback<Map<String, Boolean>> {
    final /* synthetic */ Function2 $onRequestSuccess;
    final /* synthetic */ MainActivity this$0;

    MainActivity$performRequestPermission$requestPermissions$1(MainActivity mainActivity, Function2 function2) {
        this.this$0 = mainActivity;
        this.$onRequestSuccess = function2;
    }

    public final void onActivityResult(Map<String, Boolean> map) {
        this.this$0.isAlreadyRequestPermissionEnable = true;
        MainActivity mainActivity = this.this$0;
        Intrinsics.checkNotNullExpressionValue(map, "result");
        if (mainActivity.grantedLocationPermissions(map)) {
            GeneralKt.log("Granted Location permission");
            if (this.this$0.isEnableLocationService()) {
                MainActivity.getCurrentLocationListener$default(this.this$0, null, new Function2<AddressSuggestion, Boolean, Unit>(this) {
                    /* class com.thecoffeehouse.guestapp.MainActivity$performRequestPermission$requestPermissions$1.AnonymousClass1 */
                    final /* synthetic */ MainActivity$performRequestPermission$requestPermissions$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion, Boolean bool) {
                        invoke(addressSuggestion, bool);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AddressSuggestion addressSuggestion, Boolean bool) {
                        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
                        GeneralKt.log("isOutOfThreadHold: " + bool);
                        this.this$0.$onRequestSuccess.invoke(Boolean.valueOf(this.this$0.this$0.isGrantedLocationPermission()), addressSuggestion);
                    }
                }, 1, null);
            } else {
                this.this$0.showEnableServiceAlertDialog();
            }
        } else if (this.this$0.getAddressSuggestion() != null) {
            Function2 function2 = this.$onRequestSuccess;
            Boolean valueOf = Boolean.valueOf(this.this$0.isGrantedLocationPermission());
            AddressSuggestion addressSuggestion = this.this$0.getAddressSuggestion();
            Intrinsics.checkNotNull(addressSuggestion);
            function2.invoke(valueOf, addressSuggestion);
        } else {
            this.this$0.getDefaultLocation(new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.MainActivity$performRequestPermission$requestPermissions$1.AnonymousClass2 */
                final /* synthetic */ MainActivity$performRequestPermission$requestPermissions$1 this$0;

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
                    this.this$0.$onRequestSuccess.invoke(Boolean.valueOf(this.this$0.this$0.isGrantedLocationPermission()), addressSuggestion);
                }
            });
        }
    }
}
