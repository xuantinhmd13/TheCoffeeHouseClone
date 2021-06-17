package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter$itemTouchListener$1", "Landroidx/recyclerview/widget/RecyclerView$SimpleOnItemTouchListener;", "onInterceptTouchEvent", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "motionEvent", "Landroid/view/MotionEvent;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductRecyclerViewAdapter.kt */
public final class ProductRecyclerViewAdapter$itemTouchListener$1 extends RecyclerView.SimpleOnItemTouchListener {
    final /* synthetic */ ProductRecyclerViewAdapter this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ProductRecyclerViewAdapter$itemTouchListener$1(ProductRecyclerViewAdapter productRecyclerViewAdapter) {
        this.this$0 = productRecyclerViewAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener, androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.ViewHolder second;
        View view;
        RecyclerView.ViewHolder second2;
        View view2;
        RecyclerView.ViewHolder second3;
        View view3;
        RecyclerView.ViewHolder second4;
        View view4;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            Pair<Integer, RecyclerView.ViewHolder> currentHeader = ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0).getCurrentHeader();
            if (y <= ((float) ((currentHeader == null || (second4 = currentHeader.getSecond()) == null || (view4 = second4.itemView) == null) ? 0 : view4.getBottom()))) {
                Pair<Integer, RecyclerView.ViewHolder> currentHeader2 = ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0).getCurrentHeader();
                ConstraintLayout constraintLayout = null;
                ImageView imageView = (currentHeader2 == null || (second3 = currentHeader2.getSecond()) == null || (view3 = second3.itemView) == null) ? null : (ImageView) view3.findViewById(R.id.img_search_product);
                Pair<Integer, RecyclerView.ViewHolder> currentHeader3 = ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0).getCurrentHeader();
                ImageView imageView2 = (currentHeader3 == null || (second2 = currentHeader3.getSecond()) == null || (view2 = second2.itemView) == null) ? null : (ImageView) view2.findViewById(R.id.img_favourite_product);
                Pair<Integer, RecyclerView.ViewHolder> currentHeader4 = ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0).getCurrentHeader();
                if (!(currentHeader4 == null || (second = currentHeader4.getSecond()) == null || (view = second.itemView) == null)) {
                    constraintLayout = (ConstraintLayout) view.findViewById(R.id.layout_filter_category);
                }
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                Rect rect3 = new Rect();
                if (imageView != null) {
                    imageView.getHitRect(rect);
                }
                if (imageView2 != null) {
                    imageView2.getHitRect(rect2);
                }
                if (constraintLayout != null) {
                    constraintLayout.getHitRect(rect3);
                }
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.this$0.onClickSearchListener.invoke();
                }
                if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.this$0.onClickFavouriteProductsListener.invoke();
                }
                if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return true;
                }
                this.this$0.onClickFilterListener.invoke();
                return true;
            }
        }
        return false;
    }
}
