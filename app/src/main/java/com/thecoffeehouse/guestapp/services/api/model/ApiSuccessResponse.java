package com.thecoffeehouse.guestapp.services.api.model;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/ApiSuccessResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "body", "linkHeader", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "links", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getLinks", "()Ljava/util/Map;", "nextPage", "", "getNextPage", "()Ljava/lang/Integer;", "nextPage$delegate", "Lkotlin/Lazy;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/util/Map;)Lcom/thecoffeehouse/guestapp/services/api/model/ApiSuccessResponse;", "equals", "", "other", "", "hashCode", "toString", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ApiResponse.kt */
public final class ApiSuccessResponse<T> extends ApiResponse<T> {
    public static final Companion Companion = new Companion(null);
    private static final Pattern LINK_PATTERN = Pattern.compile("<([^>]*)>[\\s]*;[\\s]*rel=\"([a-zA-Z0-9]+)\"");
    private static final String NEXT_LINK = "next";
    private static final Pattern PAGE_PATTERN = Pattern.compile("\\bpage=(\\d+)");
    private final T body;
    private final Map<String, String> links;
    private final Lazy nextPage$delegate;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiSuccessResponse copy$default(ApiSuccessResponse apiSuccessResponse, Object obj, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = apiSuccessResponse.body;
        }
        if ((i & 2) != 0) {
            map = apiSuccessResponse.links;
        }
        return apiSuccessResponse.copy(obj, map);
    }

    public final T component1() {
        return this.body;
    }

    public final Map<String, String> component2() {
        return this.links;
    }

    public final ApiSuccessResponse<T> copy(T t, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "links");
        return new ApiSuccessResponse<>(t, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiSuccessResponse)) {
            return false;
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) obj;
        return Intrinsics.areEqual(this.body, apiSuccessResponse.body) && Intrinsics.areEqual(this.links, apiSuccessResponse.links);
    }

    public final Integer getNextPage() {
        return (Integer) this.nextPage$delegate.getValue();
    }

    public int hashCode() {
        T t = this.body;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Map<String, String> map = this.links;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApiSuccessResponse(body=" + ((Object) this.body) + ", links=" + this.links + ")";
    }

    public final T getBody() {
        return this.body;
    }

    public final Map<String, String> getLinks() {
        return this.links;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiSuccessResponse(T t, Map<String, String> map) {
        super(null);
        Intrinsics.checkNotNullParameter(map, "links");
        this.body = t;
        this.links = map;
        this.nextPage$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ApiSuccessResponse$nextPage$2(this));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiSuccessResponse(T r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x000b
            com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse$Companion r0 = com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse.Companion
            java.util.Map r3 = com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse.Companion.access$extractLinks(r0, r3)
            if (r3 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
        L_0x000f:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse.<init>(java.lang.Object, java.lang.String):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n*\u00020\u0007H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/ApiSuccessResponse$Companion;", "", "()V", "LINK_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "NEXT_LINK", "", "PAGE_PATTERN", "extractLinks", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ApiResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final Map<String, String> extractLinks(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Matcher matcher = ApiSuccessResponse.LINK_PATTERN.matcher(str);
            while (matcher.find()) {
                if (matcher.groupCount() == 2) {
                    String group = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group, "matcher.group(2)");
                    String group2 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(1)");
                    linkedHashMap.put(group, group2);
                }
            }
            return linkedHashMap;
        }
    }
}
