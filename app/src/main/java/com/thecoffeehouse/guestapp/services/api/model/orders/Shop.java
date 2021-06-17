package com.thecoffeehouse.guestapp.services.api.model.orders;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\"\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR&\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\b¨\u0006/"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;", "", "()V", "adapter", "", "getAdapter", "()Ljava/lang/String;", "setAdapter", "(Ljava/lang/String;)V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "getAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "setAddress", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;)V", "ahamoveService", "getAhamoveService", "setAhamoveService", "dis", "", "getDis", "()Ljava/lang/Double;", "setDis", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "getName", "setName", "posId", "getPosId", "setPosId", NotificationCompat.CATEGORY_SERVICE, "", "getService", "()Ljava/util/List;", "setService", "(Ljava/util/List;)V", "tchService", "getTchService", "setTchService", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Shop {
    @SerializedName("adapter")
    private String adapter;
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private AddressOrder address;
    @SerializedName("ahamove_service")
    private String ahamoveService;
    @SerializedName("dis")
    private Double dis;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("pos_id")
    private Integer posId;
    @SerializedName(NotificationCompat.CATEGORY_SERVICE)
    private List<String> service;
    @SerializedName("tch_service")
    private String tchService;

    public final Integer getId() {
        return this.id;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final Integer getPosId() {
        return this.posId;
    }

    public final void setPosId(Integer num) {
        this.posId = num;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getAdapter() {
        return this.adapter;
    }

    public final void setAdapter(String str) {
        this.adapter = str;
    }

    public final String getAhamoveService() {
        return this.ahamoveService;
    }

    public final void setAhamoveService(String str) {
        this.ahamoveService = str;
    }

    public final String getTchService() {
        return this.tchService;
    }

    public final void setTchService(String str) {
        this.tchService = str;
    }

    public final List<String> getService() {
        return this.service;
    }

    public final void setService(List<String> list) {
        this.service = list;
    }

    public final Double getDis() {
        return this.dis;
    }

    public final void setDis(Double d) {
        this.dis = d;
    }

    public final AddressOrder getAddress() {
        return this.address;
    }

    public final void setAddress(AddressOrder addressOrder) {
        this.address = addressOrder;
    }
}
