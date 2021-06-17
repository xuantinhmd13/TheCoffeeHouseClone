package com.thecoffeehouse.guestapp.screens.order;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.EditCartEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.order.cart.FloatingCartInteraction;
import com.thecoffeehouse.guestapp.screens.order.checkout.CheckoutDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.checkout.ReceiverInfoDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.favouriteproducts.FavouriteProductDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductDetailDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager;
import com.thecoffeehouse.guestapp.screens.order.recentorders.RecentProductsDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.SelectShippingMethodDialog;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationDialogV2;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.PickStoreBottomSheetHolderFragment;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.PickStoreDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderDialogFragment;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.AddCouponDialogFragment;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.CouponDetailDialogFragmentV3;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.CouponsFragment;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.ScanQRActivity;
import com.thecoffeehouse.guestapp.screens.stores.StoresViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Extra;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetMenuByLatLngResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.services.api.model.orders.MenuStyle;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.Problem;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.Warning;
import com.thecoffeehouse.guestapp.services.api.model.orders.WarningButton;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000é\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0001\u0010\u0018\u0000 ê\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002ê\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010L\u001a\u00020C2\u0006\u0010M\u001a\u00020NH\u0002J\u0012\u0010O\u001a\u00020C2\b\u0010P\u001a\u0004\u0018\u00010QH\u0002J\u0012\u0010R\u001a\u00020C2\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J4\u0010U\u001a\u00020C2\b\b\u0002\u0010V\u001a\u00020N2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010QH\u0002J\u0012\u0010Z\u001a\u00020C2\b\u0010[\u001a\u0004\u0018\u00010XH\u0002J\u0006\u0010\\\u001a\u00020CJ\u001c\u0010]\u001a\u00020C2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_H\u0002J\u0018\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020dH\u0002J\b\u0010f\u001a\u0004\u0018\u00010TJ\b\u0010g\u001a\u0004\u0018\u00010XJ\b\u0010h\u001a\u0004\u0018\u00010QJ\u0010\u0010i\u001a\u00020C2\u0006\u0010j\u001a\u00020kH\u0002J\b\u0010l\u001a\u00020CH\u0002J\b\u0010m\u001a\u00020CH\u0002J\b\u0010n\u001a\u00020CH\u0002J\b\u0010o\u001a\u00020\nH\u0002J\u001c\u0010p\u001a\u00020C2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020C0rH\u0002J\u001e\u0010s\u001a\u00020C2\u0014\b\u0002\u0010q\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020C0rH\u0002J\b\u0010t\u001a\u00020CH\u0002J\b\u0010u\u001a\u00020NH\u0014J\f\u0010v\u001a\u00060*j\u0002`wH\u0002J\u0006\u0010x\u001a\u00020NJ:\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001f0z2\u0006\u0010V\u001a\u00020N2\b\u0010{\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010QH\u0002J<\u0010|\u001a\u00020C2\u0016\u0010}\u001a\u0012\u0012\u0004\u0012\u00020X0)j\b\u0012\u0004\u0012\u00020X`+2\u0006\u0010~\u001a\u00020_2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020C0rH\u0002J\u0013\u0010\u001a\u00020C2\t\u0010\u0001\u001a\u0004\u0018\u00010NH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020CH\u0014J\u0019\u0010\u0001\u001a\u00020C2\u000e\b\u0002\u0010q\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J\u0013\u0010\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001d\u0010\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001a\u0010\u0001\u001a\u00020C2\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\u0019\u0010\u0001\u001a\u00020C2\u000e\b\u0002\u0010q\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\u001f\u0010\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J\t\u0010\u0001\u001a\u00020\nH\u0002J\t\u0010\u0001\u001a\u00020\nH\u0002J\t\u0010\u0001\u001a\u00020\nH\u0002J\u0013\u0010\u0001\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\t\u0010\u0001\u001a\u00020\u0005H\u0016J\u001f\u0010\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J\t\u0010\u0001\u001a\u00020\nH\u0002J\u0013\u0010\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u0001H\u0002J'\u0010 \u0001\u001a\u00020C2\u0007\u0010¡\u0001\u001a\u00020\u00052\u0007\u0010¢\u0001\u001a\u00020\u00052\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0016J-\u0010¥\u0001\u001a\u00020C2\u0006\u0010V\u001a\u00020N2\b\u0010{\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010P\u001a\u0004\u0018\u00010QJ\t\u0010¦\u0001\u001a\u00020CH\u0016J\t\u0010§\u0001\u001a\u00020CH\u0016J\t\u0010¨\u0001\u001a\u00020CH\u0002J\u0014\u0010©\u0001\u001a\u00020C2\t\u0010£\u0001\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010ª\u0001\u001a\u00020C2\u000f\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0002J\u001b\u0010¬\u0001\u001a\u00020\n2\b\u0010­\u0001\u001a\u00030\u00012\u0006\u0010j\u001a\u00020kH\u0002J\u0007\u0010®\u0001\u001a\u00020CJ\t\u0010¯\u0001\u001a\u00020CH\u0002J\u0011\u0010°\u0001\u001a\u00020\n2\u0006\u0010j\u001a\u00020kH\u0002J\u001b\u0010±\u0001\u001a\u00020C2\u0007\u0010²\u0001\u001a\u00020N2\t\u0010³\u0001\u001a\u0004\u0018\u00010NJ\u0007\u0010´\u0001\u001a\u00020CJ,\u0010µ\u0001\u001a\u00020C2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010X2\f\b\u0002\u0010¶\u0001\u001a\u0005\u0018\u00010·\u00012\u0007\u0010¸\u0001\u001a\u00020\nH\u0002J0\u0010¹\u0001\u001a\u00020C2\u0007\u0010º\u0001\u001a\u00020N2\u000b\b\u0002\u0010»\u0001\u001a\u0004\u0018\u00010\u00052\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010N¢\u0006\u0003\u0010¼\u0001J\t\u0010½\u0001\u001a\u00020CH\u0002J\t\u0010¾\u0001\u001a\u00020CH\u0002J\u001c\u0010¿\u0001\u001a\u00020C2\t\u0010À\u0001\u001a\u0004\u0018\u00010N2\b\u0010M\u001a\u0004\u0018\u00010NJ\u0013\u0010Á\u0001\u001a\u00020C2\b\u0010­\u0001\u001a\u00030Â\u0001H\u0002J\u001b\u0010Ã\u0001\u001a\u00020C2\u0007\u0010Ä\u0001\u001a\u00020k2\u0007\u0010Å\u0001\u001a\u00020\u0005H\u0002J\u0015\u0010Æ\u0001\u001a\u00020C2\n\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u0001H\u0002J\t\u0010É\u0001\u001a\u00020CH\u0016J\t\u0010Ê\u0001\u001a\u00020CH\u0002J\t\u0010Ë\u0001\u001a\u00020CH\u0002J\u0012\u0010Ì\u0001\u001a\u00020C2\u0007\u0010£\u0001\u001a\u00020 H\u0002J4\u0010Í\u0001\u001a\u00020C2\b\u0010\u0001\u001a\u00030\u00012\f\b\u0002\u0010Î\u0001\u001a\u0005\u0018\u00010Ï\u00012\u000b\b\u0002\u0010Å\u0001\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0003\u0010Ð\u0001J\t\u0010Ñ\u0001\u001a\u00020CH\u0002J\t\u0010Ò\u0001\u001a\u00020CH\u0002J\t\u0010Ó\u0001\u001a\u00020CH\u0002J\t\u0010Ô\u0001\u001a\u00020CH\u0002J\u0012\u0010Õ\u0001\u001a\u00020C2\u0007\u0010Ö\u0001\u001a\u00020\nH\u0002J\u0013\u0010×\u0001\u001a\u00020C2\b\u0010Ø\u0001\u001a\u00030Ù\u0001H\u0002J\t\u0010Ú\u0001\u001a\u00020CH\u0002J\u0012\u0010Û\u0001\u001a\u00020C2\u0007\u0010Ü\u0001\u001a\u00020\u001aH\u0002J\u001d\u0010Ý\u0001\u001a\u00020C2\u0012\u0010Þ\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010N\u0018\u00010\u0001H\u0002J\t\u0010ß\u0001\u001a\u00020CH\u0002J\u0015\u0010à\u0001\u001a\u00020C2\n\u0010Î\u0001\u001a\u0005\u0018\u00010Ï\u0001H\u0002J\u0012\u0010á\u0001\u001a\u00020C2\u0007\u0010â\u0001\u001a\u00020NH\u0002J\u0012\u0010ã\u0001\u001a\u00020C2\u0007\u0010£\u0001\u001a\u00020 H\u0002J\u000f\u0010ä\u0001\u001a\u00020C2\u0006\u0010M\u001a\u00020NJ\u001c\u0010å\u0001\u001a\u00020C2\b\u0010æ\u0001\u001a\u00030\u00012\u0007\u0010Ö\u0001\u001a\u00020\nH\u0002J\t\u0010ç\u0001\u001a\u00020CH\u0002J8\u0010è\u0001\u001a\u00020C2\u0006\u0010j\u001a\u00020k2\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u00030\u00012\n\u0010Î\u0001\u001a\u0005\u0018\u00010Ï\u0001H\u0002¢\u0006\u0003\u0010é\u0001R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0019R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b#\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R+\u0010(\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b,\u0010-R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b7\u0010\u0017\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b<\u0010\u0017\u001a\u0004\b:\u0010;R\u000e\u0010=\u001a\u00020>X.¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000R \u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020IX\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006ë\u0001"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/OrderFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "()V", "MAX_DISTANCE_DRAFT_CART_WARNING_IN_METERS", "", "SCAN_QR_TABLE_QUEST", "couponFragment", "Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponsFragment;", "isInitDefaultShippingMethod", "", "mCheckoutDialogFragment", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/CheckoutDialogFragment;", "mFavouriteProductDialogFragment", "Lcom/thecoffeehouse/guestapp/screens/order/favouriteproducts/FavouriteProductDialogFragment;", "mFragmentLifeCycleCallback", "com/thecoffeehouse/guestapp/screens/order/OrderFragment$mFragmentLifeCycleCallback$1", "Lcom/thecoffeehouse/guestapp/screens/order/OrderFragment$mFragmentLifeCycleCallback$1;", "mInteractionFloatingCart", "Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "getMInteractionFloatingCart", "()Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "mInteractionFloatingCart$delegate", "Lkotlin/Lazy;", "mObserveCreateOrder", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "mObserveGetMenuByLatLng", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetMenuByLatLngResponse;", "mObserverCalculateOrder", "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "mProductAdapter", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter;", "getMProductAdapter", "()Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter;", "mProductAdapter$delegate", "mProductDetailDialogFragment", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment;", "mProducts", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getMProducts", "()Ljava/util/ArrayList;", "mProducts$delegate", "mRecentProductsDialogFragment", "Lcom/thecoffeehouse/guestapp/screens/order/recentorders/RecentProductsDialogFragment;", "mSearchProductDialog", "Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment;", "mStoreViewModel", "Lcom/thecoffeehouse/guestapp/screens/stores/StoresViewModel;", "getMStoreViewModel", "()Lcom/thecoffeehouse/guestapp/screens/stores/StoresViewModel;", "mStoreViewModel$delegate", "mTrackingEventOrder", "Lcom/thecoffeehouse/guestapp/screens/order/TrackingEventOrder;", "getMTrackingEventOrder", "()Lcom/thecoffeehouse/guestapp/screens/order/TrackingEventOrder;", "mTrackingEventOrder$delegate", "mViewRcvProduct", "Landroidx/recyclerview/widget/RecyclerView;", "methodDialog", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/SelectShippingMethodDialog;", "onInitDataDone", "Lkotlin/Function0;", "", "getOnInitDataDone", "()Lkotlin/jvm/functions/Function0;", "setOnInitDataDone", "(Lkotlin/jvm/functions/Function0;)V", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "addCouponToCart", "couponCode", "", "calculateAtTableOrder", "currentAtTableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "calculateDeliveryOrder", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "calculateOrder", "currentMethod", "pickUpInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "tableInfo", "calculatePickupOrder", "store", "changeShippingMethod", "checkShowPopupWarningDraftCart", "loc1", "Lcom/google/android/gms/maps/model/LatLng;", "loc2", "createLocation", "Landroid/location/Location;", "lat", "", "lng", "currentDeliveryInfo", "currentPickUpInfo", "currentTableInfo", "deleteItemInCart", "orderLine", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "dismissActiveCouponDialogs", "dismissAllDialogs", "dismissSelectShippingMethod", "existDraftCart", "fillDeliInfoDefault", "onCompleted", "Lkotlin/Function1;", "fillPickUpInfoDefault", "floatingCartListener", "getAnalyticScreenName", "getCategoriesOfItems", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/ParamValue;", "getCurrentMethod", "getMenuByLatLng", "Landroidx/lifecycle/LiveData;", "deliveryInfo", "getNearestStore", "pickupStores", "myLatLng", "getTableInfoAndUpdateAtTableMethod", "tableCode", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "hideLoading", "initDefaultShippingMethod", "initFloatingCartViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initGroupMenuRecyclerView", "initInflatedViewStubOrder", "inflated", "parentView", "initProducts", "menu", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "initShippingInfoByDraftOrder", "initShippingInfoByLocation", "initShippingMethodViews", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "isAtTableAndEmptyTableInfo", "isCartEmpty", "isDeliAndEmptyAddress", "isUsingDefaultAddress", "layoutResId", "listenViewInteractions", "notExistCouponInCart", "notifyItemChangedProductInMenuList", "product", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onChangeShippingMethod", "onDestroy", "onResume", "openFavouriteProductDialogFragment", "openOrderTrackingFragment", "openSearchProductDialogFragment", "menus", "productInGroupMenu", "it", "refreshLocation", "removeExistedCouponInCart", "removeItemOut", "reorder", "ref", "orderType", "scrollToTop", "setDefaultPickupInfo", "shop", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;", "updateView", "setShippingMethodByDeepLink", FirebaseAnalytics.Param.METHOD, "storeId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "showActiveCouponsDialog", "showCheckout", "showCouponDetailDialog", Constants.FirelogAnalytics.PARAM_CAMPAIGN_ID, "showDeleteCartDialog", "Landroid/content/Context;", "showEditOrderLineDialog", "orderLineEdit", "position", "showEditReceiverInfo", "orderResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "showLoading", "showPickLocationDialog", "showPickUpStoreDialog", "showProblem", "showProductDetailDialog", "configs", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;Ljava/lang/Integer;)V", "showScanQRCodeActivity", "showScheduleTimeOrderBottomSheet", "showSelectShippingMethod", "showShippingAndPaymentDialog", "showToastUpdateFavouriteProduct", "isFavourite", "showWarningButton", "warning", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Warning;", "swipeToRefreshData", "trackingCreateOrder", "createOrderResponse", "trackingDeleteCart", "deletedProductIds", "trackingDeleteOrderLine", "trackingEditItemCart", "trackingShippingDetailChange", "currentShippingMethod", "updateCartToAllDialogFragments", "updateCouponToOrderFlow", "updateFavouriteProduct", "productFavourite", "updateNotes", "upsertItemInCart", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;Ljava/lang/Integer;Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;)V", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment extends BaseFragment<OrderViewModel> {
    public static final String CAMPAIGN_ID_EXTRA = "campaign_id";
    public static final String COUPON_CODE_EXTRA = "coupon_code";
    public static final Companion Companion = new Companion(null);
    public static final String INTENT_FILTER_ADD_COUPON = "add_coupon";
    public static final String OVERRIDE_DIRECTLY_EXTRA = "add_directly";
    private final int MAX_DISTANCE_DRAFT_CART_WARNING_IN_METERS = 30;
    private final int SCAN_QR_TABLE_QUEST = 112;
    private HashMap _$_findViewCache;
    private CouponsFragment couponFragment;
    private boolean isInitDefaultShippingMethod;
    private CheckoutDialogFragment mCheckoutDialogFragment;
    private FavouriteProductDialogFragment mFavouriteProductDialogFragment;
    private OrderFragment$mFragmentLifeCycleCallback$1 mFragmentLifeCycleCallback = new OrderFragment$mFragmentLifeCycleCallback$1(this);
    private final Lazy mInteractionFloatingCart$delegate = LazyKt.lazy(OrderFragment$mInteractionFloatingCart$2.INSTANCE);
    private BaseFragment<OrderViewModel>.ObserverBaseResource mObserveCreateOrder = new BaseFragment.ObserverBaseResource<>(this, new OrderFragment$mObserveCreateOrder$1(this), null, false, false, 14, null);
    private BaseFragment<OrderViewModel>.ObserverBaseResource mObserveGetMenuByLatLng = new BaseFragment.ObserverBaseResource<>(this, new OrderFragment$mObserveGetMenuByLatLng$1(this), null, false, false, 14, null);
    private Observer<Resource<CalculateOrderResponse>> mObserverCalculateOrder = new OrderFragment$mObserverCalculateOrder$1(this);
    private final Lazy mProductAdapter$delegate = LazyKt.lazy(new OrderFragment$mProductAdapter$2(this));
    private ProductDetailDialogFragment mProductDetailDialogFragment;
    private final Lazy mProducts$delegate = LazyKt.lazy(OrderFragment$mProducts$2.INSTANCE);
    private RecentProductsDialogFragment mRecentProductsDialogFragment;
    private SearchProductDialogFragment mSearchProductDialog;
    private final Lazy mStoreViewModel$delegate = LazyKt.lazy(new OrderFragment$mStoreViewModel$2(this));
    private final Lazy mTrackingEventOrder$delegate = LazyKt.lazy(OrderFragment$mTrackingEventOrder$2.INSTANCE);
    private RecyclerView mViewRcvProduct;
    private SelectShippingMethodDialog methodDialog;
    private Function0<Unit> onInitDataDone = OrderFragment$onInitDataDone$1.INSTANCE;
    private final Class<OrderViewModel> viewModelClass = OrderViewModel.class;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final FloatingCartInteraction getMInteractionFloatingCart() {
        return (FloatingCartInteraction) this.mInteractionFloatingCart$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ProductRecyclerViewAdapter getMProductAdapter() {
        return (ProductRecyclerViewAdapter) this.mProductAdapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ArrayList<Object> getMProducts() {
        return (ArrayList) this.mProducts$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final StoresViewModel getMStoreViewModel() {
        return (StoresViewModel) this.mStoreViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final TrackingEventOrder getMTrackingEventOrder() {
        return (TrackingEventOrder) this.mTrackingEventOrder$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Menu_Category_List;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_order;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ RecyclerView access$getMViewRcvProduct$p(OrderFragment orderFragment) {
        RecyclerView recyclerView = orderFragment.mViewRcvProduct;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        return recyclerView;
    }

    public final Function0<Unit> getOnInitDataDone() {
        return this.onInitDataDone;
    }

    public final void setOnInitDataDone(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onInitDataDone = function0;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<OrderViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    /* access modifiers changed from: private */
    public final void notifyItemChangedProductInMenuList(Product product) {
        boolean z;
        Iterator<Object> it = getMProducts().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (!(next instanceof Product)) {
                z = false;
            } else {
                z = Intrinsics.areEqual(((Product) next).getId(), product.getId());
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i != -1) {
            getMProductAdapter().notifyItemChanged(i);
        }
    }

    /* access modifiers changed from: private */
    public final void showWarningButton(Warning warning) {
        List<WarningButton> buttons = warning.getButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getText());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        TextView textView = new TextView(requireContext());
        textView.setPadding(ViewExtsKt.DPtoPX(24.0f), ViewExtsKt.DPtoPX(24.0f), ViewExtsKt.DPtoPX(24.0f), 0);
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(String.valueOf(warning.getTitle()), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_bold)), new TextViewAttribute("\n\n" + warning.getDescription(), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular)));
        new AlertDialog.Builder(requireContext()).setCustomTitle(textView).setCancelable(false).setItems((String[]) array, new OrderFragment$showWarningButton$1(this, warning)).create().show();
    }

    /* access modifiers changed from: private */
    public final void dismissAllDialogs() {
        CheckoutDialogFragment checkoutDialogFragment = this.mCheckoutDialogFragment;
        if (checkoutDialogFragment != null) {
            checkoutDialogFragment.showLoading();
        }
        CheckoutDialogFragment checkoutDialogFragment2 = this.mCheckoutDialogFragment;
        if (checkoutDialogFragment2 != null) {
            checkoutDialogFragment2.dismiss();
        }
        this.mCheckoutDialogFragment = null;
        FloatingCartInteraction.updateCart$default(getMInteractionFloatingCart(), null, false, null, 6, null);
    }

    /* access modifiers changed from: private */
    public final void trackingCreateOrder(CreateOrderResponse createOrderResponse) {
        Payment payment;
        List<Payment> payments = createOrderResponse.getPayments();
        String str = null;
        String method = (payments == null || (payment = (Payment) CollectionsKt.firstOrNull(payments)) == null) ? null : payment.getMethod();
        ArrayList<OrderLineCreateOrder> orderlines = createOrderResponse.getOrderlines();
        int intValue = (orderlines != null ? Integer.valueOf(FloatingCartInteraction.Companion.calculateTotalItemsInOrder(orderlines)) : null).intValue();
        String shippingType = createOrderResponse.getShippingType();
        Order orderResponse = ((OrderViewModel) getViewModel()).getOrderResponse();
        if (orderResponse != null) {
            str = orderResponse.getCouponCode();
        }
        String str2 = str;
        getMTrackingEventOrder().trackingAndTriggerWhenCreateOrder(method, Integer.valueOf(intValue), shippingType, !(str2 == null || str2.length() == 0));
    }

    static /* synthetic */ void calculateOrder$default(OrderFragment orderFragment, String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ShippingType.INSTANCE.getDELI();
        }
        if ((i & 2) != 0) {
            addressSuggestion = null;
        }
        if ((i & 4) != 0) {
            store = null;
        }
        orderFragment.calculateOrder(str, addressSuggestion, store, tableInfo);
    }

    /* access modifiers changed from: private */
    public final void calculateOrder(String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo) {
        GeneralKt.log("isCartEmpty(): " + isCartEmpty());
        if (isCartEmpty()) {
            LiveData<Resource<GetMenuByLatLngResponse>> menuByLatLng = getMenuByLatLng(str, addressSuggestion, store, tableInfo);
            OrderFragment orderFragment = this;
            menuByLatLng.observe(orderFragment, this.mObserveGetMenuByLatLng);
            menuByLatLng.observe(orderFragment, new BaseFragment.ObserverBaseResource(this, new OrderFragment$calculateOrder$1(this, str, addressSuggestion, store, tableInfo), null, false, false, 14, null));
        } else {
            GeneralKt.log("currentMethod: " + str);
            if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
                calculatePickupOrder(store);
            } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
                calculateDeliveryOrder(addressSuggestion);
            } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getTABLE())) {
                calculateAtTableOrder(tableInfo);
            }
        }
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.updateHeaderShippingMethod(getMProductAdapter().getSelectedMethod(), getMProductAdapter().getCurrentDeliveryInfo(), getMProductAdapter().getCurrentPickupInfo(), getMProductAdapter().getCurrentAtTableInfo());
        }
    }

    private final void calculateAtTableOrder(TableInfo tableInfo) {
        if (tableInfo != null) {
            ((OrderViewModel) getViewModel()).changeShippingMethodToAtTable(tableInfo).observe(this, this.mObserverCalculateOrder);
        }
    }

    private final void calculateDeliveryOrder(AddressSuggestion addressSuggestion) {
        if (addressSuggestion != null) {
            ((OrderViewModel) getViewModel()).changeShippingMethodToDelivery(addressSuggestion).observe(this, this.mObserverCalculateOrder);
        }
    }

    private final void calculatePickupOrder(Store store) {
        ((OrderViewModel) getViewModel()).changeShippingMethodToPickUp(store).observe(this, this.mObserverCalculateOrder);
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void showLoading() {
        super.showLoading();
        CheckoutDialogFragment checkoutDialogFragment = this.mCheckoutDialogFragment;
        if (checkoutDialogFragment != null) {
            checkoutDialogFragment.showLoading();
        }
        ProductDetailDialogFragment productDetailDialogFragment = this.mProductDetailDialogFragment;
        if (productDetailDialogFragment != null) {
            productDetailDialogFragment.showLoading();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void hideLoading() {
        super.hideLoading();
        CheckoutDialogFragment checkoutDialogFragment = this.mCheckoutDialogFragment;
        if (checkoutDialogFragment != null) {
            checkoutDialogFragment.hideLoading();
        }
        ProductDetailDialogFragment productDetailDialogFragment = this.mProductDetailDialogFragment;
        if (productDetailDialogFragment != null) {
            productDetailDialogFragment.hideLoading();
        }
    }

    /* access modifiers changed from: private */
    public final void updateCartToAllDialogFragments(CalculateOrderResponse calculateOrderResponse) {
        FloatingCartInteraction mInteractionFloatingCart = getMInteractionFloatingCart();
        Order order = calculateOrderResponse.getOrder();
        Intrinsics.checkNotNull(order);
        FloatingCartInteraction.updateCart$default(mInteractionFloatingCart, order, false, null, 4, null);
        CheckoutDialogFragment checkoutDialogFragment = this.mCheckoutDialogFragment;
        if (checkoutDialogFragment != null) {
            Order order2 = calculateOrderResponse.getOrder();
            Intrinsics.checkNotNull(order2);
            CheckoutDialogFragment.updateOrder$default(checkoutDialogFragment, order2, false, 2, null);
        }
        ProductDetailDialogFragment productDetailDialogFragment = this.mProductDetailDialogFragment;
        if (productDetailDialogFragment != null) {
            productDetailDialogFragment.dismiss();
        }
        SearchProductDialogFragment searchProductDialogFragment = this.mSearchProductDialog;
        if (searchProductDialogFragment != null) {
            Order order3 = calculateOrderResponse.getOrder();
            Intrinsics.checkNotNull(order3);
            searchProductDialogFragment.updateCart(order3);
        }
        FavouriteProductDialogFragment favouriteProductDialogFragment = this.mFavouriteProductDialogFragment;
        if (favouriteProductDialogFragment != null) {
            Order order4 = calculateOrderResponse.getOrder();
            Intrinsics.checkNotNull(order4);
            favouriteProductDialogFragment.updateCart(order4);
        }
        RecentProductsDialogFragment recentProductsDialogFragment = this.mRecentProductsDialogFragment;
        if (recentProductsDialogFragment != null) {
            Order order5 = calculateOrderResponse.getOrder();
            Intrinsics.checkNotNull(order5);
            recentProductsDialogFragment.updateCart(order5);
        }
    }

    /* access modifiers changed from: private */
    public final void showProblem(CalculateOrderResponse calculateOrderResponse) {
        String str;
        List<Problem> problems = calculateOrderResponse.getProblems();
        if (problems != null) {
            List<Problem> list = problems;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMessage());
            }
            str = CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            String string = getString(R.string.str_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
            ContextExtsKt.showOneButtonAlertDialog$default(mainActivity, string, valueOf, null, false, null, 28, null);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        FragmentManager supportFragmentManager;
        super.onDestroy();
        GeneralKt.log("onDestroy");
        MainActivity mainActivity = getMainActivity();
        if (!(mainActivity == null || (supportFragmentManager = mainActivity.getSupportFragmentManager()) == null)) {
            supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.mFragmentLifeCycleCallback);
        }
        ((OrderViewModel) getViewModel()).saveDraftCartLocal();
        ((OrderViewModel) getViewModel()).saveLocationLocal();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new OrderViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        BaseFragment.addSwipeToRefreshLayout$default(this, null, new OrderFragment$initViews$1(this), 1, null);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_order);
        viewStub.setOnInflateListener(new OrderFragment$initViews$2(this, view));
        Intrinsics.checkNotNullExpressionValue(viewStub, "viewStubOrder");
        viewStub.setLayoutResource(R.layout.layout_menu_group_v2);
        viewStub.inflate();
    }

    /* access modifiers changed from: private */
    public final void swipeToRefreshData() {
        calculateOrder(getMProductAdapter().getSelectedMethod(), getMProductAdapter().getCurrentDeliveryInfo(), getMProductAdapter().getCurrentPickupInfo(), getMProductAdapter().getCurrentAtTableInfo());
        getMTrackingEventOrder().updateSourceTrackingEvent(OrderEvents.EventViewMenu.name, "Refresh");
    }

    /* access modifiers changed from: private */
    public final void initInflatedViewStubOrder(View view, View view2) {
        FragmentManager supportFragmentManager;
        initGroupMenuRecyclerView(view);
        initFloatingCartViews(view2);
        GeneralKt.log("initInflatedViewStubOrder");
        initShippingMethodViews();
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.mFragmentLifeCycleCallback, false);
        }
    }

    private final void fillDeliInfoDefault(Function1<? super AddressSuggestion, Unit> function1) {
        showLoading();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.getMyAddress(new OrderFragment$fillDeliInfoDefault$1(function1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.order.OrderFragment */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void fillPickUpInfoDefault$default(OrderFragment orderFragment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = OrderFragment$fillPickUpInfoDefault$1.INSTANCE;
        }
        orderFragment.fillPickUpInfoDefault(function1);
    }

    /* access modifiers changed from: private */
    public final void fillPickUpInfoDefault(Function1<? super Store, Unit> function1) {
        getMStoreViewModel().getStores().observe(this, new BaseFragment.ObserverBaseResource(this, new OrderFragment$fillPickUpInfoDefault$2(this, function1), null, false, false, 14, null));
        getMStoreViewModel().refreshStore(true);
    }

    /* access modifiers changed from: private */
    public final void getNearestStore(ArrayList<Store> arrayList, LatLng latLng, Function1<? super Store, Unit> function1) {
        ArrayList<Store> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (T t : arrayList2) {
            if (t.getDistance() == null) {
                LocationStore locationStore = t.getLocationStore();
                double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                double lat = locationStore != null ? locationStore.getLat() : 0.0d;
                LocationStore locationStore2 = t.getLocationStore();
                if (locationStore2 != null) {
                    d = locationStore2.getLong();
                }
                t.setDistance(Double.valueOf((double) createLocation(latLng.latitude, latLng.longitude).distanceTo(createLocation(lat, d))));
            }
            arrayList3.add(t);
        }
        function1.invoke((Store) CollectionsKt.sortedWith(arrayList3, new OrderFragment$getNearestStore$$inlined$sortedBy$1()).get(0));
    }

    private final Location createLocation(double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void listenViewInteractions(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.listenViewInteractions(view, bundle);
        floatingCartListener();
    }

    public static /* synthetic */ void setShippingMethodByDeepLink$default(OrderFragment orderFragment, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        orderFragment.setShippingMethodByDeepLink(str, num, str2);
    }

    public final void setShippingMethodByDeepLink(String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Param.METHOD);
        if (isAdded()) {
            initDefaultShippingMethod(new OrderFragment$setShippingMethodByDeepLink$1(this, str, num, str2));
        }
    }

    /* access modifiers changed from: private */
    public final void getTableInfoAndUpdateAtTableMethod(String str) {
        ((OrderViewModel) getViewModel()).getTableInfo(str).observe(this, new BaseFragment.ObserverBaseResource(this, new OrderFragment$getTableInfoAndUpdateAtTableMethod$1(this), null, false, false, 14, null));
    }

    private final void floatingCartListener() {
        getMInteractionFloatingCart().setSetOnSafeClickListener(new OrderFragment$floatingCartListener$1(this));
        getMInteractionFloatingCart().setSetOnClickButtonActionListener(new OrderFragment$floatingCartListener$2(this));
    }

    private final void initFloatingCartViews(View view) {
        FloatingCartInteraction mInteractionFloatingCart = getMInteractionFloatingCart();
        View findViewById = view.findViewById(R.id.layout_floating_cart);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.layout_floating_cart)");
        mInteractionFloatingCart.initView(findViewById);
    }

    private final void initGroupMenuRecyclerView(View view) {
        View findViewById = view.findViewById(R.id.rcv_products);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.rcv_products)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.mViewRcvProduct = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        recyclerView.setLayoutManager(new ProductLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.mViewRcvProduct;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager");
        ((ProductLayoutManager) layoutManager).setItemPrefetchEnabled(true);
        RecyclerView recyclerView3 = this.mViewRcvProduct;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
        Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager");
        ((ProductLayoutManager) layoutManager2).setInitialPrefetchItemCount(20);
        RecyclerView recyclerView4 = this.mViewRcvProduct;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        recyclerView4.setItemViewCacheSize(20);
        RecyclerView recyclerView5 = this.mViewRcvProduct;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        recyclerView5.setAdapter(getMProductAdapter());
        RecyclerView recyclerView6 = this.mViewRcvProduct;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView6.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
    }

    /* access modifiers changed from: private */
    public final void initProducts(List<Menu> list) {
        getMProducts().removeIf(OrderFragment$initProducts$1.INSTANCE);
        for (T t : list) {
            String str = "";
            if (t.getStyle() == MenuStyle.INSTANCE.getHORIZONTAL()) {
                ArrayList<Object> mProducts = getMProducts();
                String title = t.getTitle();
                if (title != null) {
                    str = title;
                }
                mProducts.add(str);
                getMProducts().add(t);
            } else if (t.getStyle() == MenuStyle.INSTANCE.getVERICAL()) {
                ArrayList<Object> mProducts2 = getMProducts();
                String title2 = t.getTitle();
                if (title2 != null) {
                    str = title2;
                }
                mProducts2.add(str);
                Iterator<T> it = t.getProducts().iterator();
                while (it.hasNext()) {
                    getMProducts().add(it.next());
                }
            }
        }
        getMProductAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public final void openSearchProductDialogFragment(List<Menu> list) {
        SearchProductDialogFragment searchProductDialogFragment;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, it.next().getProducts());
        }
        List list2 = CollectionsKt.toList(new LinkedHashSet(arrayList));
        SearchProductDialogFragment.Companion companion = SearchProductDialogFragment.Companion;
        Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.Product> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.Product> */");
        this.mSearchProductDialog = companion.newInstance((ArrayList) list2, new OrderFragment$openSearchProductDialogFragment$1(this), new OrderFragment$openSearchProductDialogFragment$2(this), ((OrderViewModel) getViewModel()).getOrderResponse());
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (searchProductDialogFragment = this.mSearchProductDialog) != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            searchProductDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    private final void initShippingMethodViews() {
        initDefaultShippingMethod(new OrderFragment$initShippingMethodViews$1(this));
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openFavouriteProductDialogFragment() {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.screens.order.OrderFragment.openFavouriteProductDialogFragment():void");
    }

    /* access modifiers changed from: private */
    public final void showToastUpdateFavouriteProduct(boolean z) {
        if (z) {
            Toast.makeText(requireContext(), (int) R.string.str_added_to_favourite_items, 0).show();
        } else {
            Toast.makeText(requireContext(), (int) R.string.str_removed_to_favourite_items, 0).show();
        }
    }

    /* access modifiers changed from: private */
    public final void openOrderTrackingFragment(CreateOrderResponse createOrderResponse) {
        if (createOrderResponse != null && createOrderResponse.getRef() != null) {
            TrackingEventService.Companion.updateSourceTrackingEvent(OrderTrackingEvents.EventOrderTrackingOpenSelected.name, OrderTrackingEvents.EventOrderTrackingOpenSelected.Value.Order_History);
            TrackingOrderDialogFragment newInstance = TrackingOrderDialogFragment.Companion.newInstance(createOrderResponse.getRef(), createOrderResponse.getOrderType(), true);
            MainActivity mainActivity = getMainActivity();
            if (mainActivity != null) {
                FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it1.supportFragmentManager");
                newInstance.show(supportFragmentManager, (String) null);
            }
        }
    }

    static /* synthetic */ void setDefaultPickupInfo$default(OrderFragment orderFragment, Store store, Shop shop, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            store = null;
        }
        if ((i & 2) != 0) {
            shop = null;
        }
        orderFragment.setDefaultPickupInfo(store, shop, z);
    }

    private final void setDefaultPickupInfo(Store store, Shop shop, boolean z) {
        if (store != null) {
            getMProductAdapter().setPickUpInfo(store, z);
        } else if (shop != null) {
            ProductRecyclerViewAdapter mProductAdapter = getMProductAdapter();
            Integer id = shop.getId();
            String name = shop.getName();
            AddressOrder address = shop.getAddress();
            ProductRecyclerViewAdapter.setPickUpInfo$default(mProductAdapter, new Store(id, name, null, null, null, String.valueOf(address != null ? address.getStreet() : null), null, null, null, false, false, 2012, null), false, 2, null);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getMTrackingEventOrder().updateSourceTrackingEvent(ShippingMethodEvents.EventChangeShipping.name, "Menu - Change Method");
        getMTrackingEventOrder().updateSourceTrackingEvent(ShippingMethodEvents.EventShippingChangedSuccessfully.name, "Menu - Change Method");
    }

    public final void onChangeShippingMethod(String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(str, "currentMethod");
        if (isAdded()) {
            getMTrackingEventOrder().triggerSendEventChangeShippingMethod();
            calculateOrder(str, addressSuggestion, store, tableInfo);
            FragmentActivity activity = getActivity();
            if (!(activity instanceof MainActivity)) {
                activity = null;
            }
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity != null) {
                mainActivity.updateHeaderShippingMethod(str, addressSuggestion, store, tableInfo);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void trackingShippingDetailChange(String str) {
        getMTrackingEventOrder().trackingShippingDetailChange(str);
    }

    /* access modifiers changed from: private */
    public final void showActiveCouponsDialog() {
        this.couponFragment = CouponsFragment.Companion.newInstance(getString(R.string.str_your_vouchers), true);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            CouponsFragment couponsFragment = this.couponFragment;
            Intrinsics.checkNotNull(couponsFragment);
            couponsFragment.show(mainActivity.getSupportFragmentManager(), (String) null);
        }
        getMTrackingEventOrder().updateSourceTrackingEvent(SelectVoucherEvents.EventViewVoucherList.name, "Cart");
        TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.Voucher_List, R.layout.fragment_coupons);
    }

    /* access modifiers changed from: private */
    public final void showCheckout() {
        if (isDeliAndEmptyAddress() || isAtTableAndEmptyTableInfo()) {
            showSelectShippingMethod();
        } else if (((OrderViewModel) getViewModel()).getOrderResponse() != null) {
            showShippingAndPaymentDialog();
        }
    }

    /* access modifiers changed from: private */
    public final boolean notExistCouponInCart() {
        Order orderResponse = ((OrderViewModel) getViewModel()).getOrderResponse();
        return (orderResponse != null ? orderResponse.getCouponCode() : null) == null;
    }

    /* access modifiers changed from: private */
    public final void trackingDeleteOrderLine() {
        getMTrackingEventOrder().updateSourceTrackingEvent(EditCartEvents.EventCartItemRemovedSuccessfully.name, "Cart");
        getMTrackingEventOrder().triggerSendEventDeleteItemCart();
    }

    /* access modifiers changed from: private */
    public final void trackingDeleteCart(List<String> list) {
        getMTrackingEventOrder().trackingEventDeleteCart(list, getCategoriesOfItems());
        getMTrackingEventOrder().triggerSendEventDeleteCart();
    }

    private final Object getCategoriesOfItems() {
        ArrayList<OrderLine> orderLines;
        ArrayList arrayList = new ArrayList();
        Order orderResponse = ((OrderViewModel) getViewModel()).getOrderResponse();
        if (!(orderResponse == null || (orderLines = orderResponse.getOrderLines()) == null)) {
            for (T t : orderLines) {
                List<Menu> currentMenus = ((OrderViewModel) getViewModel()).getCurrentMenus();
                Menu menu = null;
                if (currentMenus != null) {
                    Iterator<T> it = currentMenus.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (productInGroupMenu(next, t)) {
                            menu = next;
                            break;
                        }
                    }
                    menu = menu;
                }
                if (menu != null) {
                    arrayList.add(Integer.valueOf(menu.getId()));
                }
            }
        }
        return arrayList;
    }

    private final boolean productInGroupMenu(Menu menu, OrderLine orderLine) {
        ArrayList<Product> products = menu.getProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getId());
        }
        return CollectionsKt.contains(arrayList, orderLine.getId());
    }

    public final void showCouponDetailDialog(String str, String str2) {
        if (isAdded()) {
            CouponDetailDialogFragmentV3 newInstance = CouponDetailDialogFragmentV3.Companion.newInstance(str, str2, new OrderFragment$showCouponDetailDialog$couponDetailDialogFragment$1(this));
            MainActivity mainActivity = getMainActivity();
            if (mainActivity != null) {
                FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
                newInstance.show(supportFragmentManager, (String) null);
            }
            getMTrackingEventOrder().updateSourceTrackingOpenGroupMenu();
        }
    }

    public final void updateCouponToOrderFlow(String str) {
        Intrinsics.checkNotNullParameter(str, "couponCode");
        if (!isAdded()) {
            return;
        }
        if (isCartEmpty()) {
            MainActivity mainActivity = getMainActivity();
            if (mainActivity != null) {
                mainActivity.navigateTab(R.id.navigation_order);
            }
            TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewMenu.name, "Voucher_Detail");
            return;
        }
        Order orderResponse = ((OrderViewModel) getViewModel()).getOrderResponse();
        if (Intrinsics.areEqual(orderResponse != null ? orderResponse.getCouponCode() : null, str)) {
            removeExistedCouponInCart();
        } else {
            addCouponToCart(str);
        }
    }

    private final boolean isCartEmpty() {
        try {
            Order orderResponse = ((OrderViewModel) getViewModel()).getOrderResponse();
            ArrayList<OrderLine> orderLines = orderResponse != null ? orderResponse.getOrderLines() : null;
            return orderLines == null || orderLines.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private final void removeExistedCouponInCart() {
        LiveData<Resource<CalculateOrderResponse>> removeExistedCouponInCart = ((OrderViewModel) getViewModel()).removeExistedCouponInCart();
        OrderFragment orderFragment = this;
        removeExistedCouponInCart.observe(orderFragment, this.mObserverCalculateOrder);
        removeExistedCouponInCart.observe(orderFragment, new BaseFragment.ObserverBaseResource(this, new OrderFragment$removeExistedCouponInCart$1(this), null, false, false, 14, null));
    }

    private final void addCouponToCart(String str) {
        GeneralKt.log("addCouponToCart: " + str);
        getMTrackingEventOrder().triggerSendEventApplyAVoucher();
        LiveData<Resource<CalculateOrderResponse>> updateCouponToOrder = ((OrderViewModel) getViewModel()).updateCouponToOrder(str);
        OrderFragment orderFragment = this;
        updateCouponToOrder.observe(orderFragment, this.mObserverCalculateOrder);
        updateCouponToOrder.observe(orderFragment, new BaseFragment.ObserverBaseResource(this, new OrderFragment$addCouponToCart$1(this), new OrderFragment$addCouponToCart$2(this), false, false, 12, null));
    }

    /* access modifiers changed from: private */
    public final void dismissActiveCouponDialogs() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        CouponsFragment couponsFragment = this.couponFragment;
        if (couponsFragment != null) {
            couponsFragment.dismiss();
        }
        MainActivity mainActivity = getMainActivity();
        if (!(mainActivity == null || (supportFragmentManager = mainActivity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null)) {
            for (T t : fragments) {
                if (t instanceof AddCouponDialogFragment) {
                    t.dismiss();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    public final void showEditOrderLineDialog(OrderLine orderLine, int i) {
        List<Menu> currentMenus = ((OrderViewModel) getViewModel()).getCurrentMenus();
        Product product = null;
        if (currentMenus != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = currentMenus.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, it.next().getProducts());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((Product) next).getId(), orderLine.getId())) {
                    product = next;
                    break;
                }
            }
            product = product;
        }
        if (product != null) {
            HashMap hashMap = new HashMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : orderLine.getExtra()) {
                Integer groupId = t.getGroupId();
                Object obj = linkedHashMap.get(groupId);
                if (obj == null) {
                    obj = (List) new ArrayList();
                    linkedHashMap.put(groupId, obj);
                }
                ((List) obj).add(t);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Integer num = (Integer) entry.getKey();
                if (num != null) {
                    Integer valueOf = Integer.valueOf(num.intValue());
                    Iterable<Extra> iterable = (Iterable) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Extra extra : iterable) {
                        arrayList2.add(extra.getId());
                    }
                    ArrayList arrayList3 = (ArrayList) hashMap.put(valueOf, arrayList2);
                }
            }
            showProductDetailDialog(product, new ProductDetailDialogFragment.ProductConfiguration(hashMap, orderLine.getNote(), Integer.valueOf(orderLine.getQuantity())), Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    public final boolean isUsingDefaultAddress(AddressSuggestion addressSuggestion) {
        String str = null;
        if ((addressSuggestion != null ? addressSuggestion.getTitle() : null) == null) {
            if (addressSuggestion != null) {
                str = addressSuggestion.getTitleAddress();
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ void showProductDetailDialog$default(OrderFragment orderFragment, Product product, ProductDetailDialogFragment.ProductConfiguration productConfiguration, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            productConfiguration = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        orderFragment.showProductDetailDialog(product, productConfiguration, num);
    }

    private final void showProductDetailDialog(Product product, ProductDetailDialogFragment.ProductConfiguration productConfiguration, Integer num) {
        this.mProductDetailDialogFragment = ProductDetailDialogFragment.Companion.newInstance(product, productConfiguration, new OrderFragment$showProductDetailDialog$1(this, num, product, productConfiguration), new OrderFragment$showProductDetailDialog$2(this, product));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            ProductDetailDialogFragment productDetailDialogFragment = this.mProductDetailDialogFragment;
            Intrinsics.checkNotNull(productDetailDialogFragment);
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            productDetailDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void upsertItemInCart(OrderLine orderLine, Integer num, Product product, ProductDetailDialogFragment.ProductConfiguration productConfiguration) {
        if (isDeliAndEmptyAddress() || isAtTableAndEmptyTableInfo()) {
            ProductDetailDialogFragment productDetailDialogFragment = this.mProductDetailDialogFragment;
            if (productDetailDialogFragment != null) {
                productDetailDialogFragment.dismiss();
            }
            showSelectShippingMethod();
            return;
        }
        ((OrderViewModel) getViewModel()).upsertOrderLineAndCalculateOrder(orderLine, num).observe(this, this.mObserverCalculateOrder);
        getMTrackingEventOrder().trackingItemAddToCart(product, orderLine, productConfiguration, ((OrderViewModel) getViewModel()).getOrderedProductIds().contains(product.getId()), getMProductAdapter().getSelectedMethod());
        trackingEditItemCart(productConfiguration);
    }

    private final boolean isAtTableAndEmptyTableInfo() {
        return Intrinsics.areEqual(getMProductAdapter().getSelectedMethod(), ShippingType.INSTANCE.getTABLE()) && getMProductAdapter().getCurrentAtTableInfo() == null;
    }

    private final boolean isDeliAndEmptyAddress() {
        return isUsingDefaultAddress(getMProductAdapter().getCurrentDeliveryInfo()) && Intrinsics.areEqual(getMProductAdapter().getSelectedMethod(), ShippingType.INSTANCE.getDELI());
    }

    /* access modifiers changed from: private */
    public final void deleteItemInCart(OrderLine orderLine) {
        getMTrackingEventOrder().trackingAndTriggerDeleteItemCart();
        ((OrderViewModel) getViewModel()).deleteOrderLineAndCalculateOrder(orderLine).observe(this, this.mObserverCalculateOrder);
    }

    /* access modifiers changed from: private */
    public final boolean removeItemOut(OrderLine orderLine) {
        return orderLine.getQuantity() <= 0;
    }

    private final void trackingEditItemCart(ProductDetailDialogFragment.ProductConfiguration productConfiguration) {
        if (productConfiguration != null) {
            getMTrackingEventOrder().triggerSendEventEditItemCart();
        }
    }

    /* access modifiers changed from: private */
    public final void updateFavouriteProduct(Product product, boolean z) {
        Object obj;
        List<Menu> currentMenus = ((OrderViewModel) getViewModel()).getCurrentMenus();
        if (currentMenus != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = currentMenus.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, it.next().getProducts());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((Product) obj).getId(), product.getId())) {
                    break;
                }
            }
            Product product2 = (Product) obj;
            if (product2 != null) {
                product2.setFavourite(z);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showScheduleTimeOrderBottomSheet() {
        ((OrderViewModel) getViewModel()).getScheduleOrder().observe(this, new BaseFragment.ObserverBaseResource(this, new OrderFragment$showScheduleTimeOrderBottomSheet$1(this), null, false, false, 14, null));
    }

    private final void showShippingAndPaymentDialog() {
        FragmentManager supportFragmentManager;
        GeneralKt.log("viewModel.orderResponse: " + ((OrderViewModel) getViewModel()).getOrderResponse());
        CheckoutDialogFragment.Companion companion = CheckoutDialogFragment.Companion;
        Order orderResponse = ((OrderViewModel) getViewModel()).getOrderResponse();
        Intrinsics.checkNotNull(orderResponse);
        this.mCheckoutDialogFragment = companion.newInstance(orderResponse, new OrderFragment$showShippingAndPaymentDialog$2(this), new OrderFragment$showShippingAndPaymentDialog$3(this), new OrderFragment$showShippingAndPaymentDialog$1(this), new OrderFragment$showShippingAndPaymentDialog$4(this), new OrderFragment$showShippingAndPaymentDialog$5(this), new OrderFragment$showShippingAndPaymentDialog$6(this), new OrderFragment$showShippingAndPaymentDialog$7(this), new OrderFragment$showShippingAndPaymentDialog$8(this), new OrderFragment$showShippingAndPaymentDialog$10(this), new OrderFragment$showShippingAndPaymentDialog$9(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            CheckoutDialogFragment checkoutDialogFragment = this.mCheckoutDialogFragment;
            Intrinsics.checkNotNull(checkoutDialogFragment);
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it");
            checkoutDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void showDeleteCartDialog(Context context) {
        new AlertDialog.Builder(context).setTitle(getString(R.string.str_confirm_title_dialog)).setMessage(getString(R.string.str_delete_all_items_in_cart)).setNegativeButton(getString(R.string.str_cancel), OrderFragment$showDeleteCartDialog$1.INSTANCE).setPositiveButton(getString(R.string.str_delete), new OrderFragment$showDeleteCartDialog$2(this)).show();
    }

    /* access modifiers changed from: private */
    public final void showEditReceiverInfo(Order order) {
        FragmentManager supportFragmentManager;
        AddressSuggestion addressSuggestion;
        Phone phone;
        AddressSuggestion addressSuggestion2;
        ReceiverInfoDialogFragment newInstance = ReceiverInfoDialogFragment.Companion.newInstance((order == null || (addressSuggestion2 = order.getAddressSuggestion()) == null) ? null : addressSuggestion2.getName(), (order == null || (addressSuggestion = order.getAddressSuggestion()) == null || (phone = addressSuggestion.getPhone()) == null) ? null : phone.getPhoneNumber(), new OrderFragment$showEditReceiverInfo$receiverInfoDialogFragment$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (supportFragmentManager = mainActivity.getSupportFragmentManager()) != null) {
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void updateNotes() {
        String str;
        String noteShipping;
        OrderViewModel orderViewModel = (OrderViewModel) getViewModel();
        CheckoutDialogFragment checkoutDialogFragment = this.mCheckoutDialogFragment;
        String str2 = "";
        if (checkoutDialogFragment == null || (str = checkoutDialogFragment.getDeliveryShipping()) == null) {
            str = str2;
        }
        CheckoutDialogFragment checkoutDialogFragment2 = this.mCheckoutDialogFragment;
        if (!(checkoutDialogFragment2 == null || (noteShipping = checkoutDialogFragment2.getNoteShipping()) == null)) {
            str2 = noteShipping;
        }
        CheckoutDialogFragment checkoutDialogFragment3 = this.mCheckoutDialogFragment;
        orderViewModel.updateNotesAndSaveConfirmOrder(str, str2, checkoutDialogFragment3 != null ? checkoutDialogFragment3.getSaveConfirm() : null);
    }

    /* access modifiers changed from: private */
    public final LiveData<Resource<GetMenuByLatLngResponse>> getMenuByLatLng(String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo) {
        LatLng defaultLatLng = ((OrderViewModel) getViewModel()).getDefaultLatLng();
        if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
            if (addressSuggestion != null) {
                return OrderViewModel.getMenuByLatLng$default((OrderViewModel) getViewModel(), addressSuggestion.getLat(), addressSuggestion.getLng(), str, null, 8, null);
            }
            return OrderViewModel.getMenuByLatLng$default((OrderViewModel) getViewModel(), defaultLatLng.latitude, defaultLatLng.longitude, null, null, 12, null);
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
            if (store == null) {
                return OrderViewModel.getMenuByLatLng$default((OrderViewModel) getViewModel(), defaultLatLng.latitude, defaultLatLng.longitude, null, null, 12, null);
            }
            OrderViewModel orderViewModel = (OrderViewModel) getViewModel();
            LocationStore locationStore = store.getLocationStore();
            double lat = locationStore != null ? locationStore.getLat() : defaultLatLng.latitude;
            LocationStore locationStore2 = store.getLocationStore();
            return orderViewModel.getMenuByLatLng(lat, locationStore2 != null ? locationStore2.getLong() : defaultLatLng.longitude, str, store.getId());
        } else if (!Intrinsics.areEqual(str, ShippingType.INSTANCE.getTABLE())) {
            return OrderViewModel.getMenuByLatLng$default((OrderViewModel) getViewModel(), defaultLatLng.latitude, defaultLatLng.longitude, null, null, 12, null);
        } else {
            if (tableInfo == null) {
                return OrderViewModel.getMenuByLatLng$default((OrderViewModel) getViewModel(), defaultLatLng.latitude, defaultLatLng.longitude, null, null, 12, null);
            }
            OrderViewModel orderViewModel2 = (OrderViewModel) getViewModel();
            Double lat2 = tableInfo.getLat();
            double doubleValue = lat2 != null ? lat2.doubleValue() : defaultLatLng.latitude;
            Double d = tableInfo.getLong();
            return orderViewModel2.getMenuByLatLng(doubleValue, d != null ? d.doubleValue() : defaultLatLng.longitude, str, tableInfo.getStoreId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.order.OrderFragment */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initDefaultShippingMethod$default(OrderFragment orderFragment, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = OrderFragment$initDefaultShippingMethod$1.INSTANCE;
        }
        orderFragment.initDefaultShippingMethod(function0);
    }

    private final void initDefaultShippingMethod(Function0<Unit> function0) {
        if (this.isInitDefaultShippingMethod) {
            function0.invoke();
        } else if (existDraftCart()) {
            initShippingInfoByLocation(new OrderFragment$initDefaultShippingMethod$2(this, function0));
        } else {
            initShippingInfoByLocation(new OrderFragment$initDefaultShippingMethod$3(this, function0));
        }
    }

    /* access modifiers changed from: private */
    public final void initShippingInfoByDraftOrder() {
        AddressSuggestion addressSuggestion;
        AddressSuggestion addressSuggestion2;
        CalculateOrderResponse draftCart = ((OrderViewModel) getViewModel()).getDraftCart();
        GeneralKt.log("draftOrder: " + draftCart);
        if (draftCart != null) {
            Order order = draftCart.getOrder();
            LatLng latLng = null;
            Shop shop = null;
            String shippingType = order != null ? order.getShippingType() : null;
            if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP())) {
                Order order2 = draftCart.getOrder();
                if (order2 != null && order2.getShop() != null) {
                    Order order3 = draftCart.getOrder();
                    if (order3 != null) {
                        shop = order3.getShop();
                    }
                    setDefaultPickupInfo$default(this, null, shop, true, 1, null);
                }
            } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
                Order order4 = draftCart.getOrder();
                LatLng latLng2 = (order4 == null || (addressSuggestion2 = order4.getAddressSuggestion()) == null) ? null : addressSuggestion2.getLatLng();
                AddressSuggestion currentDeliveryInfo = getMProductAdapter().getCurrentDeliveryInfo();
                if (currentDeliveryInfo != null) {
                    latLng = currentDeliveryInfo.getLatLng();
                }
                checkShowPopupWarningDraftCart(latLng2, latLng);
                Order order5 = draftCart.getOrder();
                if (order5 != null && (addressSuggestion = order5.getAddressSuggestion()) != null) {
                    getMProductAdapter().setDeliveryInfo(addressSuggestion, true);
                }
            } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
                ProductRecyclerViewAdapter mProductAdapter = getMProductAdapter();
                Order order6 = draftCart.getOrder();
                ProductRecyclerViewAdapter.setTableInfo$default(mProductAdapter, order6 != null ? order6.getTableInfo() : null, false, 2, null);
                MainActivity mainActivity = getMainActivity();
                if (mainActivity != null) {
                    mainActivity.getMyAddress(new OrderFragment$initShippingInfoByDraftOrder$$inlined$let$lambda$1(this, draftCart));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void checkShowPopupWarningDraftCart(LatLng latLng, LatLng latLng2) {
        MainActivity mainActivity;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double d2 = latLng != null ? latLng.latitude : 0.0d;
        if (latLng2 != null) {
            d = latLng2.longitude;
        }
        double distanceByTwoLocation = OrderExtsKt.getDistanceByTwoLocation(new LatLng(d2, d), latLng2);
        GeneralKt.log("distance: " + distanceByTwoLocation);
        if (distanceByTwoLocation >= ((double) this.MAX_DISTANCE_DRAFT_CART_WARNING_IN_METERS) && (mainActivity = getMainActivity()) != null) {
            String string = getString(R.string.str_please_check_your_address_again);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_p…check_your_address_again)");
            mainActivity.showPopupWarningDraftCart(string);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.order.OrderFragment */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initShippingInfoByLocation$default(OrderFragment orderFragment, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = OrderFragment$initShippingInfoByLocation$1.INSTANCE;
        }
        orderFragment.initShippingInfoByLocation(function0);
    }

    /* access modifiers changed from: private */
    public final void initShippingInfoByLocation(Function0<Unit> function0) {
        showLoading();
        fillDeliInfoDefault(new OrderFragment$initShippingInfoByLocation$2(this, function0));
    }

    private final boolean existDraftCart() {
        return ((OrderViewModel) getViewModel()).getDraftCart() != null;
    }

    public final void scrollToTop() {
        try {
            if (this.mViewRcvProduct != null) {
                RecyclerView recyclerView = this.mViewRcvProduct;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewRcvProduct");
                }
                recyclerView.smoothScrollToPosition(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void reorder(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        if (isAdded()) {
            LiveData<Resource<CalculateOrderResponse>> reorder = ((OrderViewModel) getViewModel()).reorder(str, str2);
            OrderFragment orderFragment = this;
            reorder.observe(orderFragment, this.mObserverCalculateOrder);
            reorder.observe(orderFragment, new BaseFragment.ObserverBaseResource(this, new OrderFragment$reorder$1(this), null, false, false, 14, null));
        }
    }

    /* access modifiers changed from: private */
    public final void showSelectShippingMethod() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.availableShippingMethods(new OrderFragment$showSelectShippingMethod$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showScanQRCodeActivity() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            startActivityForResult(ScanQRActivity.Companion.createIntentScanQRTableCode(mainActivity), this.SCAN_QR_TABLE_QUEST);
        }
    }

    /* access modifiers changed from: private */
    public final void showPickUpStoreDialog() {
        FragmentManager supportFragmentManager;
        PickStoreBottomSheetHolderFragment pickStoreBottomSheetHolderFragment = new PickStoreBottomSheetHolderFragment();
        PickStoreDialogFragment newInstance = PickStoreDialogFragment.Companion.newInstance(new OrderFragment$showPickUpStoreDialog$pickStoreDialogFragment$1(this, pickStoreBottomSheetHolderFragment));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            pickStoreBottomSheetHolderFragment.showNow(supportFragmentManager, null);
            pickStoreBottomSheetHolderFragment.addFragment(newInstance);
        }
    }

    /* access modifiers changed from: private */
    public final void showPickLocationDialog() {
        FragmentManager supportFragmentManager;
        PickLocationDialogV2 newInstance = PickLocationDialogV2.Companion.newInstance(true, new OrderFragment$showPickLocationDialog$pickLocationDialog$1(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void dismissSelectShippingMethod() {
        SelectShippingMethodDialog selectShippingMethodDialog = this.methodDialog;
        if (selectShippingMethodDialog != null) {
            selectShippingMethodDialog.dismiss();
        }
        this.methodDialog = null;
    }

    public final void changeShippingMethod() {
        if (isAdded()) {
            showSelectShippingMethod();
        }
    }

    public final String getCurrentMethod() {
        return getMProductAdapter().getSelectedMethod();
    }

    public final AddressSuggestion currentDeliveryInfo() {
        return getMProductAdapter().getCurrentDeliveryInfo();
    }

    public final Store currentPickUpInfo() {
        return getMProductAdapter().getCurrentPickupInfo();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/OrderFragment$Companion;", "", "()V", "CAMPAIGN_ID_EXTRA", "", "COUPON_CODE_EXTRA", "INTENT_FILTER_ADD_COUPON", "OVERRIDE_DIRECTLY_EXTRA", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: OrderFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        GeneralKt.log("activity result: " + i + ' ' + i2 + ' ' + intent);
        if (i == this.SCAN_QR_TABLE_QUEST && i2 == -1 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra(ScanQRActivity.Companion.getRESULT_SCAN_CODE());
                String str = null;
                String substringAfterLast$default = stringExtra != null ? StringsKt.substringAfterLast$default(stringExtra, "link=", (String) null, 2, (Object) null) : null;
                MainActivity mainActivity = getMainActivity();
                if (mainActivity != null) {
                    str = mainActivity.extractTableCodeInDeepLink(substringAfterLast$default);
                }
                if (str != null) {
                    getTableInfoAndUpdateAtTableMethod(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final TableInfo currentTableInfo() {
        return getMProductAdapter().getCurrentAtTableInfo();
    }

    public final void refreshLocation() {
        MainActivity mainActivity;
        if (isCartEmpty() && (mainActivity = getMainActivity()) != null) {
            mainActivity.getCurrentLocationListener(40L, new OrderFragment$refreshLocation$1(this));
        }
    }
}
