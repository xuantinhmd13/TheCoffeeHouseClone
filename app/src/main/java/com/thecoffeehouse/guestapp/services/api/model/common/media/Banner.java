package com.thecoffeehouse.guestapp.services.api.model.common.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Popup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/media/Banner;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Popup;", "Landroid/os/Parcelable;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Media.kt */
public final class Banner extends Popup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("id")
    private String id;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            if (parcel.readInt() != 0) {
                return new Banner();
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Banner[i];
        }
    }

    @Override // com.thecoffeehouse.guestapp.services.api.model.common.notification.Popup
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(1);
    }

    public Banner() {
        super(null, null, null, null, 15, null);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }
}
