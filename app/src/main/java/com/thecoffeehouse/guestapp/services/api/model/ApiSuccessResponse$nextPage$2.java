package com.thecoffeehouse.guestapp.services.api.model;

import androidx.exifinterface.media.ExifInterface;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 0})
/* compiled from: ApiResponse.kt */
public final class ApiSuccessResponse$nextPage$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ ApiSuccessResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApiSuccessResponse$nextPage$2(ApiSuccessResponse apiSuccessResponse) {
        super(0);
        this.this$0 = apiSuccessResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        String str = this.this$0.getLinks().get("next");
        if (str == null) {
            return null;
        }
        Matcher matcher = ApiSuccessResponse.PAGE_PATTERN.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        } catch (NumberFormatException unused) {
            GeneralKt.log("cannot parse next page from " + str);
            return null;
        }
    }
}
