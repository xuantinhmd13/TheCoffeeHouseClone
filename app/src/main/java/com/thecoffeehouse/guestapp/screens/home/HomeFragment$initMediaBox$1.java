package com.thecoffeehouse.guestapp.screens.home;

import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "metadata", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$initMediaBox$1<T> implements Observer<GetMetadataResponse> {
    final /* synthetic */ HomeFragment this$0;

    HomeFragment$initMediaBox$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    public final void onChanged(GetMetadataResponse getMetadataResponse) {
        Object obj;
        try {
            obj = getMetadataResponse.getMediaBackground();
        } catch (Exception unused) {
            obj = Integer.valueOf((int) R.drawable.background_home);
        }
        if (obj != null) {
            ((RequestBuilder) Glide.with(this.this$0.requireContext()).load(obj).placeholder((int) R.drawable.background_home)).into((ImageView) this.this$0.getRootView().findViewById(R.id.img_media_background)).onLoadFailed(ContextCompat.getDrawable(this.this$0.requireContext(), R.drawable.background_home));
        }
    }
}
