package com.thecoffeehouse.guestapp.views.base;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/base/IRoundableDrawable;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "isRound", "", "()Z", "setRound", "(Z)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: IRoundableDrawable.kt */
public interface IRoundableDrawable {
    Drawable getDrawable();

    boolean isRound();

    void setDrawable(Drawable drawable);

    void setRound(boolean z);
}
