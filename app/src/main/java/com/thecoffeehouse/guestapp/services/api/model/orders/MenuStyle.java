package com.thecoffeehouse.guestapp.services.api.model.orders;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/MenuStyle;", "", "()V", "HORIZONTAL", "", "getHORIZONTAL", "()I", "OTHER", "getOTHER", "VERICAL", "getVERICAL", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class MenuStyle {
    private static final int HORIZONTAL = 1;
    public static final MenuStyle INSTANCE = new MenuStyle();
    private static final int OTHER = 99;
    private static final int VERICAL = 0;

    private MenuStyle() {
    }

    public final int getVERICAL() {
        return VERICAL;
    }

    public final int getHORIZONTAL() {
        return HORIZONTAL;
    }

    public final int getOTHER() {
        return OTHER;
    }
}
