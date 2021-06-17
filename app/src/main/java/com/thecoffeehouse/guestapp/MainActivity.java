package com.thecoffeehouse.guestapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.messaging.Constants;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.TabMoreEvents;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.screens.base.BaseActivity;
import com.thecoffeehouse.guestapp.screens.home.HomeFragment;
import com.thecoffeehouse.guestapp.screens.login.LoginActivity;
import com.thecoffeehouse.guestapp.screens.main.CardDialogAdapter;
import com.thecoffeehouse.guestapp.screens.main.MainViewModel;
import com.thecoffeehouse.guestapp.screens.main.MainViewModelFactory;
import com.thecoffeehouse.guestapp.screens.more.MoreFragment;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationViewModel;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderDialogFragment;
import com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers.RewardsAndCouponsFragment;
import com.thecoffeehouse.guestapp.screens.stores.StoresFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.ButtonsItem;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationPayload;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Popup;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vn.zalopay.sdk.ZaloPaySDK;
import vn.zalopay.sdk.responses.PaymentResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Ð\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Ð\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010G\u001a\u00020;2\u0006\u0010H\u001a\u00020\u0015H\u0002J\u001a\u0010I\u001a\u00020;2\u0006\u0010H\u001a\u00020\u00152\b\b\u0002\u0010J\u001a\u00020\u0013H\u0002J\u0006\u0010K\u001a\u00020;J\u0006\u0010L\u001a\u00020;J\u0018\u0010M\u001a\u00020;2\u0006\u0010H\u001a\u00020\u00152\u0006\u0010N\u001a\u00020OH\u0002J*\u0010P\u001a\u00020;2\"\u0010Q\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0Rj\b\u0012\u0004\u0012\u00020\u000e`S\u0012\u0004\u0012\u00020;0:J\u0010\u0010T\u001a\u00020;2\u0006\u0010H\u001a\u00020\u0015H\u0002J\u0010\u0010U\u001a\u00020;2\u0006\u0010V\u001a\u00020WH\u0002J\u0006\u0010X\u001a\u00020;J\b\u0010Y\u001a\u00020;H\u0002J\u0010\u0010Z\u001a\u00020;2\u0006\u0010V\u001a\u00020\u000eH\u0002J\u0012\u0010[\u001a\u0004\u0018\u00010\u000e2\b\u0010\\\u001a\u0004\u0018\u00010\u000eJ&\u0010\f\u001a\u00020;2\b\u0010]\u001a\u0004\u0018\u00010^2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020;0:H\u0002J5\u0010`\u001a\u00020;2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010b2\u001a\u0010_\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020;0cH\u0007¢\u0006\u0002\u0010dJ\u001c\u0010e\u001a\u00020;2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020;0:H\u0002J\b\u0010f\u001a\u00020\u0005H\u0016J\u001a\u0010g\u001a\u00020;2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020;0:J\b\u0010h\u001a\u00020iH\u0016J\u001c\u0010j\u001a\u00020\u00132\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130lH\u0002J\b\u0010m\u001a\u00020;H\u0002J\u000e\u0010n\u001a\u00020;2\u0006\u0010o\u001a\u00020pJ\u0010\u0010q\u001a\u00020;2\u0006\u0010V\u001a\u00020\u000eH\u0002J\b\u0010r\u001a\u00020;H\u0003J\b\u0010s\u001a\u00020;H\u0002J\u0010\u0010t\u001a\u00020;2\u0006\u0010u\u001a\u00020\u0015H\u0002J\b\u0010v\u001a\u00020;H\u0014J\u0010\u0010w\u001a\u00020\u00132\u0006\u0010u\u001a\u00020\u0015H\u0002J\b\u0010x\u001a\u00020\u0013H\u0002J\u0006\u0010y\u001a\u00020\u0013J\b\u0010z\u001a\u00020;H\u0002J\b\u0010{\u001a\u00020;H\u0002J\b\u0010|\u001a\u00020;H\u0014J\u0010\u0010}\u001a\u00020;2\u0006\u0010~\u001a\u00020WH\u0002J\u0011\u0010\u001a\u00020;2\t\b\u0001\u0010\u0001\u001a\u00020\u0005J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010~\u001a\u00020WJ\u0013\u0010\u0001\u001a\u00020;2\b\u0010~\u001a\u0004\u0018\u00010WH\u0002J\u0013\u0010\u0001\u001a\u00020;2\b\u0010~\u001a\u0004\u0018\u00010WH\u0002J\t\u0010\u0001\u001a\u00020;H\u0014J'\u0010\u0001\u001a\u00020;2\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00052\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J\t\u0010\u0001\u001a\u00020;H\u0016J\t\u0010\u0001\u001a\u00020;H\u0014J\u0015\u0010\u0001\u001a\u00020;2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J\t\u0010\u0001\u001a\u00020;H\u0014J\u0013\u0010\u0001\u001a\u00020;2\b\u0010\u0001\u001a\u00030\u0001H\u0014J\t\u0010\u0001\u001a\u00020;H\u0014J\u001f\u0010\u0001\u001a\u00020;2\t\u0010\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0001\u001a\u0004\u0018\u00010\u000eH\u0002J\u0013\u0010\u0001\u001a\u00020;2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0007\u0010\u0001\u001a\u00020;J\u001d\u0010\u0001\u001a\u00020;2\t\u0010\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u0001\u001a\u00020\u0013H\u0002J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010V\u001a\u00020\u000eJ$\u0010\u0001\u001a\u00020;2\u0019\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020;0cH\u0002J\t\u0010 \u0001\u001a\u00020;H\u0002J\t\u0010¡\u0001\u001a\u00020;H\u0002J\t\u0010¢\u0001\u001a\u00020;H\u0014J\u0007\u0010£\u0001\u001a\u00020;J\"\u0010¤\u0001\u001a\u00020;2\u0019\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020;0cJ\u0007\u0010¥\u0001\u001a\u00020;J\u0007\u0010¦\u0001\u001a\u00020;J\u0007\u0010§\u0001\u001a\u00020;J\u001c\u0010¨\u0001\u001a\u00020;2\u0013\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020;0:J\u001b\u0010ª\u0001\u001a\u00020;2\u0007\u0010«\u0001\u001a\u00020\u000e2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u000eJ\t\u0010­\u0001\u001a\u00020;H\u0016J.\u0010®\u0001\u001a\u00020;2\u0007\u0010¯\u0001\u001a\u00020\u000e2\t\u0010°\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0003\u0010²\u0001J'\u0010³\u0001\u001a\u00020;2\u0016\u0010´\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030¶\u00010µ\u0001\"\u00030¶\u0001H\u0002¢\u0006\u0003\u0010·\u0001J\u0013\u0010¸\u0001\u001a\u00020;2\b\u0010´\u0001\u001a\u00030¶\u0001H\u0002J\t\u0010¹\u0001\u001a\u00020;H\u0002J\t\u0010º\u0001\u001a\u00020;H\u0002J\t\u0010»\u0001\u001a\u00020;H\u0002J$\u0010¼\u0001\u001a\u00020;2\u0019\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020;0cH\u0002J\t\u0010½\u0001\u001a\u00020;H\u0002J\t\u0010¾\u0001\u001a\u00020;H\u0002J\u0010\u0010¿\u0001\u001a\u00020;2\u0007\u0010À\u0001\u001a\u00020\u000eJ\u001c\u0010Á\u0001\u001a\u00020;2\u0007\u0010À\u0001\u001a\u00020\u000e2\b\u0010Â\u0001\u001a\u00030Ã\u0001H\u0002J\u001a\u0010Ä\u0001\u001a\u00020;2\u0007\u0010À\u0001\u001a\u00020\u000e2\b\u0010Â\u0001\u001a\u00030Ã\u0001J\u0013\u0010Å\u0001\u001a\u00020;2\b\u0010~\u001a\u0004\u0018\u00010WH\u0002J\u0015\u0010Æ\u0001\u001a\u00020;2\n\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u0001H\u0002J\u0013\u0010É\u0001\u001a\u00020;2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0015\u0010Ê\u0001\u001a\u00020;2\n\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u0001H\u0002J3\u0010Í\u0001\u001a\u00020;2\u0007\u0010Î\u0001\u001a\u00020\u000e2\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\n2\n\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u00012\n\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u0001R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010#R\u0010\u0010%\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8FX\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b0\u00101R\u0010\u00103\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u00104\u001a\u0002058FX\u0002¢\u0006\f\n\u0004\b8\u0010\u001e\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020;0:X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010<\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b@\u0010\u001e\u001a\u0004\b>\u0010?R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020DX\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F¨\u0006Ñ\u0001"}, d2 = {"Lcom/thecoffeehouse/guestapp/MainActivity;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity;", "Lcom/thecoffeehouse/guestapp/screens/main/MainViewModel;", "()V", "LOCATION_REQUEST_CODE", "", "LOGIN_REQUEST_CODE", "getLOGIN_REQUEST_CODE", "()I", "<set-?>", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "addressSuggestion", "getAddressSuggestion", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "dynamicLink", "getDynamicLink", "()Ljava/lang/String;", "isAlreadyRequestPermissionEnable", "", "mActiveFragment", "Landroidx/fragment/app/Fragment;", "mAddCouponBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "mCurrentBottomNavigationItemId", "mHomeFragment", "Lcom/thecoffeehouse/guestapp/screens/home/HomeFragment;", "getMHomeFragment", "()Lcom/thecoffeehouse/guestapp/screens/home/HomeFragment;", "mHomeFragment$delegate", "Lkotlin/Lazy;", "mLayoutMain", "mMoreFragment", "Lcom/thecoffeehouse/guestapp/screens/more/MoreFragment;", "getMMoreFragment", "()Lcom/thecoffeehouse/guestapp/screens/more/MoreFragment;", "mMoreFragment$delegate", "mNotificationBroadcast", "mObserveGetBanner", "Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/media/GetBannerResponse;", "mOrderFragment", "Lcom/thecoffeehouse/guestapp/screens/order/OrderFragment;", "getMOrderFragment", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderFragment;", "mOrderFragment$delegate", "mRewardsAndCouponsFragment", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/RewardsAndCouponsFragment;", "getMRewardsAndCouponsFragment", "()Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/RewardsAndCouponsFragment;", "mRewardsAndCouponsFragment$delegate", "mSilentNotificationBroadcast", "mStoresFragment", "Lcom/thecoffeehouse/guestapp/screens/stores/StoresFragment;", "getMStoresFragment", "()Lcom/thecoffeehouse/guestapp/screens/stores/StoresFragment;", "mStoresFragment$delegate", "onLoginCallBackListener", "Lkotlin/Function1;", "", "pickLocationViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "getPickLocationViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "pickLocationViewModel$delegate", "popupWindow", "Landroid/widget/PopupWindow;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "addFragmentsToContainers", "fragment", "animateFragmentAnimation", "isForceAnimate", "animateSlideDownMainTabLayout", "animateSlideUpMainTabLayout", "animateTransitionFragments", "animation", "Landroid/view/animation/Animation;", "availableShippingMethods", "onAvailable", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "changeActiveFragment", "checkSettingAccessTrade", "deepLink", "Landroid/net/Uri;", "clearMyLocation", "dismissAllDialogFragments", "dismissDialogsAndNavigate", "extractTableCodeInDeepLink", "deepLinkTableCode", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "onCompleted", "getCurrentLocationListener", "threadHoldDistanceInMeters", "", "Lkotlin/Function2;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "getDefaultLocation", "getLayoutResId", "getMyAddress", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "grantedLocationPermissions", "result", "", "handleAppLinks", "handleNotificationPayload", "notificationPayload", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/NotificationPayload;", "handleSilentPush", "initDummyMapView", "initLayoutHeader", "initMainNavigationBottom", "activeFragment", "initViews", "isAddedFragmentToContainer", "isEnableLocationService", "isGrantedLocationPermission", "listenBottomNavigationOnClick", "listenMainHeaderCardOnClick", "listenViews", "navigateInAppByDeepLink", "url", "navigateTab", "tabId", "navigateTabOrderWithMethod", "navigateTabRewardsAndVouchers", "navigateTabStore", "observeViewModel", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onDestroy", "onNewIntent", "intent", "onPause", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "openCouponDetail", "couponCode", Constants.FirelogAnalytics.PARAM_CAMPAIGN_ID, "openNotificationBottomSheet", "popup", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;", "openSettingsApp", "openWebViewDialog", "urlNews", "fullScreen", "parseDeepLink", "performRequestPermission", "onRequestSuccess", "registerNotificationBroadcast", "registerReceiveAddCoupon", "registersAndCallsBackground", "reloadHomeFragment", "requestLocationPermissionRuntimeListener", "resetDynamicLink", "rotateHeaderIconDown", "rotateHeaderIconUp", "runFlowLogin", "isSuccess", "runFlowReorder", "ref", "orderType", "saveStateViewModelWhenProcessIsKilled", "selectShippingMethod", FirebaseAnalytics.Param.METHOD, "storeId", "tableCode", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "setVisibilityGoneLayouts", "fragmentContainer", "", "Landroid/widget/FrameLayout;", "([Landroid/widget/FrameLayout;)V", "setVisibilityShowLayout", "showEnableServiceAlertDialog", "showMainHeader", "showMemberCardDialog", "showOpenSettingDialog", "showOrderHeader", "showPopupUpdateOrderAtTable", "showPopupWarningDraftCart", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "showPopupWindowLeftTopAnchor", "anchorView", "Landroid/view/View;", "showPopupWindowRightTopAnchor", "switchTabInRewardsAndVouchers", "updateHeaderOrderByAtTable", "tableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "updateHeaderOrderByDeli", "updateHeaderOrderByPickup", "pickUpInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "updateHeaderShippingMethod", "currentMethod", "deliveryInfo", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity extends BaseActivity<MainViewModel> {
    public static final String ACTION_NOTIFICATION = "action_notification";
    public static final int AIRPAY_REQUEST_CODE = 100;
    public static final Companion Companion = new Companion(null);
    public static final String INTENT_NOTIFICATION = "intent_notification";
    public static final String SILENT_NOTIFICATION = "silent_notification";
    public static final String hostDeepLink = "https://order.thecoffeehouse.com";
    private final int LOCATION_REQUEST_CODE = 99;
    private final int LOGIN_REQUEST_CODE = 403;
    private HashMap _$_findViewCache;
    private AddressSuggestion addressSuggestion;
    private String dynamicLink;
    private boolean isAlreadyRequestPermissionEnable;
    private Fragment mActiveFragment;
    private BroadcastReceiver mAddCouponBroadcastReceiver;
    private int mCurrentBottomNavigationItemId = -1;
    private final Lazy mHomeFragment$delegate = LazyKt.lazy(MainActivity$mHomeFragment$2.INSTANCE);
    private int mLayoutMain;
    private final Lazy mMoreFragment$delegate = LazyKt.lazy(MainActivity$mMoreFragment$2.INSTANCE);
    private BroadcastReceiver mNotificationBroadcast;
    private final BaseActivity<MainViewModel>.ObserverBaseResource mObserveGetBanner = new BaseActivity.ObserverBaseResource<>(this, new MainActivity$mObserveGetBanner$1(this), null, 2, null);
    private final Lazy mOrderFragment$delegate = LazyKt.lazy(MainActivity$mOrderFragment$2.INSTANCE);
    private final Lazy mRewardsAndCouponsFragment$delegate = LazyKt.lazy(MainActivity$mRewardsAndCouponsFragment$2.INSTANCE);
    private BroadcastReceiver mSilentNotificationBroadcast;
    private final Lazy mStoresFragment$delegate = LazyKt.lazy(MainActivity$mStoresFragment$2.INSTANCE);
    private Function1<? super Boolean, Unit> onLoginCallBackListener = MainActivity$onLoginCallBackListener$1.INSTANCE;
    private final Lazy pickLocationViewModel$delegate = LazyKt.lazy(new MainActivity$pickLocationViewModel$2(this));
    private PopupWindow popupWindow;
    private final Class<MainViewModel> viewModelClass = MainViewModel.class;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
        }
    }

    /* access modifiers changed from: private */
    public final HomeFragment getMHomeFragment() {
        return (HomeFragment) this.mHomeFragment$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final MoreFragment getMMoreFragment() {
        return (MoreFragment) this.mMoreFragment$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final RewardsAndCouponsFragment getMRewardsAndCouponsFragment() {
        return (RewardsAndCouponsFragment) this.mRewardsAndCouponsFragment$delegate.getValue();
    }

    private final PickLocationViewModel getPickLocationViewModel() {
        return (PickLocationViewModel) this.pickLocationViewModel$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
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

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    public final OrderFragment getMOrderFragment() {
        return (OrderFragment) this.mOrderFragment$delegate.getValue();
    }

    public final StoresFragment getMStoresFragment() {
        return (StoresFragment) this.mStoresFragment$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void saveStateViewModelWhenProcessIsKilled() {
    }

    public final AddressSuggestion getAddressSuggestion() {
        return this.addressSuggestion;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public Class<MainViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    public final String getDynamicLink() {
        return this.dynamicLink;
    }

    public final int getLOGIN_REQUEST_CODE() {
        return this.LOGIN_REQUEST_CODE;
    }

    public final void getMyAddress(Function1<? super AddressSuggestion, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onCompleted");
        AddressSuggestion addressSuggestion2 = this.addressSuggestion;
        if (addressSuggestion2 != null) {
            Intrinsics.checkNotNull(addressSuggestion2);
            function1.invoke(addressSuggestion2);
            return;
        }
        getCurrentLocationListener$default(this, null, new MainActivity$getMyAddress$1(this, function1), 1, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        GeneralKt.log("onNewIntent");
        ZaloPaySDK.getInstance().onResult(intent);
        if (intent != null && (data = intent.getData()) != null) {
            String uri = data.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "it.toString()");
            parseDeepLink(uri);
            Intrinsics.checkNotNullExpressionValue(data, "it");
            checkSettingAccessTrade(data);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public ViewModelProvider.Factory getViewModelFactory() {
        return new MainViewModelFactory(this, null, 2, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        unregisterReceiver(this.mNotificationBroadcast);
        unregisterReceiver(this.mSilentNotificationBroadcast);
        unregisterReceiver(this.mAddCouponBroadcastReceiver);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void observeViewModel() {
        super.observeViewModel();
        ((MainViewModel) getViewModel()).getBanner().observe(this, this.mObserveGetBanner);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void listenViews() {
        NotificationPayload notificationPayload;
        super.listenViews();
        listenBottomNavigationOnClick();
        listenMainHeaderCardOnClick();
        if (getIntent().hasExtra(INTENT_NOTIFICATION) && (notificationPayload = (NotificationPayload) getIntent().getParcelableExtra(INTENT_NOTIFICATION)) != null) {
            handleNotificationPayload(notificationPayload);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        if (intent.getData() != null) {
            GeneralKt.log("listenViews");
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Uri data = intent2.getData();
            GeneralKt.log("deepLink: " + String.valueOf(data));
            parseDeepLink(String.valueOf(data));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        registerNotificationBroadcast();
        registerReceiveAddCoupon();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void initViews() {
        super.initViews();
        initDummyMapView();
        initLayoutHeader();
        initMainNavigationBottom(getMHomeFragment());
    }

    private final void initDummyMapView() {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) this);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "fusedLocationClient");
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new MainActivity$initDummyMapView$1(this, fusedLocationProviderClient)).addOnFailureListener(new MainActivity$initDummyMapView$2(this));
    }

    private final void initLayoutHeader() {
        getTCHApplication().m0getMetadata().observe(this, new MainActivity$initLayoutHeader$$inlined$apply$lambda$1(_$_findCachedViewById(R.id.layout_main_header), this));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout, 0, new MainActivity$initLayoutHeader$2(this), 1, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void registersAndCallsBackground() {
        super.registersAndCallsBackground();
    }

    public final void animateSlideDownMainTabLayout() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ViewParent parent = _$_findCachedViewById.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new Fade(1));
        Unit unit = Unit.INSTANCE;
        TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
        ViewExtsKt.marginTop(_$_findCachedViewById2, 0);
    }

    public final void animateSlideUpMainTabLayout() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        this.mLayoutMain = _$_findCachedViewById.getHeight();
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
        ViewParent parent = _$_findCachedViewById2.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new Fade(1));
        Unit unit = Unit.INSTANCE;
        TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_main_header");
        ViewExtsKt.marginTop(_$_findCachedViewById3, -this.mLayoutMain);
    }

    public final void handleNotificationPayload(NotificationPayload notificationPayload) {
        Intrinsics.checkNotNullParameter(notificationPayload, "notificationPayload");
        if (notificationPayload.getPopup() != null) {
            Popup popup = notificationPayload.getPopup();
            Intrinsics.checkNotNull(popup);
            openNotificationBottomSheet(popup);
            return;
        }
        String deeplink = notificationPayload.getDeeplink();
        if (deeplink != null) {
            dismissDialogsAndNavigate(deeplink);
        }
    }

    public final void navigateTabOrderWithMethod(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "url");
        BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
        if (bottomNavigationView.getSelectedItemId() != R.id.navigation_order) {
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView2, "bottom_navigation");
            bottomNavigationView2.setSelectedItemId(R.id.navigation_order);
        }
        try {
            String queryParameter = uri.getQueryParameter(FirebaseAnalytics.Param.METHOD);
            String queryParameter2 = uri.getQueryParameter("sid");
            Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
            String queryParameter3 = uri.getQueryParameter(PaymentResponse.RETURN_CODE);
            GeneralKt.log("method: " + queryParameter);
            GeneralKt.log("storeId: " + intOrNull);
            GeneralKt.log("tableCode: " + queryParameter3);
            if (queryParameter != null) {
                selectShippingMethod(queryParameter, intOrNull, queryParameter3);
            }
        } catch (Exception e) {
            e.printStackTrace();
            GeneralKt.log(Unit.INSTANCE);
            getSupportFragmentManager().registerFragmentLifecycleCallbacks(new MainActivity$navigateTabOrderWithMethod$2(this, uri), false);
        }
    }

    private final void navigateTabRewardsAndVouchers(Uri uri) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
        if (bottomNavigationView.getSelectedItemId() != R.id.navigation_rewards) {
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView2, "bottom_navigation");
            bottomNavigationView2.setSelectedItemId(R.id.navigation_rewards);
        }
        new Handler().postDelayed(new MainActivity$navigateTabRewardsAndVouchers$1(this, uri), 300);
    }

    public static /* synthetic */ void getCurrentLocationListener$default(MainActivity mainActivity, Long l, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        mainActivity.getCurrentLocationListener(l, function2);
    }

    public final void getCurrentLocationListener(Long l, Function2<? super AddressSuggestion, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "onCompleted");
        if (isGrantedLocationPermission()) {
            if (isEnableLocationService()) {
                try {
                    FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) this);
                    Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "fusedLocation");
                    Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new MainActivity$getCurrentLocationListener$1(this, l, function2)).addOnFailureListener(new MainActivity$getCurrentLocationListener$2(this, function2)), "fusedLocation.lastLocati…  }\n                    }");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (!this.isAlreadyRequestPermissionEnable) {
                showEnableServiceAlertDialog();
            } else {
                getDefaultLocation(new MainActivity$getCurrentLocationListener$3(this, function2));
            }
        } else if (getTCHApplication().requireClientManager().isLoggedIn()) {
            GeneralKt.log("loggin but not access location");
            getAddressSuggestion(null, new MainActivity$getCurrentLocationListener$4(this, function2));
        } else {
            getDefaultLocation(new MainActivity$getCurrentLocationListener$5(this, function2));
        }
    }

    /* access modifiers changed from: private */
    public final void getAddressSuggestion(LatLng latLng, Function1<? super AddressSuggestion, Unit> function1) {
        getPickLocationViewModel().suggestAddress(latLng != null ? new LocationStore(latLng.latitude, latLng.longitude) : null).observe(this, new BaseActivity.ObserverBaseResource(this, new MainActivity$getAddressSuggestion$1(this, function1), new MainActivity$getAddressSuggestion$2(this, function1)));
    }

    /* access modifiers changed from: private */
    public final boolean isEnableLocationService() {
        Object systemService = getSystemService(FirebaseAnalytics.Param.LOCATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return LocationManagerCompat.isLocationEnabled((LocationManager) systemService);
    }

    /* access modifiers changed from: private */
    public final void showEnableServiceAlertDialog() {
        LocationRequest create = LocationRequest.create();
        Intrinsics.checkNotNullExpressionValue(create, "locationRequest");
        create.setPriority(100);
        create.setInterval(1000);
        create.setFastestInterval(500);
        LocationSettingsRequest build = new LocationSettingsRequest.Builder().addLocationRequest(create).setAlwaysShow(true).build();
        GoogleApiClient build2 = new GoogleApiClient.Builder(this).addApi(LocationServices.API).addConnectionCallbacks(new MainActivity$showEnableServiceAlertDialog$googleApiClient$1()).build();
        build2.connect();
        LocationServices.SettingsApi.checkLocationSettings(build2, build).setResultCallback(new MainActivity$showEnableServiceAlertDialog$1(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        List<Fragment> fragments = supportFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
        if (i == this.LOCATION_REQUEST_CODE) {
            this.isAlreadyRequestPermissionEnable = true;
            if (i2 == -1) {
                GeneralKt.log("turned on");
                BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
                Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
                bottomNavigationView.setSelectedItemId(this.mCurrentBottomNavigationItemId);
            } else if (i2 == 0) {
                GeneralKt.log("canceled");
                ((MainViewModel) getViewModel()).getDefaultLocation(new MainActivity$onActivityResult$2(this));
            }
        }
        if (i != this.LOGIN_REQUEST_CODE) {
            return;
        }
        if (i2 != -1) {
            this.onLoginCallBackListener.invoke(false);
            return;
        }
        this.onLoginCallBackListener.invoke(true);
        getCurrentLocationListener$default(this, null, new MainActivity$onActivityResult$3(this), 1, null);
    }

    public final void requestLocationPermissionRuntimeListener(Function2<? super Boolean, ? super AddressSuggestion, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "onRequestSuccess");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            getCurrentLocationListener$default(this, null, new MainActivity$requestLocationPermissionRuntimeListener$1(function2), 1, null);
        } else if (!shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION") || !shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION")) {
            performRequestPermission(function2);
        } else {
            showOpenSettingDialog(function2);
        }
    }

    private final void showOpenSettingDialog(Function2<? super Boolean, ? super AddressSuggestion, Unit> function2) {
        if (this.addressSuggestion != null) {
            Boolean valueOf = Boolean.valueOf(isGrantedLocationPermission());
            AddressSuggestion addressSuggestion2 = this.addressSuggestion;
            Intrinsics.checkNotNull(addressSuggestion2);
            function2.invoke(valueOf, addressSuggestion2);
        } else {
            getDefaultLocation(new MainActivity$showOpenSettingDialog$1(this, function2));
        }
        this.isAlreadyRequestPermissionEnable = true;
        new AlertDialog.Builder(this).setTitle(getString(R.string.open_location_settings)).setMessage(getString(R.string.str_access_location_permission)).setNegativeButton(getString(R.string.str_cancel), MainActivity$showOpenSettingDialog$2.INSTANCE).setPositiveButton(getString(R.string.str_go_to_setting), new MainActivity$showOpenSettingDialog$3(this)).show();
    }

    public final void openSettingsApp() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    private final void performRequestPermission(Function2<? super Boolean, ? super AddressSuggestion, Unit> function2) {
        GeneralKt.log("request location now");
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new MainActivity$performRequestPermission$requestPermissions$1(this, function2));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…}\n            }\n        }");
        registerForActivityResult.launch(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    public final boolean isGrantedLocationPermission() {
        return ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* access modifiers changed from: private */
    public final void getDefaultLocation(Function1<? super AddressSuggestion, Unit> function1) {
        ((MainViewModel) getViewModel()).getDefaultLocation(new MainActivity$getDefaultLocation$1(function1));
    }

    /* access modifiers changed from: private */
    public final void addFragmentsToContainers(Fragment fragment) {
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            String simpleName = fragment.getClass().getSimpleName();
            if (Intrinsics.areEqual(simpleName, HomeFragment.class.getSimpleName())) {
                supportFragmentManager.beginTransaction().add(R.id.fragment_home_container, fragment, fragment.getClass().getSimpleName()).commitNow();
            } else if (Intrinsics.areEqual(simpleName, OrderFragment.class.getSimpleName())) {
                supportFragmentManager.beginTransaction().add(R.id.fragment_order_container, fragment, fragment.getClass().getSimpleName()).commitNow();
            } else if (Intrinsics.areEqual(simpleName, StoresFragment.class.getSimpleName())) {
                supportFragmentManager.beginTransaction().add(R.id.fragment_stores_container, fragment, fragment.getClass().getSimpleName()).commitNow();
            } else if (Intrinsics.areEqual(simpleName, RewardsAndCouponsFragment.class.getSimpleName())) {
                supportFragmentManager.beginTransaction().add(R.id.fragment_rewards_container, fragment, fragment.getClass().getSimpleName()).commitNow();
            } else if (Intrinsics.areEqual(simpleName, MoreFragment.class.getSimpleName())) {
                supportFragmentManager.beginTransaction().add(R.id.fragment_more_container, fragment, fragment.getClass().getSimpleName()).commitNow();
            }
        } catch (Exception e) {
            e.printStackTrace();
            GeneralKt.log(Unit.INSTANCE);
        }
    }

    static /* synthetic */ void animateFragmentAnimation$default(MainActivity mainActivity, Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        mainActivity.animateFragmentAnimation(fragment, z);
    }

    private final void animateFragmentAnimation(Fragment fragment, boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.activity_fade_in);
        if (z) {
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "animation");
            animateTransitionFragments(fragment, loadAnimation);
            return;
        }
        Fragment fragment2 = this.mActiveFragment;
        if (fragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActiveFragment");
        }
        if (!Intrinsics.areEqual(fragment2, fragment)) {
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "animation");
            animateTransitionFragments(fragment, loadAnimation);
        }
    }

    private final void animateTransitionFragments(Fragment fragment, Animation animation) {
        if (Intrinsics.areEqual(fragment, getMHomeFragment())) {
            ((FragmentContainerView) _$_findCachedViewById(R.id.fragment_home_container)).bringToFront();
            ((FragmentContainerView) _$_findCachedViewById(R.id.fragment_home_container)).startAnimation(animation);
        } else if (Intrinsics.areEqual(fragment, getMOrderFragment())) {
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_order_container)).bringToFront();
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_order_container)).startAnimation(animation);
        } else if (Intrinsics.areEqual(fragment, getMStoresFragment())) {
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_stores_container)).bringToFront();
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_stores_container)).startAnimation(animation);
        } else if (Intrinsics.areEqual(fragment, getMRewardsAndCouponsFragment())) {
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_rewards_container)).bringToFront();
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_rewards_container)).startAnimation(animation);
        } else if (Intrinsics.areEqual(fragment, getMMoreFragment())) {
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_more_container)).bringToFront();
            ((FrameLayout) _$_findCachedViewById(R.id.fragment_more_container)).startAnimation(animation);
        }
        animation.setAnimationListener(new MainActivity$animateTransitionFragments$1(this, fragment));
    }

    /* access modifiers changed from: private */
    public final void changeActiveFragment(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(fragment.getClass().getSimpleName());
        if (!(findFragmentByTag != null ? findFragmentByTag.isAdded() : false)) {
            addFragmentsToContainers(fragment);
        }
        animateFragmentAnimation$default(this, fragment, false, 2, null);
        this.mActiveFragment = fragment;
    }

    private final void dismissAllDialogFragments() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        List<Fragment> fragments = supportFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
        for (Fragment fragment : fragments) {
            if (fragment instanceof BaseFullScreenDialogFragment) {
                ((BaseFullScreenDialogFragment) fragment).dismiss();
            }
            if (fragment instanceof BaseBottomSheetDialogFragment) {
                ((BaseBottomSheetDialogFragment) fragment).dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void dismissDialogsAndNavigate(String str) {
        parseDeepLink(str);
    }

    /* access modifiers changed from: private */
    public final boolean grantedLocationPermissions(Map<String, Boolean> map) {
        return Intrinsics.areEqual(map.get("android.permission.ACCESS_FINE_LOCATION"), true) && Intrinsics.areEqual(map.get("android.permission.ACCESS_FINE_LOCATION"), true);
    }

    private final void handleAppLinks() {
        MainActivity mainActivity = this;
        FirebaseDynamicLinks.getInstance().getDynamicLink(getIntent()).addOnSuccessListener(mainActivity, new MainActivity$handleAppLinks$1(this)).addOnFailureListener(mainActivity, MainActivity$handleAppLinks$2.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final void checkSettingAccessTrade(Uri uri) {
        if (uri.getQueryParameter("link") != null) {
            this.dynamicLink = uri.getQueryParameter("link");
        } else if (uri.getQueryParameter("utm_source") != null) {
            this.dynamicLink = uri.toString();
        }
    }

    private final void initMainNavigationBottom(Fragment fragment) {
        this.mActiveFragment = fragment;
        if (!isAddedFragmentToContainer(fragment)) {
            addFragmentsToContainers(fragment);
        }
        getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        String simpleName = fragment.getClass().getSimpleName();
        if (Intrinsics.areEqual(simpleName, HomeFragment.class.getSimpleName())) {
            BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
            bottomNavigationView.setSelectedItemId(R.id.navigation_home);
        } else if (Intrinsics.areEqual(simpleName, OrderFragment.class.getSimpleName())) {
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView2, "bottom_navigation");
            bottomNavigationView2.setSelectedItemId(R.id.navigation_order);
        } else if (Intrinsics.areEqual(simpleName, StoresFragment.class.getSimpleName())) {
            BottomNavigationView bottomNavigationView3 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView3, "bottom_navigation");
            bottomNavigationView3.setSelectedItemId(R.id.navigation_stores);
        } else if (Intrinsics.areEqual(simpleName, RewardsAndCouponsFragment.class.getSimpleName())) {
            BottomNavigationView bottomNavigationView4 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView4, "bottom_navigation");
            bottomNavigationView4.setSelectedItemId(R.id.navigation_rewards);
        } else if (Intrinsics.areEqual(simpleName, MoreFragment.class.getSimpleName())) {
            BottomNavigationView bottomNavigationView5 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView5, "bottom_navigation");
            bottomNavigationView5.setSelectedItemId(R.id.navigation_more);
        }
    }

    /* access modifiers changed from: private */
    public final boolean isAddedFragmentToContainer(Fragment fragment) {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(fragment.getClass().getSimpleName());
        if (findFragmentByTag != null) {
            return findFragmentByTag.isAdded();
        }
        return false;
    }

    private final void listenBottomNavigationOnClick() {
        ((BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation)).setOnNavigationItemSelectedListener(new MainActivity$listenBottomNavigationOnClick$1(this));
    }

    /* access modifiers changed from: private */
    public final void showMainHeader() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_banner);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_banner");
        constraintLayout.setVisibility(0);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById2.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_main_header.layout_header_order");
        constraintLayout2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void showOrderHeader() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_banner);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_banner");
        constraintLayout.setVisibility(8);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById2.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_main_header.layout_header_order");
        constraintLayout2.setVisibility(0);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
        if (bottomNavigationView.getSelectedItemId() != R.id.navigation_home) {
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView2, "bottom_navigation");
            bottomNavigationView2.setSelectedItemId(R.id.navigation_home);
            return;
        }
        super.onBackPressed();
    }

    private final void listenMainHeaderCardOnClick() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ImageView imageView = (ImageView) _$_findCachedViewById.findViewById(R.id.img_member_card);
        Intrinsics.checkNotNullExpressionValue(imageView, "layout_main_header.img_member_card");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new MainActivity$listenMainHeaderCardOnClick$1(this), 1, null);
    }

    private final void navigateTabStore(Uri uri) {
        String queryParameter = uri != null ? uri.getQueryParameter("id") : null;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
        if (bottomNavigationView.getSelectedItemId() != R.id.navigation_stores) {
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
            Intrinsics.checkNotNullExpressionValue(bottomNavigationView2, "bottom_navigation");
            bottomNavigationView2.setSelectedItemId(R.id.navigation_stores);
        }
        GeneralKt.log("storeId: " + queryParameter);
        getMStoresFragment().setOnInitViewDone(new MainActivity$navigateTabStore$1(this, queryParameter));
    }

    /* access modifiers changed from: private */
    public final void openNotificationBottomSheet(Popup popup) {
        MainActivity mainActivity = this;
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(mainActivity, R.style.AppBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.layout_noti_bottom_sheet, (ViewGroup) null, false);
        bottomSheetDialog.setContentView(inflate);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutNotificationBottomSheet");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_noti_title);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutNotificationBottomSheet.txt_noti_title");
        textView.setText(popup.getTitle());
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_noti_description);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutNotificationBottomSheet.txt_noti_description");
        textView2.setText(popup.getContent());
        Glide.with(getApplicationContext()).load(popup.getImage()).into((TLImageView) inflate.findViewById(R.id.img_background)).onLoadFailed(ContextCompat.getDrawable(getApplicationContext(), R.drawable.img_background_detail_subscription));
        List<ButtonsItem> buttons = popup.getButtons();
        if (buttons != null) {
            int i = 0;
            for (T t : buttons) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                View inflate2 = LayoutInflater.from(mainActivity).inflate(R.layout.button_notification, (ViewGroup) null, false);
                Objects.requireNonNull(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) inflate2;
                textView3.setText(t2.getText());
                TextView textView4 = textView3;
                ContextExtsKt.setOnSafeClickListener$default(textView4, 0, new MainActivity$openNotificationBottomSheet$$inlined$forEachIndexed$lambda$1(t2, this, bottomSheetDialog, inflate), 1, null);
                ((LinearLayout) inflate.findViewById(R.id.layout_buttons)).addView(textView4);
                ViewExtsKt.marginBottom(textView4, ViewExtsKt.DPtoPX(12.0f));
                i = i2;
            }
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.img_close);
        Intrinsics.checkNotNullExpressionValue(imageView, "layoutNotificationBottomSheet.img_close");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new MainActivity$openNotificationBottomSheet$2(bottomSheetDialog), 1, null);
        bottomSheetDialog.show();
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior, "notificationBottomSheetDialog.behavior");
        behavior.setState(3);
        BottomSheetBehavior<FrameLayout> behavior2 = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior2, "notificationBottomSheetDialog.behavior");
        behavior2.setFitToContents(true);
        BottomSheetBehavior<FrameLayout> behavior3 = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior3, "notificationBottomSheetDialog.behavior");
        behavior3.setSkipCollapsed(true);
        BottomSheetBehavior<FrameLayout> behavior4 = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior4, "notificationBottomSheetDialog.behavior");
        behavior4.setHideable(true);
        BottomSheetBehavior<FrameLayout> behavior5 = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior5, "notificationBottomSheetDialog.behavior");
        behavior5.setHalfExpandedRatio(1.0E-7f);
        bottomSheetDialog.getBehavior().addBottomSheetCallback(new MainActivity$openNotificationBottomSheet$3(bottomSheetDialog));
        TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.Notif_Detail, R.layout.layout_noti_bottom_sheet);
    }

    public final void parseDeepLink(String str) {
        Intrinsics.checkNotNullParameter(str, "deepLink");
        Uri parse = Uri.parse(str);
        StringBuilder append = new StringBuilder().append("url.path: ");
        Intrinsics.checkNotNullExpressionValue(parse, "url");
        GeneralKt.log(append.append(parse.getPathSegments()).toString());
        GeneralKt.log("url.host:" + parse.getHost());
        GeneralKt.log("url.query:" + parse.getQuery());
        GeneralKt.log("url.queryParameterNames: " + parse.getQueryParameterNames());
        String host = parse.getHost();
        if (host != null) {
            switch (host.hashCode()) {
                case -1414111927:
                    if (host.equals("guestapp")) {
                        String queryParameter = parse.getQueryParameter(PaymentResponse.RETURN_CODE);
                        boolean contains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "hr_api", false, 2, (Object) null);
                        if (queryParameter == null || !contains$default) {
                            navigateInAppByDeepLink(parse);
                            return;
                        } else {
                            ((MainViewModel) getViewModel()).linkHaraworkAccount(queryParameter).observe(this, new MainActivity$parseDeepLink$$inlined$let$lambda$1(this, queryParameter));
                            return;
                        }
                    } else {
                        return;
                    }
                case -853556437:
                    if (host.equals("links.thecoffeehouse.com")) {
                        try {
                            String substringAfterLast$default = StringsKt.substringAfterLast$default(str, "link=", (String) null, 2, (Object) null);
                            GeneralKt.log("link: " + substringAfterLast$default);
                            Uri parse2 = Uri.parse(substringAfterLast$default);
                            Intrinsics.checkNotNullExpressionValue(parse2, "Uri.parse(link)");
                            navigateInAppByDeepLink(parse2);
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    } else {
                        return;
                    }
                case -395185802:
                    if (!host.equals("order.thecoffeehouse.com")) {
                        return;
                    }
                    break;
                case -93718826:
                    if (!host.equals("thecoffeehouse.com")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            navigateInAppByDeepLink(parse);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void navigateInAppByDeepLink(android.net.Uri r13) {
        /*
        // Method dump skipped, instructions count: 454
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.MainActivity.navigateInAppByDeepLink(android.net.Uri):void");
    }

    /* access modifiers changed from: private */
    public final void openWebViewDialog(String str, boolean z) {
        WebViewDialogFragment newInstance = WebViewDialogFragment.Companion.newInstance(new PostsItem(null, null, str, null, null, TabMoreEvents.EventNewsAccessed.Value.News, str, null, 155, null), z);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        newInstance.show(supportFragmentManager, (String) null);
    }

    private final void openCouponDetail(String str, String str2) {
        Intent intent = new Intent(OrderFragment.INTENT_FILTER_ADD_COUPON);
        intent.setAction(OrderFragment.INTENT_FILTER_ADD_COUPON);
        if (str != null) {
            intent.putExtra(OrderFragment.COUPON_CODE_EXTRA, str);
        }
        if (str2 != null) {
            intent.putExtra(OrderFragment.CAMPAIGN_ID_EXTRA, str);
        }
        intent.putExtra(OrderFragment.OVERRIDE_DIRECTLY_EXTRA, false);
        sendBroadcast(intent);
    }

    private final void registerNotificationBroadcast() {
        this.mNotificationBroadcast = new MainActivity$registerNotificationBroadcast$1(this);
        registerReceiver(this.mNotificationBroadcast, new IntentFilter(ACTION_NOTIFICATION));
        this.mSilentNotificationBroadcast = new MainActivity$registerNotificationBroadcast$2(this);
        IntentFilter intentFilter = new IntentFilter(SILENT_NOTIFICATION);
        intentFilter.addAction(SILENT_NOTIFICATION);
        registerReceiver(this.mSilentNotificationBroadcast, intentFilter);
    }

    /* access modifiers changed from: private */
    public final void handleSilentPush(String str) {
        T t;
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "url");
        List<String> pathSegments = parse.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "url.pathSegments");
        String str2 = (String) CollectionsKt.firstOrNull((List) pathSegments);
        if (str2 != null && str2.hashCode() == 1270488759 && str2.equals("tracking")) {
            String queryParameter = parse.getQueryParameter("id");
            parse.getQueryParameter("type");
            if (queryParameter != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                List<Fragment> fragments = supportFragmentManager.getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
                Iterator<T> it = fragments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t instanceof TrackingOrderDialogFragment) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    T t3 = t2;
                    if (Intrinsics.areEqual(t3.getOrderRef(), queryParameter)) {
                        t3.reloadData();
                    }
                }
            }
        }
        reloadHomeFragment();
    }

    /* access modifiers changed from: private */
    public final void selectShippingMethod(String str, Integer num, String str2) {
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String pickup = ShippingType.INSTANCE.getPICKUP();
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "Locale.ROOT");
        Objects.requireNonNull(pickup, "null cannot be cast to non-null type java.lang.String");
        String lowerCase2 = pickup.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
            getMOrderFragment().setShippingMethodByDeepLink(ShippingType.INSTANCE.getPICKUP(), num, null);
            return;
        }
        String deli = ShippingType.INSTANCE.getDELI();
        Locale locale3 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale3, "Locale.ROOT");
        Objects.requireNonNull(deli, "null cannot be cast to non-null type java.lang.String");
        String lowerCase3 = deli.toLowerCase(locale3);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, lowerCase3)) {
            getMOrderFragment().setShippingMethodByDeepLink(ShippingType.INSTANCE.getDELI(), null, null);
            return;
        }
        String table = ShippingType.INSTANCE.getTABLE();
        Locale locale4 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale4, "Locale.ROOT");
        Objects.requireNonNull(table, "null cannot be cast to non-null type java.lang.String");
        String lowerCase4 = table.toLowerCase(locale4);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, lowerCase4)) {
            availableShippingMethods(new MainActivity$selectShippingMethod$1(this, str2));
        }
    }

    /* access modifiers changed from: private */
    public final void setVisibilityGoneLayouts(FrameLayout... frameLayoutArr) {
        for (FrameLayout frameLayout : frameLayoutArr) {
            if (frameLayout.getVisibility() == 0) {
                frameLayout.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setVisibilityShowLayout(FrameLayout frameLayout) {
        if (!(frameLayout.getVisibility() == 0)) {
            frameLayout.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public final void showMemberCardDialog() {
        Profile userInfo = ((MainViewModel) getViewModel()).getUserInfo();
        if (userInfo != null && userInfo.getBarcode() != null) {
            GetMetadataResponse value = getTCHApplication().m0getMetadata().getValue();
            ArrayList arrayList = null;
            List<RankInfoItem> rankInfo = value != null ? value.getRankInfo() : null;
            if (!(rankInfo == null || rankInfo.isEmpty())) {
                MainActivity mainActivity = this;
                Dialog dialog = new Dialog(mainActivity);
                View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.layout_dialog_card, (ViewGroup) null, false);
                dialog.setContentView(inflate);
                ArrayList arrayList2 = new ArrayList();
                GetMetadataResponse value2 = getTCHApplication().m0getMetadata().getValue();
                if (value2 != null) {
                    arrayList = value2.getRankInfo();
                }
                String fullName = userInfo.getFullName();
                String barcode = userInfo.getBarcode();
                Intrinsics.checkNotNull(barcode);
                arrayList2.add(new CardDialogAdapter.CardInfo(fullName, barcode, userInfo.getRankId()));
                Intrinsics.checkNotNullExpressionValue(inflate, "viewDialogCard");
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rcv_card);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "viewDialogCard.rcv_card");
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                recyclerView.setAdapter(new CardDialogAdapter(arrayList, arrayList2));
                RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.rcv_card);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "viewDialogCard.rcv_card");
                recyclerView2.setLayoutManager(new LinearLayoutManager(mainActivity, 0, false));
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = getWindowManager();
                Intrinsics.checkNotNullExpressionValue(windowManager, "windowManager");
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int DPtoPX = (displayMetrics.widthPixels - ViewExtsKt.DPtoPX(300.0f)) / 2;
                ((RecyclerView) inflate.findViewById(R.id.rcv_card)).setPadding(DPtoPX, 0, DPtoPX, 0);
                new PagerSnapHelper().attachToRecyclerView((RecyclerView) inflate.findViewById(R.id.rcv_card));
                dialog.show();
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setLayout(-1, -2);
                }
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
                TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.MemberCard_Popup, R.layout.layout_dialog_card);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void switchTabInRewardsAndVouchers(Uri uri) {
        List<String> pathSegments;
        String str = (uri == null || (pathSegments = uri.getPathSegments()) == null) ? null : (String) CollectionsKt.firstOrNull((List) pathSegments);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1354573786) {
                if (hashCode != 106845584) {
                    if (hashCode == 1100650276 && str.equals("rewards")) {
                        getMRewardsAndCouponsFragment().switchToTab(RewardsAndCouponsFragment.Companion.getREWARD_TAB_POSITION());
                        String queryParameter = uri.getQueryParameter("id");
                        if (queryParameter != null) {
                            new Handler().post(new MainActivity$switchTabInRewardsAndVouchers$$inlined$let$lambda$1(this, queryParameter));
                        }
                        String queryParameter2 = uri.getQueryParameter("supplier");
                        if (queryParameter2 != null) {
                            getMRewardsAndCouponsFragment().openRewardBySupplier(queryParameter2);
                        }
                        String queryParameter3 = uri.getQueryParameter(MonitorLogServerProtocol.PARAM_CATEGORY);
                        if (queryParameter3 != null) {
                            getMRewardsAndCouponsFragment().openRewardByCategory(queryParameter3);
                        }
                    }
                } else if (str.equals("point")) {
                    getMRewardsAndCouponsFragment().switchToTab(RewardsAndCouponsFragment.Companion.getACCUMULATE_TAB_POSITION());
                }
            } else if (str.equals(FirebaseAnalytics.Param.COUPON)) {
                getMRewardsAndCouponsFragment().switchToTab(RewardsAndCouponsFragment.Companion.getCOUPON_TAB_POSITION());
                openCouponDetail(uri.getQueryParameter(PaymentResponse.RETURN_CODE), uri.getQueryParameter("cid"));
            }
        }
    }

    public final void navigateTab(int i) {
        dismissAllDialogFragments();
        BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bottom_navigation);
        Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
        bottomNavigationView.setSelectedItemId(i);
    }

    public final void runFlowReorder(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        changeActiveFragment(getMOrderFragment());
        navigateTab(R.id.navigation_order);
        try {
            getMOrderFragment().reorder(str, str2);
        } catch (Exception unused) {
            getMOrderFragment().setOnInitViewDone(new MainActivity$runFlowReorder$1(this, str, str2));
        }
    }

    private final void registerReceiveAddCoupon() {
        this.mAddCouponBroadcastReceiver = new MainActivity$registerReceiveAddCoupon$1(this);
        registerReceiver(this.mAddCouponBroadcastReceiver, new IntentFilter(OrderFragment.INTENT_FILTER_ADD_COUPON));
    }

    public final void reloadHomeFragment() {
        getMHomeFragment().resetData();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void onRestoreInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(65536);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        startActivity(intent);
    }

    public final void resetDynamicLink() {
        this.dynamicLink = null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        Glide.with(getApplicationContext()).pauseRequests();
    }

    public final void runFlowLogin(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "isSuccess");
        Application application = getApplication();
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        if (((TCHApplication) application).requireClientManager().isLoggedIn()) {
            function1.invoke(true);
            return;
        }
        this.onLoginCallBackListener = function1;
        LoginActivity.Companion.openWithActivityResult(this, this.LOGIN_REQUEST_CODE, null);
    }

    public final void updateHeaderShippingMethod(String str, AddressSuggestion addressSuggestion2, Store store, TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(str, "currentMethod");
        if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
            updateHeaderOrderByPickup(store);
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
            updateHeaderOrderByDeli(addressSuggestion2);
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getTABLE())) {
            updateHeaderOrderByAtTable(tableInfo);
        }
        rotateHeaderIconDown();
    }

    private final void updateHeaderOrderByAtTable(TableInfo tableInfo) {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        ((ImageView) constraintLayout.findViewById(R.id.img_shipping_type)).setImageResource(R.drawable.ic_badge_at_table_shortcut);
        String str = null;
        String tableName = tableInfo != null ? tableInfo.getTableName() : null;
        if (!(tableName == null || tableName.length() == 0)) {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById2.findViewById(R.id.layout_header_order);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_main_header.layout_header_order");
            TextView textView = (TextView) constraintLayout2.findViewById(R.id.txt_shipping_type);
            Intrinsics.checkNotNullExpressionValue(textView, "layout_main_header.layou…r_order.txt_shipping_type");
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
            String string = getString(R.string.str_at_table);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_at_table)");
            textViewAttributeArr[0] = new TextViewAttribute(string, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_semibold));
            textViewAttributeArr[1] = new TextViewAttribute(" - " + StringExtsKt.toStringOrEmpty(tableInfo != null ? tableInfo.getTableName() : null), Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            showPopupUpdateOrderAtTable();
        } else {
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_main_header);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_main_header");
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById3.findViewById(R.id.layout_header_order);
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "layout_main_header.layout_header_order");
            TextView textView2 = (TextView) constraintLayout3.findViewById(R.id.txt_shipping_type);
            Intrinsics.checkNotNullExpressionValue(textView2, "layout_main_header.layou…r_order.txt_shipping_type");
            String string2 = getString(R.string.str_at_table);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_at_table)");
            TLTextViewKt.setTextMultipleFonts(textView2, new TextViewAttribute(string2, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_semibold)));
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_main_header");
        ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById4.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "layout_main_header.layout_header_order");
        TextView textView3 = (TextView) constraintLayout4.findViewById(R.id.txt_shipping_address);
        Intrinsics.checkNotNullExpressionValue(textView3, "layout_main_header.layou…rder.txt_shipping_address");
        textView3.setHint(getString(R.string.str_order_at_table_hint));
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "layout_main_header");
        ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById5.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "layout_main_header.layout_header_order");
        TextView textView4 = (TextView) constraintLayout5.findViewById(R.id.txt_shipping_address);
        Intrinsics.checkNotNullExpressionValue(textView4, "layout_main_header.layou…rder.txt_shipping_address");
        if (tableInfo != null) {
            str = tableInfo.getStoreName();
        }
        textView4.setText(StringExtsKt.toStringOrEmpty(str));
    }

    private final void updateHeaderOrderByDeli(AddressSuggestion addressSuggestion2) {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        ((ImageView) constraintLayout.findViewById(R.id.img_shipping_type)).setImageResource(R.drawable.ic_badge_deli_shortcut);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById2.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_main_header.layout_header_order");
        TextView textView = (TextView) constraintLayout2.findViewById(R.id.txt_shipping_type);
        Intrinsics.checkNotNullExpressionValue(textView, "layout_main_header.layou…r_order.txt_shipping_type");
        textView.setText(getString(R.string.str_deliver_to));
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_main_header");
        ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById3.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "layout_main_header.layout_header_order");
        TextView textView2 = (TextView) constraintLayout3.findViewById(R.id.txt_shipping_address);
        Intrinsics.checkNotNullExpressionValue(textView2, "layout_main_header.layou…rder.txt_shipping_address");
        textView2.setText(addressSuggestion2 != null ? addressSuggestion2.getFullAddress() : null);
    }

    private final void updateHeaderOrderByPickup(Store store) {
        String str = null;
        GeneralKt.log("pickUpInfo: " + (store != null ? store.getAddress() : null));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        ((ImageView) constraintLayout.findViewById(R.id.img_shipping_type)).setImageResource(R.drawable.ic_badge_pickup_shortcut);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById2.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_main_header.layout_header_order");
        TextView textView = (TextView) constraintLayout2.findViewById(R.id.txt_shipping_type);
        Intrinsics.checkNotNullExpressionValue(textView, "layout_main_header.layou…r_order.txt_shipping_type");
        textView.setText(getString(R.string.str_pick_up_at));
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_main_header");
        ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById3.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "layout_main_header.layout_header_order");
        TextView textView2 = (TextView) constraintLayout3.findViewById(R.id.txt_shipping_address);
        Intrinsics.checkNotNullExpressionValue(textView2, "layout_main_header.layou…rder.txt_shipping_address");
        if (store != null) {
            str = store.getName();
        }
        textView2.setText(str);
    }

    public final void clearMyLocation() {
        this.addressSuggestion = null;
    }

    public final void showPopupWarningDraftCart(String str) {
        Intrinsics.checkNotNullParameter(str, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_shipping_address);
        Intrinsics.checkNotNullExpressionValue(textView, "layout_main_header.layou…rder.txt_shipping_address");
        showPopupWindowLeftTopAnchor(str, textView);
    }

    private final void showPopupWindowLeftTopAnchor(String str, View view) {
        try {
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                this.popupWindow = new PopupWindow(this);
                View inflate = LayoutInflater.from(this).inflate(R.layout.layout_popup_warning, (ViewGroup) null, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "layoutPopup");
                TextView textView = (TextView) inflate.findViewById(R.id.txt_message);
                Intrinsics.checkNotNullExpressionValue(textView, "layoutPopup.txt_message");
                textView.setText(str);
                PopupWindow popupWindow3 = this.popupWindow;
                if (popupWindow3 != null) {
                    popupWindow3.setContentView(inflate);
                }
                View findViewById = inflate.findViewById(R.id.view_anchor);
                Intrinsics.checkNotNullExpressionValue(findViewById, "layoutPopup.view_anchor");
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = GravityCompat.START;
                    PopupWindow popupWindow4 = this.popupWindow;
                    if (popupWindow4 != null) {
                        popupWindow4.setBackgroundDrawable(null);
                    }
                    PopupWindow popupWindow5 = this.popupWindow;
                    if (popupWindow5 != null) {
                        popupWindow5.showAsDropDown(view, ViewExtsKt.DPtoPX(10.0f), 0);
                    }
                    PopupWindow popupWindow6 = this.popupWindow;
                    if (popupWindow6 != null) {
                        popupWindow6.setOutsideTouchable(true);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void showPopupUpdateOrderAtTable() {
        String string = getString(R.string.str_updated_method_and_table_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_u…ed_method_and_table_name)");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_shipping_address);
        Intrinsics.checkNotNullExpressionValue(textView, "layout_main_header.layou…rder.txt_shipping_address");
        showPopupWindowLeftTopAnchor(string, textView);
    }

    public final void rotateHeaderIconUp() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        ((ImageView) constraintLayout.findViewById(R.id.img_icon_arrow)).animate().rotation(180.0f).start();
    }

    public final void rotateHeaderIconDown() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_main_header);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById.findViewById(R.id.layout_header_order);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_main_header.layout_header_order");
        ((ImageView) constraintLayout.findViewById(R.id.img_icon_arrow)).animate().rotation(0.0f).start();
    }

    public final void showPopupWindowRightTopAnchor(String str, View view) {
        Intrinsics.checkNotNullParameter(str, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        Intrinsics.checkNotNullParameter(view, "anchorView");
        try {
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                View inflate = LayoutInflater.from(this).inflate(R.layout.layout_popup_warning, (ViewGroup) null, false);
                this.popupWindow = new PopupWindow(this);
                Intrinsics.checkNotNullExpressionValue(inflate, "layoutPopup");
                TextView textView = (TextView) inflate.findViewById(R.id.txt_message);
                Intrinsics.checkNotNullExpressionValue(textView, "layoutPopup.txt_message");
                textView.setText(str);
                View findViewById = inflate.findViewById(R.id.view_anchor);
                Intrinsics.checkNotNullExpressionValue(findViewById, "layoutPopup.view_anchor");
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = GravityCompat.END;
                    PopupWindow popupWindow3 = this.popupWindow;
                    if (popupWindow3 != null) {
                        popupWindow3.setBackgroundDrawable(null);
                    }
                    inflate.measure(0, 0);
                    PopupWindow popupWindow4 = this.popupWindow;
                    if (popupWindow4 != null) {
                        popupWindow4.setWidth(inflate.getMeasuredWidth());
                    }
                    PopupWindow popupWindow5 = this.popupWindow;
                    if (popupWindow5 != null) {
                        popupWindow5.setHeight(inflate.getMeasuredHeight());
                    }
                    PopupWindow popupWindow6 = this.popupWindow;
                    if (popupWindow6 != null) {
                        popupWindow6.setContentView(inflate);
                    }
                    PopupWindow popupWindow7 = this.popupWindow;
                    if (popupWindow7 != null) {
                        popupWindow7.showAsDropDown(view, 0, 0, 0);
                    }
                    PopupWindow popupWindow8 = this.popupWindow;
                    if (popupWindow8 != null) {
                        popupWindow8.setOutsideTouchable(true);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String extractTableCodeInDeepLink(String str) {
        return Uri.parse(str).getQueryParameter(PaymentResponse.RETURN_CODE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/MainActivity$Companion;", "", "()V", "ACTION_NOTIFICATION", "", "AIRPAY_REQUEST_CODE", "", "INTENT_NOTIFICATION", "SILENT_NOTIFICATION", "hostDeepLink", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: MainActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void availableShippingMethods(Function1<? super ArrayList<String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onAvailable");
        getTCHApplication().m0getMetadata().observe(this, new MainActivity$availableShippingMethods$1(function1));
    }
}
