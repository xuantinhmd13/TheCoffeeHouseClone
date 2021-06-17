package com.thecoffeehouse.guestapp.repositories;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J1\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/repositories/CacheRequestUtils;", "", "()V", "CACHE_REQUEST_PREFS", "", "cacheResponse", "", "context", "Landroid/content/Context;", "key", "value", "getCacheResponse", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getCacheResponseString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CacheRequestUtils.kt */
public final class CacheRequestUtils {
    public static final String CACHE_REQUEST_PREFS = "cache_request";
    public static final CacheRequestUtils INSTANCE = new CacheRequestUtils();

    private CacheRequestUtils() {
    }

    public final void cacheResponse(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "value");
        SharePrefs.INSTANCE.putString(context, CACHE_REQUEST_PREFS, str, str2);
    }

    public final <T> T getCacheResponse(Context context, String str, Class<T> cls) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        String string = SharePrefs.INSTANCE.getString(context, CACHE_REQUEST_PREFS, str);
        if (string == null) {
            return null;
        }
        try {
            return (T) new Gson().fromJson(string, (Class) cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getCacheResponseString(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "key");
        String string = SharePrefs.INSTANCE.getString(context, CACHE_REQUEST_PREFS, str);
        if (string == null) {
            return null;
        }
        return string;
    }
}
