package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.server.UserAPIService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/services/api/server/UserAPIService;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ClientManager.kt */
public final class ClientManager$userAPIService$2 extends Lambda implements Function0<UserAPIService> {
    public static final ClientManager$userAPIService$2 INSTANCE = new ClientManager$userAPIService$2();

    ClientManager$userAPIService$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final UserAPIService invoke() {
        return new UserAPIService();
    }
}
