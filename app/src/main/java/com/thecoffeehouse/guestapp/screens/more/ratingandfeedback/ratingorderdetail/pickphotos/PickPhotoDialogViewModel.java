package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J \u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\f0\u000eJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotoDialogViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dateToTimestamp", "", "day", "", "month", "year", "loadImages", "", "onCompleted", "Lkotlin/Function1;", "", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "queryImages", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickPhotoDialogViewModel.kt */
public final class PickPhotoDialogViewModel extends AndroidViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickPhotoDialogViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    public final void loadImages(Function1<? super List<MediaStoreImage>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onCompleted");
        function1.invoke(queryImages());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        kotlin.io.CloseableKt.closeFinally(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos.MediaStoreImage> queryImages() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos.PickPhotoDialogViewModel.queryImages():java.util.List");
    }

    private final long dateToTimestamp(int i, int i2, int i3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Date parse = simpleDateFormat.parse(new StringBuilder().append(i).append('.').append(i2).append('.').append(i3).toString());
        return timeUnit.toSeconds(parse != null ? parse.getTime() : 0);
    }
}
