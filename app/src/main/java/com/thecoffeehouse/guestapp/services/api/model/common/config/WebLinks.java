package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/WebLinks;", "", "reward", "", "help", "pressRelease", "story", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHelp", "()Ljava/lang/String;", "getPressRelease", "getReward", "getStory", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class WebLinks {
    @SerializedName("help")
    private final String help;
    @SerializedName("press_release")
    private final String pressRelease;
    @SerializedName("reward")
    private final String reward;
    @SerializedName("story")
    private final String story;

    public WebLinks() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WebLinks copy$default(WebLinks webLinks, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webLinks.reward;
        }
        if ((i & 2) != 0) {
            str2 = webLinks.help;
        }
        if ((i & 4) != 0) {
            str3 = webLinks.pressRelease;
        }
        if ((i & 8) != 0) {
            str4 = webLinks.story;
        }
        return webLinks.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.reward;
    }

    public final String component2() {
        return this.help;
    }

    public final String component3() {
        return this.pressRelease;
    }

    public final String component4() {
        return this.story;
    }

    public final WebLinks copy(String str, String str2, String str3, String str4) {
        return new WebLinks(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebLinks)) {
            return false;
        }
        WebLinks webLinks = (WebLinks) obj;
        return Intrinsics.areEqual(this.reward, webLinks.reward) && Intrinsics.areEqual(this.help, webLinks.help) && Intrinsics.areEqual(this.pressRelease, webLinks.pressRelease) && Intrinsics.areEqual(this.story, webLinks.story);
    }

    public int hashCode() {
        String str = this.reward;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.help;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.pressRelease;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.story;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "WebLinks(reward=" + this.reward + ", help=" + this.help + ", pressRelease=" + this.pressRelease + ", story=" + this.story + ")";
    }

    public WebLinks(String str, String str2, String str3, String str4) {
        this.reward = str;
        this.help = str2;
        this.pressRelease = str3;
        this.story = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebLinks(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getReward() {
        return this.reward;
    }

    public final String getHelp() {
        return this.help;
    }

    public final String getPressRelease() {
        return this.pressRelease;
    }

    public final String getStory() {
        return this.story;
    }
}
