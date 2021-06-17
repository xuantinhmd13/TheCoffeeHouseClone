package com.thecoffeehouse.guestapp.services.api.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/MockResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "requestPayload", "httpCode", "", "responseBody", "responseBodyString", "", "(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/String;)V", "getHttpCode", "()I", "setHttpCode", "(I)V", "getRequestPayload", "()Ljava/lang/Object;", "setRequestPayload", "(Ljava/lang/Object;)V", "getResponseBody", "setResponseBody", "Ljava/lang/Object;", "getResponseBodyString", "()Ljava/lang/String;", "setResponseBodyString", "(Ljava/lang/String;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MockResponse.kt */
public final class MockResponse<T> {
    private int httpCode;
    private Object requestPayload;
    private T responseBody;
    private String responseBodyString;

    public MockResponse(Object obj, int i, T t, String str) {
        this.requestPayload = obj;
        this.httpCode = i;
        this.responseBody = t;
        this.responseBodyString = str;
    }

    public final Object getRequestPayload() {
        return this.requestPayload;
    }

    public final void setRequestPayload(Object obj) {
        this.requestPayload = obj;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    public final void setHttpCode(int i) {
        this.httpCode = i;
    }

    public final T getResponseBody() {
        return this.responseBody;
    }

    public final void setResponseBody(T t) {
        this.responseBody = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MockResponse(Object obj, int i, Object obj2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, i, (i2 & 4) != 0 ? null : obj2, (i2 & 8) != 0 ? null : str);
    }

    public final String getResponseBodyString() {
        return this.responseBodyString;
    }

    public final void setResponseBodyString(String str) {
        this.responseBodyString = str;
    }
}
