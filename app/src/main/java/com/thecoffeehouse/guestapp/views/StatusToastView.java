package com.thecoffeehouse.guestapp.views;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/StatusToastView;", "", "()V", "Companion", "StatusToast", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StatusToastView.kt */
public final class StatusToastView {
    private static final float ALPHA_LAYOUT_TOAST = 0.6f;
    private static final long ANIM_DURATION = 300;
    public static final Companion Companion = new Companion(null);
    private static boolean mShowingToast;
    private static ArrayList<StatusToast> mToastQueue = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/StatusToastView$StatusToast;", "", "viewGroup", "Landroid/view/ViewGroup;", "layoutToast", "Landroid/view/View;", "duration", "", "marginTop", "", "(Landroid/view/ViewGroup;Landroid/view/View;JI)V", "getDuration", "()J", "getLayoutToast", "()Landroid/view/View;", "getMarginTop", "()I", "getViewGroup", "()Landroid/view/ViewGroup;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: StatusToastView.kt */
    public static final class StatusToast {
        private final long duration;
        private final View layoutToast;
        private final int marginTop;
        private final ViewGroup viewGroup;

        public static /* synthetic */ StatusToast copy$default(StatusToast statusToast, ViewGroup viewGroup2, View view, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                viewGroup2 = statusToast.viewGroup;
            }
            if ((i2 & 2) != 0) {
                view = statusToast.layoutToast;
            }
            if ((i2 & 4) != 0) {
                j = statusToast.duration;
            }
            if ((i2 & 8) != 0) {
                i = statusToast.marginTop;
            }
            return statusToast.copy(viewGroup2, view, j, i);
        }

        public final ViewGroup component1() {
            return this.viewGroup;
        }

        public final View component2() {
            return this.layoutToast;
        }

        public final long component3() {
            return this.duration;
        }

        public final int component4() {
            return this.marginTop;
        }

        public final StatusToast copy(ViewGroup viewGroup2, View view, long j, int i) {
            Intrinsics.checkNotNullParameter(viewGroup2, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "layoutToast");
            return new StatusToast(viewGroup2, view, j, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusToast)) {
                return false;
            }
            StatusToast statusToast = (StatusToast) obj;
            return Intrinsics.areEqual(this.viewGroup, statusToast.viewGroup) && Intrinsics.areEqual(this.layoutToast, statusToast.layoutToast) && this.duration == statusToast.duration && this.marginTop == statusToast.marginTop;
        }

        public int hashCode() {
            ViewGroup viewGroup2 = this.viewGroup;
            int i = 0;
            int hashCode = (viewGroup2 != null ? viewGroup2.hashCode() : 0) * 31;
            View view = this.layoutToast;
            if (view != null) {
                i = view.hashCode();
            }
            return ((((hashCode + i) * 31) + Long.hashCode(this.duration)) * 31) + Integer.hashCode(this.marginTop);
        }

        public String toString() {
            return "StatusToast(viewGroup=" + this.viewGroup + ", layoutToast=" + this.layoutToast + ", duration=" + this.duration + ", marginTop=" + this.marginTop + ")";
        }

        public StatusToast(ViewGroup viewGroup2, View view, long j, int i) {
            Intrinsics.checkNotNullParameter(viewGroup2, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "layoutToast");
            this.viewGroup = viewGroup2;
            this.layoutToast = view;
            this.duration = j;
            this.marginTop = i;
        }

        public final ViewGroup getViewGroup() {
            return this.viewGroup;
        }

        public final View getLayoutToast() {
            return this.layoutToast;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final int getMarginTop() {
            return this.marginTop;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002J*\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/StatusToastView$Companion;", "", "()V", "ALPHA_LAYOUT_TOAST", "", "ANIM_DURATION", "", "mShowingToast", "", "mToastQueue", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/views/StatusToastView$StatusToast;", "Lkotlin/collections/ArrayList;", "buildToast", "viewGroup", "Landroid/view/ViewGroup;", "layoutToast", "Landroid/view/View;", "duration", "marginTop", "", "makeToast", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: StatusToastView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        static /* synthetic */ StatusToast buildToast$default(Companion companion, ViewGroup viewGroup, View view, long j, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                j = 2000;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return companion.buildToast(viewGroup, view, j, i);
        }

        private final StatusToast buildToast(ViewGroup viewGroup, View view, long j, int i) {
            return new StatusToast(viewGroup, view, j, i);
        }

        public static /* synthetic */ void makeToast$default(Companion companion, ViewGroup viewGroup, View view, long j, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                j = 2000;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            companion.makeToast(viewGroup, view, j, i);
        }

        public final void makeToast(ViewGroup viewGroup, View view, long j, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "layoutToast");
            GeneralKt.log("mShowingToast: " + StatusToastView.mShowingToast);
            if (StatusToastView.mShowingToast) {
                StatusToastView.mToastQueue.add(buildToast(viewGroup, view, j, i));
                return;
            }
            GeneralKt.log("Toast queue size: " + StatusToastView.mToastQueue.size());
            if (StatusToastView.mToastQueue.isEmpty()) {
                StatusToast buildToast = buildToast(viewGroup, view, j, i);
                View layoutToast = buildToast.getLayoutToast();
                layoutToast.setAlpha(0.0f);
                buildToast.getViewGroup().addView(layoutToast);
                ViewExtsKt.marginTop(layoutToast, i);
                layoutToast.animate().alpha(StatusToastView.ALPHA_LAYOUT_TOAST).setDuration(StatusToastView.ANIM_DURATION).start();
                StatusToastView.mShowingToast = true;
                layoutToast.bringToFront();
                new Handler().postDelayed(new StatusToastView$Companion$makeToast$1(layoutToast, buildToast), buildToast.getDuration());
                return;
            }
            View layoutToast2 = ((StatusToast) StatusToastView.mToastQueue.get(0)).getLayoutToast();
            layoutToast2.setAlpha(0.0f);
            ((StatusToast) StatusToastView.mToastQueue.get(0)).getViewGroup().addView(layoutToast2);
            ViewExtsKt.marginTop(layoutToast2, i);
            layoutToast2.animate().alpha(StatusToastView.ALPHA_LAYOUT_TOAST).setDuration(StatusToastView.ANIM_DURATION).start();
            StatusToastView.mShowingToast = true;
            layoutToast2.bringToFront();
            new Handler().postDelayed(new StatusToastView$Companion$makeToast$2(layoutToast2), j);
        }
    }
}
