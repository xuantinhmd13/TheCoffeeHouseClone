package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/MetadataRequest;", "", "last_time", "", "(J)V", "getLast_time", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class MetadataRequest {
    @SerializedName("last_time")
    private final long last_time;

    public MetadataRequest() {
        this(0, 1, null);
    }

    public static /* synthetic */ MetadataRequest copy$default(MetadataRequest metadataRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = metadataRequest.last_time;
        }
        return metadataRequest.copy(j);
    }

    public final long component1() {
        return this.last_time;
    }

    public final MetadataRequest copy(long j) {
        return new MetadataRequest(j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MetadataRequest) && this.last_time == ((MetadataRequest) obj).last_time;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(this.last_time);
    }

    public String toString() {
        return "MetadataRequest(last_time=" + this.last_time + ")";
    }

    public MetadataRequest(long j) {
        this.last_time = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MetadataRequest(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() / ((long) 1000) : j);
    }

    public final long getLast_time() {
        return this.last_time;
    }
}
