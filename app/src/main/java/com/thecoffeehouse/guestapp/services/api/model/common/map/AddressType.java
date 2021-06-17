package com.thecoffeehouse.guestapp.services.api.model.common.map;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressType;", "", "()V", "DB", "", "getDB", "()I", "GOOGLE", "getGOOGLE", "HOME", "getHOME", "OTHER", "getOTHER", "RECENT", "getRECENT", "WORK", "getWORK", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class AddressType {
    private static final int DB = 4;
    private static final int GOOGLE = 0;
    private static final int HOME = 1;
    public static final AddressType INSTANCE = new AddressType();
    private static final int OTHER = 99;
    private static final int RECENT = 3;
    private static final int WORK = 2;

    private AddressType() {
    }

    public final int getGOOGLE() {
        return GOOGLE;
    }

    public final int getHOME() {
        return HOME;
    }

    public final int getWORK() {
        return WORK;
    }

    public final int getRECENT() {
        return RECENT;
    }

    public final int getDB() {
        return DB;
    }

    public final int getOTHER() {
        return OTHER;
    }
}
