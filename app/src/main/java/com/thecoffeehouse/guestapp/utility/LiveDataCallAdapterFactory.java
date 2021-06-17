package com.thecoffeehouse.guestapp.utility;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/LiveDataCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "()V", "get", "Lretrofit2/CallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LiveDataCallAdapterFactory.kt */
public final class LiveDataCallAdapterFactory extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "returnType");
        Intrinsics.checkNotNullParameter(annotationArr, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(CallAdapter.Factory.getRawType(type), LiveData.class)) {
            return null;
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        if (!Intrinsics.areEqual(CallAdapter.Factory.getRawType(parameterUpperBound), ApiResponse.class)) {
            throw new IllegalArgumentException("type must be a resource");
        } else if (parameterUpperBound instanceof ParameterizedType) {
            Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            Intrinsics.checkNotNullExpressionValue(parameterUpperBound2, "bodyType");
            return new LiveDataCallAdapter(parameterUpperBound2);
        } else {
            throw new IllegalArgumentException("resource must be parameterized");
        }
    }
}
