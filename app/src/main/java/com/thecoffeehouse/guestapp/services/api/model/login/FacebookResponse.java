package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/FacebookResponse;", "", "id", "", "name", "first_name", "last_name", "birthday", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "getEmail", "getFirst_name", "getId", "getLast_name", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class FacebookResponse {
    @SerializedName("birthday")
    private final String birthday;
    @SerializedName("email")
    private final String email;
    @SerializedName("first_name")
    private final String first_name;
    @SerializedName("id")
    private final String id;
    @SerializedName("last_name")
    private final String last_name;
    @SerializedName("name")
    private final String name;

    public static /* synthetic */ FacebookResponse copy$default(FacebookResponse facebookResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facebookResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = facebookResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = facebookResponse.first_name;
        }
        if ((i & 8) != 0) {
            str4 = facebookResponse.last_name;
        }
        if ((i & 16) != 0) {
            str5 = facebookResponse.birthday;
        }
        if ((i & 32) != 0) {
            str6 = facebookResponse.email;
        }
        return facebookResponse.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.first_name;
    }

    public final String component4() {
        return this.last_name;
    }

    public final String component5() {
        return this.birthday;
    }

    public final String component6() {
        return this.email;
    }

    public final FacebookResponse copy(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "id");
        return new FacebookResponse(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacebookResponse)) {
            return false;
        }
        FacebookResponse facebookResponse = (FacebookResponse) obj;
        return Intrinsics.areEqual(this.id, facebookResponse.id) && Intrinsics.areEqual(this.name, facebookResponse.name) && Intrinsics.areEqual(this.first_name, facebookResponse.first_name) && Intrinsics.areEqual(this.last_name, facebookResponse.last_name) && Intrinsics.areEqual(this.birthday, facebookResponse.birthday) && Intrinsics.areEqual(this.email, facebookResponse.email);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.first_name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.last_name;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.birthday;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.email;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "FacebookResponse(id=" + this.id + ", name=" + this.name + ", first_name=" + this.first_name + ", last_name=" + this.last_name + ", birthday=" + this.birthday + ", email=" + this.email + ")";
    }

    public FacebookResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.id = str;
        this.name = str2;
        this.first_name = str3;
        this.last_name = str4;
        this.birthday = str5;
        this.email = str6;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FacebookResponse(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public final String getName() {
        return this.name;
    }

    public final String getFirst_name() {
        return this.first_name;
    }

    public final String getLast_name() {
        return this.last_name;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getEmail() {
        return this.email;
    }
}
