package com.thecoffeehouse.guestapp.screens.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationPayload;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Popup;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/splashscreen/SplashScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getNotificationPayload", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/NotificationPayload;", "getStringExtraByKey", "", "key", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SplashScreenActivity.kt */
public final class SplashScreenActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

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

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = new Intent(this, MainActivity.class);
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            if (intent2.getExtras() != null) {
                try {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(MainActivity.INTENT_NOTIFICATION, getNotificationPayload()), "intentMainActivity.putEx…oad\n                    )");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final NotificationPayload getNotificationPayload() {
        Object obj = null;
        NotificationPayload notificationPayload = new NotificationPayload(null, null, null, null, null, 31, null);
        notificationPayload.setDescription(getStringExtraByKey("description"));
        notificationPayload.setTitle(getStringExtraByKey("title"));
        notificationPayload.setId(getStringExtraByKey("id"));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        Bundle extras = intent.getExtras();
        if (String.valueOf(extras != null ? extras.get("popup") : null).length() > 0) {
            Gson gson = new Gson();
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Bundle extras2 = intent2.getExtras();
            if (extras2 != null) {
                obj = extras2.get("popup");
            }
            notificationPayload.setPopup((Popup) gson.fromJson(String.valueOf(obj), Popup.class));
        }
        notificationPayload.setDeeplink(getStringExtraByKey("deeplink"));
        return notificationPayload;
    }

    private final String getStringExtraByKey(String str) {
        if (!getIntent().hasExtra(str)) {
            return null;
        }
        return getIntent().getStringExtra(str);
    }
}
