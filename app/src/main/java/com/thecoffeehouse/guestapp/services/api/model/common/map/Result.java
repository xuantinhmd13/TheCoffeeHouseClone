package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR \u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR \u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR \u0010\"\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR \u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR \u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR&\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR \u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR\"\u00106\u001a\u0004\u0018\u0001078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010=\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&¨\u0006@"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Result;", "", "()V", "addressComponents", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressComponent;", "getAddressComponents", "()Ljava/util/List;", "setAddressComponents", "(Ljava/util/List;)V", "adrAddress", "", "getAdrAddress", "()Ljava/lang/String;", "setAdrAddress", "(Ljava/lang/String;)V", "formattedAddress", "getFormattedAddress", "setFormattedAddress", "geometry", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;", "getGeometry", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;", "setGeometry", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;)V", "icon", "getIcon", "setIcon", "id", "getId", "setId", "name", "getName", "setName", "photos", "getPhotos", "()Ljava/lang/Object;", "setPhotos", "(Ljava/lang/Object;)V", "placeId", "getPlaceId", "setPlaceId", "reference", "getReference", "setReference", "scope", "getScope", "setScope", "types", "getTypes", "setTypes", "url", "getUrl", "setUrl", "utcOffset", "", "getUtcOffset", "()Ljava/lang/Integer;", "setUtcOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "vicinity", "getVicinity", "setVicinity", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class Result {
    @SerializedName("address_components")
    private List<AddressComponent> addressComponents;
    @SerializedName("adr_address")
    private String adrAddress;
    @SerializedName("formatted_address")
    private String formattedAddress;
    @SerializedName("geometry")
    private Geometry geometry;
    @SerializedName("icon")
    private String icon;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("photos")
    private Object photos;
    @SerializedName("place_id")
    private String placeId;
    @SerializedName("reference")
    private String reference;
    @SerializedName("scope")
    private String scope;
    @SerializedName("types")
    private List<String> types;
    @SerializedName("url")
    private String url;
    @SerializedName("utc_offset")
    private Integer utcOffset;
    @SerializedName("vicinity")
    private Object vicinity;

    public final List<AddressComponent> getAddressComponents() {
        return this.addressComponents;
    }

    public final void setAddressComponents(List<AddressComponent> list) {
        this.addressComponents = list;
    }

    public final String getAdrAddress() {
        return this.adrAddress;
    }

    public final void setAdrAddress(String str) {
        this.adrAddress = str;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final void setFormattedAddress(String str) {
        this.formattedAddress = str;
    }

    public final Geometry getGeometry() {
        return this.geometry;
    }

    public final void setGeometry(Geometry geometry2) {
        this.geometry = geometry2;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final Object getPhotos() {
        return this.photos;
    }

    public final void setPhotos(Object obj) {
        this.photos = obj;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final void setPlaceId(String str) {
        this.placeId = str;
    }

    public final String getReference() {
        return this.reference;
    }

    public final void setReference(String str) {
        this.reference = str;
    }

    public final String getScope() {
        return this.scope;
    }

    public final void setScope(String str) {
        this.scope = str;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final Integer getUtcOffset() {
        return this.utcOffset;
    }

    public final void setUtcOffset(Integer num) {
        this.utcOffset = num;
    }

    public final Object getVicinity() {
        return this.vicinity;
    }

    public final void setVicinity(Object obj) {
        this.vicinity = obj;
    }
}
