package com.thecoffeehouse.guestapp.screens.stores;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0014J\u001e\u0010#\u001a\u00020\u001f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0014J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0014J\u0018\u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0014J\u001e\u0010)\u001a\u00020\u001f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarkerRenderer;", "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "mContext", "Landroid/content/Context;", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "clusterManager", "Lcom/google/maps/android/clustering/ClusterManager;", "(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;)V", "iconClusterGenerator", "Lcom/google/maps/android/ui/IconGenerator;", "mDensity", "", "mIconGenerator", "mImageView", "Landroid/widget/ImageView;", "getClusterIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "cluster", "Lcom/google/maps/android/clustering/Cluster;", "getItemIcon", "clusterMarker", "getMinClusterSize", "", "makeClusterBackground", "Landroid/graphics/drawable/LayerDrawable;", "makeSquareTextView", "Lcom/google/maps/android/ui/SquareTextView;", "context", "onBeforeClusterItemRendered", "", "item", "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "onBeforeClusterRendered", "onClusterItemRendered", "clusterItem", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onClusterItemUpdated", "onClusterUpdated", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ClusterMarkerRenderer.kt */
public final class ClusterMarkerRenderer extends DefaultClusterRenderer<ClusterMarker> {
    private IconGenerator iconClusterGenerator;
    private final Context mContext;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private ImageView mImageView;

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public int getMinClusterSize() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClusterMarkerRenderer(Context context, GoogleMap googleMap, ClusterManager<ClusterMarker> clusterManager) {
        super(context, googleMap, clusterManager);
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(googleMap, "mGoogleMap");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        this.mContext = context;
        this.iconClusterGenerator = new IconGenerator(context);
        Resources resources = context.getResources();
        Float valueOf = (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? null : Float.valueOf(displayMetrics.density);
        Intrinsics.checkNotNull(valueOf);
        this.mDensity = valueOf.floatValue();
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        this.iconClusterGenerator.setBackground(makeClusterBackground());
        this.iconClusterGenerator.setContentView(makeSquareTextView(context));
        ImageView imageView = new ImageView(context);
        this.mImageView = imageView;
        if (imageView != null) {
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        iconGenerator.setContentView(this.mImageView);
        iconGenerator.setBackground(null);
    }

    /* access modifiers changed from: protected */
    public void onBeforeClusterItemRendered(ClusterMarker clusterMarker, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(clusterMarker, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        markerOptions.icon(getItemIcon(clusterMarker));
    }

    public final BitmapDescriptor getItemIcon(ClusterMarker clusterMarker) {
        Intrinsics.checkNotNullParameter(clusterMarker, "clusterMarker");
        if (clusterMarker.isSelected() && clusterMarker.getStore().isFavourite()) {
            ImageView imageView = this.mImageView;
            Intrinsics.checkNotNull(imageView);
            imageView.setImageResource(R.drawable.ic_marker_favourite_selected);
        } else if (clusterMarker.isSelected()) {
            ImageView imageView2 = this.mImageView;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setImageResource(R.drawable.ic_marker_selected);
        } else if (clusterMarker.getStore().isFavourite()) {
            ImageView imageView3 = this.mImageView;
            Intrinsics.checkNotNull(imageView3);
            imageView3.setImageResource(R.drawable.ic_marker_favourite_store);
        } else {
            ImageView imageView4 = this.mImageView;
            Intrinsics.checkNotNull(imageView4);
            imageView4.setImageResource(R.drawable.ic_marker);
        }
        return BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon());
    }

    /* access modifiers changed from: protected */
    public void onClusterItemUpdated(ClusterMarker clusterMarker, Marker marker) {
        Intrinsics.checkNotNullParameter(clusterMarker, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        super.onClusterItemUpdated((ClusterItem) clusterMarker, marker);
        try {
            marker.setIcon(getItemIcon(clusterMarker));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public void onBeforeClusterRendered(Cluster<ClusterMarker> cluster, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        markerOptions.icon(getClusterIcon(cluster));
    }

    /* access modifiers changed from: protected */
    public void onClusterItemRendered(ClusterMarker clusterMarker, Marker marker) {
        Intrinsics.checkNotNullParameter(clusterMarker, "clusterItem");
        Intrinsics.checkNotNullParameter(marker, "marker");
        marker.setIcon(getItemIcon(clusterMarker));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public void onClusterUpdated(Cluster<ClusterMarker> cluster, Marker marker) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(marker, "marker");
        marker.setIcon(getClusterIcon(cluster));
    }

    private final BitmapDescriptor getClusterIcon(Cluster<ClusterMarker> cluster) {
        return BitmapDescriptorFactory.fromBitmap(this.iconClusterGenerator.makeIcon(String.valueOf(cluster.getSize())));
    }

    private final LayerDrawable makeClusterBackground() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "mColoredCircleBackground.paint");
        paint.setColor(ContextCompat.getColor(this.mContext, R.color.color876F5D));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint2 = shapeDrawable2.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint2, "outline.paint");
        paint2.setColor(ContextCompat.getColor(this.mContext, R.color.colorWhite));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
        int i = (int) (this.mDensity * ((float) 3));
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    private final SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        squareTextView.setTypeface(ResourcesCompat.getFont(this.mContext, R.font.sfpd_bold));
        squareTextView.setTextSize(0, this.mContext.getResources().getDimension(R.dimen._14sp));
        squareTextView.setTextColor(ContextCompat.getColor(this.mContext, R.color.colorWhite));
        int i = (int) (((float) 12) * this.mDensity);
        squareTextView.setPadding(i, i, i, i);
        return squareTextView;
    }
}
