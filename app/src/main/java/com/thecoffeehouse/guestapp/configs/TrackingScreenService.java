package com.thecoffeehouse.guestapp.configs;

import android.content.Context;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/TrackingScreenService;", "", "()V", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingScreenService.kt */
public final class TrackingScreenService {
    public static final String App_Feedback_Form = "App_Feedback_Form";
    public static final String App_Setting = "App_Setting";
    public static final Companion Companion = new Companion(null);
    public static final String Home = "Home";
    private static volatile FirebaseAnalytics INSTANCE = null;
    public static final String Item_Detail = "Item_Detail";
    public static final String Item_Search_List = "Item_Search_List";
    public static final String MemberCard_Popup = "MemberCard_Popup";
    public static final String Member_Program_Page = "Member_Program_Page";
    public static final String Membership_Home = "Membership_Home";
    public static final String Menu_Category_List = "Menu_Category_List";
    public static final String Menu_Favorite_List = "Menu_Favorite_List";
    public static final String Menu_Item_List_FromCategory = "Menu_Item_List_FromCategory";
    public static final String Menu_Recent_List = "Menu_Recent_List";
    public static final String News_Promotion_List = "News_Promotion_List";
    public static final String Notif_Detail = "Notif_Detail";
    public static final String Order_CancelForm = "Order_CancelForm";
    public static final String Order_Cart = "Order_Cart";
    public static final String Order_Checkout = "Order_Checkout";
    public static final String Order_History_List = "Order_History_List";
    public static final String Order_SelectPaymentMethod = "Order_SelectPaymentMethod";
    public static final String Order_SelectTime = "Order_SelectTime";
    public static final String Order_Tracking = "Order_Tracking";
    public static final String Reward_Detail = "Reward_Detail";
    public static final String Reward_List = "Reward_List";
    public static final String Reward_Store = "Reward_Store";
    public static final String Shipping_Deli_Address_CustomMap = "Shipping_Deli_Address_CustomMap";
    public static final String Shipping_Deli_Address_CustomNote = "Shipping_Deli_Address_CustomNote";
    public static final String Shipping_Deli_Address_SearchResult = "Shipping_Deli_Address_SearchResult";
    public static final String Shipping_Method_StartPage = "Shipping_Method_StartPage";
    public static final String Shipping_Pickup_StoreList = "Shipping_Pickup_StoreList";
    public static final String Shipping_Pickup_StoreMap = "Shipping_Pickup_StoreMap";
    public static final String Shipping_Pickup_StoreSearchResult = "Shipping_Pickup_StoreSearchResult";
    public static final String Store_Detail = "Store_Detail";
    public static final String Store_List = "Store_List";
    public static final String Store_Map = "Store_Map";
    public static final String Store_Music_Player = "Store_Music_Player";
    public static final String Store_SearchResult = "Store_SearchResult";
    public static final String Support_Page = "Support_Page";
    public static final String Tab_More = "Tab_More";
    public static final String Update_Personal_Form = "Update_Personal_Form";
    public static final String Voucher_Detail = "Voucher_Detail";
    public static final String Voucher_List = "Voucher_List";
    public static final String Voucher_ManualInput = "Voucher_ManualInput";
    private static Context mContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u00102\u001a\u00020\b2\u0006\u00103\u001a\u000201J\u001f\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u000208¢\u0006\u0002\u00109J\u001d\u0010:\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0002\u0010<J\u001d\u0010=\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u00042\u0006\u0010>\u001a\u00020?¢\u0006\u0002\u0010@R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/TrackingScreenService$Companion;", "", "()V", TrackingScreenService.App_Feedback_Form, "", TrackingScreenService.App_Setting, "Home", "INSTANCE", "Lcom/google/firebase/analytics/FirebaseAnalytics;", TrackingScreenService.Item_Detail, TrackingScreenService.Item_Search_List, TrackingScreenService.MemberCard_Popup, TrackingScreenService.Member_Program_Page, TrackingScreenService.Membership_Home, TrackingScreenService.Menu_Category_List, TrackingScreenService.Menu_Favorite_List, TrackingScreenService.Menu_Item_List_FromCategory, TrackingScreenService.Menu_Recent_List, TrackingScreenService.News_Promotion_List, TrackingScreenService.Notif_Detail, TrackingScreenService.Order_CancelForm, TrackingScreenService.Order_Cart, TrackingScreenService.Order_Checkout, TrackingScreenService.Order_History_List, TrackingScreenService.Order_SelectPaymentMethod, TrackingScreenService.Order_SelectTime, TrackingScreenService.Order_Tracking, TrackingScreenService.Reward_Detail, TrackingScreenService.Reward_List, TrackingScreenService.Reward_Store, TrackingScreenService.Shipping_Deli_Address_CustomMap, TrackingScreenService.Shipping_Deli_Address_CustomNote, TrackingScreenService.Shipping_Deli_Address_SearchResult, TrackingScreenService.Shipping_Method_StartPage, TrackingScreenService.Shipping_Pickup_StoreList, TrackingScreenService.Shipping_Pickup_StoreMap, TrackingScreenService.Shipping_Pickup_StoreSearchResult, "Store_Detail", TrackingScreenService.Store_List, TrackingScreenService.Store_Map, TrackingScreenService.Store_Music_Player, TrackingScreenService.Store_SearchResult, TrackingScreenService.Support_Page, TrackingScreenService.Tab_More, TrackingScreenService.Update_Personal_Form, "Voucher_Detail", TrackingScreenService.Voucher_List, TrackingScreenService.Voucher_ManualInput, "mContext", "Landroid/content/Context;", "initialize", "context", "logScreenViewByLayoutResId", "", "screenName", "layoutResId", "", "(Ljava/lang/String;I)Lkotlin/Unit;", "logScreenViewByName", "name", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "logScreenViewByViewId", "viewId", "Landroid/view/View;", "(Ljava/lang/String;Landroid/view/View;)Lkotlin/Unit;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TrackingScreenService.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FirebaseAnalytics initialize(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FirebaseAnalytics firebaseAnalytics = TrackingScreenService.INSTANCE;
            if (firebaseAnalytics == null) {
                synchronized (this) {
                    TrackingScreenService.mContext = context;
                    firebaseAnalytics = TrackingScreenService.INSTANCE;
                    if (firebaseAnalytics == null) {
                        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
                        TrackingScreenService.INSTANCE = instance;
                        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseAnalytics.getIns…t).also { INSTANCE = it }");
                        firebaseAnalytics = instance;
                    }
                }
            }
            return firebaseAnalytics;
        }

        public final Unit logScreenViewByLayoutResId(String str, int i) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            return (Unit) BuildersKt.runBlocking(Dispatchers.getIO(), new TrackingScreenService$Companion$logScreenViewByLayoutResId$1(i, str, null));
        }

        public final Unit logScreenViewByViewId(String str, View view) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(view, "viewId");
            return (Unit) BuildersKt.runBlocking(Dispatchers.getIO(), new TrackingScreenService$Companion$logScreenViewByViewId$1(view, str, null));
        }

        public final Unit logScreenViewByName(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "screenName");
            Intrinsics.checkNotNullParameter(str2, "name");
            return (Unit) BuildersKt.runBlocking(Dispatchers.getIO(), new TrackingScreenService$Companion$logScreenViewByName$1(str, str2, null));
        }
    }
}
