package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "result", "Lcom/google/android/play/core/tasks/Task;", "Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderDialogFragment.kt */
final class TrackingOrderDialogFragment$runInAppRatingFlow$1<ResultT> implements OnCompleteListener<ReviewInfo> {
    final /* synthetic */ ReviewManager $manager;
    final /* synthetic */ TrackingOrderDialogFragment this$0;

    TrackingOrderDialogFragment$runInAppRatingFlow$1(TrackingOrderDialogFragment trackingOrderDialogFragment, ReviewManager reviewManager) {
        this.this$0 = trackingOrderDialogFragment;
        this.$manager = reviewManager;
    }

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public final void onComplete(Task<ReviewInfo> task) {
        if (this.this$0.getActivity() != null) {
            Intrinsics.checkNotNullExpressionValue(task, "result");
            if (task.isSuccessful()) {
                this.$manager.launchReviewFlow(this.this$0.getActivity(), task.getResult()).addOnCompleteListener(new OnCompleteListener<Void>(this) {
                    /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderDialogFragment$runInAppRatingFlow$1.AnonymousClass1 */
                    final /* synthetic */ TrackingOrderDialogFragment$runInAppRatingFlow$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // com.google.android.play.core.tasks.OnCompleteListener
                    public final void onComplete(Task<Void> task) {
                        this.this$0.this$0.getMOrderViewModel().saveRatedApp();
                    }
                });
                return;
            }
            GeneralKt.log(task.getException());
        }
    }
}
