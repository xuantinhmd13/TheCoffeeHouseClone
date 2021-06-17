package com.thecoffeehouse.guestapp.utility;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/utility/Retrofit$unzippingInterceptor$1", "Lokhttp3/Interceptor;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "unzip", "response", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Retrofit.kt */
public final class Retrofit$unzippingInterceptor$1 implements Interceptor {
    Retrofit$unzippingInterceptor$1() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return unzip(chain.proceed(chain.request()));
    }

    private final Response unzip(Response response) {
        String str;
        if (response.body() == null || (str = response.headers().get("Content-Encoding")) == null || !Intrinsics.areEqual(str, "gzip")) {
            return response;
        }
        ResponseBody body = response.body();
        Intrinsics.checkNotNull(body);
        long contentLength = body.contentLength();
        ResponseBody body2 = response.body();
        Intrinsics.checkNotNull(body2);
        GzipSource gzipSource = new GzipSource(body2.source());
        Response.Builder headers = response.newBuilder().headers(response.headers().newBuilder().build());
        ResponseBody body3 = response.body();
        Intrinsics.checkNotNull(body3);
        return headers.body(new RealResponseBody(String.valueOf(body3.contentType()), contentLength, Okio.buffer(gzipSource))).build();
    }
}
