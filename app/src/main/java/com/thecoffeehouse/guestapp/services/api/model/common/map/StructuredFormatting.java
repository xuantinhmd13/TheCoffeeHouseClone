package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/StructuredFormatting;", "", "()V", "mainText", "", "getMainText", "()Ljava/lang/String;", "setMainText", "(Ljava/lang/String;)V", "mainTextMatchedSubstrings", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/MainTextMatchedSubstring;", "getMainTextMatchedSubstrings", "()Ljava/util/List;", "setMainTextMatchedSubstrings", "(Ljava/util/List;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class StructuredFormatting {
    @SerializedName("main_text")
    private String mainText;
    @SerializedName("main_text_matched_substrings")
    private List<MainTextMatchedSubstring> mainTextMatchedSubstrings;
    @SerializedName("secondary_text")
    private String secondaryText;

    public final String getMainText() {
        return this.mainText;
    }

    public final void setMainText(String str) {
        this.mainText = str;
    }

    public final List<MainTextMatchedSubstring> getMainTextMatchedSubstrings() {
        return this.mainTextMatchedSubstrings;
    }

    public final void setMainTextMatchedSubstrings(List<MainTextMatchedSubstring> list) {
        this.mainTextMatchedSubstrings = list;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final void setSecondaryText(String str) {
        this.secondaryText = str;
    }
}
