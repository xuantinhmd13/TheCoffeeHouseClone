package com.thecoffeehouse.guestapp.services.api.model.error;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "Landroid/os/Parcelable;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ServerError.kt */
public final class ServerErrorResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("error")
    private ServerError error;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new ServerErrorResponse(parcel.readInt() != 0 ? (ServerError) ServerError.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ServerErrorResponse[i];
        }
    }

    public ServerErrorResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ ServerErrorResponse copy$default(ServerErrorResponse serverErrorResponse, ServerError serverError, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = serverErrorResponse.error;
        }
        return serverErrorResponse.copy(serverError);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final ServerErrorResponse copy(ServerError serverError) {
        return new ServerErrorResponse(serverError);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ServerErrorResponse) && Intrinsics.areEqual(this.error, ((ServerErrorResponse) obj).error);
        }
        return true;
    }

    public int hashCode() {
        ServerError serverError = this.error;
        if (serverError != null) {
            return serverError.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ServerErrorResponse(error=" + this.error + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ServerError serverError = this.error;
        if (serverError != null) {
            parcel.writeInt(1);
            serverError.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public ServerErrorResponse(ServerError serverError) {
        this.error = serverError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServerErrorResponse(ServerError serverError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }
}
