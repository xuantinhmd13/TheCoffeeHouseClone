package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.music.MusicResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006H\u0014¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingViewModel$getMusicFromServer$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "convertRequestToResult", "newData", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MusicPlayingViewModel.kt */
public final class MusicPlayingViewModel$getMusicFromServer$1 extends NetworkBoundResource<MusicResponse, MusicResponse> {
    final /* synthetic */ MusicPlayingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MusicPlayingViewModel$getMusicFromServer$1(MusicPlayingViewModel musicPlayingViewModel, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = musicPlayingViewModel;
    }

    /* access modifiers changed from: protected */
    public MusicResponse convertRequestToResult(MusicResponse musicResponse) {
        Intrinsics.checkNotNullParameter(musicResponse, "newData");
        this.this$0._musicPlaying.setValue(Resource.Companion.success(musicResponse));
        return (MusicResponse) super.convertRequestToResult((Object) musicResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<MusicResponse>> createCall() {
        return this.this$0.getApplication().requireCommonServiceManager().getCommonApiService().getMusicService().getMusicPlaying();
    }
}
