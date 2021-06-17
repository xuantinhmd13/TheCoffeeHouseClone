package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00062"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetLocationByIpAddress;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "metroCode", "", "city", "ip", "latitude", "", "countryName", "regionName", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "zipCode", "regionCode", "longitude", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getCity", "()Ljava/lang/String;", "getCountryCode", "getCountryName", "getIp", "getLatitude", "()D", "getLongitude", "getMetroCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegionCode", "getRegionName", "getTimeZone", "getZipCode", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetLocationByIpAddress;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class GetLocationByIpAddress {
    @SerializedName("city")
    private final String city;
    @SerializedName("country_code")
    private final String countryCode;
    @SerializedName("country_name")
    private final String countryName;
    @SerializedName("ip")
    private final String ip;
    @SerializedName("latitude")
    private final double latitude;
    @SerializedName("longitude")
    private final double longitude;
    @SerializedName("metro_code")
    private final Integer metroCode;
    @SerializedName("region_code")
    private final String regionCode;
    @SerializedName("region_name")
    private final String regionName;
    @SerializedName("time_zone")
    private final String timeZone;
    @SerializedName("zip_code")
    private final String zipCode;

    public static /* synthetic */ GetLocationByIpAddress copy$default(GetLocationByIpAddress getLocationByIpAddress, String str, Integer num, String str2, String str3, double d, String str4, String str5, String str6, String str7, String str8, double d2, int i, Object obj) {
        return getLocationByIpAddress.copy((i & 1) != 0 ? getLocationByIpAddress.countryCode : str, (i & 2) != 0 ? getLocationByIpAddress.metroCode : num, (i & 4) != 0 ? getLocationByIpAddress.city : str2, (i & 8) != 0 ? getLocationByIpAddress.ip : str3, (i & 16) != 0 ? getLocationByIpAddress.latitude : d, (i & 32) != 0 ? getLocationByIpAddress.countryName : str4, (i & 64) != 0 ? getLocationByIpAddress.regionName : str5, (i & 128) != 0 ? getLocationByIpAddress.timeZone : str6, (i & 256) != 0 ? getLocationByIpAddress.zipCode : str7, (i & 512) != 0 ? getLocationByIpAddress.regionCode : str8, (i & 1024) != 0 ? getLocationByIpAddress.longitude : d2);
    }

    public final String component1() {
        return this.countryCode;
    }

    public final String component10() {
        return this.regionCode;
    }

    public final double component11() {
        return this.longitude;
    }

    public final Integer component2() {
        return this.metroCode;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.ip;
    }

    public final double component5() {
        return this.latitude;
    }

    public final String component6() {
        return this.countryName;
    }

    public final String component7() {
        return this.regionName;
    }

    public final String component8() {
        return this.timeZone;
    }

    public final String component9() {
        return this.zipCode;
    }

    public final GetLocationByIpAddress copy(String str, Integer num, String str2, String str3, double d, String str4, String str5, String str6, String str7, String str8, double d2) {
        return new GetLocationByIpAddress(str, num, str2, str3, d, str4, str5, str6, str7, str8, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLocationByIpAddress)) {
            return false;
        }
        GetLocationByIpAddress getLocationByIpAddress = (GetLocationByIpAddress) obj;
        return Intrinsics.areEqual(this.countryCode, getLocationByIpAddress.countryCode) && Intrinsics.areEqual(this.metroCode, getLocationByIpAddress.metroCode) && Intrinsics.areEqual(this.city, getLocationByIpAddress.city) && Intrinsics.areEqual(this.ip, getLocationByIpAddress.ip) && Double.compare(this.latitude, getLocationByIpAddress.latitude) == 0 && Intrinsics.areEqual(this.countryName, getLocationByIpAddress.countryName) && Intrinsics.areEqual(this.regionName, getLocationByIpAddress.regionName) && Intrinsics.areEqual(this.timeZone, getLocationByIpAddress.timeZone) && Intrinsics.areEqual(this.zipCode, getLocationByIpAddress.zipCode) && Intrinsics.areEqual(this.regionCode, getLocationByIpAddress.regionCode) && Double.compare(this.longitude, getLocationByIpAddress.longitude) == 0;
    }

    public int hashCode() {
        String str = this.countryCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.metroCode;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.city;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ip;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Double.hashCode(this.latitude)) * 31;
        String str4 = this.countryName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.regionName;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.timeZone;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.zipCode;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.regionCode;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((hashCode8 + i) * 31) + Double.hashCode(this.longitude);
    }

    public String toString() {
        return "GetLocationByIpAddress(countryCode=" + this.countryCode + ", metroCode=" + this.metroCode + ", city=" + this.city + ", ip=" + this.ip + ", latitude=" + this.latitude + ", countryName=" + this.countryName + ", regionName=" + this.regionName + ", timeZone=" + this.timeZone + ", zipCode=" + this.zipCode + ", regionCode=" + this.regionCode + ", longitude=" + this.longitude + ")";
    }

    public GetLocationByIpAddress(String str, Integer num, String str2, String str3, double d, String str4, String str5, String str6, String str7, String str8, double d2) {
        this.countryCode = str;
        this.metroCode = num;
        this.city = str2;
        this.ip = str3;
        this.latitude = d;
        this.countryName = str4;
        this.regionName = str5;
        this.timeZone = str6;
        this.zipCode = str7;
        this.regionCode = str8;
        this.longitude = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetLocationByIpAddress(String str, Integer num, String str2, String str3, double d, String str4, String str5, String str6, String str7, String str8, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, d, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, d2);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final Integer getMetroCode() {
        return this.metroCode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getIp() {
        return this.ip;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getRegionName() {
        return this.regionName;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final double getLongitude() {
        return this.longitude;
    }
}
