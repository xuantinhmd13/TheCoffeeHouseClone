package com.thecoffeehouse.guestapp;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.repositories.data.AbsentLiveData;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.common.config.PaymentsItem;
import com.thecoffeehouse.guestapp.services.api.model.common.config.ShippingPayment;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CancelOrderRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.DataRatingOrderInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTimeResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersProcessingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetShippingInfoRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetShippingInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetTableInfoRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetTableInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderAPI;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistoryRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessingRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.ReorderRequest;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.WarningButton;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CouponDetailRequest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CouponDetailResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.Address;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.services.api.model.stores.StoreAPI;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=J\"\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0>0=2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0006J\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0006\u0010D\u001a\u00020EJ\u001a\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0006\u0010G\u001a\u00020HJ\u001c\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\b\u0010J\u001a\u0004\u0018\u00010KJ\u0012\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0MJ\u0006\u0010N\u001a\u00020OJ\u001c\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0>0=2\u0006\u0010R\u001a\u00020SH\u0002J\u001a\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0006\u0010U\u001a\u00020VJ\b\u0010W\u001a\u00020!H\u0002J\b\u0010X\u001a\u00020OH\u0002J\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0#J\u0016\u0010[\u001a\u0012\u0012\u0004\u0012\u00020Z0#j\b\u0012\u0004\u0012\u00020Z`$J\b\u0010\\\u001a\u0004\u0018\u00010\u001cJ&\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0>0=2\b\u0010_\u001a\u0004\u0018\u00010\u00062\b\u0010`\u001a\u0004\u0018\u00010\u0006J\u0016\u0010a\u001a\u0012\u0012\u0004\u0012\u00020\u00060bj\b\u0012\u0004\u0012\u00020\u0006`cJ\b\u0010d\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010e\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$H\u0002J\b\u0010f\u001a\u0004\u0018\u00010\u001cJ&\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0>0=2\u0006\u0010h\u001a\u00020\u00062\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0006J\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\"\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0>0=2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020nJ\u0012\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0>0=J\f\u0010r\u001a\b\u0012\u0004\u0012\u00020n0\u0013J\u0016\u0010s\u001a\u0012\u0012\u0004\u0012\u00020)0#j\b\u0012\u0004\u0012\u00020)`$J\u0012\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0>0=J$\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0>0=2\u0006\u0010h\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010\u0006J\u001c\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0>0=2\b\u0010{\u001a\u0004\u0018\u00010\u0006J\b\u0010|\u001a\u00020OH\u0002J\u0014\u0010}\u001a\u0004\u0018\u00010\u001c2\b\u0010~\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u001a\u00020\u001aH\u0002J\t\u0010\u0001\u001a\u00020\u001aH\u0002J\t\u0010\u0001\u001a\u00020OH\u0002J\t\u0010\u0001\u001a\u00020OH\u0002J\u0007\u0010\u0001\u001a\u00020OJ\u0007\u0010\u0001\u001a\u00020!J\u001e\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010>0=2\b\u0010\u0001\u001a\u00030\u0001J'\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010>0=2\u0006\u0010A\u001a\u00020\u00062\t\u0010\u0001\u001a\u0004\u0018\u00010\u0006J\u0013\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=J%\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0006\u0010A\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010\u0006J\t\u0010\u0001\u001a\u00020OH\u0002J\t\u0010\u0001\u001a\u00020OH\u0002J\u0007\u0010\u0001\u001a\u00020OJ\t\u0010\u0001\u001a\u00020OH\u0002J\u0007\u0010\u0001\u001a\u00020OJ\u001a\u0010\u0001\u001a\u00020O2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0006J\u0012\u0010\u0001\u001a\u00020O2\u0007\u0010\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0007\u0010\u0001\u001a\u00020\u0006J%\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0007\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u0006J:\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0>0=2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010 \u0001\u001a\u0004\u0018\u00010\u00062\t\u0010¡\u0001\u001a\u0004\u0018\u00010!¢\u0006\u0003\u0010¢\u0001J\u0019\u0010£\u0001\u001a\u00020O2\u0007\u0010¤\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020!J*\u0010¦\u0001\u001a\u00020O2\u0007\u0010§\u0001\u001a\u00020\u00062\u0007\u0010 \u0001\u001a\u00020\u00062\t\u0010¡\u0001\u001a\u0004\u0018\u00010!¢\u0006\u0003\u0010¨\u0001J\u001c\u0010©\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0007\u0010ª\u0001\u001a\u00020ZJ\u001d\u0010«\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\b\u0010¬\u0001\u001a\u00030­\u0001J\u001d\u0010®\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0>0=2\b\u0010¯\u0001\u001a\u00030°\u0001J,\u0010±\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>0=2\u0006\u0010U\u001a\u00020V2\t\u0010²\u0001\u001a\u0004\u0018\u00010n¢\u0006\u0003\u0010³\u0001R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R>\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001c0#j\b\u0012\u0004\u0012\u00020\u001c`$@BX.¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\u0012\u0012\u0004\u0012\u00020)0#j\b\u0012\u0004\u0012\u00020)`$X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008FX\u0002¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b1\u00102R\u001d\u00104\u001a\u0004\u0018\u00010\u001c8BX\u0002¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\b5\u0010\u001fR\u001b\u00107\u001a\u0002088FX\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b9\u0010:¨\u0006´\u0001"}, d2 = {"Lcom/thecoffeehouse/guestapp/OrderManager;", "", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "(Lcom/thecoffeehouse/guestapp/TCHApplication;)V", "DRAFT_ORDER", "", "LATEST_ORDERS", "ORDER_5_STAR_COUNT", "ORDER_LOCAL", "RATED_GOOGLE_PLAY", "RECENT_SEARCH_ADDRESSES", "appExecutors", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "getAppExecutors", "()Lcom/thecoffeehouse/guestapp/AppExecutors;", "appExecutors$delegate", "Lkotlin/properties/ReadOnlyProperty;", "mAvailablePayments", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PaymentsItem;", "getMAvailablePayments", "()Ljava/util/List;", "mAvailablePayments$delegate", "Lkotlin/Lazy;", "mCalculateOrderRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderRequest;", "<set-?>", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "mCalculateOrderResponse", "getMCalculateOrderResponse", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "mInitLatestOrder", "", "mLastedPaymentKey", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mLatestOrders", "getMLatestOrders", "()Ljava/util/ArrayList;", "mRecentSearchAddresses", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "mShippingPayments", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;", "getMShippingPayments", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;", "mShippingPayments$delegate", "orderAPIService", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderAPI;", "getOrderAPIService", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderAPI;", "orderAPIService$delegate", "savedDraftOrder", "getSavedDraftOrder", "savedDraftOrder$delegate", "storeAPIService", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/StoreAPI;", "getStoreAPIService", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/StoreAPI;", "storeAPIService$delegate", "callCalculateOrderToServer", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "cancelOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingResponse;", "ref", "reasonId", "changeShippingMethodToAtTable", "currentAtTableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "changeShippingMethodToDelivery", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "changeShippingMethodToPickUp", "storePickUp", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "clearDraftCart", "Landroidx/lifecycle/MutableLiveData;", "clearDraftOrderInLocal", "", "createOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "createOrderRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderRequest;", "deleteOrderLinesAndCalculateOrder", "orderLine", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "draftIsEmpty", "fillReceiveInfo", "getAllPaymentMethods", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "getAvailablePayments", "getDraftOrder", "getExistedCouponDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponDetailResponse;", Constants.FirelogAnalytics.PARAM_CAMPAIGN_ID, "couponId", "getFavouriteProductIds", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getLatestDeliOrder", "getLatestOrdersFromLocal", "getLatestPickUpOrder", "getOrderTracking", "orderRef", "orderTye", "getOrderedProductIds", "getOrdersHistory", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersHistoryResponse;", "page", "", "limit", "getOrdersProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersProcessingResponse;", "getRecentStoreIds", "getSavedSearchAddresses", "getScheduleTimeOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTimeResponse;", "getShippingInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetShippingInfoResponse;", "orderType", "getTableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetTableInfoResponse;", "tableCode", "increaseRatingOrderCountInLocal", "initDraftOrder", "draftOrder", "initEmptyOrderRequest", "initLatestOrderRequest", "initLatestOrders", "initRecentSearchAddresses", "ratedApp", "ratingAppFlowIsSufficient", "ratingOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "ratingOrderInfoResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;", "ratingOrderInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderInfoResponse;", "type", "removeExistedCouponInCart", "reorder", "resetAllItemsInCart", "resetRatingOrderCount", "saveDraftCart", "saveLatestOrderInformation", "saveLocationLocal", "saveSearchedLocation", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "streetName", "updateCalculateOrderResponse", "item", "updateCoupon", "selectedCoupon", "updateCustomerInfo", "name", "phoneNumber", "updateDeliveryInfoAndCreateOrder", "shippingNote", "billNote", "saveConfirm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Landroidx/lifecycle/LiveData;", "updateFavouriteProductIds", "productId", "isFavourite", "updateNotesAndSaveConfirmOrder", "deliveryNote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "updatePaymentMethodAndCalculateOrder", "payment", "updateScheduleTime", "scheduleTime", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "updateWarningSelectedAndCreateOrder", "selected", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/WarningButton;", "upsertOrderLinesAndCalculateOrder", FirebaseAnalytics.Param.INDEX, "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;Ljava/lang/Integer;)Landroidx/lifecycle/LiveData;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
public final class OrderManager {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderManager.class, "appExecutors", "getAppExecutors()Lcom/thecoffeehouse/guestapp/AppExecutors;", 0))};
    private final String DRAFT_ORDER = "draftOrder";
    private final String LATEST_ORDERS = "latestOrders";
    private final String ORDER_5_STAR_COUNT = "orderFiveStarCount";
    private final String ORDER_LOCAL = "order";
    private final String RATED_GOOGLE_PLAY = "ratedGooglePlay";
    private final String RECENT_SEARCH_ADDRESSES = "recentSearchAddresses";
    private final ReadOnlyProperty appExecutors$delegate = new OrderManager$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private final TCHApplication application;
    private final Lazy mAvailablePayments$delegate = LazyKt.lazy(new OrderManager$mAvailablePayments$2(this));
    private CalculateOrderRequest mCalculateOrderRequest;
    private CalculateOrderResponse mCalculateOrderResponse;
    private boolean mInitLatestOrder;
    private String mLastedPaymentKey;
    private ArrayList<CalculateOrderResponse> mLatestOrders;
    private ArrayList<AddressOrder> mRecentSearchAddresses = new ArrayList<>();
    private final Lazy mShippingPayments$delegate = LazyKt.lazy(new OrderManager$mShippingPayments$2(this));
    private final Lazy orderAPIService$delegate;
    private final Lazy savedDraftOrder$delegate;
    private final Lazy storeAPIService$delegate;

    private final AppExecutors getAppExecutors() {
        return (AppExecutors) this.appExecutors$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final List<PaymentsItem> getMAvailablePayments() {
        return (List) this.mAvailablePayments$delegate.getValue();
    }

    private final ShippingPayment getMShippingPayments() {
        return (ShippingPayment) this.mShippingPayments$delegate.getValue();
    }

    private final CalculateOrderResponse getSavedDraftOrder() {
        return (CalculateOrderResponse) this.savedDraftOrder$delegate.getValue();
    }

    public final OrderAPI getOrderAPIService() {
        return (OrderAPI) this.orderAPIService$delegate.getValue();
    }

    public final StoreAPI getStoreAPIService() {
        return (StoreAPI) this.storeAPIService$delegate.getValue();
    }

    public OrderManager(TCHApplication tCHApplication) {
        CalculateOrderRequest calculateOrderRequest;
        Intrinsics.checkNotNullParameter(tCHApplication, "application");
        this.application = tCHApplication;
        initLatestOrders();
        initRecentSearchAddresses();
        ArrayList<CalculateOrderResponse> arrayList = this.mLatestOrders;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        if (arrayList.isEmpty()) {
            calculateOrderRequest = initEmptyOrderRequest();
        } else {
            calculateOrderRequest = initLatestOrderRequest();
        }
        this.mCalculateOrderRequest = calculateOrderRequest;
        this.mCalculateOrderResponse = new CalculateOrderResponse();
        this.orderAPIService$delegate = LazyKt.lazy(OrderManager$orderAPIService$2.INSTANCE);
        this.storeAPIService$delegate = LazyKt.lazy(OrderManager$storeAPIService$2.INSTANCE);
        this.savedDraftOrder$delegate = LazyKt.lazy(new OrderManager$savedDraftOrder$2(this));
    }

    public static final /* synthetic */ ArrayList access$getMLatestOrders$p(OrderManager orderManager) {
        ArrayList<CalculateOrderResponse> arrayList = orderManager.mLatestOrders;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        return arrayList;
    }

    private final CalculateOrderRequest initLatestOrderRequest() {
        ArrayList<Payment> arrayList;
        Shop shop;
        ArrayList<CalculateOrderResponse> arrayList2 = this.mLatestOrders;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        CalculateOrderResponse calculateOrderResponse = (CalculateOrderResponse) CollectionsKt.first((List) arrayList2);
        CalculateOrderResponse calculateOrderResponse2 = new CalculateOrderResponse();
        Order order = calculateOrderResponse2.getOrder();
        Shop shop2 = null;
        if (order != null) {
            Order order2 = calculateOrderResponse.getOrder();
            order.setShippingType(order2 != null ? order2.getShippingType() : null);
        }
        Order order3 = calculateOrderResponse2.getOrder();
        if (order3 != null) {
            Order order4 = calculateOrderResponse.getOrder();
            order3.setAddressSuggestion(order4 != null ? order4.getAddressSuggestion() : null);
        }
        Order order5 = calculateOrderResponse2.getOrder();
        if (order5 != null) {
            Order order6 = calculateOrderResponse.getOrder();
            order5.setShop(order6 != null ? order6.getShop() : null);
        }
        Unit unit = Unit.INSTANCE;
        this.mCalculateOrderResponse = calculateOrderResponse2;
        CalculateOrderRequest calculateOrderRequest = new CalculateOrderRequest();
        Order order7 = calculateOrderResponse.getOrder();
        if (order7 == null || (arrayList = order7.getPayments()) == null) {
            arrayList = new ArrayList<>();
        }
        calculateOrderRequest.setPayments(arrayList);
        Order order8 = calculateOrderResponse.getOrder();
        calculateOrderRequest.setShippingType(order8 != null ? order8.getShippingType() : null);
        Order order9 = calculateOrderResponse.getOrder();
        calculateOrderRequest.setAddressSuggestion(order9 != null ? order9.getAddressSuggestion() : null);
        Order order10 = calculateOrderResponse.getOrder();
        calculateOrderRequest.setStoreId((order10 == null || (shop = order10.getShop()) == null) ? null : shop.getId());
        Order order11 = calculateOrderResponse.getOrder();
        if (order11 != null) {
            shop2 = order11.getShop();
        }
        calculateOrderRequest.setShop(shop2);
        return calculateOrderRequest;
    }

    private final CalculateOrderRequest initEmptyOrderRequest() {
        CalculateOrderRequest calculateOrderRequest = new CalculateOrderRequest();
        calculateOrderRequest.setPayments(new ArrayList<>());
        calculateOrderRequest.setShippingType(ShippingType.INSTANCE.getDELI());
        AddressSuggestion addressSuggestion = new AddressSuggestion();
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        Phone phone = null;
        addressSuggestion.setName(userProfile != null ? userProfile.getFullName() : null);
        Profile userProfile2 = this.application.requireClientManager().getUserProfile();
        if (userProfile2 != null) {
            phone = userProfile2.getPhone();
        }
        addressSuggestion.setPhone(phone);
        Unit unit = Unit.INSTANCE;
        calculateOrderRequest.setAddressSuggestion(addressSuggestion);
        return calculateOrderRequest;
    }

    public final CalculateOrderResponse getMCalculateOrderResponse() {
        return this.mCalculateOrderResponse;
    }

    public final ArrayList<CalculateOrderResponse> getMLatestOrders() {
        ArrayList<CalculateOrderResponse> arrayList = this.mLatestOrders;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        return arrayList;
    }

    public final LiveData<Resource<CalculateOrderResponse>> callCalculateOrderToServer() {
        fillReceiveInfo();
        return new OrderManager$callCalculateOrderToServer$1(this, getAppExecutors()).asLiveData();
    }

    private final void fillReceiveInfo() {
        AddressSuggestion addressSuggestion;
        Phone phone;
        AddressSuggestion addressSuggestion2;
        AddressSuggestion addressSuggestion3 = this.mCalculateOrderRequest.getAddressSuggestion();
        Phone phone2 = null;
        String name = addressSuggestion3 != null ? addressSuggestion3.getName() : null;
        boolean z = false;
        if ((name == null || name.length() == 0) && (addressSuggestion2 = this.mCalculateOrderRequest.getAddressSuggestion()) != null) {
            Profile userProfile = this.application.requireClientManager().getUserProfile();
            addressSuggestion2.setName(userProfile != null ? userProfile.getFullName() : null);
        }
        AddressSuggestion addressSuggestion4 = this.mCalculateOrderRequest.getAddressSuggestion();
        String phoneNumber = (addressSuggestion4 == null || (phone = addressSuggestion4.getPhone()) == null) ? null : phone.getPhoneNumber();
        if (phoneNumber == null || phoneNumber.length() == 0) {
            z = true;
        }
        if (z && (addressSuggestion = this.mCalculateOrderRequest.getAddressSuggestion()) != null) {
            Profile userProfile2 = this.application.requireClientManager().getUserProfile();
            if (userProfile2 != null) {
                phone2 = userProfile2.getPhone();
            }
            addressSuggestion.setPhone(phone2);
        }
    }

    /* access modifiers changed from: private */
    public final void updateCalculateOrderResponse(CalculateOrderResponse calculateOrderResponse) {
        ArrayList<Payment> payments;
        Payment payment;
        Order order;
        ArrayList<OrderLine> orderLines;
        this.mCalculateOrderRequest.getOrderLines().clear();
        Order order2 = calculateOrderResponse.getOrder();
        if (!(order2 == null || (orderLines = order2.getOrderLines()) == null)) {
            this.mCalculateOrderRequest.getOrderLines().addAll(orderLines);
        }
        CalculateOrderRequest calculateOrderRequest = this.mCalculateOrderRequest;
        Order order3 = calculateOrderResponse.getOrder();
        calculateOrderRequest.setCouponCode(order3 != null ? order3.getCouponCode() : null);
        CalculateOrderResponse calculateOrderResponse2 = this.mCalculateOrderResponse;
        if (calculateOrderResponse2 != null) {
            calculateOrderResponse2.setOrder(calculateOrderResponse.getOrder());
        }
        CalculateOrderResponse calculateOrderResponse3 = this.mCalculateOrderResponse;
        if (calculateOrderResponse3 != null) {
            calculateOrderResponse3.setProblems(calculateOrderResponse.getProblems());
        }
        CalculateOrderResponse calculateOrderResponse4 = this.mCalculateOrderResponse;
        if (!(calculateOrderResponse4 == null || (order = calculateOrderResponse4.getOrder()) == null)) {
            order.setSwitchSaveAddress(this.mCalculateOrderRequest.getSwitchSaveAddress());
        }
        Order order4 = calculateOrderResponse.getOrder();
        if (order4 != null && (payments = order4.getPayments()) != null && (payment = (Payment) CollectionsKt.firstOrNull((List) payments)) != null) {
            this.mLastedPaymentKey = payment.getMethod();
        }
    }

    public final LiveData<Resource<GetOrderTrackingResponse>> cancelOrder(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(str2, "reasonId");
        CancelOrderRequest cancelOrderRequest = new CancelOrderRequest();
        cancelOrderRequest.setRef(str);
        cancelOrderRequest.setReasonId(str2);
        return new OrderManager$cancelOrder$1(this, cancelOrderRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<CalculateOrderResponse>> changeShippingMethodToDelivery(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
        boolean z = true;
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventShippingChangedSuccessfully.name, new TrackingData(ShippingMethodEvents.EventShippingChangedSuccessfully.Param.oldShippingMethod, TrackingEventService.Companion.getValueTracking(ShippingMethodEvents.EventShippingChangedSuccessfully.name, ShippingMethodEvents.EventShippingChangedSuccessfully.Param.newShippingMethod)));
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewMenu.name, new TrackingData(OrderEvents.EventViewMenu.Param.defaultShippingMethod, "Deli"));
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewMenu.name, new TrackingData(OrderEvents.EventViewMenu.Param.itemsInCart, Integer.valueOf(this.mCalculateOrderRequest.getOrderLines().size())));
        this.mCalculateOrderRequest.setShippingType(ShippingType.INSTANCE.getDELI());
        this.mCalculateOrderRequest.setAddressSuggestion(addressSuggestion);
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventShippingChangedSuccessfully.name, new TrackingData(ShippingMethodEvents.EventShippingChangedSuccessfully.Param.newShippingMethod, ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(this.mCalculateOrderRequest.getShippingType())));
        ArrayList<OrderLine> orderLines = this.mCalculateOrderRequest.getOrderLines();
        if (orderLines != null && !orderLines.isEmpty()) {
            z = false;
        }
        if (z) {
            return AbsentLiveData.Companion.create();
        }
        return callCalculateOrderToServer();
    }

    public final LiveData<Resource<CalculateOrderResponse>> changeShippingMethodToPickUp(Store store) {
        String str;
        AddressSuggestion addressSuggestion;
        AddressSuggestion addressSuggestion2;
        Address address;
        Address address2;
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventShippingChangedSuccessfully.name, new TrackingData(ShippingMethodEvents.EventShippingChangedSuccessfully.Param.oldShippingMethod, TrackingEventService.Companion.getValueTracking(ShippingMethodEvents.EventShippingChangedSuccessfully.name, ShippingMethodEvents.EventShippingChangedSuccessfully.Param.newShippingMethod)));
        this.mCalculateOrderRequest.setShippingType(ShippingType.INSTANCE.getPICKUP());
        Phone phone = null;
        this.mCalculateOrderRequest.setStoreId(store != null ? store.getId() : null);
        CalculateOrderRequest calculateOrderRequest = this.mCalculateOrderRequest;
        Shop shop = new Shop();
        shop.setName(store != null ? store.getName() : null);
        AddressOrder addressOrder = new AddressOrder();
        if (store == null || (str = store.getFullAddress()) == null) {
            str = (store == null || (address2 = store.getAddress()) == null) ? null : address2.getFullAddress();
        }
        if (str == null) {
            str = (store == null || (address = store.getAddress()) == null) ? null : address.getStreet();
        }
        if (str == null) {
            str = "";
        }
        addressOrder.setStreet(str);
        Unit unit = Unit.INSTANCE;
        shop.setAddress(addressOrder);
        Unit unit2 = Unit.INSTANCE;
        calculateOrderRequest.setShop(shop);
        AddressSuggestion addressSuggestion3 = this.mCalculateOrderRequest.getAddressSuggestion();
        if ((addressSuggestion3 != null ? addressSuggestion3.getName() : null) == null && (addressSuggestion2 = this.mCalculateOrderRequest.getAddressSuggestion()) != null) {
            Profile userProfile = this.application.requireClientManager().getUserProfile();
            addressSuggestion2.setName(userProfile != null ? userProfile.getFullName() : null);
        }
        AddressSuggestion addressSuggestion4 = this.mCalculateOrderRequest.getAddressSuggestion();
        if ((addressSuggestion4 != null ? addressSuggestion4.getPhone() : null) == null && (addressSuggestion = this.mCalculateOrderRequest.getAddressSuggestion()) != null) {
            Profile userProfile2 = this.application.requireClientManager().getUserProfile();
            if (userProfile2 != null) {
                phone = userProfile2.getPhone();
            }
            addressSuggestion.setPhone(phone);
        }
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventShippingChangedSuccessfully.name, new TrackingData(ShippingMethodEvents.EventShippingChangedSuccessfully.Param.newShippingMethod, ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(this.mCalculateOrderRequest.getShippingType())));
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewMenu.name, new TrackingData(OrderEvents.EventViewMenu.Param.defaultShippingMethod, "Pickup"));
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewMenu.name, new TrackingData(OrderEvents.EventViewMenu.Param.itemsInCart, Integer.valueOf(this.mCalculateOrderRequest.getOrderLines().size())));
        if (this.mCalculateOrderRequest.getOrderLines().isEmpty()) {
            return AbsentLiveData.Companion.create();
        }
        return callCalculateOrderToServer();
    }

    public final LiveData<Resource<CalculateOrderResponse>> changeShippingMethodToAtTable(TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(tableInfo, "currentAtTableInfo");
        this.mCalculateOrderRequest.setShippingType(ShippingType.INSTANCE.getTABLE());
        this.mCalculateOrderRequest.setStoreId(tableInfo.getStoreId());
        this.mCalculateOrderRequest.setTableCode(tableInfo.getTableCode());
        if (this.mCalculateOrderRequest.getOrderLines().isEmpty()) {
            return AbsentLiveData.Companion.create();
        }
        return callCalculateOrderToServer();
    }

    public final void clearDraftOrderInLocal() {
        SharePrefs sharePrefs = SharePrefs.INSTANCE;
        TCHApplication tCHApplication = this.application;
        String str = this.ORDER_LOCAL;
        StringBuilder append = new StringBuilder().append(this.DRAFT_ORDER);
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        sharePrefs.putString(tCHApplication, str, append.append(userProfile != null ? userProfile.getBarcode() : null).toString(), (String) null);
    }

    public final LiveData<Resource<CalculateOrderResponse>> deleteOrderLinesAndCalculateOrder(OrderLine orderLine) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLine");
        if (!(!this.mCalculateOrderRequest.getOrderLines().isEmpty())) {
            return AbsentLiveData.Companion.create();
        }
        if (this.mCalculateOrderRequest.getOrderLines().size() <= 1) {
            return clearDraftCart();
        }
        GeneralKt.log("remove ordeline: " + orderLine.getQuantity() + ' ' + orderLine.getNote());
        int i = 0;
        int i2 = 0;
        for (T t : this.mCalculateOrderRequest.getOrderLines()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            GeneralKt.log(i2 + " ordeline: " + t2.getQuantity() + ' ' + t2.getNote());
            i2 = i3;
        }
        Iterator<OrderLine> it = this.mCalculateOrderRequest.getOrderLines().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getUniqueId(), orderLine.getUniqueId())) {
                break;
            } else {
                i++;
            }
        }
        GeneralKt.log("removedPositionOrderLine: " + i);
        if (i >= 0) {
            this.mCalculateOrderRequest.getOrderLines().remove(i);
        }
        return callCalculateOrderToServer();
    }

    public final MutableLiveData<Resource<CalculateOrderResponse>> clearDraftCart() {
        resetAllItemsInCart();
        MutableLiveData<Resource<CalculateOrderResponse>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new Resource<>(Status.SUCCESS, this.mCalculateOrderResponse, null));
        return mutableLiveData;
    }

    private final void resetAllItemsInCart() {
        Order order;
        Order order2;
        ArrayList<Payment> payments;
        Order order3;
        ArrayList<OrderLine> orderLines;
        this.mCalculateOrderRequest.getOrderLines().clear();
        String str = null;
        this.mCalculateOrderRequest.setCouponCode(str);
        CalculateOrderResponse calculateOrderResponse = this.mCalculateOrderResponse;
        if (!(calculateOrderResponse == null || (order3 = calculateOrderResponse.getOrder()) == null || (orderLines = order3.getOrderLines()) == null)) {
            orderLines.clear();
        }
        CalculateOrderResponse calculateOrderResponse2 = this.mCalculateOrderResponse;
        if (!(calculateOrderResponse2 == null || (order2 = calculateOrderResponse2.getOrder()) == null || (payments = order2.getPayments()) == null)) {
            payments.clear();
        }
        CalculateOrderResponse calculateOrderResponse3 = this.mCalculateOrderResponse;
        if (!(calculateOrderResponse3 == null || (order = calculateOrderResponse3.getOrder()) == null)) {
            order.setCouponCode(str);
        }
        CalculateOrderResponse calculateOrderResponse4 = this.mCalculateOrderResponse;
        if (calculateOrderResponse4 != null) {
            calculateOrderResponse4.setProblems(null);
        }
    }

    public final ArrayList<Payment> getAvailablePayments() {
        Order order;
        ArrayList<Payment> arrayList = new ArrayList<>();
        CalculateOrderResponse calculateOrderResponse = this.mCalculateOrderResponse;
        String shippingType = (calculateOrderResponse == null || (order = calculateOrderResponse.getOrder()) == null) ? null : order.getShippingType();
        if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP())) {
            for (T t : getMAvailablePayments()) {
                List<String> pickup = getMShippingPayments().getPickup();
                if (pickup != null && pickup.contains(t.getMethod())) {
                    Payment payment = new Payment();
                    payment.setText(t.getText());
                    payment.setMethod(t.getMethod());
                    payment.setImage(t.getImage());
                    Unit unit = Unit.INSTANCE;
                    arrayList.add(payment);
                }
            }
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
            for (T t2 : getMAvailablePayments()) {
                List<String> deli = getMShippingPayments().getDeli();
                if (deli != null && deli.contains(t2.getMethod())) {
                    Payment payment2 = new Payment();
                    payment2.setText(t2.getText());
                    payment2.setMethod(t2.getMethod());
                    payment2.setImage(t2.getImage());
                    Unit unit2 = Unit.INSTANCE;
                    arrayList.add(payment2);
                }
            }
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
            for (T t3 : getMAvailablePayments()) {
                List<String> table = getMShippingPayments().getTable();
                if (table != null && table.contains(t3.getMethod())) {
                    Payment payment3 = new Payment();
                    payment3.setText(t3.getText());
                    payment3.setMethod(t3.getMethod());
                    payment3.setImage(t3.getImage());
                    Unit unit3 = Unit.INSTANCE;
                    arrayList.add(payment3);
                }
            }
        } else {
            for (T t4 : getMAvailablePayments()) {
                Payment payment4 = new Payment();
                payment4.setText(t4.getText());
                payment4.setMethod(t4.getMethod());
                payment4.setImage(t4.getImage());
                Unit unit4 = Unit.INSTANCE;
                arrayList.add(payment4);
            }
        }
        return arrayList;
    }

    public final CalculateOrderResponse getDraftOrder() {
        return getSavedDraftOrder();
    }

    /* access modifiers changed from: private */
    public final CalculateOrderResponse initDraftOrder(String str) {
        ArrayList<OrderLine> arrayList;
        ArrayList<Payment> arrayList2;
        try {
            CalculateOrderResponse calculateOrderResponse = (CalculateOrderResponse) new Gson().fromJson(str, CalculateOrderResponse.class);
            if (!(calculateOrderResponse == null || calculateOrderResponse.getOrder() == null)) {
                CalculateOrderRequest calculateOrderRequest = this.mCalculateOrderRequest;
                Order order = calculateOrderResponse.getOrder();
                String src = order != null ? order.getSrc() : null;
                Intrinsics.checkNotNull(src);
                calculateOrderRequest.setSrc(src);
                CalculateOrderRequest calculateOrderRequest2 = this.mCalculateOrderRequest;
                Order order2 = calculateOrderResponse.getOrder();
                calculateOrderRequest2.setShippingType(order2 != null ? order2.getShippingType() : null);
                CalculateOrderRequest calculateOrderRequest3 = this.mCalculateOrderRequest;
                Order order3 = calculateOrderResponse.getOrder();
                calculateOrderRequest3.setAddressSuggestion(order3 != null ? order3.getAddressSuggestion() : null);
                CalculateOrderRequest calculateOrderRequest4 = this.mCalculateOrderRequest;
                Order order4 = calculateOrderResponse.getOrder();
                calculateOrderRequest4.setCouponCode(order4 != null ? order4.getCouponCode() : null);
                CalculateOrderRequest calculateOrderRequest5 = this.mCalculateOrderRequest;
                Order order5 = calculateOrderResponse.getOrder();
                if (order5 == null || (arrayList = order5.getOrderLines()) == null) {
                    arrayList = new ArrayList<>();
                }
                calculateOrderRequest5.setOrderLines(arrayList);
                CalculateOrderRequest calculateOrderRequest6 = this.mCalculateOrderRequest;
                Order order6 = calculateOrderResponse.getOrder();
                if (order6 == null || (arrayList2 = order6.getPayments()) == null) {
                    arrayList2 = new ArrayList<>();
                }
                calculateOrderRequest6.setPayments(arrayList2);
                CalculateOrderRequest calculateOrderRequest7 = this.mCalculateOrderRequest;
                Order order7 = calculateOrderResponse.getOrder();
                calculateOrderRequest7.setStoreId(order7 != null ? order7.getStoreId() : null);
                CalculateOrderRequest calculateOrderRequest8 = this.mCalculateOrderRequest;
                Order order8 = calculateOrderResponse.getOrder();
                calculateOrderRequest8.setLocationStore(order8 != null ? order8.getLocationStore() : null);
                CalculateOrderRequest calculateOrderRequest9 = this.mCalculateOrderRequest;
                Order order9 = calculateOrderResponse.getOrder();
                calculateOrderRequest9.setShop(order9 != null ? order9.getShop() : null);
                this.mCalculateOrderResponse = calculateOrderResponse;
            }
            return calculateOrderResponse;
        } catch (Exception unused) {
            return null;
        }
    }

    public final LiveData<Resource<CouponDetailResponse>> getExistedCouponDetail(String str, String str2) {
        CouponDetailRequest couponDetailRequest = new CouponDetailRequest();
        couponDetailRequest.setCampaignId(str);
        couponDetailRequest.setBarcode(str2);
        return new OrderManager$getExistedCouponDetail$1(this, str2, couponDetailRequest, getAppExecutors()).asLiveData();
    }

    public final HashSet<String> getFavouriteProductIds() {
        return this.application.requireClientManager().getUserConfigurations().getFavouriteProductIds();
    }

    public final void updateFavouriteProductIds(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "productId");
        if (z) {
            this.application.requireClientManager().getUserConfigurations().getFavouriteProductIds().add(str);
        } else {
            this.application.requireClientManager().getUserConfigurations().getFavouriteProductIds().remove(str);
        }
    }

    public final CalculateOrderResponse getLatestDeliOrder() {
        String str;
        initLatestOrders();
        ArrayList<CalculateOrderResponse> arrayList = this.mLatestOrders;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Order order = next.getOrder();
            if (order != null) {
                str = order.getShippingType();
            }
            if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
                str = next;
                break;
            }
        }
        return (CalculateOrderResponse) str;
    }

    public final CalculateOrderResponse getLatestPickUpOrder() {
        String str;
        initLatestOrders();
        ArrayList<CalculateOrderResponse> arrayList = this.mLatestOrders;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Order order = next.getOrder();
            if (order != null) {
                str = order.getShippingType();
            }
            if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
                str = next;
                break;
            }
        }
        return (CalculateOrderResponse) str;
    }

    public static /* synthetic */ LiveData getOrderTracking$default(OrderManager orderManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return orderManager.getOrderTracking(str, str2);
    }

    public final LiveData<Resource<GetOrderTrackingResponse>> getOrderTracking(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "orderRef");
        GetOrderTrackingRequest getOrderTrackingRequest = new GetOrderTrackingRequest();
        getOrderTrackingRequest.setRef(str);
        getOrderTrackingRequest.setOrderType(str2);
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        getOrderTrackingRequest.setUserRank(userProfile != null ? Integer.valueOf(userProfile.getRankId()) : null);
        return new OrderManager$getOrderTracking$1(this, getOrderTrackingRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetOrdersHistoryResponse>> getOrdersHistory(int i, int i2) {
        OrderHistoryRequest orderHistoryRequest = new OrderHistoryRequest();
        orderHistoryRequest.setPage(i);
        orderHistoryRequest.setLimit(i2);
        return new OrderManager$getOrdersHistory$1(this, orderHistoryRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetOrdersProcessingResponse>> getOrdersProcessing() {
        OrderProcessingRequest orderProcessingRequest = new OrderProcessingRequest();
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        orderProcessingRequest.setProcessing(userProfile != null ? userProfile.getRankId() : 1);
        return new OrderManager$getOrdersProcessing$1(this, orderProcessingRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetOrderTimeResponse>> getScheduleTimeOrder() {
        return new OrderManager$getScheduleTimeOrder$1(this, Intrinsics.areEqual(this.mCalculateOrderRequest.getShippingType(), ShippingType.INSTANCE.getPICKUP()) ? this.mCalculateOrderRequest.getStoreId() : null, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<ServerErrorResponse>> ratingOrder(DataRatingOrderInfo dataRatingOrderInfo) {
        Intrinsics.checkNotNullParameter(dataRatingOrderInfo, "ratingOrderInfoResponse");
        return new OrderManager$ratingOrder$1(this, dataRatingOrderInfo, getAppExecutors()).asLiveData();
    }

    /* access modifiers changed from: private */
    public final void resetRatingOrderCount() {
        SharePrefs.INSTANCE.putInt(this.application, this.ORDER_LOCAL, this.ORDER_5_STAR_COUNT, 0);
    }

    /* access modifiers changed from: private */
    public final void increaseRatingOrderCountInLocal() {
        Integer num = SharePrefs.INSTANCE.getInt(this.application, this.ORDER_LOCAL, this.ORDER_5_STAR_COUNT);
        int intValue = (num != null ? num.intValue() : 0) + 1;
        SharePrefs.INSTANCE.putInt(this.application, this.ORDER_LOCAL, this.ORDER_5_STAR_COUNT, intValue);
        GeneralKt.log("fiveStarOrderCount: " + intValue);
    }

    public final LiveData<Resource<CalculateOrderResponse>> removeExistedCouponInCart() {
        this.mCalculateOrderRequest.setCouponCode(null);
        return callCalculateOrderToServer();
    }

    public final void saveDraftCart() {
        if (draftIsEmpty()) {
            GeneralKt.log("clear draft");
            clearDraftOrderInLocal();
            return;
        }
        GeneralKt.log("save draft");
        String json = new Gson().toJson(this.mCalculateOrderResponse);
        SharePrefs sharePrefs = SharePrefs.INSTANCE;
        TCHApplication tCHApplication = this.application;
        String str = this.ORDER_LOCAL;
        StringBuilder append = new StringBuilder().append(this.DRAFT_ORDER);
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        sharePrefs.putString(tCHApplication, str, append.append(userProfile != null ? userProfile.getBarcode() : null).toString(), json);
    }

    private final boolean draftIsEmpty() {
        Order order;
        ArrayList<OrderLine> orderLines;
        CalculateOrderResponse calculateOrderResponse = this.mCalculateOrderResponse;
        if (calculateOrderResponse == null || (order = calculateOrderResponse.getOrder()) == null || (orderLines = order.getOrderLines()) == null) {
            return false;
        }
        ArrayList<OrderLine> arrayList = orderLines;
        return arrayList == null || arrayList.isEmpty();
    }

    public final LiveData<Resource<CalculateOrderResponse>> updateCoupon(String str) {
        Intrinsics.checkNotNullParameter(str, "selectedCoupon");
        this.mCalculateOrderRequest.setCouponCode(str);
        return callCalculateOrderToServer();
    }

    public final LiveData<Resource<CreateOrderResponse>> updateDeliveryInfoAndCreateOrder(String str, String str2, Boolean bool) {
        AddressSuggestion addressSuggestion = this.mCalculateOrderRequest.getAddressSuggestion();
        if (addressSuggestion != null) {
            addressSuggestion.setNote(str);
        }
        AddressSuggestion addressSuggestion2 = this.mCalculateOrderRequest.getAddressSuggestion();
        if (addressSuggestion2 != null) {
            addressSuggestion2.setSaveConfirm(bool);
        }
        this.mCalculateOrderRequest.setNote(str2);
        CreateOrderRequest createOrderRequest = new CreateOrderRequest();
        createOrderRequest.setSrc(this.mCalculateOrderRequest.getSrc());
        createOrderRequest.setShippingType(this.mCalculateOrderRequest.getShippingType());
        createOrderRequest.setAddressSuggestion(this.mCalculateOrderRequest.getAddressSuggestion());
        createOrderRequest.setCouponCode(this.mCalculateOrderRequest.getCouponCode());
        createOrderRequest.setNote(this.mCalculateOrderRequest.getNote());
        createOrderRequest.setOrderLines(this.mCalculateOrderRequest.getOrderLines());
        createOrderRequest.setPayments(this.mCalculateOrderRequest.getPayments());
        createOrderRequest.setStoreId(this.mCalculateOrderRequest.getStoreId());
        createOrderRequest.setScheduleTime(this.mCalculateOrderRequest.getScheduleTime());
        createOrderRequest.setTableCode(this.mCalculateOrderRequest.getTableCode());
        return createOrder(createOrderRequest);
    }

    public final LiveData<Resource<CalculateOrderResponse>> updatePaymentMethodAndCalculateOrder(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.mCalculateOrderRequest.getPayments().clear();
        this.mCalculateOrderRequest.getPayments().add(payment);
        return callCalculateOrderToServer();
    }

    public final LiveData<Resource<CalculateOrderResponse>> updateScheduleTime(ScheduleTime scheduleTime) {
        Intrinsics.checkNotNullParameter(scheduleTime, "scheduleTime");
        this.mCalculateOrderRequest.setScheduleTime(scheduleTime);
        return callCalculateOrderToServer();
    }

    public final LiveData<Resource<CalculateOrderResponse>> upsertOrderLinesAndCalculateOrder(OrderLine orderLine, Integer num) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLine");
        if (num == null) {
            this.mCalculateOrderRequest.getOrderLines().add(orderLine);
        } else if (num.intValue() <= CollectionsKt.getLastIndex(this.mCalculateOrderRequest.getOrderLines())) {
            this.mCalculateOrderRequest.getOrderLines().set(num.intValue(), orderLine);
        }
        return callCalculateOrderToServer();
    }

    private final LiveData<Resource<CreateOrderResponse>> createOrder(CreateOrderRequest createOrderRequest) {
        Activity currentActivity = this.application.getCurrentActivity();
        if (!(currentActivity instanceof MainActivity)) {
            currentActivity = null;
        }
        MainActivity mainActivity = (MainActivity) currentActivity;
        if (mainActivity != null) {
            createOrderRequest.setDynamicLink(mainActivity.getDynamicLink());
        }
        createOrderRequest.setReOrder(Boolean.valueOf(this.mCalculateOrderRequest.getReorder()));
        return new OrderManager$createOrder$2(this, createOrderRequest, getAppExecutors()).asLiveData();
    }

    private final ArrayList<CalculateOrderResponse> getLatestOrdersFromLocal() {
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        String string = SharePrefs.INSTANCE.getString(this.application, this.ORDER_LOCAL, this.LATEST_ORDERS + (userProfile != null ? userProfile.getBarcode() : null));
        String str = string;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            }
            if (!z) {
                try {
                    Object fromJson = new Gson().fromJson(string, new OrderManager$getLatestOrdersFromLocal$1().getType());
                    Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\n       …{}.type\n                )");
                    return (ArrayList) fromJson;
                } catch (Exception e) {
                    e.printStackTrace();
                    return new ArrayList<>();
                }
            }
        }
        return new ArrayList<>();
    }

    private final void initRecentSearchAddresses() {
        String str = this.RECENT_SEARCH_ADDRESSES;
        String string = SharePrefs.INSTANCE.getString(this.application, str, str);
        String str2 = string;
        boolean z = false;
        if (!(str2 == null || str2.length() == 0)) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            }
            if (!z) {
                try {
                    Object fromJson = new Gson().fromJson(string, new OrderManager$initRecentSearchAddresses$1().getType());
                    Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\n       …{}.type\n                )");
                    this.mRecentSearchAddresses = (ArrayList) fromJson;
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        this.mRecentSearchAddresses = new ArrayList<>();
    }

    private final void initLatestOrders() {
        if (!this.mInitLatestOrder) {
            this.mLatestOrders = getLatestOrdersFromLocal();
            this.mInitLatestOrder = true;
        }
    }

    /* access modifiers changed from: private */
    public final void saveLatestOrderInformation() {
        ArrayList<CalculateOrderResponse> arrayList = this.mLatestOrders;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        if (arrayList.size() >= 10) {
            ArrayList<CalculateOrderResponse> arrayList2 = this.mLatestOrders;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
            }
            ArrayList<CalculateOrderResponse> arrayList3 = this.mLatestOrders;
            if (arrayList3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
            }
            arrayList2.remove(CollectionsKt.getLastIndex(arrayList3));
        }
        CalculateOrderResponse calculateOrderResponse = this.mCalculateOrderResponse;
        if (calculateOrderResponse != null) {
            CalculateOrderResponse calculateOrderResponse2 = (CalculateOrderResponse) new Gson().fromJson(new Gson().toJson(calculateOrderResponse), CalculateOrderResponse.class);
            ArrayList<CalculateOrderResponse> arrayList4 = this.mLatestOrders;
            if (arrayList4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
            }
            arrayList4.add(0, calculateOrderResponse2);
        }
        getAppExecutors().getDiskIO().execute(new OrderManager$saveLatestOrderInformation$2(this));
    }

    public final List<String> getOrderedProductIds() {
        ArrayList<OrderLine> arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<CalculateOrderResponse> arrayList3 = this.mLatestOrders;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLatestOrders");
        }
        ArrayList<CalculateOrderResponse> arrayList4 = new ArrayList();
        for (T t : arrayList3) {
            if (t.getOrder() != null) {
                arrayList4.add(t);
            }
        }
        ArrayList<OrderLine> arrayList5 = new ArrayList();
        for (CalculateOrderResponse calculateOrderResponse : arrayList4) {
            Order order = calculateOrderResponse.getOrder();
            if (order == null || (arrayList = order.getOrderLines()) == null) {
                arrayList = new ArrayList<>();
            }
            CollectionsKt.addAll(arrayList5, arrayList);
        }
        for (OrderLine orderLine : arrayList5) {
            String id = orderLine.getId();
            if (id != null) {
                arrayList2.add(id);
            }
        }
        return arrayList2;
    }

    public final boolean ratingAppFlowIsSufficient() {
        Integer num;
        if (SharePrefs.INSTANCE.getBoolean(this.application, this.ORDER_LOCAL, this.RATED_GOOGLE_PLAY) || (num = SharePrefs.INSTANCE.getInt(this.application, this.ORDER_LOCAL, this.ORDER_5_STAR_COUNT)) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final void ratedApp() {
        SharePrefs.INSTANCE.putBoolean(this.application, this.ORDER_LOCAL, this.RATED_GOOGLE_PLAY, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0016 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Integer> getRecentStoreIds() {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.OrderManager.getRecentStoreIds():java.util.List");
    }

    public final LiveData<Resource<CalculateOrderResponse>> reorder(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        resetAllItemsInCart();
        return new OrderManager$reorder$1(this, new ReorderRequest(str, str2), getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<CalculateOrderResponse>> updateCustomerInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        AddressSuggestion addressSuggestion = this.mCalculateOrderRequest.getAddressSuggestion();
        if (addressSuggestion != null) {
            addressSuggestion.setName(str);
            Phone phone = addressSuggestion.getPhone();
            if (phone != null) {
                phone.setPhoneNumber(str2);
            }
        }
        return callCalculateOrderToServer();
    }

    public final void updateNotesAndSaveConfirmOrder(String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "deliveryNote");
        Intrinsics.checkNotNullParameter(str2, "billNote");
        AddressSuggestion addressSuggestion = this.mCalculateOrderRequest.getAddressSuggestion();
        if (addressSuggestion != null) {
            addressSuggestion.setNote(str);
        }
        this.mCalculateOrderRequest.setSwitchSaveAddress(bool);
        this.mCalculateOrderRequest.setNote(str2);
    }

    public final LiveData<Resource<GetShippingInfoResponse>> getShippingInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "orderRef");
        GetShippingInfoRequest getShippingInfoRequest = new GetShippingInfoRequest();
        getShippingInfoRequest.setRef(str);
        getShippingInfoRequest.setOrderType(str2);
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        getShippingInfoRequest.setUserRank(userProfile != null ? Integer.valueOf(userProfile.getRankId()) : null);
        return new OrderManager$getShippingInfo$1(this, getShippingInfoRequest, getAppExecutors()).asLiveData();
    }

    public final ArrayList<AddressOrder> getSavedSearchAddresses() {
        return this.mRecentSearchAddresses;
    }

    public final void saveSearchedLocation(LatLng latLng, String str) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(str, "streetName");
        this.mRecentSearchAddresses.add(0, new AddressOrder(latLng.latitude, latLng.longitude, str));
        if (this.mRecentSearchAddresses.size() > 10) {
            CollectionsKt.removeLastOrNull(this.mRecentSearchAddresses);
        }
    }

    public final void saveLocationLocal() {
        String json = new Gson().toJson(this.mRecentSearchAddresses);
        String str = this.RECENT_SEARCH_ADDRESSES;
        SharePrefs.INSTANCE.putString(this.application, str, str, json);
    }

    public final LiveData<Resource<CreateOrderResponse>> updateWarningSelectedAndCreateOrder(WarningButton warningButton) {
        Intrinsics.checkNotNullParameter(warningButton, "selected");
        CreateOrderRequest createOrderRequest = new CreateOrderRequest();
        createOrderRequest.setSrc(this.mCalculateOrderRequest.getSrc());
        createOrderRequest.setShippingType(this.mCalculateOrderRequest.getShippingType());
        createOrderRequest.setAddressSuggestion(this.mCalculateOrderRequest.getAddressSuggestion());
        createOrderRequest.setCouponCode(this.mCalculateOrderRequest.getCouponCode());
        createOrderRequest.setOrderLines(this.mCalculateOrderRequest.getOrderLines());
        createOrderRequest.setPayments(this.mCalculateOrderRequest.getPayments());
        createOrderRequest.setStoreId(this.mCalculateOrderRequest.getStoreId());
        createOrderRequest.setNote(this.mCalculateOrderRequest.getNote());
        createOrderRequest.setScheduleTime(this.mCalculateOrderRequest.getScheduleTime());
        createOrderRequest.setWarningSelected(warningButton);
        createOrderRequest.setTableCode(this.mCalculateOrderRequest.getTableCode());
        return createOrder(createOrderRequest);
    }

    public final ArrayList<Payment> getAllPaymentMethods() {
        ArrayList<Payment> arrayList = new ArrayList<>();
        for (T t : getMAvailablePayments()) {
            Payment payment = new Payment();
            payment.setText(t.getText());
            payment.setMethod(t.getMethod());
            payment.setImage(t.getImage());
            Unit unit = Unit.INSTANCE;
            arrayList.add(payment);
        }
        return arrayList;
    }

    public final LiveData<Resource<GetTableInfoResponse>> getTableInfo(String str) {
        GetTableInfoRequest getTableInfoRequest = new GetTableInfoRequest();
        getTableInfoRequest.setTableCode(str);
        return new OrderManager$getTableInfo$1(this, getTableInfoRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<RatingOrderInfoResponse>> ratingOrderInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        GetOrderTrackingRequest getOrderTrackingRequest = new GetOrderTrackingRequest();
        getOrderTrackingRequest.setRef(str);
        getOrderTrackingRequest.setOrderType(str2);
        Profile userProfile = this.application.requireClientManager().getUserProfile();
        getOrderTrackingRequest.setUserRank(userProfile != null ? Integer.valueOf(userProfile.getRankId()) : null);
        return new OrderManager$ratingOrderInfo$1(this, getOrderTrackingRequest, getAppExecutors()).asLiveData();
    }
}
