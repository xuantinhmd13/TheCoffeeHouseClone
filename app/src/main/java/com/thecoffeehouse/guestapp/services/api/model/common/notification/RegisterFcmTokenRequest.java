package com.thecoffeehouse.guestapp.services.api.model.common.notification;

import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/RegisterFcmTokenRequest;", "", "fcmToken", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "deviceId", "deviceModel", "os", "osVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getDeviceModel", "setDeviceModel", "getFcmToken", "setFcmToken", "getOs", "setOs", "getOsVersion", "setOsVersion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Notification.kt */
public final class RegisterFcmTokenRequest {
    @SerializedName("app_version")
    private String appVersion;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName(MonitorLogServerProtocol.PARAM_DEVICE_MODEL)
    private String deviceModel;
    @SerializedName("fcm_token")
    private String fcmToken;
    @SerializedName("os")
    private String os;
    @SerializedName("os_version")
    private String osVersion;

    public RegisterFcmTokenRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "fcmToken");
        Intrinsics.checkNotNullParameter(str2, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        Intrinsics.checkNotNullParameter(str3, "deviceId");
        Intrinsics.checkNotNullParameter(str4, "deviceModel");
        Intrinsics.checkNotNullParameter(str5, "os");
        Intrinsics.checkNotNullParameter(str6, "osVersion");
        this.fcmToken = str;
        this.appVersion = str2;
        this.deviceId = str3;
        this.deviceModel = str4;
        this.os = str5;
        this.osVersion = str6;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final void setFcmToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fcmToken = str;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final void setDeviceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterFcmTokenRequest(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L_0x0006
            java.lang.String r9 = "5.2.11"
        L_0x0006:
            r2 = r9
            r9 = r14 & 4
            if (r9 == 0) goto L_0x000d
            java.lang.String r10 = ""
        L_0x000d:
            r3 = r10
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0019
            java.lang.String r11 = android.os.Build.MANUFACTURER
            java.lang.String r9 = "Build.MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r9)
        L_0x0019:
            r4 = r11
            r9 = r14 & 16
            if (r9 == 0) goto L_0x0020
            java.lang.String r12 = "Android"
        L_0x0020:
            r5 = r12
            r9 = r14 & 32
            if (r9 == 0) goto L_0x002b
            int r9 = android.os.Build.VERSION.SDK_INT
            java.lang.String r13 = java.lang.String.valueOf(r9)
        L_0x002b:
            r6 = r13
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.services.api.model.common.notification.RegisterFcmTokenRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final void setDeviceModel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceModel = str;
    }

    public final String getOs() {
        return this.os;
    }

    public final void setOs(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os = str;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final void setOsVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVersion = str;
    }
}
