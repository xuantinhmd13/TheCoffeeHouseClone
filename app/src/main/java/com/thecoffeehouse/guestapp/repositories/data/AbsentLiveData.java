package com.thecoffeehouse.guestapp.repositories.data;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/repositories/data/AbsentLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "()V", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AbsentLiveData.kt */
public final class AbsentLiveData<T> extends LiveData<T> {
    public static final Companion Companion = new Companion(null);

    private AbsentLiveData() {
        postValue(null);
    }

    public /* synthetic */ AbsentLiveData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/repositories/data/AbsentLiveData$Companion;", "", "()V", "create", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: AbsentLiveData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> LiveData<T> create() {
            return new AbsentLiveData(null);
        }
    }
}
