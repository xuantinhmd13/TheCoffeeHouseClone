package com.thecoffeehouse.guestapp.screens.rewards;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\f¨\u0006\u000f"}, d2 = {"getRankInfoWithTheme", "Lkotlin/Triple;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RankInfoItem;", "", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "rankInfos", "", "rank", "", "convertSecondToTimeFormat", "", "timeFormat", "secondToExpiredDate", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: RewardExts.kt */
public final class RewardExtsKt {
    public static final long secondToExpiredDate(long j) {
        return TimeUnit.MILLISECONDS.toDays(Math.abs((j * ((long) 1000)) - System.currentTimeMillis()));
    }

    public static final String convertSecondToTimeFormat(long j, String str) {
        Intrinsics.checkNotNullParameter(str, "timeFormat");
        return StringDateUtilsKt.ToFormat(new Date(j * ((long) 1000)), str);
    }

    public static final Triple<RankInfoItem, String, GradientDrawable> getRankInfoWithTheme(Context context, List<RankInfoItem> list, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "rankInfos");
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.getId() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                List<String> gradients = t2.getGradients();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(gradients, 10));
                Iterator<T> it2 = gradients.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(Color.parseColor(it2.next())));
                }
                return new Triple<>(t2, t2.getName(), new GradientDrawable(GradientDrawable.Orientation.TL_BR, CollectionsKt.toIntArray(arrayList)));
            }
            return new Triple<>(t2, "Mới", new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(context, R.color.colorEF9E59), ContextCompat.getColor(context, R.color.colorEA8024), ContextCompat.getColor(context, R.color.colorC56C1E), ContextCompat.getColor(context, R.color.colorB2611B)}));
        }
        return new Triple<>(null, "Mới", new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(context, R.color.colorEF9E59), ContextCompat.getColor(context, R.color.colorEA8024), ContextCompat.getColor(context, R.color.colorC56C1E), ContextCompat.getColor(context, R.color.colorB2611B)}));
    }
}
