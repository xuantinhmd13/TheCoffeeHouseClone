package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderuploadphoto;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0019J\u0014\u0010!\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderuploadphoto/RatingOrderUploadPhotosView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onAddPhotoListener", "Lkotlin/Function1;", "", "getOnAddPhotoListener", "()Lkotlin/jvm/functions/Function1;", "setOnAddPhotoListener", "(Lkotlin/jvm/functions/Function1;)V", "uploadPhotoViews", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderuploadphoto/UploadPhotoView;", "Lkotlin/collections/ArrayList;", "appendImages", "images", "", "Landroid/net/Uri;", "checkToggleEmptyText", "initAddPhotosTextView", "initAddPhotosUploadView", "rearrangeUploadPhotos", "setImageByIndex", FirebaseAnalytics.Param.INDEX, MessengerShareContentUtility.MEDIA_IMAGE, "updateData", "photos", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderUploadPhotosView.kt */
public final class RatingOrderUploadPhotosView extends FrameLayout {
    private HashMap _$_findViewCache;
    private Function1<? super Integer, Unit> onAddPhotoListener = RatingOrderUploadPhotosView$onAddPhotoListener$1.INSTANCE;
    private ArrayList<UploadPhotoView> uploadPhotoViews = new ArrayList<>();

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getOnAddPhotoListener() {
        return this.onAddPhotoListener;
    }

    public final void setOnAddPhotoListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onAddPhotoListener = function1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderUploadPhotosView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_upload_photos_view, (ViewGroup) this, true);
        initAddPhotosTextView();
        initAddPhotosUploadView();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderUploadPhotosView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_upload_photos_view, (ViewGroup) this, true);
        initAddPhotosTextView();
        initAddPhotosUploadView();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderUploadPhotosView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rating_order_upload_photos_view, (ViewGroup) this, true);
        initAddPhotosTextView();
        initAddPhotosUploadView();
    }

    private final void initAddPhotosUploadView() {
        this.uploadPhotoViews.add((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_1));
        this.uploadPhotoViews.add((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_2));
        this.uploadPhotoViews.add((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_3));
        this.uploadPhotoViews.add((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_4));
        ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_2)).setOnClickListener(new RatingOrderUploadPhotosView$initAddPhotosUploadView$1(this));
        ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_3)).setOnClickListener(new RatingOrderUploadPhotosView$initAddPhotosUploadView$2(this));
        ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_4)).setOnClickListener(new RatingOrderUploadPhotosView$initAddPhotosUploadView$3(this));
        ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_1)).setOnDeletePhotoListener(new RatingOrderUploadPhotosView$initAddPhotosUploadView$4(this));
        ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_2)).setOnDeletePhotoListener(new RatingOrderUploadPhotosView$initAddPhotosUploadView$5(this));
        ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_3)).setOnDeletePhotoListener(new RatingOrderUploadPhotosView$initAddPhotosUploadView$6(this));
    }

    /* access modifiers changed from: private */
    public final void rearrangeUploadPhotos() {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.uploadPhotoViews.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getImage() != null) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        ArrayList<UploadPhotoView> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (UploadPhotoView uploadPhotoView : arrayList2) {
            arrayList3.add(uploadPhotoView.getImage());
        }
        ArrayList arrayList4 = arrayList3;
        for (T t : this.uploadPhotoViews) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i <= CollectionsKt.getLastIndex(arrayList4)) {
                t2.updateData((Uri) arrayList4.get(i));
            } else {
                t2.updateData(null);
            }
            i = i2;
        }
        checkToggleEmptyText();
    }

    private final void initAddPhotosTextView() {
        ((TextView) _$_findCachedViewById(R.id.txt_add_photos)).setOnClickListener(new RatingOrderUploadPhotosView$initAddPhotosTextView$1(this));
    }

    public final void updateData(List<? extends Uri> list) {
        Intrinsics.checkNotNullParameter(list, "photos");
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i == 0) {
                ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_1)).updateData(t2);
            } else if (i == 1) {
                ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_2)).updateData(t2);
            } else if (i == 2) {
                ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_3)).updateData(t2);
            } else if (i == 3) {
                ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_4)).updateData(t2);
            }
            i = i2;
        }
        checkToggleEmptyText();
    }

    private final void checkToggleEmptyText() {
        if (((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_1)).getImage() == null && ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_2)).getImage() == null && ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_3)).getImage() == null && ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_4)).getImage() == null) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_add_photos);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_add_photos");
            textView.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.layout_upload_photos);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_upload_photos");
            constraintLayout.setVisibility(4);
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_add_photos);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_add_photos");
        textView2.setVisibility(4);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.layout_upload_photos);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_upload_photos");
        constraintLayout2.setVisibility(0);
    }

    public final void setImageByIndex(int i, Uri uri) {
        if (i == 0) {
            ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_1)).updateData(uri);
        } else if (i == 1) {
            ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_2)).updateData(uri);
        } else if (i == 2) {
            ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_3)).updateData(uri);
        } else if (i == 3) {
            ((UploadPhotoView) _$_findCachedViewById(R.id.upload_photo_view_4)).updateData(uri);
        }
    }

    public final void appendImages(List<? extends Uri> list) {
        int i;
        Intrinsics.checkNotNullParameter(list, "images");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.uploadPhotoViews.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getImage() == null) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UploadPhotoView uploadPhotoView = (UploadPhotoView) obj;
            if (i <= CollectionsKt.getLastIndex(list)) {
                uploadPhotoView.updateData((Uri) list.get(i));
            }
            i = i2;
        }
        checkToggleEmptyText();
    }
}
