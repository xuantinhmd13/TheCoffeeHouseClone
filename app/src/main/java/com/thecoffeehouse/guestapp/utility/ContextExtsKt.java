package com.thecoffeehouse.guestapp.utility;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.iid.FirebaseInstanceId;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.views.BaseAlertDialog;
import com.thecoffeehouse.guestapp.views.StatusToastView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

public final class ContextExtsKt {
    private static BaseAlertDialog baseAlertDialog;
    private static AtomicBoolean isShowingToast = new AtomicBoolean(false);
    private static Toast toastLogout;

    public static final /* synthetic */ Toast access$getToastLogout$p() {
        Toast toast = toastLogout;
        if (toast == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastLogout");
        }
        return toast;
    }

    public static final boolean hasInternetConnected(Context context) {
        Intrinsics.checkNotNullParameter(context, "$this$hasInternetConnected");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12);
        }
        return false;
    }

    public static final int internetConnectionType(Context context) {
        Intrinsics.checkNotNullParameter(context, "$this$internetConnectionType");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connMgr.allNetworks");
        boolean z = false;
        boolean z2 = false;
        for (Network network : allNetworks) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo.getType() == 1) {
                z |= networkInfo.isConnected();
            }
            if (networkInfo.getType() == 0) {
                z2 |= networkInfo.isConnected();
            }
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 0;
        }
        return -1;
    }

    public static /* synthetic */ void showToast$default(Context context, ViewGroup viewGroup, View view, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 2000;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        showToast(context, viewGroup, view, j, i);
    }

    public static final void showToast(Context context, ViewGroup viewGroup, View view, long j, int i) {
        Intrinsics.checkNotNullParameter(context, "$this$showToast");
        Intrinsics.checkNotNullParameter(view, "layoutToast");
        if (viewGroup != null) {
            StatusToastView.Companion.makeToast(viewGroup, view, j, i);
        } else if (context instanceof AppCompatActivity) {
            GeneralKt.log("activity");
            ViewGroup viewGroup2 = (ViewGroup) ((AppCompatActivity) context).findViewById(16908290);
            StatusToastView.Companion companion = StatusToastView.Companion;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "rootLayoutView");
            companion.makeToast(viewGroup2, view, j, i);
        }
    }

    public static /* synthetic */ void showToast$default(Context context, ViewGroup viewGroup, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = 2000;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        showToast(context, viewGroup, i, j, i2);
    }

    public static final void showToast(Context context, ViewGroup viewGroup, int i, long j, int i2) {
        Intrinsics.checkNotNullParameter(context, "$this$showToast");
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutToast");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (viewGroup != null) {
            StatusToastView.Companion.makeToast(viewGroup, inflate, j, i2);
        } else if (context instanceof AppCompatActivity) {
            GeneralKt.log("activity");
            ViewGroup viewGroup2 = (ViewGroup) ((AppCompatActivity) context).findViewById(16908290);
            StatusToastView.Companion companion = StatusToastView.Companion;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "rootLayoutView");
            companion.makeToast(viewGroup2, inflate, j, i2);
        }
    }

    public static final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "$this$isNetworkAvailable");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void logout$default(Activity activity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        logout(activity, z);
    }

    public static final void logout(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "$this$logout");
        Application application = activity.getApplication();
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        activity.runOnUiThread(new ContextExtsKt$logout$1(activity, z, (TCHApplication) application));
    }

    public static final void clearUserLocalData(Activity activity, TCHApplication tCHApplication) {
        EncryptionUtils.INSTANCE.encryptUserToken(tCHApplication, "");
        tCHApplication.requireOrderManager().clearDraftOrderInLocal();
        tCHApplication.requireOrderManager().clearDraftCart();
        tCHApplication.requireClientManager().deleteUserDataFromLocal(new ContextExtsKt$clearUserLocalData$1(activity));
    }

    public static final void signOut(TCHApplication tCHApplication, Function0<Unit> function0) {
        Profile userProfile = tCHApplication.requireClientManager().getUserProfile();
        tCHApplication.requireClientManager().getUserAPIService().getAuthenticationService().signOut("Bearer " + (userProfile != null ? userProfile.getToken() : null)).enqueue(new ContextExtsKt$signOut$1(tCHApplication, function0));
    }

    public static final void deRegisterFcmToken(TCHApplication tCHApplication, Function0<Unit> function0) {
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseInstanceId.getInstance()");
        instance.getInstanceId().addOnCompleteListener(new ContextExtsKt$deRegisterFcmToken$1(tCHApplication, function0));
    }

    public static /* synthetic */ AlertDialog showOneButtonAlertDialog$default(Context context, String str, String str2, String str3, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            function0 = ContextExtsKt$showOneButtonAlertDialog$1.INSTANCE;
        }
        return showOneButtonAlertDialog(context, str, str2, str3, z, function0);
    }

    public static final AlertDialog showOneButtonAlertDialog(Context context, String str, String str2, String str3, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "$this$showOneButtonAlertDialog");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        Intrinsics.checkNotNullParameter(function0, "onClickListener");
        if (baseAlertDialog == null) {
            baseAlertDialog = new BaseAlertDialog(context);
        }
        AlertDialog.Builder cancelable = new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setCancelable(z);
        if (str3 == null) {
            str3 = context.getString(R.string.str_cancel);
            Intrinsics.checkNotNullExpressionValue(str3, "getString(R.string.str_cancel)");
        }
        AlertDialog create = cancelable.setPositiveButton(str3, new ContextExtsKt$showOneButtonAlertDialog$alertDialog$1(function0)).create();
        Intrinsics.checkNotNullExpressionValue(create, "AlertDialog.Builder(this…voke()\n        }.create()");
        BaseAlertDialog baseAlertDialog2 = baseAlertDialog;
        Intrinsics.checkNotNull(baseAlertDialog2);
        baseAlertDialog2.show(create);
        BaseAlertDialog baseAlertDialog3 = baseAlertDialog;
        Intrinsics.checkNotNull(baseAlertDialog3);
        return baseAlertDialog3.getDialog();
    }

    public static final View getRootView(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$this$getRootView");
        View findViewById = activity.findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<View>(android.R.id.content)");
        return findViewById;
    }

    public static final float convertDpToPx(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "$this$convertDpToPx");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "this.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public static final boolean isKeyboardOpen(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$this$isKeyboardOpen");
        Rect rect = new Rect();
        getRootView(activity).getWindowVisibleDisplayFrame(rect);
        return getRootView(activity).getHeight() - rect.height() > MathKt.roundToInt(convertDpToPx(activity, 50.0f));
    }

    public static final boolean isKeyboardClosed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$this$isKeyboardClosed");
        return !isKeyboardOpen(activity);
    }

    public static final boolean isAppAvailable(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "$this$isAppAvailable");
        Intrinsics.checkNotNullParameter(str, "appPackage");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "this.packageManager");
        try {
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ void setOnSafeClickListener$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        setOnSafeClickListener(view, j, function1);
    }

    public static final void setOnSafeClickListener(View view, long j, Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "$this$setOnSafeClickListener");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 0;
        view.setOnClickListener(new ContextExtsKt$setOnSafeClickListener$1(j, longRef, function1));
    }

    public static final void openGooglePlayStoreByUrl(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "$this$openGooglePlayStoreByUrl");
        Intrinsics.checkNotNullParameter(str, "packageName");
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
        } catch (Exception unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
        }
    }
}
