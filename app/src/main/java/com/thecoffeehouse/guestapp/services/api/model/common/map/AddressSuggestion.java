package com.thecoffeehouse.guestapp.services.api.model.common.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u000bB\u0005¢\u0006\u0002\u0010\fJ\t\u0010u\u001a\u00020)HÖ\u0001J\u0006\u0010v\u001a\u00020\u0007J\u0019\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020)HÖ\u0001R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR \u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR \u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010(\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR \u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR \u00104\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR \u00107\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR \u0010:\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R \u0010C\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR \u0010F\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001eR \u0010I\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001eR \u0010L\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001c\"\u0004\bN\u0010\u001eR \u0010O\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR \u0010U\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001c\"\u0004\bW\u0010\u001eR\"\u0010X\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bY\u0010+\"\u0004\bZ\u0010-R \u0010[\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001c\"\u0004\b]\u0010\u001eR\"\u0010^\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b_\u0010+\"\u0004\b`\u0010-R\"\u0010a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010\u0018R\u001e\u0010d\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u001c\"\u0004\bf\u0010\u001eR \u0010g\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u001c\"\u0004\bi\u0010\u001eR \u0010j\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u001c\"\u0004\bl\u0010\u001eR\u001e\u0010m\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR \u0010r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u001c\"\u0004\bt\u0010\u001e¨\u0006|"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "Landroid/os/Parcelable;", "lat", "", "lng", "(DD)V", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "fullAddress", "", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)V", "(DDLjava/lang/String;)V", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "getAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "setAddress", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;)V", "allowSave", "", "getAllowSave", "()Ljava/lang/Boolean;", "setAllowSave", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "building", "getBuilding", "()Ljava/lang/String;", "setBuilding", "(Ljava/lang/String;)V", "city", "getCity", "setCity", "distance", "getDistance", "setDistance", "district", "getDistrict", "setDistrict", "floor", "", "getFloor", "()Ljava/lang/Integer;", "setFloor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFullAddress", "setFullAddress", "gate", "getGate", "setGate", "houseDetail", "getHouseDetail", "setHouseDetail", "houseNumber", "getHouseNumber", "setHouseNumber", "id", "getId", "setId", "getLat", "()D", "setLat", "(D)V", "getLng", "setLng", "mapId", "getMapId", "setMapId", "name", "getName", "setName", "national", "getNational", "setNational", "note", "getNote", "setNote", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "setPhone", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;)V", "placeId", "getPlaceId", "setPlaceId", "position", "getPosition", "setPosition", "province", "getProvince", "setProvince", "room", "getRoom", "setRoom", "saveConfirm", "getSaveConfirm", "setSaveConfirm", "street", "getStreet", "setStreet", "title", "getTitle", "setTitle", "titleAddress", "getTitleAddress", "setTitleAddress", "type", "getType", "()I", "setType", "(I)V", "ward", "getWard", "setWard", "describeContents", "getLatLng", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class AddressSuggestion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private AddressOrder address;
    @SerializedName("allow_save")
    private Boolean allowSave;
    @SerializedName("building")
    private String building;
    @SerializedName("city")
    private String city;
    @SerializedName("distance")
    private String distance;
    @SerializedName("district")
    private String district;
    @SerializedName("floor")
    private Integer floor;
    @SerializedName("full_address")
    private String fullAddress;
    @SerializedName("gate")
    private String gate;
    @SerializedName("house_detail")
    private String houseDetail;
    @SerializedName("house_number")
    private String houseNumber;
    @SerializedName("id")
    private String id;
    @SerializedName("lat")
    private double lat;
    @SerializedName("long")
    private double lng;
    @SerializedName("map_id")
    private String mapId;
    @SerializedName("name")
    private String name;
    @SerializedName("national")
    private String national;
    @SerializedName("note")
    private String note;
    @SerializedName("phone")
    private Phone phone;
    @SerializedName("place_id")
    private String placeId;
    @SerializedName("position")
    private Integer position;
    @SerializedName("province")
    private String province;
    @SerializedName("room")
    private Integer room;
    @SerializedName("save_confirm")
    private Boolean saveConfirm;
    @SerializedName("street")
    private String street;
    @SerializedName("title")
    private String title;
    @SerializedName("title_address")
    private String titleAddress;
    @SerializedName("type")
    private int type;
    @SerializedName("ward")
    private String ward;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            if (parcel.readInt() != 0) {
                return new AddressSuggestion();
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressSuggestion[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(1);
    }

    public AddressSuggestion() {
        this.fullAddress = "";
        this.street = "";
        this.type = AddressType.INSTANCE.getGOOGLE();
    }

    public final LatLng getLatLng() {
        return new LatLng(this.lat, this.lng);
    }

    public AddressSuggestion(double d, double d2) {
        this();
        this.lat = d;
        this.lng = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddressSuggestion(LatLng latLng, String str) {
        this();
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(str, "fullAddress");
        this.lat = latLng.latitude;
        this.lng = latLng.longitude;
        this.fullAddress = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddressSuggestion(double d, double d2, String str) {
        this();
        Intrinsics.checkNotNullParameter(str, "fullAddress");
        this.lat = d;
        this.lng = d2;
        this.fullAddress = str;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final void setPlaceId(String str) {
        this.placeId = str;
    }

    public final double getLat() {
        return this.lat;
    }

    public final void setLat(double d) {
        this.lat = d;
    }

    public final double getLng() {
        return this.lng;
    }

    public final void setLng(double d) {
        this.lng = d;
    }

    public final String getHouseDetail() {
        return this.houseDetail;
    }

    public final void setHouseDetail(String str) {
        this.houseDetail = str;
    }

    public final String getBuilding() {
        return this.building;
    }

    public final void setBuilding(String str) {
        this.building = str;
    }

    public final Integer getFloor() {
        return this.floor;
    }

    public final void setFloor(Integer num) {
        this.floor = num;
    }

    public final Integer getRoom() {
        return this.room;
    }

    public final void setRoom(Integer num) {
        this.room = num;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final void setFullAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullAddress = str;
    }

    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final void setHouseNumber(String str) {
        this.houseNumber = str;
    }

    public final String getStreet() {
        return this.street;
    }

    public final void setStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.street = str;
    }

    public final String getWard() {
        return this.ward;
    }

    public final void setWard(String str) {
        this.ward = str;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final String getProvince() {
        return this.province;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public final String getCity() {
        return this.city;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final String getNational() {
        return this.national;
    }

    public final void setNational(String str) {
        this.national = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final void setPhone(Phone phone2) {
        this.phone = phone2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getTitleAddress() {
        return this.titleAddress;
    }

    public final void setTitleAddress(String str) {
        this.titleAddress = str;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final String getMapId() {
        return this.mapId;
    }

    public final void setMapId(String str) {
        this.mapId = str;
    }

    public final String getDistance() {
        return this.distance;
    }

    public final void setDistance(String str) {
        this.distance = str;
    }

    public final String getGate() {
        return this.gate;
    }

    public final void setGate(String str) {
        this.gate = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final AddressOrder getAddress() {
        return this.address;
    }

    public final void setAddress(AddressOrder addressOrder) {
        this.address = addressOrder;
    }

    public final Boolean getSaveConfirm() {
        return this.saveConfirm;
    }

    public final void setSaveConfirm(Boolean bool) {
        this.saveConfirm = bool;
    }

    public final Boolean getAllowSave() {
        return this.allowSave;
    }

    public final void setAllowSave(Boolean bool) {
        this.allowSave = bool;
    }
}
