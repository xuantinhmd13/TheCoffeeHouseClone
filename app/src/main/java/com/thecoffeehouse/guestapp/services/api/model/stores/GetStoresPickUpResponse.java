package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresPickUpResponse;", "Landroid/os/Parcelable;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "storeIds", "", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/util/List;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getStoreIds", "()Ljava/util/List;", "setStoreIds", "(Ljava/util/List;)V", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class GetStoresPickUpResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("error")
    private ServerError error;
    @SerializedName("store_ids")
    private List<Integer> storeIds;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            ArrayList arrayList = null;
            ServerError serverError = parcel.readInt() != 0 ? (ServerError) ServerError.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                    readInt--;
                }
                arrayList = arrayList2;
            }
            return new GetStoresPickUpResponse(serverError, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GetStoresPickUpResponse[i];
        }
    }

    public GetStoresPickUpResponse() {
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
        List<Integer> list = this.storeIds;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Integer num : list) {
                parcel.writeInt(num.intValue());
            }
            return;
        }
        parcel.writeInt(0);
    }

    public GetStoresPickUpResponse(ServerError serverError, List<Integer> list) {
        this.error = serverError;
        this.storeIds = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetStoresPickUpResponse(ServerError serverError, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, (i & 2) != 0 ? null : list);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final List<Integer> getStoreIds() {
        return this.storeIds;
    }

    public final void setStoreIds(List<Integer> list) {
        this.storeIds = list;
    }
}
