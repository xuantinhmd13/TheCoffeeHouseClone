package com.thecoffeehouse.guestapp.screens.home;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: ItemRowMediaBox.kt */
public final class ItemRowMediaBox$onResolve$1 implements Runnable {
    final /* synthetic */ ItemRowMediaBox this$0;

    ItemRowMediaBox$onResolve$1(ItemRowMediaBox itemRowMediaBox) {
        this.this$0 = itemRowMediaBox;
    }

    public final void run() {
        ViewExtsKt.marginEnd(this.this$0.getImgMediaBox(), 0);
        try {
            Intrinsics.checkNotNullExpressionValue(Glide.with(this.this$0.getImgMediaBox().getContext()).load(this.this$0.mediaBox.getIcon()).transition(DrawableTransitionOptions.withCrossFade()).into(this.this$0.getImgMediaBox()), "Glide.with(imgMediaBox.c…       .into(imgMediaBox)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
