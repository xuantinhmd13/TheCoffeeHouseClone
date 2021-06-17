package com.thecoffeehouse.guestapp.services.api.server;

import com.thecoffeehouse.guestapp.services.api.model.common.config.MetadataAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.ExternalAccountAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.map.MapAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.media.MediaAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.music.MusicAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionsAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationAPI;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/server/CommonAPIService;", "Lcom/thecoffeehouse/guestapp/services/api/server/APIService;", "()V", "getConfigService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/MetadataAPI;", "getExternalAccountService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/ExternalAccountAPI;", "getMapService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/MapAPI;", "getMediaService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/media/MediaAPI;", "getMusicService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicAPI;", "getNewsAndPromotionService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionsAPI;", "getNotificationService", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/NotificationAPI;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CommonAPIService.kt */
public final class CommonAPIService extends APIService {
    public final MusicAPI getMusicService() {
        return (MusicAPI) getRetrofit().createService(MusicAPI.class);
    }

    public final NewsAndPromotionsAPI getNewsAndPromotionService() {
        return (NewsAndPromotionsAPI) getRetrofit().createService(NewsAndPromotionsAPI.class);
    }

    public final MapAPI getMapService() {
        return (MapAPI) getRetrofit().createService(MapAPI.class);
    }

    public final NotificationAPI getNotificationService() {
        return (NotificationAPI) getRetrofit().createService(NotificationAPI.class);
    }

    public final MediaAPI getMediaService() {
        return (MediaAPI) getRetrofit().createService(MediaAPI.class);
    }

    public final MetadataAPI getConfigService() {
        return (MetadataAPI) getRetrofit().createService(MetadataAPI.class);
    }

    public final ExternalAccountAPI getExternalAccountService() {
        return (ExternalAccountAPI) getRetrofit().createService(ExternalAccountAPI.class);
    }
}
