package com.thecoffeehouse.guestapp.views;

import android.animation.Animator;
import android.view.View;
import com.thecoffeehouse.guestapp.views.StatusToastView;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: StatusToastView.kt */
public final class StatusToastView$Companion$makeToast$1 implements Runnable {
    final /* synthetic */ View $layout;
    final /* synthetic */ StatusToastView.StatusToast $statusToast;

    StatusToastView$Companion$makeToast$1(View view, StatusToastView.StatusToast statusToast) {
        this.$layout = view;
        this.$statusToast = statusToast;
    }

    public final void run() {
        this.$layout.animate().alpha(StatusToastView.ALPHA_LAYOUT_TOAST).setDuration(StatusToastView.ANIM_DURATION).setListener(new Animator.AnimatorListener(this) {
            /* class com.thecoffeehouse.guestapp.views.StatusToastView$Companion$makeToast$1.AnonymousClass1 */
            final /* synthetic */ StatusToastView$Companion$makeToast$1 this$0;

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.this$0 = r1;
            }

            public void onAnimationEnd(Animator animator) {
                StatusToastView.mShowingToast = false;
                this.this$0.$statusToast.getViewGroup().removeView(this.this$0.$statusToast.getLayoutToast());
                if (!StatusToastView.mToastQueue.isEmpty()) {
                    StatusToastView.Companion.makeToast(((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getViewGroup(), ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getLayoutToast(), ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getDuration(), ((StatusToastView.StatusToast) StatusToastView.mToastQueue.get(0)).getMarginTop());
                }
            }
        }).start();
    }
}
