package com.thecoffeehouse.guestapp.services.api.model.common.music;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Next;", "", "name", "", "start", "", "end", "artist", "thumbnail", "album", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlbum", "()Ljava/lang/String;", "getArtist", "getEnd", "()J", "getName", "getStart", "getThumbnail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Next.kt */
public final class Next {
    @SerializedName("album")
    private final String album;
    @SerializedName("artist")
    private final String artist;
    @SerializedName("end")
    private final long end;
    @SerializedName("name")
    private final String name;
    @SerializedName("start")
    private final long start;
    @SerializedName("thumbnail")
    private final String thumbnail;

    public static /* synthetic */ Next copy$default(Next next, String str, long j, long j2, String str2, String str3, String str4, int i, Object obj) {
        return next.copy((i & 1) != 0 ? next.name : str, (i & 2) != 0 ? next.start : j, (i & 4) != 0 ? next.end : j2, (i & 8) != 0 ? next.artist : str2, (i & 16) != 0 ? next.thumbnail : str3, (i & 32) != 0 ? next.album : str4);
    }

    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.start;
    }

    public final long component3() {
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

    public final Next copy(String str, long j, long j2, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "artist");
        Intrinsics.checkNotNullParameter(str3, "thumbnail");
        Intrinsics.checkNotNullParameter(str4, "album");
        return new Next(str, j, j2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Next)) {
            return false;
        }
        Next next = (Next) obj;
        return Intrinsics.areEqual(this.name, next.name) && this.start == next.start && this.end == next.end && Intrinsics.areEqual(this.artist, next.artist) && Intrinsics.areEqual(this.thumbnail, next.thumbnail) && Intrinsics.areEqual(this.album, next.album);
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end)) * 31;
        String str2 = this.artist;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.thumbnail;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.album;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Next(name=" + this.name + ", start=" + this.start + ", end=" + this.end + ", artist=" + this.artist + ", thumbnail=" + this.thumbnail + ", album=" + this.album + ")";
    }

    public Next(String str, long j, long j2, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "artist");
        Intrinsics.checkNotNullParameter(str3, "thumbnail");
        Intrinsics.checkNotNullParameter(str4, "album");
        this.name = str;
        this.start = j;
        this.end = j2;
        this.artist = str2;
        this.thumbnail = str3;
        this.album = str4;
    }

    public final String getName() {
        return this.name;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getEnd() {
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
