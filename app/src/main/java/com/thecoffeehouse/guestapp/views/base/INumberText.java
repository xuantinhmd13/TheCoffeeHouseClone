package com.thecoffeehouse.guestapp.views.base;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0010\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/base/INumberText;", "", "cutWithNumberInRightDecimal", "", "getCutWithNumberInRightDecimal", "()I", "setCutWithNumberInRightDecimal", "(I)V", "isThousandsSeparate", "", "()Z", "setThousandsSeparate", "(Z)V", "minNumberInLeftDecimal", "getMinNumberInLeftDecimal", "setMinNumberInLeftDecimal", "roundWithNumberInRightDecimal", "getRoundWithNumberInRightDecimal", "setRoundWithNumberInRightDecimal", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: INumberText.kt */
public interface INumberText {
    int getCutWithNumberInRightDecimal();

    int getMinNumberInLeftDecimal();

    int getRoundWithNumberInRightDecimal();

    boolean isThousandsSeparate();

    void setCutWithNumberInRightDecimal(int i);

    void setMinNumberInLeftDecimal(int i);

    void setRoundWithNumberInRightDecimal(int i);

    void setThousandsSeparate(boolean z);
}
