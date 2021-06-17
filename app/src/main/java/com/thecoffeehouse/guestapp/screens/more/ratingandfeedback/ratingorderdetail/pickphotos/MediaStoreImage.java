package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos;

import android.net.Uri;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "", "id", "", "displayName", "", "dateAdded", "Ljava/util/Date;", "contentUri", "Landroid/net/Uri;", "selectedPosition", "", "(JLjava/lang/String;Ljava/util/Date;Landroid/net/Uri;Ljava/lang/Integer;)V", "getContentUri", "()Landroid/net/Uri;", "getDateAdded", "()Ljava/util/Date;", "getDisplayName", "()Ljava/lang/String;", "getId", "()J", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/util/Date;Landroid/net/Uri;Ljava/lang/Integer;)Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "equals", "", "other", "hashCode", "toString", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MediaStoreImage.kt */
public final class MediaStoreImage {
    public static final Companion Companion = new Companion(null);
    private static final DiffUtil.ItemCallback<MediaStoreImage> DiffCallback = new MediaStoreImage$Companion$DiffCallback$1();
    private final Uri contentUri;
    private final Date dateAdded;
    private final String displayName;
    private final long id;
    private Integer selectedPosition;

    public static /* synthetic */ MediaStoreImage copy$default(MediaStoreImage mediaStoreImage, long j, String str, Date date, Uri uri, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mediaStoreImage.id;
        }
        if ((i & 2) != 0) {
            str = mediaStoreImage.displayName;
        }
        if ((i & 4) != 0) {
            date = mediaStoreImage.dateAdded;
        }
        if ((i & 8) != 0) {
            uri = mediaStoreImage.contentUri;
        }
        if ((i & 16) != 0) {
            num = mediaStoreImage.selectedPosition;
        }
        return mediaStoreImage.copy(j, str, date, uri, num);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final Date component3() {
        return this.dateAdded;
    }

    public final Uri component4() {
        return this.contentUri;
    }

    public final Integer component5() {
        return this.selectedPosition;
    }

    public final MediaStoreImage copy(long j, String str, Date date, Uri uri, Integer num) {
        Intrinsics.checkNotNullParameter(str, "displayName");
        Intrinsics.checkNotNullParameter(date, "dateAdded");
        Intrinsics.checkNotNullParameter(uri, "contentUri");
        return new MediaStoreImage(j, str, date, uri, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStoreImage)) {
            return false;
        }
        MediaStoreImage mediaStoreImage = (MediaStoreImage) obj;
        return this.id == mediaStoreImage.id && Intrinsics.areEqual(this.displayName, mediaStoreImage.displayName) && Intrinsics.areEqual(this.dateAdded, mediaStoreImage.dateAdded) && Intrinsics.areEqual(this.contentUri, mediaStoreImage.contentUri) && Intrinsics.areEqual(this.selectedPosition, mediaStoreImage.selectedPosition);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.displayName;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Date date = this.dateAdded;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        Uri uri = this.contentUri;
        int hashCode4 = (hashCode3 + (uri != null ? uri.hashCode() : 0)) * 31;
        Integer num = this.selectedPosition;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "MediaStoreImage(id=" + this.id + ", displayName=" + this.displayName + ", dateAdded=" + this.dateAdded + ", contentUri=" + this.contentUri + ", selectedPosition=" + this.selectedPosition + ")";
    }

    public MediaStoreImage(long j, String str, Date date, Uri uri, Integer num) {
        Intrinsics.checkNotNullParameter(str, "displayName");
        Intrinsics.checkNotNullParameter(date, "dateAdded");
        Intrinsics.checkNotNullParameter(uri, "contentUri");
        this.id = j;
        this.displayName = str;
        this.dateAdded = date;
        this.contentUri = uri;
        this.selectedPosition = num;
    }

    public final long getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getDateAdded() {
        return this.dateAdded;
    }

    public final Uri getContentUri() {
        return this.contentUri;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaStoreImage(long j, String str, Date date, Uri uri, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, date, uri, (i & 16) != 0 ? null : num);
    }

    public final Integer getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(Integer num) {
        this.selectedPosition = num;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage$Companion;", "", "()V", "DiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: MediaStoreImage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DiffUtil.ItemCallback<MediaStoreImage> getDiffCallback() {
            return MediaStoreImage.DiffCallback;
        }
    }
}
