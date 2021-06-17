package com.thecoffeehouse.guestapp.services.api.model.common.music;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "", "previous", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Previous;", "current", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Current;", "next", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Next;", "schedulerTime", "", "expire", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Previous;Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Current;Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Next;Ljava/lang/String;Ljava/lang/Integer;)V", "getCurrent", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Current;", "getExpire", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Next;", "getPrevious", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Previous;", "getSchedulerTime", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Previous;Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Current;Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Next;Ljava/lang/String;Ljava/lang/Integer;)Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MusicResponse.kt */
public final class MusicResponse {
    @SerializedName("current")
    private final Current current;
    @SerializedName("expire")
    private final Integer expire;
    @SerializedName("next")
    private final Next next;
    @SerializedName("previous")
    private final Previous previous;
    @SerializedName("schedulerTime")
    private final String schedulerTime;

    public MusicResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MusicResponse copy$default(MusicResponse musicResponse, Previous previous2, Current current2, Next next2, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            previous2 = musicResponse.previous;
        }
        if ((i & 2) != 0) {
            current2 = musicResponse.current;
        }
        if ((i & 4) != 0) {
            next2 = musicResponse.next;
        }
        if ((i & 8) != 0) {
            str = musicResponse.schedulerTime;
        }
        if ((i & 16) != 0) {
            num = musicResponse.expire;
        }
        return musicResponse.copy(previous2, current2, next2, str, num);
    }

    public final Previous component1() {
        return this.previous;
    }

    public final Current component2() {
        return this.current;
    }

    public final Next component3() {
        return this.next;
    }

    public final String component4() {
        return this.schedulerTime;
    }

    public final Integer component5() {
        return this.expire;
    }

    public final MusicResponse copy(Previous previous2, Current current2, Next next2, String str, Integer num) {
        return new MusicResponse(previous2, current2, next2, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicResponse)) {
            return false;
        }
        MusicResponse musicResponse = (MusicResponse) obj;
        return Intrinsics.areEqual(this.previous, musicResponse.previous) && Intrinsics.areEqual(this.current, musicResponse.current) && Intrinsics.areEqual(this.next, musicResponse.next) && Intrinsics.areEqual(this.schedulerTime, musicResponse.schedulerTime) && Intrinsics.areEqual(this.expire, musicResponse.expire);
    }

    public int hashCode() {
        Previous previous2 = this.previous;
        int i = 0;
        int hashCode = (previous2 != null ? previous2.hashCode() : 0) * 31;
        Current current2 = this.current;
        int hashCode2 = (hashCode + (current2 != null ? current2.hashCode() : 0)) * 31;
        Next next2 = this.next;
        int hashCode3 = (hashCode2 + (next2 != null ? next2.hashCode() : 0)) * 31;
        String str = this.schedulerTime;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.expire;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "MusicResponse(previous=" + this.previous + ", current=" + this.current + ", next=" + this.next + ", schedulerTime=" + this.schedulerTime + ", expire=" + this.expire + ")";
    }

    public MusicResponse(Previous previous2, Current current2, Next next2, String str, Integer num) {
        this.previous = previous2;
        this.current = current2;
        this.next = next2;
        this.schedulerTime = str;
        this.expire = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicResponse(Previous previous2, Current current2, Next next2, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : previous2, (i & 2) != 0 ? null : current2, (i & 4) != 0 ? null : next2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num);
    }

    public final Previous getPrevious() {
        return this.previous;
    }

    public final Current getCurrent() {
        return this.current;
    }

    public final Next getNext() {
        return this.next;
    }

    public final String getSchedulerTime() {
        return this.schedulerTime;
    }

    public final Integer getExpire() {
        return this.expire;
    }
}
