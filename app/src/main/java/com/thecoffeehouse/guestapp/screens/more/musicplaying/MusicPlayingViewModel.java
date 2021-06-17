package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.music.MusicResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0004¢\u0006\u0002\n\u0000R6\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_fetchMusicPlaying", "Landroidx/lifecycle/MutableLiveData;", "", "_musicPlaying", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "<set-?>", "Landroidx/lifecycle/LiveData;", "musicPlaying", "getMusicPlaying", "()Landroidx/lifecycle/LiveData;", "getMusicFromServer", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MusicPlayingViewModel.kt */
public final class MusicPlayingViewModel extends BaseViewModel {
    private MutableLiveData<Boolean> _fetchMusicPlaying = new MutableLiveData<>();
    private final MutableLiveData<Resource<MusicResponse>> _musicPlaying = new MutableLiveData<>();
    private LiveData<Resource<MusicResponse>> musicPlaying;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicPlayingViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        LiveData<Resource<MusicResponse>> switchMap = Transformations.switchMap(this._fetchMusicPlaying, new MusicPlayingViewModel$musicPlaying$1(this));
        Intrinsics.checkNotNullExpressionValue(switchMap, "Transformations.switchMa…g\n            }\n        }");
        this.musicPlaying = switchMap;
    }

    public final LiveData<Resource<MusicResponse>> getMusicPlaying() {
        return this.musicPlaying;
    }

    /* renamed from: getMusicPlaying  reason: collision with other method in class */
    public final void m1getMusicPlaying() {
        this._fetchMusicPlaying.setValue(true);
    }

    /* access modifiers changed from: private */
    public final LiveData<Resource<MusicResponse>> getMusicFromServer() {
        return new MusicPlayingViewModel$getMusicFromServer$1(this, getAppExecutors()).asLiveData();
    }
}
