package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "Landroid/os/Parcelable;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "stores", "", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/util/List;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getStores", "()Ljava/util/List;", "setStores", "(Ljava/util/List;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class GetStoresResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("error")
    @Expose
    private ServerError error;
    @SerializedName("stores")
    @Expose
    private List<Store> stores;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            ServerError serverError = parcel.readInt() != 0 ? (ServerError) ServerError.CREATOR.createFromParcel(parcel) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Store) Store.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new GetStoresResponse(serverError, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GetStoresResponse[i];
        }
    }

    public GetStoresResponse() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ServerError serverError = this.error;
        if (serverError != null) {
            parcel.writeInt(1);
            serverError.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Store> list = this.stores;
        parcel.writeInt(list.size());
        for (Store store : list) {
            store.writeToParcel(parcel, 0);
        }
    }

    public GetStoresResponse(ServerError serverError, List<Store> list) {
        Intrinsics.checkNotNullParameter(list, "stores");
        this.error = serverError;
        this.stores = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetStoresResponse(ServerError serverError, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, (i & 2) != 0 ? new ArrayList() : list);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final List<Store> getStores() {
        return this.stores;
    }

    public final void setStores(List<Store> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.stores = list;
    }
}
