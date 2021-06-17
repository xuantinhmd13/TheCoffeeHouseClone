package com.thecoffeehouse.guestapp.screens.order;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.filterproducts.FilterProductBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$mProductAdapter$2 extends Lambda implements Function0<ProductRecyclerViewAdapter> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$mProductAdapter$2(OrderFragment orderFragment) {
        super(0);
        this.this$0 = orderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductRecyclerViewAdapter invoke() {
        ArrayList arrayList = this.this$0.getMProducts();
        AnonymousClass1 r2 = new Function1<Product, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass1 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Product product) {
                invoke(product);
                return Unit.INSTANCE;
            }

            public final void invoke(Product product) {
                Intrinsics.checkNotNullParameter(product, "product");
                OrderFragment.showProductDetailDialog$default(this.this$0.this$0, product, null, null, 6, null);
            }
        };
        AnonymousClass2 r3 = new Function1<Product, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass2 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Product product) {
                invoke(product);
                return Unit.INSTANCE;
            }

            public final void invoke(final Product product) {
                Intrinsics.checkNotNullParameter(product, "product");
                FragmentActivity activity = this.this$0.this$0.getActivity();
                if (!(activity instanceof MainActivity)) {
                    activity = null;
                }
                MainActivity mainActivity = (MainActivity) activity;
                if (mainActivity != null) {
                    mainActivity.runFlowLogin(new Function1<Boolean, Unit>(this) {
                        /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass2.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass2 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                Product product = product;
                                product.setFavourite(!product.isFavourite());
                                OrderFragment orderFragment = this.this$0.this$0.this$0;
                                Product product2 = product;
                                orderFragment.updateFavouriteProduct(product2, product2.isFavourite());
                                this.this$0.this$0.this$0.notifyItemChangedProductInMenuList(product);
                                ((OrderViewModel) this.this$0.this$0.this$0.getViewModel()).updateFavouriteProduct(product.getId(), product.isFavourite());
                                this.this$0.this$0.this$0.showToastUpdateFavouriteProduct(product.isFavourite());
                                if (product.isFavourite()) {
                                    TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventFavoriteItem.name, "Menu");
                                    TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventFavoriteItem.name, new TrackingData("productID", product.getId()), new TrackingData("categoryID", product.getCategoryId()));
                                    TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventFavoriteItem.name);
                                }
                            }
                        }
                    });
                }
            }
        };
        AnonymousClass3 r5 = new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass3 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.getMProductAdapter().setSelectedShippingMethod(ShippingType.INSTANCE.getDELI());
                this.this$0.this$0.onChangeShippingMethod(this.this$0.this$0.getMProductAdapter().getSelectedMethod(), this.this$0.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.this$0.getMProductAdapter().getCurrentAtTableInfo());
            }
        };
        return new ProductRecyclerViewAdapter(arrayList, r2, r3, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass4 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.getMProductAdapter().setSelectedShippingMethod(ShippingType.INSTANCE.getPICKUP());
                this.this$0.this$0.onChangeShippingMethod(this.this$0.this$0.getMProductAdapter().getSelectedMethod(), this.this$0.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.this$0.getMProductAdapter().getCurrentAtTableInfo());
            }
        }, r5, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass5 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                TrackingEventService.Companion.updateSourceTrackingEvent("Change_Deli_Address", "Menu");
                this.this$0.this$0.showPickLocationDialog();
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass6 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.showPickUpStoreDialog();
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass8 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                FragmentManager supportFragmentManager;
                List<Menu> currentMenus = ((OrderViewModel) this.this$0.this$0.getViewModel()).getCurrentMenus();
                if (currentMenus != null) {
                    FilterProductBottomSheetDialogFragment newInstance = FilterProductBottomSheetDialogFragment.Companion.newInstance(new ArrayList<>(currentMenus), new OrderFragment$mProductAdapter$2$8$$special$$inlined$let$lambda$1(this));
                    FragmentActivity activity = this.this$0.this$0.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        newInstance.show(supportFragmentManager, (String) null);
                    }
                }
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass7 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                List<Menu> currentMenus = ((OrderViewModel) this.this$0.this$0.getViewModel()).getCurrentMenus();
                if (currentMenus != null) {
                    this.this$0.this$0.openSearchProductDialogFragment(currentMenus);
                }
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass9 */
            final /* synthetic */ OrderFragment$mProductAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                FragmentActivity activity = this.this$0.this$0.getActivity();
                if (!(activity instanceof MainActivity)) {
                    activity = null;
                }
                MainActivity mainActivity = (MainActivity) activity;
                if (mainActivity != null) {
                    mainActivity.runFlowLogin(new Function1<Boolean, Unit>(this) {
                        /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2.AnonymousClass9.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass9 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                this.this$0.this$0.this$0.openFavouriteProductDialogFragment();
                            }
                        }
                    });
                }
            }
        });
    }
}
