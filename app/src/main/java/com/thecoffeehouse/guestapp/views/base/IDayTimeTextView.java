package com.thecoffeehouse.guestapp.views.base;

import java.util.Date;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/base/IDayTimeTextView;", "", "dateInputFormat", "", "getDateInputFormat", "()Ljava/lang/String;", "setDateInputFormat", "(Ljava/lang/String;)V", "dateObject", "Ljava/util/Date;", "getDateObject", "()Ljava/util/Date;", "setDateObject", "(Ljava/util/Date;)V", "dateOutputFormat", "getDateOutputFormat", "setDateOutputFormat", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: IDayTimeTextView.kt */
public interface IDayTimeTextView {
    String getDateInputFormat();

    Date getDateObject();

    String getDateOutputFormat();

    void setDateInputFormat(String str);

    void setDateObject(Date date);

    void setDateOutputFormat(String str);
}
