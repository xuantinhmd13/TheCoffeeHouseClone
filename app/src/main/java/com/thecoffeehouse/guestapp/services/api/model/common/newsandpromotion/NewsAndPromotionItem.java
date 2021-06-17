package com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionItem;", "", "name", "", "posts", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/PostsItem;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getPosts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetNewsAndPromotions.kt */
public final class NewsAndPromotionItem {
    @SerializedName("name")
    private final String name;
    @SerializedName("posts")
    private final List<PostsItem> posts;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsAndPromotionItem copy$default(NewsAndPromotionItem newsAndPromotionItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsAndPromotionItem.name;
        }
        if ((i & 2) != 0) {
            list = newsAndPromotionItem.posts;
        }
        return newsAndPromotionItem.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<PostsItem> component2() {
        return this.posts;
    }

    public final NewsAndPromotionItem copy(String str, List<PostsItem> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "posts");
        return new NewsAndPromotionItem(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsAndPromotionItem)) {
            return false;
        }
        NewsAndPromotionItem newsAndPromotionItem = (NewsAndPromotionItem) obj;
        return Intrinsics.areEqual(this.name, newsAndPromotionItem.name) && Intrinsics.areEqual(this.posts, newsAndPromotionItem.posts);
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<PostsItem> list = this.posts;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NewsAndPromotionItem(name=" + this.name + ", posts=" + this.posts + ")";
    }

    public NewsAndPromotionItem(String str, List<PostsItem> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "posts");
        this.name = str;
        this.posts = list;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewsAndPromotionItem(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ArrayList() : list);
    }

    public final List<PostsItem> getPosts() {
        return this.posts;
    }
}
