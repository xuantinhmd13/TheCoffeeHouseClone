package com.thecoffeehouse.guestapp.views;

import android.animation.Animator;
import android.view.View;
import com.thecoffeehouse.guestapp.views.StatusToastView;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: StatusToastView.kt */
public final class StatusToastView$Companion$makeToast$2 implements Runnable {
    final /* synthetic */ View $layout;

    StatusToastView$Companion$makeToast$2(View view) {
        this.$layout = view;
    }

    public final void run() {
        this.$layout.animate().alpha(StatusToastView.ALPHA_LAYOUT_TOAST).setDuration(StatusToastView.ANIM_DURATION).setListener(new Animator.AnimatorListener() {
            /* class com.thecoffeehouse.guestapp.views.StatusToastView$Companion$makeToast$2.AnonymousClass1 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                StatusToastView.mShowingToast = false;
                ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getViewGroup().removeView(((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getLayoutToast());
                StatusToastView.mToastQueue.remove(0);
                if (!StatusToastView.mToastQueue.isEmpty()) {
                    StatusToastView.Companion.makeToast(((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getViewGroup(), ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getLayoutToast(), ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getDuration(), ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getMarginTop());
                }
            }
        }).start();
    }
}
