package com.thecoffeehouse.guestapp.repositories;

import androidx.exifinterface.media.ExifInterface;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/repositories/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "status", "Lcom/thecoffeehouse/guestapp/repositories/Status;", "data", "serverError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "(Lcom/thecoffeehouse/guestapp/repositories/Status;Ljava/lang/Object;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getServerError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "getStatus", "()Lcom/thecoffeehouse/guestapp/repositories/Status;", "setStatus", "(Lcom/thecoffeehouse/guestapp/repositories/Status;)V", "component1", "component2", "component3", "copy", "(Lcom/thecoffeehouse/guestapp/repositories/Status;Ljava/lang/Object;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;)Lcom/thecoffeehouse/guestapp/repositories/Resource;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Resource.kt */
public final class Resource<T> {
    public static final Companion Companion = new Companion(null);
    private final T data;
    private final ServerErrorResponse serverError;
    private Status status;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.repositories.Resource */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource copy$default(Resource resource, Status status2, Object obj, ServerErrorResponse serverErrorResponse, int i, Object obj2) {
        if ((i & 1) != 0) {
            status2 = resource.status;
        }
        if ((i & 2) != 0) {
            obj = resource.data;
        }
        if ((i & 4) != 0) {
            serverErrorResponse = resource.serverError;
        }
        return resource.copy(status2, obj, serverErrorResponse);
    }

    public final Status component1() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    public final ServerErrorResponse component3() {
        return this.serverError;
    }

    public final Resource<T> copy(Status status2, T t, ServerErrorResponse serverErrorResponse) {
        Intrinsics.checkNotNullParameter(status2, "status");
        return new Resource<>(status2, t, serverErrorResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        return Intrinsics.areEqual(this.status, resource.status) && Intrinsics.areEqual(this.data, resource.data) && Intrinsics.areEqual(this.serverError, resource.serverError);
    }

    public int hashCode() {
        Status status2 = this.status;
        int i = 0;
        int hashCode = (status2 != null ? status2.hashCode() : 0) * 31;
        T t = this.data;
        int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
        ServerErrorResponse serverErrorResponse = this.serverError;
        if (serverErrorResponse != null) {
            i = serverErrorResponse.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Resource(status=" + this.status + ", data=" + ((Object) this.data) + ", serverError=" + this.serverError + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/repositories/Resource$Companion;", "", "()V", "error", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "data", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;Ljava/lang/Object;)Lcom/thecoffeehouse/guestapp/repositories/Resource;", "loading", "(Ljava/lang/Object;)Lcom/thecoffeehouse/guestapp/repositories/Resource;", "success", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: Resource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> Resource<T> success(T t) {
            return new Resource<>(Status.SUCCESS, t, null);
        }

        public final <T> Resource<T> error(ServerErrorResponse serverErrorResponse, T t) {
            return new Resource<>(Status.ERROR, t, serverErrorResponse);
        }

        public final <T> Resource<T> loading(T t) {
            return new Resource<>(Status.LOADING, t, null);
        }
    }

    public Resource(Status status2, T t, ServerErrorResponse serverErrorResponse) {
        Intrinsics.checkNotNullParameter(status2, "status");
        this.status = status2;
        this.data = t;
        this.serverError = serverErrorResponse;
    }

    public final T getData() {
        return this.data;
    }

    public final ServerErrorResponse getServerError() {
        return this.serverError;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(Status status2) {
        Intrinsics.checkNotNullParameter(status2, "<set-?>");
        this.status = status2;
    }
}
