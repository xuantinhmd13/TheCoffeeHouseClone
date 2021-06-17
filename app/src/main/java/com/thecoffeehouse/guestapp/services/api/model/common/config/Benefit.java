package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/Benefit;", "", "icon", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class Benefit {
    @SerializedName("icon")
    private final String icon;
    @SerializedName("name")
    private final String name;

    public Benefit() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Benefit copy$default(Benefit benefit, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benefit.icon;
        }
        if ((i & 2) != 0) {
            str2 = benefit.name;
        }
        return benefit.copy(str, str2);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.name;
    }

    public final Benefit copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "icon");
        Intrinsics.checkNotNullParameter(str2, "name");
        return new Benefit(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) obj;
        return Intrinsics.areEqual(this.icon, benefit.icon) && Intrinsics.areEqual(this.name, benefit.name);
    }

    public int hashCode() {
        String str = this.icon;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Benefit(icon=" + this.icon + ", name=" + this.name + ")";
    }

    public Benefit(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "icon");
        Intrinsics.checkNotNullParameter(str2, "name");
        this.icon = str;
        this.name = str2;
    }

    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Benefit(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getName() {
        return this.name;
    }
}
