package com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000e¨\u00060"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/PostsItem;", "Landroid/os/Parcelable;", "button", "", "thumbnail", "shareUrl", "publish", "", "deeplink", "title", "url", FirebaseAnalytics.Param.CONTENT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButton", "()Ljava/lang/String;", "getContent", "getDeeplink", "getPublish", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShareUrl", "getThumbnail", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/PostsItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetNewsAndPromotions.kt */
public final class PostsItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("button")
    private final String button;
    @SerializedName(FirebaseAnalytics.Param.CONTENT)
    private final String content;
    @SerializedName("deeplink")
    private final String deeplink;
    @SerializedName("publish")
    private final Integer publish;
    @SerializedName("share_url")
    private final String shareUrl;
    @SerializedName("thumbnail")
    private final String thumbnail;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private final String url;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new PostsItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostsItem[i];
        }
    }

    public PostsItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ PostsItem copy$default(PostsItem postsItem, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i, Object obj) {
        return postsItem.copy((i & 1) != 0 ? postsItem.button : str, (i & 2) != 0 ? postsItem.thumbnail : str2, (i & 4) != 0 ? postsItem.shareUrl : str3, (i & 8) != 0 ? postsItem.publish : num, (i & 16) != 0 ? postsItem.deeplink : str4, (i & 32) != 0 ? postsItem.title : str5, (i & 64) != 0 ? postsItem.url : str6, (i & 128) != 0 ? postsItem.content : str7);
    }

    public final String component1() {
        return this.button;
    }

    public final String component2() {
        return this.thumbnail;
    }

    public final String component3() {
        return this.shareUrl;
    }

    public final Integer component4() {
        return this.publish;
    }

    public final String component5() {
        return this.deeplink;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.content;
    }

    public final PostsItem copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7) {
        return new PostsItem(str, str2, str3, num, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostsItem)) {
            return false;
        }
        PostsItem postsItem = (PostsItem) obj;
        return Intrinsics.areEqual(this.button, postsItem.button) && Intrinsics.areEqual(this.thumbnail, postsItem.thumbnail) && Intrinsics.areEqual(this.shareUrl, postsItem.shareUrl) && Intrinsics.areEqual(this.publish, postsItem.publish) && Intrinsics.areEqual(this.deeplink, postsItem.deeplink) && Intrinsics.areEqual(this.title, postsItem.title) && Intrinsics.areEqual(this.url, postsItem.url) && Intrinsics.areEqual(this.content, postsItem.content);
    }

    public int hashCode() {
        String str = this.button;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.thumbnail;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.shareUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.publish;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.deeplink;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.url;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.content;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "PostsItem(button=" + this.button + ", thumbnail=" + this.thumbnail + ", shareUrl=" + this.shareUrl + ", publish=" + this.publish + ", deeplink=" + this.deeplink + ", title=" + this.title + ", url=" + this.url + ", content=" + this.content + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.button);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.shareUrl);
        Integer num = this.publish;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.content);
    }

    public PostsItem(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7) {
        this.button = str;
        this.thumbnail = str2;
        this.shareUrl = str3;
        this.publish = num;
        this.deeplink = str4;
        this.title = str5;
        this.url = str6;
        this.content = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostsItem(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }

    public final String getButton() {
        return this.button;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final Integer getPublish() {
        return this.publish;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getContent() {
        return this.content;
    }
}
