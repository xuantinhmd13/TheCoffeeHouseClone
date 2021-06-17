package com.thecoffeehouse.guestapp.services.api.model.common.music;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\""}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Current;", "", "name", "", "start", "", "end", "artist", "thumbnail", "album", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlbum", "()Ljava/lang/String;", "getArtist", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getStart", "getThumbnail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Current;", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Current.kt */
public final class Current {
    @SerializedName("album")
    private final String album;
    @SerializedName("artist")
    private final String artist;
    @SerializedName("end")
    private final Long end;
    @SerializedName("name")
    private final String name;
    @SerializedName("start")
    private final Long start;
    @SerializedName("thumbnail")
    private final String thumbnail;

    public Current() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Current copy$default(Current current, String str, Long l, Long l2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = current.name;
        }
        if ((i & 2) != 0) {
            l = current.start;
        }
        if ((i & 4) != 0) {
            l2 = current.end;
        }
        if ((i & 8) != 0) {
            str2 = current.artist;
        }
        if ((i & 16) != 0) {
            str3 = current.thumbnail;
        }
        if ((i & 32) != 0) {
            str4 = current.album;
        }
        return current.copy(str, l, l2, str2, str3, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final Long component2() {
        return this.start;
    }

    public final Long component3() {
        return this.end;
    }

    public final String component4() {
        return this.artist;
    }

    public final String component5() {
        return this.thumbnail;
    }

    public final String component6() {
        return this.album;
    }

    public final Current copy(String str, Long l, Long l2, String str2, String str3, String str4) {
        return new Current(str, l, l2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Current)) {
            return false;
        }
        Current current = (Current) obj;
        return Intrinsics.areEqual(this.name, current.name) && Intrinsics.areEqual(this.start, current.start) && Intrinsics.areEqual(this.end, current.end) && Intrinsics.areEqual(this.artist, current.artist) && Intrinsics.areEqual(this.thumbnail, current.thumbnail) && Intrinsics.areEqual(this.album, current.album);
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.start;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.end;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.artist;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.thumbnail;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.album;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "Current(name=" + this.name + ", start=" + this.start + ", end=" + this.end + ", artist=" + this.artist + ", thumbnail=" + this.thumbnail + ", album=" + this.album + ")";
    }

    public Current(String str, Long l, Long l2, String str2, String str3, String str4) {
        this.name = str;
        this.start = l;
        this.end = l2;
        this.artist = str2;
        this.thumbnail = str3;
        this.album = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Current(String str, Long l, Long l2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    public final String getName() {
        return this.name;
    }

    public final Long getStart() {
        return this.start;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getAlbum() {
        return this.album;
    }
}
