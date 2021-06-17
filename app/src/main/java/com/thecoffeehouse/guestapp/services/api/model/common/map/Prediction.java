package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR&\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001e\u0010 \u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010)\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR \u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R&\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR&\u00106\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\t¨\u00069"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Prediction;", "", "()V", "addressComponents", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressComponent;", "getAddressComponents", "()Ljava/util/List;", "setAddressComponents", "(Ljava/util/List;)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "formattedAddress", "getFormattedAddress", "setFormattedAddress", "geometry", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;", "getGeometry", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;", "setGeometry", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;)V", "id", "getId", "setId", "matchedSubstrings", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/MatchedSubstring;", "getMatchedSubstrings", "setMatchedSubstrings", "placeId", "getPlaceId", "setPlaceId", "plusCode", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlusCode;", "getPlusCode", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlusCode;", "setPlusCode", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlusCode;)V", "reference", "getReference", "setReference", "structuredFormatting", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/StructuredFormatting;", "getStructuredFormatting", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/StructuredFormatting;", "setStructuredFormatting", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/StructuredFormatting;)V", "terms", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Term;", "getTerms", "setTerms", "types", "getTypes", "setTypes", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class Prediction {
    @SerializedName("address_components")
    private List<AddressComponent> addressComponents;
    @SerializedName("description")
    private String description;
    @SerializedName("formatted_address")
    private String formattedAddress;
    @SerializedName("geometry")
    private Geometry geometry;
    @SerializedName("id")
    private String id;
    @SerializedName("matched_substrings")
    private List<MatchedSubstring> matchedSubstrings;
    @SerializedName("place_id")
    private String placeId = "";
    @SerializedName("plus_code")
    private PlusCode plusCode;
    @SerializedName("reference")
    private String reference;
    @SerializedName("structured_formatting")
    private StructuredFormatting structuredFormatting;
    @SerializedName("terms")
    private List<Term> terms;
    @SerializedName("types")
    private List<? extends Object> types;

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final List<MatchedSubstring> getMatchedSubstrings() {
        return this.matchedSubstrings;
    }

    public final void setMatchedSubstrings(List<MatchedSubstring> list) {
        this.matchedSubstrings = list;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final void setPlaceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeId = str;
    }

    public final String getReference() {
        return this.reference;
    }

    public final void setReference(String str) {
        this.reference = str;
    }

    public final StructuredFormatting getStructuredFormatting() {
        return this.structuredFormatting;
    }

    public final void setStructuredFormatting(StructuredFormatting structuredFormatting2) {
        this.structuredFormatting = structuredFormatting2;
    }

    public final List<Term> getTerms() {
        return this.terms;
    }

    public final void setTerms(List<Term> list) {
        this.terms = list;
    }

    public final List<Object> getTypes() {
        return this.types;
    }

    public final void setTypes(List<? extends Object> list) {
        this.types = list;
    }

    public final List<AddressComponent> getAddressComponents() {
        return this.addressComponents;
    }

    public final void setAddressComponents(List<AddressComponent> list) {
        this.addressComponents = list;
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

    public final PlusCode getPlusCode() {
        return this.plusCode;
    }

    public final void setPlusCode(PlusCode plusCode2) {
        this.plusCode = plusCode2;
    }
}
