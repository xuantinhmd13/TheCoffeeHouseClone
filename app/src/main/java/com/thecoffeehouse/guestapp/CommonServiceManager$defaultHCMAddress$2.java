package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CommonServiceManager.kt */
public final class CommonServiceManager$defaultHCMAddress$2 extends Lambda implements Function0<AddressSuggestion> {
    public static final CommonServiceManager$defaultHCMAddress$2 INSTANCE = new CommonServiceManager$defaultHCMAddress$2();

    CommonServiceManager$defaultHCMAddress$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddressSuggestion invoke() {
        return new AddressSuggestion(10.7710475d, 106.6810365d, "");
    }
}
