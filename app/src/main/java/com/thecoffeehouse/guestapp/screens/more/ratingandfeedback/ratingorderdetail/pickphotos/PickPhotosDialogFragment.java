package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0004\u0012\u00020\n0\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "btnSelectImages", "Lcom/thecoffeehouse/guestapp/views/TLButton;", "onSelectImagesListener", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "Lkotlin/collections/ArrayList;", "", "pickPhotoViewModel", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotoDialogViewModel;", "getPickPhotoViewModel", "()Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotoDialogViewModel;", "pickPhotoViewModel$delegate", "Lkotlin/Lazy;", "selectCount", "", "selectedImages", "checkShowButtonSelectPhotos", "getAnalyticScreenName", "", "initToolbar", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "Companion", "GalleryAdapter", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickPhotosDialogFragment.kt */
public final class PickPhotosDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private TLButton btnSelectImages;
    private Function1<? super ArrayList<MediaStoreImage>, Unit> onSelectImagesListener = PickPhotosDialogFragment$onSelectImagesListener$1.INSTANCE;
    private final Lazy pickPhotoViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PickPhotoDialogViewModel.class), new PickPhotosDialogFragment$$special$$inlined$viewModels$2(new PickPhotosDialogFragment$$special$$inlined$viewModels$1(this)), null);
    private int selectCount = 4;
    private ArrayList<MediaStoreImage> selectedImages = new ArrayList<>();

    private final PickPhotoDialogViewModel getPickPhotoViewModel() {
        return (PickPhotoDialogViewModel) this.pickPhotoViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final PickPhotosDialogFragment newInstance(int i, Function1<? super ArrayList<MediaStoreImage>, Unit> function1) {
        return Companion.newInstance(i, function1);
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public String getAnalyticScreenName() {
        return null;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.fragment_pick_photos;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\f0\bH\u0007¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment;", "selectCount", "", "onSelectImagesListener", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "Lkotlin/collections/ArrayList;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: PickPhotosDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PickPhotosDialogFragment newInstance$default(Companion companion, int i, Function1 function1, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 4;
            }
            return companion.newInstance(i, function1);
        }

        @JvmStatic
        public final PickPhotosDialogFragment newInstance(int i, Function1<? super ArrayList<MediaStoreImage>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onSelectImagesListener");
            PickPhotosDialogFragment pickPhotosDialogFragment = new PickPhotosDialogFragment();
            pickPhotosDialogFragment.selectCount = i;
            pickPhotosDialogFragment.onSelectImagesListener = function1;
            return pickPhotosDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar(view);
        this.btnSelectImages = (TLButton) view.findViewById(R.id.btn_select_images);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_pick_images);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        }
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), 1);
        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(getContext(), 0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.divider_space_product_category);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
            dividerItemDecoration2.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration2);
        GalleryAdapter galleryAdapter = new GalleryAdapter(this, new PickPhotosDialogFragment$initViews$galleryAdapter$1(this, recyclerView));
        if (recyclerView != null) {
            recyclerView.setAdapter(galleryAdapter);
        }
        getPickPhotoViewModel().loadImages(new PickPhotosDialogFragment$initViews$2(galleryAdapter));
        TLButton tLButton = this.btnSelectImages;
        if (tLButton != null) {
            tLButton.setOnClickListener(new PickPhotosDialogFragment$initViews$3(this));
        }
    }

    private final void initToolbar(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.toolbar);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            TextView textView = (TextView) viewGroup2.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_title_sub_screen");
            textView.setText(getString(R.string.str_all_photos));
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView, "img_right_icon");
            imageView.setVisibility(0);
            ((ImageView) viewGroup2.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_close_bottom_sheet);
            ((ImageView) viewGroup2.findViewById(R.id.img_right_icon)).setOnClickListener(new PickPhotosDialogFragment$initToolbar$$inlined$apply$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void checkShowButtonSelectPhotos() {
        if (this.selectedImages.isEmpty()) {
            TLButton tLButton = this.btnSelectImages;
            if (tLButton != null) {
                tLButton.setVisibility(8);
                return;
            }
            return;
        }
        TLButton tLButton2 = this.btnSelectImages;
        if (tLButton2 != null) {
            tLButton2.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0013B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment$GalleryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment$GalleryAdapter$ImageViewHolder;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment;", "onClick", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment;Lkotlin/jvm/functions/Function1;)V", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ImageViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: PickPhotosDialogFragment.kt */
    public final class GalleryAdapter extends ListAdapter<MediaStoreImage, ImageViewHolder> {
        private final Function1<MediaStoreImage, Unit> onClick;
        final /* synthetic */ PickPhotosDialogFragment this$0;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos.MediaStoreImage, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GalleryAdapter(PickPhotosDialogFragment pickPhotosDialogFragment, Function1<? super MediaStoreImage, Unit> function1) {
            super(MediaStoreImage.Companion.getDiffCallback());
            Intrinsics.checkNotNullParameter(function1, "onClick");
            this.this$0 = pickPhotosDialogFragment;
            this.onClick = function1;
        }

        public final Function1<MediaStoreImage, Unit> getOnClick() {
            return this.onClick;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gallery_layout, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
            return new ImageViewHolder(this, inflate, this.onClick);
        }

        public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {
            Intrinsics.checkNotNullParameter(imageViewHolder, "holder");
            MediaStoreImage mediaStoreImage = (MediaStoreImage) getItem(i);
            imageViewHolder.getRootView().setTag(mediaStoreImage);
            if (mediaStoreImage.getSelectedPosition() == null) {
                imageViewHolder.getImageSelectNumber().setVisibility(8);
            } else {
                imageViewHolder.getImageSelectNumber().setVisibility(0);
                Integer selectedPosition = mediaStoreImage.getSelectedPosition();
                if (selectedPosition != null) {
                    int intValue = selectedPosition.intValue();
                    if (intValue == 1) {
                        Intrinsics.checkNotNullExpressionValue(((RequestBuilder) Glide.with(imageViewHolder.getImageView()).load(Integer.valueOf((int) R.drawable.ic_add_photo_num_1)).centerCrop()).into(imageViewHolder.getImageSelectNumber()), "Glide.with(holder.imageV…holder.imageSelectNumber)");
                    } else if (intValue == 2) {
                        Intrinsics.checkNotNullExpressionValue(((RequestBuilder) Glide.with(imageViewHolder.getImageView()).load(Integer.valueOf((int) R.drawable.ic_add_photo_num_2)).centerCrop()).into(imageViewHolder.getImageSelectNumber()), "Glide.with(holder.imageV…holder.imageSelectNumber)");
                    } else if (intValue == 3) {
                        Intrinsics.checkNotNullExpressionValue(((RequestBuilder) Glide.with(imageViewHolder.getImageView()).load(Integer.valueOf((int) R.drawable.ic_add_photo_num_3)).centerCrop()).into(imageViewHolder.getImageSelectNumber()), "Glide.with(holder.imageV…holder.imageSelectNumber)");
                    } else if (intValue != 4) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(((RequestBuilder) Glide.with(imageViewHolder.getImageView()).load(Integer.valueOf((int) R.drawable.ic_add_photo_num_4)).centerCrop()).into(imageViewHolder.getImageSelectNumber()), "Glide.with(holder.imageV…holder.imageSelectNumber)");
                    }
                }
            }
            ((RequestBuilder) Glide.with(imageViewHolder.getImageView()).load(mediaStoreImage.getContentUri()).thumbnail(0.33f).centerCrop()).into(imageViewHolder.getImageView());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment$GalleryAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onClick", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/MediaStoreImage;", "", "(Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/pickphotos/PickPhotosDialogFragment$GalleryAdapter;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "imageSelectNumber", "Landroid/widget/ImageView;", "getImageSelectNumber", "()Landroid/widget/ImageView;", "imageView", "getImageView", "rootView", "getRootView", "()Landroid/view/View;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: PickPhotosDialogFragment.kt */
        public final class ImageViewHolder extends RecyclerView.ViewHolder {
            private final ImageView imageSelectNumber;
            private final ImageView imageView;
            private final View rootView;
            final /* synthetic */ GalleryAdapter this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ImageViewHolder(GalleryAdapter galleryAdapter, View view, final Function1<? super MediaStoreImage, Unit> function1) {
                super(view);
                Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
                Intrinsics.checkNotNullParameter(function1, "onClick");
                this.this$0 = galleryAdapter;
                this.rootView = view;
                View findViewById = view.findViewById(R.id.image);
                Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.image)");
                ImageView imageView2 = (ImageView) findViewById;
                this.imageView = imageView2;
                View findViewById2 = view.findViewById(R.id.img_select_number);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.img_select_number)");
                this.imageSelectNumber = (ImageView) findViewById2;
                imageView2.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos.PickPhotosDialogFragment.GalleryAdapter.ImageViewHolder.AnonymousClass1 */
                    final /* synthetic */ ImageViewHolder this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onClick(View view) {
                        Object tag = this.this$0.getRootView().getTag();
                        if (!(tag instanceof MediaStoreImage)) {
                            tag = null;
                        }
                        MediaStoreImage mediaStoreImage = (MediaStoreImage) tag;
                        if (mediaStoreImage != null) {
                            function1.invoke(mediaStoreImage);
                        }
                    }
                });
            }

            public final View getRootView() {
                return this.rootView;
            }

            public final ImageView getImageView() {
                return this.imageView;
            }

            public final ImageView getImageSelectNumber() {
                return this.imageSelectNumber;
            }
        }
    }
}
