package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.cart.CartItemRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingItemRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u001d\u001a\u00020\u00152\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u0011J \u0010\u001f\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u0011H\u0002J \u0010\"\u001a\u00020 2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u0011H\u0002J \u0010#\u001a\u00020$2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020%0\u0010j\b\u0012\u0004\u0012\u00020%`\u0011H\u0002J\u001e\u0010&\u001a\u00020\u00152\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020%0\u0010j\b\u0012\u0004\u0012\u00020%`\u0011J\u001c\u0010'\u001a\u00020\r2\u0012\u0010(\u001a\u000e\u0012\u0002\b\u00030\u0010j\u0006\u0012\u0002\b\u0003`\u0011H\u0002J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\rJ\u0010\u0010,\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\u0010\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u000101R\u000e\u0010\u000b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0002\b\u00030\u0010j\u0006\u0012\u0002\b\u0003`\u0011X.¢\u0006\u0002\n\u0000R,\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u00062"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/OrderLineItemListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MAX_COLLAPSE_ITEM_COUNT", "isEditableNote", "", "isExpanding", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onClickOrderLineDelete", "Lkotlin/Function2;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "", "getOnClickOrderLineDelete", "()Lkotlin/jvm/functions/Function2;", "setOnClickOrderLineDelete", "(Lkotlin/jvm/functions/Function2;)V", "onClickOrderLineEdit", "getOnClickOrderLineEdit", "setOnClickOrderLineEdit", "initCartOrderLines", "orderLines", "initCollapseCartOrderLineAdapter", "Lcom/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter;", "orderLineExpandCollapse", "initExpandCartOrderLineAdapter", "initTrackingOrderLineAdapter", "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingItemRecyclerViewAdapter;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "initTrackingOrderLines", "isOrderLineLong", "it", "setCollapseExpandFooter", "setEditableNote", "isEditable", "setListCollapseExpand", "updateListIsCollapsing", "updateListIsExpanding", "updateNote", "note", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderLineItemListView.kt */
public final class OrderLineItemListView extends LinearLayout {
    private final int MAX_COLLAPSE_ITEM_COUNT = 3;
    private HashMap _$_findViewCache;
    private boolean isEditableNote;
    private boolean isExpanding;
    private ArrayList<?> items;
    private Function2<? super OrderLine, ? super Integer, Unit> onClickOrderLineDelete = OrderLineItemListView$onClickOrderLineDelete$1.INSTANCE;
    private Function2<? super OrderLine, ? super Integer, Unit> onClickOrderLineEdit = OrderLineItemListView$onClickOrderLineEdit$1.INSTANCE;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function2<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine, java.lang.Integer, kotlin.Unit> */
    public final Function2<OrderLine, Integer, Unit> getOnClickOrderLineEdit() {
        return this.onClickOrderLineEdit;
    }

    public final void setOnClickOrderLineEdit(Function2<? super OrderLine, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onClickOrderLineEdit = function2;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function2<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine, java.lang.Integer, kotlin.Unit> */
    public final Function2<OrderLine, Integer, Unit> getOnClickOrderLineDelete() {
        return this.onClickOrderLineDelete;
    }

    public final void setOnClickOrderLineDelete(Function2<? super OrderLine, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onClickOrderLineDelete = function2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderLineItemListView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_checkout_item_list_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderLineItemListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_checkout_item_list_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderLineItemListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_checkout_item_list_view, (ViewGroup) this, true);
    }

    public final void setEditableNote(boolean z) {
        this.isEditableNote = z;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_header_cart_note);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_header_cart_note");
        EditText editText = (EditText) _$_findCachedViewById.findViewById(R.id.edt_bill_note);
        Intrinsics.checkNotNullExpressionValue(editText, "layout_header_cart_note.edt_bill_note");
        editText.setEnabled(this.isEditableNote);
    }

    public final void updateNote(String str) {
        if (this.isEditableNote) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_header_cart_note);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_header_cart_note");
            _$_findCachedViewById.setVisibility(0);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_header_cart_note);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_header_cart_note");
            ((EditText) _$_findCachedViewById2.findViewById(R.id.edt_bill_note)).setText(str);
            return;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_header_cart_note);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_header_cart_note");
            _$_findCachedViewById3.setVisibility(8);
            return;
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_header_cart_note);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_header_cart_note");
        _$_findCachedViewById4.setVisibility(0);
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.layout_header_cart_note);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "layout_header_cart_note");
        ((EditText) _$_findCachedViewById5.findViewById(R.id.edt_bill_note)).setText(str2);
    }

    public final void initCartOrderLines(ArrayList<OrderLine> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "orderLines");
        this.items = arrayList;
        if (isOrderLineLong(arrayList)) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            if (!this.isExpanding) {
                arrayList = new ArrayList<>(arrayList.subList(0, this.MAX_COLLAPSE_ITEM_COUNT));
            }
            CartItemRecyclerViewAdapter initCollapseCartOrderLineAdapter = initCollapseCartOrderLineAdapter(arrayList);
            setCollapseExpandFooter(this.isExpanding);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setOnClickListener(new OrderLineItemListView$initCartOrderLines$1(this));
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
            if (recyclerView != null) {
                recyclerView.setAdapter(initCollapseCartOrderLineAdapter);
            }
            setListCollapseExpand(this.isExpanding);
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setVisibility(8);
        }
        CartItemRecyclerViewAdapter initExpandCartOrderLineAdapter = initExpandCartOrderLineAdapter(arrayList);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(initExpandCartOrderLineAdapter);
        }
    }

    public final void initTrackingOrderLines(ArrayList<OrderLineCreateOrder> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "orderLines");
        this.items = arrayList;
        if (isOrderLineLong(arrayList)) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            if (!this.isExpanding) {
                arrayList = new ArrayList<>(arrayList.subList(0, this.MAX_COLLAPSE_ITEM_COUNT));
            }
            TrackingItemRecyclerViewAdapter initTrackingOrderLineAdapter = initTrackingOrderLineAdapter(arrayList);
            setCollapseExpandFooter(this.isExpanding);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setOnClickListener(new OrderLineItemListView$initTrackingOrderLines$1(this));
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
            if (recyclerView != null) {
                recyclerView.setAdapter(initTrackingOrderLineAdapter);
            }
            setListCollapseExpand(this.isExpanding);
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setVisibility(8);
        }
        TrackingItemRecyclerViewAdapter initTrackingOrderLineAdapter2 = initTrackingOrderLineAdapter(arrayList);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(initTrackingOrderLineAdapter2);
        }
    }

    private final CartItemRecyclerViewAdapter initCollapseCartOrderLineAdapter(ArrayList<OrderLine> arrayList) {
        return new CartItemRecyclerViewAdapter(arrayList, new OrderLineItemListView$initCollapseCartOrderLineAdapter$1(this), new OrderLineItemListView$initCollapseCartOrderLineAdapter$2(this));
    }

    private final TrackingItemRecyclerViewAdapter initTrackingOrderLineAdapter(ArrayList<OrderLineCreateOrder> arrayList) {
        return new TrackingItemRecyclerViewAdapter(arrayList);
    }

    private final CartItemRecyclerViewAdapter initExpandCartOrderLineAdapter(ArrayList<OrderLine> arrayList) {
        return new CartItemRecyclerViewAdapter(arrayList, new OrderLineItemListView$initExpandCartOrderLineAdapter$1(this), new OrderLineItemListView$initExpandCartOrderLineAdapter$2(this));
    }

    private final boolean isOrderLineLong(ArrayList<?> arrayList) {
        return arrayList.size() > this.MAX_COLLAPSE_ITEM_COUNT;
    }

    /* access modifiers changed from: private */
    public final void setListCollapseExpand(boolean z) {
        if (z) {
            updateListIsExpanding();
        } else {
            updateListIsCollapsing();
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rcv_orderlines");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingItemRecyclerViewAdapter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.thecoffeehouse.guestapp.screens.order.cart.CartItemRecyclerViewAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void updateListIsExpanding() {
        ArrayList<?> arrayList = this.items;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
        }
        RecyclerView.Adapter adapter = null;
        if (CollectionsKt.firstOrNull((List) arrayList) instanceof OrderLine) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rcv_orderlines");
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 instanceof CartItemRecyclerViewAdapter) {
                adapter = adapter2;
            }
            CartItemRecyclerViewAdapter cartItemRecyclerViewAdapter = (CartItemRecyclerViewAdapter) adapter;
            if (cartItemRecyclerViewAdapter != 0) {
                ArrayList<?> arrayList2 = this.items;
                if (arrayList2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
                }
                Objects.requireNonNull(arrayList2, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> */");
                cartItemRecyclerViewAdapter.updateList(arrayList2);
                return;
            }
            return;
        }
        ArrayList<?> arrayList3 = this.items;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
        }
        if (CollectionsKt.firstOrNull((List) arrayList3) instanceof OrderLineCreateOrder) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rcv_orderlines");
            RecyclerView.Adapter adapter3 = recyclerView2.getAdapter();
            if (adapter3 instanceof TrackingItemRecyclerViewAdapter) {
                adapter = adapter3;
            }
            TrackingItemRecyclerViewAdapter trackingItemRecyclerViewAdapter = (TrackingItemRecyclerViewAdapter) adapter;
            if (trackingItemRecyclerViewAdapter != 0) {
                ArrayList<?> arrayList4 = this.items;
                if (arrayList4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
                }
                Objects.requireNonNull(arrayList4, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder> */");
                trackingItemRecyclerViewAdapter.updateList(arrayList4);
            }
        }
    }

    private final void updateListIsCollapsing() {
        ArrayList<?> arrayList = this.items;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
        }
        ArrayList<OrderLine> arrayList2 = new ArrayList<>(arrayList.subList(0, this.MAX_COLLAPSE_ITEM_COUNT));
        ArrayList<?> arrayList3 = this.items;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
        }
        CartItemRecyclerViewAdapter cartItemRecyclerViewAdapter = null;
        if (CollectionsKt.firstOrNull((List) arrayList3) instanceof OrderLine) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rcv_orderlines");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof CartItemRecyclerViewAdapter) {
                cartItemRecyclerViewAdapter = adapter;
            }
            CartItemRecyclerViewAdapter cartItemRecyclerViewAdapter2 = cartItemRecyclerViewAdapter;
            if (cartItemRecyclerViewAdapter2 != null) {
                cartItemRecyclerViewAdapter2.updateList(arrayList2);
                return;
            }
            return;
        }
        ArrayList<?> arrayList4 = this.items;
        if (arrayList4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
        }
        if (CollectionsKt.firstOrNull((List) arrayList4) instanceof OrderLineCreateOrder) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rcv_orderlines);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rcv_orderlines");
            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
            if (adapter2 instanceof TrackingItemRecyclerViewAdapter) {
                cartItemRecyclerViewAdapter = adapter2;
            }
            TrackingItemRecyclerViewAdapter trackingItemRecyclerViewAdapter = cartItemRecyclerViewAdapter;
            if (trackingItemRecyclerViewAdapter != null) {
                trackingItemRecyclerViewAdapter.updateList(arrayList2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setCollapseExpandFooter(boolean z) {
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        TextView textView2;
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
            if (!(_$_findCachedViewById == null || (textView2 = (TextView) _$_findCachedViewById.findViewById(R.id.txt_footer_cart)) == null)) {
                textView2.setText(getContext().getString(R.string.str_collapse));
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
            if (_$_findCachedViewById2 != null && (imageView2 = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_expand_collapse)) != null) {
                imageView2.setRotation(180.0f);
                return;
            }
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
        if (!(_$_findCachedViewById3 == null || (textView = (TextView) _$_findCachedViewById3.findViewById(R.id.txt_footer_cart)) == null)) {
            textView.setText(getContext().getString(R.string.str_see_all_products));
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_footer_expand_collapse);
        if (_$_findCachedViewById4 != null && (imageView = (ImageView) _$_findCachedViewById4.findViewById(R.id.img_expand_collapse)) != null) {
            imageView.setRotation(0.0f);
        }
    }
}
