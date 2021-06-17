package com.thecoffeehouse.guestapp.di;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006R\u0001\u0010\u0003\u001av\u0012\u0004\u0012\u00020\u0005\u00120\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u0004j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u0001`\u00070\u0004j:\u0012\u0004\u0012\u00020\u0005\u00120\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u0004j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u0001`\u0007`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/di/DIStorage;", "", "()V", "provided", "Ljava/util/HashMap;", "", "Lcom/thecoffeehouse/guestapp/di/DIProvider;", "Lkotlin/collections/HashMap;", "get", "scope", "className", "put", "", "provider", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: di.kt */
public final class DIStorage {
    public static final DIStorage INSTANCE = new DIStorage();
    private static final HashMap<String, HashMap<String, DIProvider<Object>>> provided = new HashMap<>();

    private DIStorage() {
    }

    public final DIProvider<Object> get(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.checkNotNullParameter(str2, "className");
        HashMap<String, DIProvider<Object>> hashMap = provided.get(str);
        if (hashMap != null) {
            return hashMap.get(str2);
        }
        return null;
    }

    public final void put(String str, String str2, DIProvider<Object> dIProvider) {
        Intrinsics.checkNotNullParameter(str, "scope");
        Intrinsics.checkNotNullParameter(str2, "className");
        Intrinsics.checkNotNullParameter(dIProvider, "provider");
        HashMap<String, HashMap<String, DIProvider<Object>>> hashMap = provided;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new HashMap<>());
        }
        HashMap<String, DIProvider<Object>> hashMap2 = hashMap.get(str);
        Intrinsics.checkNotNull(hashMap2);
        Intrinsics.checkNotNullExpressionValue(hashMap2, "provided[scope]!!");
        hashMap2.put(str2, dIProvider);
    }
}
