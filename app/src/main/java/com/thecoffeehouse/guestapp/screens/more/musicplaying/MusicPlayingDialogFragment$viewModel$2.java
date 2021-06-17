package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MusicPlayingDialogFragment.kt */
public final class MusicPlayingDialogFragment$viewModel$2 extends Lambda implements Function0<MusicPlayingViewModel> {
    final /* synthetic */ MusicPlayingDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MusicPlayingDialogFragment$viewModel$2(MusicPlayingDialogFragment musicPlayingDialogFragment) {
        super(0);
        this.this$0 = musicPlayingDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MusicPlayingViewModel invoke() {
        return (MusicPlayingViewModel) new ViewModelProvider(this.this$0, new MusicPlayingViewModelFactory(this.this$0, null)).get(MusicPlayingViewModel.class);
    }
}
