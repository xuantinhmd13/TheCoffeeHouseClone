package com.thecoffeehouse.guestapp;

import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "kotlin.jvm.PlatformType", "onChanged", "com/thecoffeehouse/guestapp/MainActivity$initLayoutHeader$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$initLayoutHeader$$inlined$apply$lambda$1<T> implements Observer<GetMetadataResponse> {
    final /* synthetic */ View $this_apply;
    final /* synthetic */ MainActivity this$0;

    MainActivity$initLayoutHeader$$inlined$apply$lambda$1(View view, MainActivity mainActivity) {
        this.$this_apply = view;
        this.this$0 = mainActivity;
    }

    public final void onChanged(GetMetadataResponse getMetadataResponse) {
        String brandingImage = getMetadataResponse.getBrandingImage();
        if (brandingImage != null) {
            ((RequestBuilder) ((RequestBuilder) Glide.with((FragmentActivity) this.this$0).load(brandingImage).placeholder((int) R.drawable.ic_branding_default)).error(ContextCompat.getDrawable(this.this$0, R.drawable.ic_branding_default))).into((ImageView) this.$this_apply.findViewById(R.id.img_tch_logo));
        }
    }
}
