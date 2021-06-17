package com.thecoffeehouse.guestapp.utility;

import com.google.maps.android.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0003"}, d2 = {"toStringOrEmpty", "", "toStringOrNull", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: StringExts.kt */
public final class StringExtsKt {
    public static final String toStringOrEmpty(String str) {
        String str2 = str;
        return ((str2 == null || str2.length() == 0) || Intrinsics.areEqual(str, BuildConfig.TRAVIS)) ? "" : str;
    }

    public static final String toStringOrNull(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return str;
    }
}
