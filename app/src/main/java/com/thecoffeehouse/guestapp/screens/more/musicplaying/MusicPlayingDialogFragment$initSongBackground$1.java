package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"com/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingDialogFragment$initSongBackground$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MusicPlayingDialogFragment.kt */
public final class MusicPlayingDialogFragment$initSongBackground$1 implements RequestListener<Drawable> {
    final /* synthetic */ MusicPlayingDialogFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MusicPlayingDialogFragment$initSongBackground$1(MusicPlayingDialogFragment musicPlayingDialogFragment) {
        this.this$0 = musicPlayingDialogFragment;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
        ((TLImageView) this.this$0._$_findCachedViewById(R.id.img_song_background)).setImageResource(R.drawable.img_background_detail_subscription);
        return false;
    }

    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
        View _$_findCachedViewById = this.this$0._$_findCachedViewById(R.id.view_shadow_song_background);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_shadow_song_background");
        _$_findCachedViewById.setVisibility(0);
        return false;
    }
}
