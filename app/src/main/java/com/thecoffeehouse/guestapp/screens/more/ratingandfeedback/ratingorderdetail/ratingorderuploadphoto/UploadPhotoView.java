package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderuploadphoto;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.thecoffeehouse.guestapp.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fR\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderuploadphoto/UploadPhotoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Landroid/net/Uri;", MessengerShareContentUtility.MEDIA_IMAGE, "getImage", "()Landroid/net/Uri;", "onDeletePhotoListener", "Lkotlin/Function0;", "", "getOnDeletePhotoListener", "()Lkotlin/jvm/functions/Function0;", "setOnDeletePhotoListener", "(Lkotlin/jvm/functions/Function0;)V", "setEmptyImage", "setFilledImage", "updateData", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: UploadPhotoView.kt */
public final class UploadPhotoView extends FrameLayout {
    private HashMap _$_findViewCache;
    private Uri image;
    private Function0<Unit> onDeletePhotoListener = UploadPhotoView$onDeletePhotoListener$1.INSTANCE;

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

    public final Uri getImage() {
        return this.image;
    }

    public final Function0<Unit> getOnDeletePhotoListener() {
        return this.onDeletePhotoListener;
    }

    public final void setOnDeletePhotoListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onDeletePhotoListener = function0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadPhotoView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_upload_photo_view, (ViewGroup) this, true);
        ((ImageView) _$_findCachedViewById(R.id.img_delete)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderuploadphoto.UploadPhotoView.AnonymousClass1 */
            final /* synthetic */ UploadPhotoView this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.setEmptyImage();
                this.this$0.image = null;
                this.this$0.getOnDeletePhotoListener().invoke();
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_upload_photo_view, (ViewGroup) this, true);
        ((ImageView) _$_findCachedViewById(R.id.img_delete)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderuploadphoto.UploadPhotoView.AnonymousClass1 */
            final /* synthetic */ UploadPhotoView this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.setEmptyImage();
                this.this$0.image = null;
                this.this$0.getOnDeletePhotoListener().invoke();
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadPhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_upload_photo_view, (ViewGroup) this, true);
        ((ImageView) _$_findCachedViewById(R.id.img_delete)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderuploadphoto.UploadPhotoView.AnonymousClass1 */
            final /* synthetic */ UploadPhotoView this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.setEmptyImage();
                this.this$0.image = null;
                this.this$0.getOnDeletePhotoListener().invoke();
            }
        });
    }

    public final void updateData(Uri uri) {
        this.image = uri;
        if (uri == null) {
            setEmptyImage();
        } else {
            setFilledImage(uri);
        }
    }

    private final void setFilledImage(Uri uri) {
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.img_photo);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_photo");
        imageView.setBackground(null);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.img_plus);
        Intrinsics.checkNotNullExpressionValue(imageView2, "img_plus");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.img_delete);
        Intrinsics.checkNotNullExpressionValue(imageView3, "img_delete");
        imageView3.setVisibility(0);
        ((RequestBuilder) Glide.with((ImageView) _$_findCachedViewById(R.id.img_photo)).load(uri).transition(DrawableTransitionOptions.withCrossFade()).centerCrop()).into((ImageView) _$_findCachedViewById(R.id.img_photo));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setEmptyImage() {
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.img_photo);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_photo");
        imageView.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_corner_dash_stroke_light_gray));
        ((RequestBuilder) Glide.with((ImageView) _$_findCachedViewById(R.id.img_photo)).load(Integer.valueOf((int) R.color.colorTransparent)).transition(DrawableTransitionOptions.withCrossFade()).centerCrop()).into((ImageView) _$_findCachedViewById(R.id.img_photo));
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.img_plus);
        Intrinsics.checkNotNullExpressionValue(imageView2, "img_plus");
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.img_delete);
        Intrinsics.checkNotNullExpressionValue(imageView3, "img_delete");
        imageView3.setVisibility(8);
    }
}
