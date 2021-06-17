package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000fJ\u0006\u0010&\u001a\u00020\rJ\u0006\u0010'\u001a\u00020\rJ\u0006\u0010(\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006)"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/ItemRowSearchDeliveryAddress;", "", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "title", "", "fullAddress", "distance", "leftIcon", "", "rightIcon", "onClickSelect", "Lkotlin/Function1;", "", "onClickRightIcon", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "imgAddressType", "Landroid/widget/ImageView;", "getImgAddressType", "()Landroid/widget/ImageView;", "setImgAddressType", "(Landroid/widget/ImageView;)V", "imgRightIcon", "getImgRightIcon", "setImgRightIcon", "Ljava/lang/Integer;", "txtAddressDetail", "Landroid/widget/TextView;", "getTxtAddressDetail", "()Landroid/widget/TextView;", "setTxtAddressDetail", "(Landroid/widget/TextView;)V", "txtAddressDistance", "getTxtAddressDistance", "setTxtAddressDistance", "txtAddressTitle", "getTxtAddressTitle", "setTxtAddressTitle", "onClick", "onClickEdit", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowSearchDeliveryAddress.kt */
public final class ItemRowSearchDeliveryAddress {
    private final AddressSuggestion addressSuggestion;
    private final String distance;
    private final String fullAddress;
    public ImageView imgAddressType;
    public ImageView imgRightIcon;
    private final int leftIcon;
    private final Function1<AddressSuggestion, Unit> onClickRightIcon;
    private final Function1<AddressSuggestion, Unit> onClickSelect;
    private final Integer rightIcon;
    private final String title;
    public TextView txtAddressDetail;
    public TextView txtAddressDistance;
    public TextView txtAddressTitle;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSearchDeliveryAddress> {
        public void bindLoadMore(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        public LoadMoreViewBinder(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            super(itemRowSearchDeliveryAddress);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSearchDeliveryAddress, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, int i) {
        }

        public ViewBinder(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            super(itemRowSearchDeliveryAddress, R.layout.item_row_search_delivery_address, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            itemRowSearchDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchDeliveryAddress != null && isNullable) {
                itemRowSearchDeliveryAddress.txtAddressTitle = null;
                itemRowSearchDeliveryAddress.txtAddressDetail = null;
                itemRowSearchDeliveryAddress.txtAddressDistance = null;
                itemRowSearchDeliveryAddress.imgAddressType = null;
                itemRowSearchDeliveryAddress.imgRightIcon = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
            itemRowSearchDeliveryAddress.txtAddressTitle = (TextView) view.findViewById(R.id.txt_address_title);
            itemRowSearchDeliveryAddress.txtAddressDetail = (TextView) view.findViewById(R.id.txt_address_detail);
            itemRowSearchDeliveryAddress.txtAddressDistance = (TextView) view.findViewById(R.id.txt_address_distance);
            itemRowSearchDeliveryAddress.imgAddressType = (ImageView) view.findViewById(R.id.img_address_type);
            itemRowSearchDeliveryAddress.imgRightIcon = (ImageView) view.findViewById(R.id.img_right_icon);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
            view.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClick();
                }
            });
            view.findViewById(R.id.img_right_icon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.ViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClickEdit();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSearchDeliveryAddress, View> {
        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void bindAnimation(int i, int i2, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindChildPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            super(itemRowSearchDeliveryAddress, R.layout.item_row_search_delivery_address, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            itemRowSearchDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
            itemRowSearchDeliveryAddress.txtAddressTitle = (TextView) view.findViewById(R.id.txt_address_title);
            itemRowSearchDeliveryAddress.txtAddressDetail = (TextView) view.findViewById(R.id.txt_address_detail);
            itemRowSearchDeliveryAddress.txtAddressDistance = (TextView) view.findViewById(R.id.txt_address_distance);
            itemRowSearchDeliveryAddress.imgAddressType = (ImageView) view.findViewById(R.id.img_address_type);
            itemRowSearchDeliveryAddress.imgRightIcon = (ImageView) view.findViewById(R.id.img_right_icon);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
            view.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClick();
                }
            });
            view.findViewById(R.id.img_right_icon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClickEdit();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.ExpandableViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    if (ExpandableViewBinder.this.isExpanded()) {
                        ExpandableViewBinder.this.collapse();
                    } else {
                        ExpandableViewBinder.this.expand();
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowSearchDeliveryAddress(AddressSuggestion addressSuggestion2, String str, String str2, String str3, int i, Integer num, Function1<? super AddressSuggestion, Unit> function1, Function1<? super AddressSuggestion, Unit> function12) {
        Intrinsics.checkNotNullParameter(addressSuggestion2, "addressSuggestion");
        Intrinsics.checkNotNullParameter(function1, "onClickSelect");
        this.addressSuggestion = addressSuggestion2;
        this.title = str;
        this.fullAddress = str2;
        this.distance = str3;
        this.leftIcon = i;
        this.rightIcon = num;
        this.onClickSelect = function1;
        this.onClickRightIcon = function12;
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, int i) {
        }

        public SwipeViewBinder(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            super(itemRowSearchDeliveryAddress, R.layout.item_row_search_delivery_address, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            itemRowSearchDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchDeliveryAddress != null && isNullable) {
                itemRowSearchDeliveryAddress.txtAddressTitle = null;
                itemRowSearchDeliveryAddress.txtAddressDetail = null;
                itemRowSearchDeliveryAddress.txtAddressDistance = null;
                itemRowSearchDeliveryAddress.imgAddressType = null;
                itemRowSearchDeliveryAddress.imgRightIcon = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchDeliveryAddress.txtAddressTitle = (TextView) frameView.findViewById(R.id.txt_address_title);
            itemRowSearchDeliveryAddress.txtAddressDetail = (TextView) frameView.findViewById(R.id.txt_address_detail);
            itemRowSearchDeliveryAddress.txtAddressDistance = (TextView) frameView.findViewById(R.id.txt_address_distance);
            itemRowSearchDeliveryAddress.imgAddressType = (ImageView) frameView.findViewById(R.id.img_address_type);
            itemRowSearchDeliveryAddress.imgRightIcon = (ImageView) frameView.findViewById(R.id.img_right_icon);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClick();
                }
            });
            frameView.findViewById(R.id.img_right_icon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.SwipeViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClickEdit();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeInDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeOutDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeTouch(float f, float f2, float f3, float f4) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipingDirection(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, int i) {
        }

        public DirectionalViewBinder(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            super(itemRowSearchDeliveryAddress, R.layout.item_row_search_delivery_address, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress) {
            itemRowSearchDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = (ItemRowSearchDeliveryAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchDeliveryAddress != null && isNullable) {
                itemRowSearchDeliveryAddress.txtAddressTitle = null;
                itemRowSearchDeliveryAddress.txtAddressDetail = null;
                itemRowSearchDeliveryAddress.txtAddressDistance = null;
                itemRowSearchDeliveryAddress.imgAddressType = null;
                itemRowSearchDeliveryAddress.imgRightIcon = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchDeliveryAddress.txtAddressTitle = (TextView) frameView.findViewById(R.id.txt_address_title);
            itemRowSearchDeliveryAddress.txtAddressDetail = (TextView) frameView.findViewById(R.id.txt_address_detail);
            itemRowSearchDeliveryAddress.txtAddressDistance = (TextView) frameView.findViewById(R.id.txt_address_distance);
            itemRowSearchDeliveryAddress.imgAddressType = (ImageView) frameView.findViewById(R.id.img_address_type);
            itemRowSearchDeliveryAddress.imgRightIcon = (ImageView) frameView.findViewById(R.id.img_right_icon);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClick();
                }
            });
            frameView.findViewById(R.id.img_right_icon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress.DirectionalViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSearchDeliveryAddress.onClickEdit();
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ItemRowSearchDeliveryAddress(AddressSuggestion addressSuggestion2, String str, String str2, String str3, int i, Integer num, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressSuggestion2, str, str2, str3, i, (i2 & 32) != 0 ? null : num, function1, (i2 & 128) != 0 ? null : function12);
    }

    public final TextView getTxtAddressTitle() {
        TextView textView = this.txtAddressTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressTitle");
        }
        return textView;
    }

    public final void setTxtAddressTitle(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtAddressTitle = textView;
    }

    public final TextView getTxtAddressDetail() {
        TextView textView = this.txtAddressDetail;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressDetail");
        }
        return textView;
    }

    public final void setTxtAddressDetail(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtAddressDetail = textView;
    }

    public final TextView getTxtAddressDistance() {
        TextView textView = this.txtAddressDistance;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressDistance");
        }
        return textView;
    }

    public final void setTxtAddressDistance(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtAddressDistance = textView;
    }

    public final ImageView getImgAddressType() {
        ImageView imageView = this.imgAddressType;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgAddressType");
        }
        return imageView;
    }

    public final void setImgAddressType(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgAddressType = imageView;
    }

    public final ImageView getImgRightIcon() {
        ImageView imageView = this.imgRightIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgRightIcon");
        }
        return imageView;
    }

    public final void setImgRightIcon(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgRightIcon = imageView;
    }

    public final void onResolve() {
        TextView textView = this.txtAddressTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressTitle");
        }
        textView.setText(this.title);
        TextView textView2 = this.txtAddressDetail;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressDetail");
        }
        textView2.setText(this.fullAddress);
        String descriptionDeliAddress = OrderExtsKt.getDescriptionDeliAddress(this.addressSuggestion);
        if (descriptionDeliAddress.length() == 0) {
            TextView textView3 = this.txtAddressDistance;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtAddressDistance");
            }
            textView3.setVisibility(8);
        } else {
            TextView textView4 = this.txtAddressDistance;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtAddressDistance");
            }
            textView4.setVisibility(0);
            TextView textView5 = this.txtAddressDistance;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtAddressDistance");
            }
            textView5.setText(descriptionDeliAddress);
        }
        ImageView imageView = this.imgAddressType;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgAddressType");
        }
        imageView.setImageResource(this.leftIcon);
        if (this.rightIcon != null) {
            ImageView imageView2 = this.imgRightIcon;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgRightIcon");
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.imgRightIcon;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgRightIcon");
            }
            imageView3.setImageResource(this.rightIcon.intValue());
            return;
        }
        ImageView imageView4 = this.imgRightIcon;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgRightIcon");
        }
        imageView4.setVisibility(8);
    }

    public final void onClick() {
        this.onClickSelect.invoke(this.addressSuggestion);
    }

    public final void onClickEdit() {
        Function1<AddressSuggestion, Unit> function1 = this.onClickRightIcon;
        if (function1 != null) {
            function1.invoke(this.addressSuggestion);
        }
    }
}
