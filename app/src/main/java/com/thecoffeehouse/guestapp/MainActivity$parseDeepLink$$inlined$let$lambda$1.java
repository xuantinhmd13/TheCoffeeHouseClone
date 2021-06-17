package com.thecoffeehouse.guestapp;

import android.widget.Toast;
import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.LinkHaravanResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "resources", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanResponse;", "kotlin.jvm.PlatformType", "onChanged", "com/thecoffeehouse/guestapp/MainActivity$parseDeepLink$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$parseDeepLink$$inlined$let$lambda$1<T> implements Observer<Resource<? extends LinkHaravanResponse>> {
    final /* synthetic */ String $codeHaravan$inlined;
    final /* synthetic */ MainActivity this$0;

    MainActivity$parseDeepLink$$inlined$let$lambda$1(MainActivity mainActivity, String str) {
        this.this$0 = mainActivity;
        this.$codeHaravan$inlined = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Resource<? extends LinkHaravanResponse> resource) {
        onChanged((Resource<LinkHaravanResponse>) resource);
    }

    public final void onChanged(Resource<LinkHaravanResponse> resource) {
        LinkHaravanResponse data;
        ServerError error;
        Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = MainActivity.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                MainActivity mainActivity = this.this$0;
                Toast.makeText(mainActivity, mainActivity.getString(R.string.str_link_account_successfully), 0).show();
            } else if (i == 2 && (data = resource.getData()) != null && (error = data.getError()) != null && error.getMessage() != null) {
                Toast.makeText(this.this$0, resource.getData().getError().getMessage(), 0).show();
            }
        }
    }
}
