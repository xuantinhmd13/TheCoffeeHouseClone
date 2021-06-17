package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.common.music.MusicResponse;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Landroidx/lifecycle/LiveData;"}, k = 3, mv = {1, 4, 0})
/* compiled from: MusicPlayingViewModel.kt */
final class MusicPlayingViewModel$musicPlaying$1<I, O> implements Function<Boolean, LiveData<Resource<? extends MusicResponse>>> {
    final /* synthetic */ MusicPlayingViewModel this$0;

    MusicPlayingViewModel$musicPlaying$1(MusicPlayingViewModel musicPlayingViewModel) {
        this.this$0 = musicPlayingViewModel;
    }

    public final LiveData<Resource<MusicResponse>> apply(Boolean bool) {
        GeneralKt.log("fetch music: " + ((Boolean) this.this$0._fetchMusicPlaying.getValue()));
        if (Intrinsics.areEqual((Object) ((Boolean) this.this$0._fetchMusicPlaying.getValue()), (Object) true)) {
            return this.this$0.getMusicFromServer();
        }
        return this.this$0._musicPlaying;
    }
}
