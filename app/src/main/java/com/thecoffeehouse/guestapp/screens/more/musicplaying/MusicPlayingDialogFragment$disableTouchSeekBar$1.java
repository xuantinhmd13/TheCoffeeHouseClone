package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "e", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 4, 0})
/* compiled from: MusicPlayingDialogFragment.kt */
public final class MusicPlayingDialogFragment$disableTouchSeekBar$1 implements View.OnTouchListener {
    public static final MusicPlayingDialogFragment$disableTouchSeekBar$1 INSTANCE = new MusicPlayingDialogFragment$disableTouchSeekBar$1();

    MusicPlayingDialogFragment$disableTouchSeekBar$1() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
