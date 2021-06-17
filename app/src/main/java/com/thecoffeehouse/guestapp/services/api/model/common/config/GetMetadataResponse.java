package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010%j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`&¢\u0006\u0002\u0010'J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010P\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010FJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010R\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00104J\u001d\u0010X\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010%j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`&HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\t\u0010[\u001a\u00020\fHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0014HÆ\u0003J¬\u0002\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010%j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`&HÆ\u0001¢\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020\u001a2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\u0005HÖ\u0001J\t\u0010e\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u001a\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b6\u00104R\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R*\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010%j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`&8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bH\u0010FR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010J¨\u0006f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "", "webLinks", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/WebLinks;", "lastUpdate", "", "payments", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PaymentsItem;", "shippingPayment", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;", "ratingCategories", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RatingCategories;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "defaultString", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DefaultString;", "cancelReasons", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "timezone", "", "callCenter", "rankInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RankInfoItem;", "pingDeviceConnected", "updateOptional", "", "updateRequired", "shipperFreq", "", "authHaravan", "brandingImage", "mediaBackground", "eventCards", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/EventCard;", "feedbackOrderCount", "shippingMethods", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/config/WebLinks;Ljava/lang/Integer;Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RatingCategories;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DefaultString;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getAuthHaravan", "()Ljava/lang/String;", "getBrandingImage", "getCallCenter", "getCancelReasons", "()Ljava/util/List;", "getDefaultString", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DefaultString;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getEventCards", "getFeedbackOrderCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastUpdate", "getMediaBackground", "getPayments", "getPingDeviceConnected", "getRankInfo", "getRatingCategories", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RatingCategories;", "getShipperFreq", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShippingMethods", "()Ljava/util/ArrayList;", "getShippingPayment", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;", "getTimezone", "getUpdateOptional", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUpdateRequired", "getWebLinks", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/config/WebLinks;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/config/WebLinks;Ljava/lang/Integer;Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RatingCategories;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Lcom/thecoffeehouse/guestapp/services/api/model/common/config/DefaultString;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "equals", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class GetMetadataResponse {
    @SerializedName("auth_haravan")
    private final String authHaravan;
    @SerializedName("branding_image")
    private final String brandingImage;
    @SerializedName("call_center")
    private final String callCenter;
    @SerializedName("cancel_reasons")
    private final List<CancelReasonsItem> cancelReasons;
    @SerializedName("default_string")
    private final DefaultString defaultString;
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("event_cards")
    private final List<EventCard> eventCards;
    @SerializedName("feedback_orders")
    private final Integer feedbackOrderCount;
    @SerializedName("last_update")
    private final Integer lastUpdate;
    @SerializedName("media_background")
    private final String mediaBackground;
    @SerializedName("payments")
    private final List<PaymentsItem> payments;
    @SerializedName("ping_device_connected")
    private final String pingDeviceConnected;
    @SerializedName("rank_info")
    private final List<RankInfoItem> rankInfo;
    @SerializedName("rating_categories")
    private final RatingCategories ratingCategories;
    @SerializedName("shipping_freq")
    private final Long shipperFreq;
    @SerializedName("shipping_method")
    private final ArrayList<String> shippingMethods;
    @SerializedName("shipping_payments")
    private final ShippingPayment shippingPayment;
    @SerializedName("timezone")
    private final String timezone;
    @SerializedName("update_optional")
    private final Boolean updateOptional;
    @SerializedName("update_required")
    private final Boolean updateRequired;
    @SerializedName("web_links")
    private final WebLinks webLinks;

    public static /* synthetic */ GetMetadataResponse copy$default(GetMetadataResponse getMetadataResponse, WebLinks webLinks2, Integer num, List list, ShippingPayment shippingPayment2, RatingCategories ratingCategories2, ServerError serverError, DefaultString defaultString2, List list2, String str, String str2, List list3, String str3, Boolean bool, Boolean bool2, Long l, String str4, String str5, String str6, List list4, Integer num2, ArrayList arrayList, int i, Object obj) {
        return getMetadataResponse.copy((i & 1) != 0 ? getMetadataResponse.webLinks : webLinks2, (i & 2) != 0 ? getMetadataResponse.lastUpdate : num, (i & 4) != 0 ? getMetadataResponse.payments : list, (i & 8) != 0 ? getMetadataResponse.shippingPayment : shippingPayment2, (i & 16) != 0 ? getMetadataResponse.ratingCategories : ratingCategories2, (i & 32) != 0 ? getMetadataResponse.error : serverError, (i & 64) != 0 ? getMetadataResponse.defaultString : defaultString2, (i & 128) != 0 ? getMetadataResponse.cancelReasons : list2, (i & 256) != 0 ? getMetadataResponse.timezone : str, (i & 512) != 0 ? getMetadataResponse.callCenter : str2, (i & 1024) != 0 ? getMetadataResponse.rankInfo : list3, (i & 2048) != 0 ? getMetadataResponse.pingDeviceConnected : str3, (i & 4096) != 0 ? getMetadataResponse.updateOptional : bool, (i & 8192) != 0 ? getMetadataResponse.updateRequired : bool2, (i & 16384) != 0 ? getMetadataResponse.shipperFreq : l, (i & 32768) != 0 ? getMetadataResponse.authHaravan : str4, (i & 65536) != 0 ? getMetadataResponse.brandingImage : str5, (i & 131072) != 0 ? getMetadataResponse.mediaBackground : str6, (i & 262144) != 0 ? getMetadataResponse.eventCards : list4, (i & 524288) != 0 ? getMetadataResponse.feedbackOrderCount : num2, (i & 1048576) != 0 ? getMetadataResponse.shippingMethods : arrayList);
    }

    public final WebLinks component1() {
        return this.webLinks;
    }

    public final String component10() {
        return this.callCenter;
    }

    public final List<RankInfoItem> component11() {
        return this.rankInfo;
    }

    public final String component12() {
        return this.pingDeviceConnected;
    }

    public final Boolean component13() {
        return this.updateOptional;
    }

    public final Boolean component14() {
        return this.updateRequired;
    }

    public final Long component15() {
        return this.shipperFreq;
    }

    public final String component16() {
        return this.authHaravan;
    }

    public final String component17() {
        return this.brandingImage;
    }

    public final String component18() {
        return this.mediaBackground;
    }

    public final List<EventCard> component19() {
        return this.eventCards;
    }

    public final Integer component2() {
        return this.lastUpdate;
    }

    public final Integer component20() {
        return this.feedbackOrderCount;
    }

    public final ArrayList<String> component21() {
        return this.shippingMethods;
    }

    public final List<PaymentsItem> component3() {
        return this.payments;
    }

    public final ShippingPayment component4() {
        return this.shippingPayment;
    }

    public final RatingCategories component5() {
        return this.ratingCategories;
    }

    public final ServerError component6() {
        return this.error;
    }

    public final DefaultString component7() {
        return this.defaultString;
    }

    public final List<CancelReasonsItem> component8() {
        return this.cancelReasons;
    }

    public final String component9() {
        return this.timezone;
    }

    public final GetMetadataResponse copy(WebLinks webLinks2, Integer num, List<PaymentsItem> list, ShippingPayment shippingPayment2, RatingCategories ratingCategories2, ServerError serverError, DefaultString defaultString2, List<CancelReasonsItem> list2, String str, String str2, List<RankInfoItem> list3, String str3, Boolean bool, Boolean bool2, Long l, String str4, String str5, String str6, List<EventCard> list4, Integer num2, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(list, "payments");
        Intrinsics.checkNotNullParameter(shippingPayment2, "shippingPayment");
        Intrinsics.checkNotNullParameter(ratingCategories2, "ratingCategories");
        Intrinsics.checkNotNullParameter(list2, "cancelReasons");
        return new GetMetadataResponse(webLinks2, num, list, shippingPayment2, ratingCategories2, serverError, defaultString2, list2, str, str2, list3, str3, bool, bool2, l, str4, str5, str6, list4, num2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMetadataResponse)) {
            return false;
        }
        GetMetadataResponse getMetadataResponse = (GetMetadataResponse) obj;
        return Intrinsics.areEqual(this.webLinks, getMetadataResponse.webLinks) && Intrinsics.areEqual(this.lastUpdate, getMetadataResponse.lastUpdate) && Intrinsics.areEqual(this.payments, getMetadataResponse.payments) && Intrinsics.areEqual(this.shippingPayment, getMetadataResponse.shippingPayment) && Intrinsics.areEqual(this.ratingCategories, getMetadataResponse.ratingCategories) && Intrinsics.areEqual(this.error, getMetadataResponse.error) && Intrinsics.areEqual(this.defaultString, getMetadataResponse.defaultString) && Intrinsics.areEqual(this.cancelReasons, getMetadataResponse.cancelReasons) && Intrinsics.areEqual(this.timezone, getMetadataResponse.timezone) && Intrinsics.areEqual(this.callCenter, getMetadataResponse.callCenter) && Intrinsics.areEqual(this.rankInfo, getMetadataResponse.rankInfo) && Intrinsics.areEqual(this.pingDeviceConnected, getMetadataResponse.pingDeviceConnected) && Intrinsics.areEqual(this.updateOptional, getMetadataResponse.updateOptional) && Intrinsics.areEqual(this.updateRequired, getMetadataResponse.updateRequired) && Intrinsics.areEqual(this.shipperFreq, getMetadataResponse.shipperFreq) && Intrinsics.areEqual(this.authHaravan, getMetadataResponse.authHaravan) && Intrinsics.areEqual(this.brandingImage, getMetadataResponse.brandingImage) && Intrinsics.areEqual(this.mediaBackground, getMetadataResponse.mediaBackground) && Intrinsics.areEqual(this.eventCards, getMetadataResponse.eventCards) && Intrinsics.areEqual(this.feedbackOrderCount, getMetadataResponse.feedbackOrderCount) && Intrinsics.areEqual(this.shippingMethods, getMetadataResponse.shippingMethods);
    }

    public int hashCode() {
        WebLinks webLinks2 = this.webLinks;
        int i = 0;
        int hashCode = (webLinks2 != null ? webLinks2.hashCode() : 0) * 31;
        Integer num = this.lastUpdate;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        List<PaymentsItem> list = this.payments;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ShippingPayment shippingPayment2 = this.shippingPayment;
        int hashCode4 = (hashCode3 + (shippingPayment2 != null ? shippingPayment2.hashCode() : 0)) * 31;
        RatingCategories ratingCategories2 = this.ratingCategories;
        int hashCode5 = (hashCode4 + (ratingCategories2 != null ? ratingCategories2.hashCode() : 0)) * 31;
        ServerError serverError = this.error;
        int hashCode6 = (hashCode5 + (serverError != null ? serverError.hashCode() : 0)) * 31;
        DefaultString defaultString2 = this.defaultString;
        int hashCode7 = (hashCode6 + (defaultString2 != null ? defaultString2.hashCode() : 0)) * 31;
        List<CancelReasonsItem> list2 = this.cancelReasons;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.timezone;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.callCenter;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<RankInfoItem> list3 = this.rankInfo;
        int hashCode11 = (hashCode10 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str3 = this.pingDeviceConnected;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.updateOptional;
        int hashCode13 = (hashCode12 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.updateRequired;
        int hashCode14 = (hashCode13 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Long l = this.shipperFreq;
        int hashCode15 = (hashCode14 + (l != null ? l.hashCode() : 0)) * 31;
        String str4 = this.authHaravan;
        int hashCode16 = (hashCode15 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.brandingImage;
        int hashCode17 = (hashCode16 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mediaBackground;
        int hashCode18 = (hashCode17 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<EventCard> list4 = this.eventCards;
        int hashCode19 = (hashCode18 + (list4 != null ? list4.hashCode() : 0)) * 31;
        Integer num2 = this.feedbackOrderCount;
        int hashCode20 = (hashCode19 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ArrayList<String> arrayList = this.shippingMethods;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode20 + i;
    }

    public String toString() {
        return "GetMetadataResponse(webLinks=" + this.webLinks + ", lastUpdate=" + this.lastUpdate + ", payments=" + this.payments + ", shippingPayment=" + this.shippingPayment + ", ratingCategories=" + this.ratingCategories + ", error=" + this.error + ", defaultString=" + this.defaultString + ", cancelReasons=" + this.cancelReasons + ", timezone=" + this.timezone + ", callCenter=" + this.callCenter + ", rankInfo=" + this.rankInfo + ", pingDeviceConnected=" + this.pingDeviceConnected + ", updateOptional=" + this.updateOptional + ", updateRequired=" + this.updateRequired + ", shipperFreq=" + this.shipperFreq + ", authHaravan=" + this.authHaravan + ", brandingImage=" + this.brandingImage + ", mediaBackground=" + this.mediaBackground + ", eventCards=" + this.eventCards + ", feedbackOrderCount=" + this.feedbackOrderCount + ", shippingMethods=" + this.shippingMethods + ")";
    }

    public GetMetadataResponse(WebLinks webLinks2, Integer num, List<PaymentsItem> list, ShippingPayment shippingPayment2, RatingCategories ratingCategories2, ServerError serverError, DefaultString defaultString2, List<CancelReasonsItem> list2, String str, String str2, List<RankInfoItem> list3, String str3, Boolean bool, Boolean bool2, Long l, String str4, String str5, String str6, List<EventCard> list4, Integer num2, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(list, "payments");
        Intrinsics.checkNotNullParameter(shippingPayment2, "shippingPayment");
        Intrinsics.checkNotNullParameter(ratingCategories2, "ratingCategories");
        Intrinsics.checkNotNullParameter(list2, "cancelReasons");
        this.webLinks = webLinks2;
        this.lastUpdate = num;
        this.payments = list;
        this.shippingPayment = shippingPayment2;
        this.ratingCategories = ratingCategories2;
        this.error = serverError;
        this.defaultString = defaultString2;
        this.cancelReasons = list2;
        this.timezone = str;
        this.callCenter = str2;
        this.rankInfo = list3;
        this.pingDeviceConnected = str3;
        this.updateOptional = bool;
        this.updateRequired = bool2;
        this.shipperFreq = l;
        this.authHaravan = str4;
        this.brandingImage = str5;
        this.mediaBackground = str6;
        this.eventCards = list4;
        this.feedbackOrderCount = num2;
        this.shippingMethods = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetMetadataResponse(WebLinks webLinks2, Integer num, List list, ShippingPayment shippingPayment2, RatingCategories ratingCategories2, ServerError serverError, DefaultString defaultString2, List list2, String str, String str2, List list3, String str3, Boolean bool, Boolean bool2, Long l, String str4, String str5, String str6, List list4, Integer num2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : webLinks2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new ArrayList() : list, shippingPayment2, ratingCategories2, (i & 32) != 0 ? null : serverError, (i & 64) != 0 ? null : defaultString2, (i & 128) != 0 ? new ArrayList() : list2, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? new ArrayList() : list3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? false : bool, (i & 8192) != 0 ? false : bool2, (i & 16384) != 0 ? 5L : l, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : str5, (131072 & i) != 0 ? null : str6, (262144 & i) != 0 ? new ArrayList() : list4, (524288 & i) != 0 ? null : num2, (i & 1048576) != 0 ? null : arrayList);
    }

    public final WebLinks getWebLinks() {
        return this.webLinks;
    }

    public final Integer getLastUpdate() {
        return this.lastUpdate;
    }

    public final List<PaymentsItem> getPayments() {
        return this.payments;
    }

    public final ShippingPayment getShippingPayment() {
        return this.shippingPayment;
    }

    public final RatingCategories getRatingCategories() {
        return this.ratingCategories;
    }

    public final ServerError getError() {
        return this.error;
    }

    public final DefaultString getDefaultString() {
        return this.defaultString;
    }

    public final List<CancelReasonsItem> getCancelReasons() {
        return this.cancelReasons;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getCallCenter() {
        return this.callCenter;
    }

    public final List<RankInfoItem> getRankInfo() {
        return this.rankInfo;
    }

    public final String getPingDeviceConnected() {
        return this.pingDeviceConnected;
    }

    public final Boolean getUpdateOptional() {
        return this.updateOptional;
    }

    public final Boolean getUpdateRequired() {
        return this.updateRequired;
    }

    public final Long getShipperFreq() {
        return this.shipperFreq;
    }

    public final String getAuthHaravan() {
        return this.authHaravan;
    }

    public final String getBrandingImage() {
        return this.brandingImage;
    }

    public final String getMediaBackground() {
        return this.mediaBackground;
    }

    public final List<EventCard> getEventCards() {
        return this.eventCards;
    }

    public final Integer getFeedbackOrderCount() {
        return this.feedbackOrderCount;
    }

    public final ArrayList<String> getShippingMethods() {
        return this.shippingMethods;
    }
}
