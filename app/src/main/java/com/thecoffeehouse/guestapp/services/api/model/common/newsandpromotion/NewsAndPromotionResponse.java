package com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionResponse;", "", "newsAndPromotions", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionItem;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/Error;", "(Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/Error;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/Error;", "getNewsAndPromotions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetNewsAndPromotions.kt */
public final class NewsAndPromotionResponse {
    @SerializedName("error")
    private final Error error;
    @SerializedName("news")
    private final List<NewsAndPromotionItem> newsAndPromotions;

    public NewsAndPromotionResponse() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsAndPromotionResponse copy$default(NewsAndPromotionResponse newsAndPromotionResponse, List list, Error error2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsAndPromotionResponse.newsAndPromotions;
        }
        if ((i & 2) != 0) {
            error2 = newsAndPromotionResponse.error;
        }
        return newsAndPromotionResponse.copy(list, error2);
    }

    public final List<NewsAndPromotionItem> component1() {
        return this.newsAndPromotions;
    }

    public final Error component2() {
        return this.error;
    }

    public final NewsAndPromotionResponse copy(List<NewsAndPromotionItem> list, Error error2) {
        Intrinsics.checkNotNullParameter(list, "newsAndPromotions");
        return new NewsAndPromotionResponse(list, error2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsAndPromotionResponse)) {
            return false;
        }
        NewsAndPromotionResponse newsAndPromotionResponse = (NewsAndPromotionResponse) obj;
        return Intrinsics.areEqual(this.newsAndPromotions, newsAndPromotionResponse.newsAndPromotions) && Intrinsics.areEqual(this.error, newsAndPromotionResponse.error);
    }

    public int hashCode() {
        List<NewsAndPromotionItem> list = this.newsAndPromotions;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Error error2 = this.error;
        if (error2 != null) {
            i = error2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NewsAndPromotionResponse(newsAndPromotions=" + this.newsAndPromotions + ", error=" + this.error + ")";
    }

    public NewsAndPromotionResponse(List<NewsAndPromotionItem> list, Error error2) {
        Intrinsics.checkNotNullParameter(list, "newsAndPromotions");
        this.newsAndPromotions = list;
        this.error = error2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewsAndPromotionResponse(List list, Error error2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : error2);
    }

    public final List<NewsAndPromotionItem> getNewsAndPromotions() {
        return this.newsAndPromotions;
    }

    public final Error getError() {
        return this.error;
    }
}
