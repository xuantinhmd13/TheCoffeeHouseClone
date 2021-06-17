package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\nJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001a\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001dH\u0002J(\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J \u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(R:\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/HeaderItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "shouldFadeOutHeader", "", "isHeader", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "itemPosition", "(ZLkotlin/jvm/functions/Function1;)V", "<set-?>", "Lkotlin/Pair;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "currentHeader", "getCurrentHeader", "()Lkotlin/Pair;", "drawHeader", "", "c", "Landroid/graphics/Canvas;", "header", "Landroid/view/View;", "paddingTop", "fixLayoutSize", "parent", "Landroid/view/ViewGroup;", ViewHierarchyConstants.VIEW_KEY, "getChildInContact", "Landroidx/recyclerview/widget/RecyclerView;", "contactPoint", "getHeaderPositionForItem", "getHeaderViewForItem", "moveHeader", "nextHeader", "onDrawOver", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "setCurrentCategory", MonitorLogServerProtocol.PARAM_CATEGORY, "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HeaderItemDecoration.kt */
public final class HeaderItemDecoration extends RecyclerView.ItemDecoration {
    private Pair<Integer, ? extends RecyclerView.ViewHolder> currentHeader;
    private final Function1<Integer, Boolean> isHeader;
    private final boolean shouldFadeOutHeader;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeaderItemDecoration(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderItemDecoration(boolean z, Function1<? super Integer, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "isHeader");
        this.shouldFadeOutHeader = z;
        this.isHeader = function1;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.Integer, ? extends androidx.recyclerview.widget.RecyclerView$ViewHolder>, kotlin.Pair<java.lang.Integer, androidx.recyclerview.widget.RecyclerView$ViewHolder> */
    public final Pair<Integer, RecyclerView.ViewHolder> getCurrentHeader() {
        return this.currentHeader;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        View headerViewForItem;
        View childInContact;
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, recyclerView, state);
        View findChildViewUnder = recyclerView.findChildViewUnder((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop());
        if (findChildViewUnder != null) {
            Intrinsics.checkNotNullExpressionValue(findChildViewUnder, "parent.findChildViewUnde…0 )*/\n        ) ?: return");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(findChildViewUnder);
            if (childAdapterPosition != -1 && (headerViewForItem = getHeaderViewForItem(childAdapterPosition, recyclerView)) != null && (childInContact = getChildInContact(recyclerView, headerViewForItem.getBottom() + recyclerView.getPaddingTop())) != null) {
                if (this.isHeader.invoke(Integer.valueOf(recyclerView.getChildAdapterPosition(childInContact))).booleanValue()) {
                    moveHeader(canvas, headerViewForItem, childInContact, recyclerView.getPaddingTop());
                } else {
                    drawHeader(canvas, headerViewForItem, recyclerView.getPaddingTop());
                }
            }
        }
    }

    private final View getHeaderViewForItem(int i, RecyclerView recyclerView) {
        int headerPositionForItem;
        RecyclerView.Adapter adapter;
        Pair<Integer, ? extends RecyclerView.ViewHolder> pair;
        RecyclerView.ViewHolder viewHolder;
        RecyclerView.ViewHolder viewHolder2;
        if (recyclerView.getAdapter() == null || (headerPositionForItem = getHeaderPositionForItem(i)) == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return null;
        }
        int itemViewType = adapter.getItemViewType(headerPositionForItem);
        Pair<Integer, ? extends RecyclerView.ViewHolder> pair2 = this.currentHeader;
        if (pair2 == null || pair2.getFirst().intValue() != headerPositionForItem || (pair = this.currentHeader) == null || (viewHolder = (RecyclerView.ViewHolder) pair.getSecond()) == null || viewHolder.getItemViewType() != itemViewType) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            RecyclerView.ViewHolder createViewHolder = adapter2 != null ? adapter2.createViewHolder(recyclerView, itemViewType) : null;
            if (createViewHolder != null) {
                RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
                if (adapter3 != null) {
                    adapter3.onBindViewHolder(createViewHolder, headerPositionForItem);
                }
                View view = createViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "headerHolder.itemView");
                fixLayoutSize(recyclerView, view);
                this.currentHeader = TuplesKt.to(Integer.valueOf(headerPositionForItem), createViewHolder);
                View findViewById = createViewHolder.itemView.findViewById(R.id.view_line_bottom);
                Intrinsics.checkNotNullExpressionValue(findViewById, "headerHolder.itemView.fi…w>(R.id.view_line_bottom)");
                findViewById.setVisibility(0);
            }
            if (createViewHolder != null) {
                return createViewHolder.itemView;
            }
            return null;
        }
        Pair<Integer, ? extends RecyclerView.ViewHolder> pair3 = this.currentHeader;
        if (pair3 == null || (viewHolder2 = (RecyclerView.ViewHolder) pair3.getSecond()) == null) {
            return null;
        }
        return viewHolder2.itemView;
    }

    private final void drawHeader(Canvas canvas, View view, int i) {
        canvas.save();
        canvas.translate(0.0f, (float) i);
        view.draw(canvas);
        canvas.restore();
    }

    private final void moveHeader(Canvas canvas, View view, View view2, int i) {
        canvas.save();
        if (!this.shouldFadeOutHeader) {
            canvas.clipRect(0, i, canvas.getWidth(), view.getHeight() + i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            canvas.saveLayerAlpha(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), (int) ((((float) (view2.getTop() - i)) / ((float) view2.getHeight())) * ((float) 255)));
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (int) ((((float) (view2.getTop() - i)) / ((float) view2.getHeight())) * ((float) 255)), 31);
        }
        canvas.translate(0.0f, (float) (view2.getTop() - view.getHeight()));
        view.draw(canvas);
        if (this.shouldFadeOutHeader) {
            canvas.restore();
        }
        canvas.restore();
    }

    private final View getChildInContact(RecyclerView recyclerView, int i) {
        View view = null;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            Rect rect = new Rect();
            recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
            if (rect.bottom > i && rect.top <= i) {
                return childAt;
            }
        }
        return view;
    }

    private final void fixLayoutSize(ViewGroup viewGroup, View view) {
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), BasicMeasure.EXACTLY), viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0), viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final int getHeaderPositionForItem(int i) {
        while (!this.isHeader.invoke(Integer.valueOf(i)).booleanValue()) {
            i--;
            if (i < 0) {
                return -1;
            }
        }
        return i;
    }

    public final void setCurrentCategory(String str) {
        TextView txtCategory;
        Pair<Integer, ? extends RecyclerView.ViewHolder> pair = this.currentHeader;
        Object obj = null;
        Object obj2 = pair != null ? (RecyclerView.ViewHolder) pair.getSecond() : null;
        if (obj2 instanceof ProductRecyclerViewAdapter.SearchViewHolder) {
            obj = obj2;
        }
        ProductRecyclerViewAdapter.SearchViewHolder searchViewHolder = (ProductRecyclerViewAdapter.SearchViewHolder) obj;
        if (searchViewHolder != null && (txtCategory = searchViewHolder.getTxtCategory()) != null) {
            txtCategory.setText(str);
        }
    }
}
