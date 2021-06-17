package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import com.thecoffeehouse.guestapp.services.api.model.common.music.Current;
import com.thecoffeehouse.guestapp.services.api.model.common.music.MusicResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MusicPlayingDialogFragment.kt */
final class MusicPlayingDialogFragment$initViews$1 extends Lambda implements Function1<MusicResponse, Unit> {
    final /* synthetic */ MusicPlayingDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MusicPlayingDialogFragment$initViews$1(MusicPlayingDialogFragment musicPlayingDialogFragment) {
        super(1);
        this.this$0 = musicPlayingDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MusicResponse musicResponse) {
        invoke(musicResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(MusicResponse musicResponse) {
        Intrinsics.checkNotNullParameter(musicResponse, "it");
        MusicPlayingDialogFragment musicPlayingDialogFragment = this.this$0;
        Current current = musicResponse.getCurrent();
        Long l = null;
        musicPlayingDialogFragment.initSongBackground(current != null ? current.getThumbnail() : null);
        MusicPlayingDialogFragment musicPlayingDialogFragment2 = this.this$0;
        Current current2 = musicResponse.getCurrent();
        musicPlayingDialogFragment2.initTitleSong(current2 != null ? current2.getName() : null);
        MusicPlayingDialogFragment musicPlayingDialogFragment3 = this.this$0;
        Current current3 = musicResponse.getCurrent();
        musicPlayingDialogFragment3.initArtist(current3 != null ? current3.getArtist() : null);
        MusicPlayingDialogFragment musicPlayingDialogFragment4 = this.this$0;
        Current current4 = musicResponse.getCurrent();
        Long start = current4 != null ? current4.getStart() : null;
        Current current5 = musicResponse.getCurrent();
        if (current5 != null) {
            l = current5.getEnd();
        }
        musicPlayingDialogFragment4.initStartEndMusicPlaying(start, l);
        this.this$0.initNextSong(musicResponse.getNext());
    }
}
