package com.thecoffeehouse.guestapp.screens.more.newsandpromotions;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\u000eJ\u0006\u0010\n\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010-\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010'\u001a\u00020(X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/ItemRowNewsAndPromotionBody;", "", MessengerShareContentUtility.MEDIA_IMAGE, "", "title", "publish", "", "hashTag", "isShowFooter", "", "onClick", "Lkotlin/Function0;", "", "onClickShare", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "mImgNews", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getMImgNews", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setMImgNews", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "mImgShare", "Landroid/widget/ImageView;", "getMImgShare", "()Landroid/widget/ImageView;", "setMImgShare", "(Landroid/widget/ImageView;)V", "mTxtHashTag", "Landroid/widget/TextView;", "getMTxtHashTag", "()Landroid/widget/TextView;", "setMTxtHashTag", "(Landroid/widget/TextView;)V", "mTxtTimeAgo", "getMTxtTimeAgo", "setMTxtTimeAgo", "mTxtTitle", "getMTxtTitle", "setMTxtTitle", "mViewFooter", "Landroid/view/View;", "getMViewFooter", "()Landroid/view/View;", "setMViewFooter", "(Landroid/view/View;)V", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowNewsAndPromotionBody.kt */
public final class ItemRowNewsAndPromotionBody {
    private final String hashTag;
    private final String image;
    private final boolean isShowFooter;
    public TLImageView mImgNews;
    public ImageView mImgShare;
    public TextView mTxtHashTag;
    public TextView mTxtTimeAgo;
    public TextView mTxtTitle;
    public View mViewFooter;
    private final Function0<Unit> onClick;
    private final Function0<Unit> onClickShare;
    private final int publish;
    private final String title;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowNewsAndPromotionBody> {
        public void bindLoadMore(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        public LoadMoreViewBinder(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            super(itemRowNewsAndPromotionBody);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowNewsAndPromotionBody, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, int i) {
        }

        public ViewBinder(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            super(itemRowNewsAndPromotionBody, R.layout.item_row_news_and_promotions_body, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            itemRowNewsAndPromotionBody.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
            boolean isNullable = isNullable();
            if (itemRowNewsAndPromotionBody != null && isNullable) {
                itemRowNewsAndPromotionBody.mImgNews = null;
                itemRowNewsAndPromotionBody.mTxtTitle = null;
                itemRowNewsAndPromotionBody.mTxtHashTag = null;
                itemRowNewsAndPromotionBody.mTxtTimeAgo = null;
                itemRowNewsAndPromotionBody.mImgShare = null;
                itemRowNewsAndPromotionBody.mViewFooter = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
            itemRowNewsAndPromotionBody.mImgNews = (TLImageView) view.findViewById(R.id.img_news);
            itemRowNewsAndPromotionBody.mTxtTitle = (TextView) view.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionBody.mTxtHashTag = (TextView) view.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionBody.mTxtTimeAgo = (TextView) view.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionBody.mImgShare = (ImageView) view.findViewById(R.id.img_share);
            itemRowNewsAndPromotionBody.mViewFooter = view.findViewById(R.id.view_footer_divider);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
            view.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClickShare();
                }
            });
            view.findViewById(R.id.layout_news_and_promotions_body_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.ViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowNewsAndPromotionBody, View> {
        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void bindAnimation(int i, int i2, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindChildPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            super(itemRowNewsAndPromotionBody, R.layout.item_row_news_and_promotions_body, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            itemRowNewsAndPromotionBody.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
            itemRowNewsAndPromotionBody.mImgNews = (TLImageView) view.findViewById(R.id.img_news);
            itemRowNewsAndPromotionBody.mTxtTitle = (TextView) view.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionBody.mTxtHashTag = (TextView) view.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionBody.mTxtTimeAgo = (TextView) view.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionBody.mImgShare = (ImageView) view.findViewById(R.id.img_share);
            itemRowNewsAndPromotionBody.mViewFooter = view.findViewById(R.id.view_footer_divider);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
            view.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClickShare();
                }
            });
            view.findViewById(R.id.layout_news_and_promotions_body_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.ExpandableViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    if (ExpandableViewBinder.this.isExpanded()) {
                        ExpandableViewBinder.this.collapse();
                    } else {
                        ExpandableViewBinder.this.expand();
                    }
                }
            });
        }
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, int i) {
        }

        public SwipeViewBinder(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            super(itemRowNewsAndPromotionBody, R.layout.item_row_news_and_promotions_body, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            itemRowNewsAndPromotionBody.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
            boolean isNullable = isNullable();
            if (itemRowNewsAndPromotionBody != null && isNullable) {
                itemRowNewsAndPromotionBody.mImgNews = null;
                itemRowNewsAndPromotionBody.mTxtTitle = null;
                itemRowNewsAndPromotionBody.mTxtHashTag = null;
                itemRowNewsAndPromotionBody.mTxtTimeAgo = null;
                itemRowNewsAndPromotionBody.mImgShare = null;
                itemRowNewsAndPromotionBody.mViewFooter = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
            itemRowNewsAndPromotionBody.mImgNews = (TLImageView) frameView.findViewById(R.id.img_news);
            itemRowNewsAndPromotionBody.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionBody.mTxtHashTag = (TextView) frameView.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionBody.mTxtTimeAgo = (TextView) frameView.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionBody.mImgShare = (ImageView) frameView.findViewById(R.id.img_share);
            itemRowNewsAndPromotionBody.mViewFooter = frameView.findViewById(R.id.view_footer_divider);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClickShare();
                }
            });
            frameView.findViewById(R.id.layout_news_and_promotions_body_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.SwipeViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClick();
                }
            });
        }
    }

    public ItemRowNewsAndPromotionBody(String str, String str2, int i, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, MessengerShareContentUtility.MEDIA_IMAGE);
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "hashTag");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Intrinsics.checkNotNullParameter(function02, "onClickShare");
        this.image = str;
        this.title = str2;
        this.publish = i;
        this.hashTag = str3;
        this.isShowFooter = z;
        this.onClick = function0;
        this.onClickShare = function02;
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeInDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeOutDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeTouch(float f, float f2, float f3, float f4) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipingDirection(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, int i) {
        }

        public DirectionalViewBinder(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            super(itemRowNewsAndPromotionBody, R.layout.item_row_news_and_promotions_body, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody) {
            itemRowNewsAndPromotionBody.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody = (ItemRowNewsAndPromotionBody) getResolver();
            boolean isNullable = isNullable();
            if (itemRowNewsAndPromotionBody != null && isNullable) {
                itemRowNewsAndPromotionBody.mImgNews = null;
                itemRowNewsAndPromotionBody.mTxtTitle = null;
                itemRowNewsAndPromotionBody.mTxtHashTag = null;
                itemRowNewsAndPromotionBody.mTxtTimeAgo = null;
                itemRowNewsAndPromotionBody.mImgShare = null;
                itemRowNewsAndPromotionBody.mViewFooter = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
            itemRowNewsAndPromotionBody.mImgNews = (TLImageView) frameView.findViewById(R.id.img_news);
            itemRowNewsAndPromotionBody.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionBody.mTxtHashTag = (TextView) frameView.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionBody.mTxtTimeAgo = (TextView) frameView.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionBody.mImgShare = (ImageView) frameView.findViewById(R.id.img_share);
            itemRowNewsAndPromotionBody.mViewFooter = frameView.findViewById(R.id.view_footer_divider);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionBody itemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClickShare();
                }
            });
            frameView.findViewById(R.id.layout_news_and_promotions_body_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionBody.DirectionalViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionBody.onClick();
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ItemRowNewsAndPromotionBody(String str, String str2, int i, String str3, boolean z, Function0 function0, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? false : z, function0, function02);
    }

    public final TLImageView getMImgNews() {
        TLImageView tLImageView = this.mImgNews;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgNews");
        }
        return tLImageView;
    }

    public final void setMImgNews(TLImageView tLImageView) {
        Intrinsics.checkNotNullParameter(tLImageView, "<set-?>");
        this.mImgNews = tLImageView;
    }

    public final TextView getMTxtTitle() {
        TextView textView = this.mTxtTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        return textView;
    }

    public final void setMTxtTitle(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtTitle = textView;
    }

    public final TextView getMTxtHashTag() {
        TextView textView = this.mTxtHashTag;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtHashTag");
        }
        return textView;
    }

    public final void setMTxtHashTag(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtHashTag = textView;
    }

    public final TextView getMTxtTimeAgo() {
        TextView textView = this.mTxtTimeAgo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTimeAgo");
        }
        return textView;
    }

    public final void setMTxtTimeAgo(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtTimeAgo = textView;
    }

    public final ImageView getMImgShare() {
        ImageView imageView = this.mImgShare;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgShare");
        }
        return imageView;
    }

    public final void setMImgShare(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mImgShare = imageView;
    }

    public final View getMViewFooter() {
        View view = this.mViewFooter;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewFooter");
        }
        return view;
    }

    public final void setMViewFooter(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mViewFooter = view;
    }

    public final void onClickShare() {
        this.onClickShare.invoke();
    }

    public final void onClick() {
        this.onClick.invoke();
    }

    public final void onResolve() {
        TLImageView tLImageView = this.mImgNews;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgNews");
        }
        RequestBuilder<Drawable> load = Glide.with(tLImageView.getContext()).load(this.image);
        TLImageView tLImageView2 = this.mImgNews;
        if (tLImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgNews");
        }
        load.into(tLImageView2);
        TextView textView = this.mTxtTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        textView.setText(this.title);
        TextView textView2 = this.mTxtHashTag;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtHashTag");
        }
        textView2.setText(this.hashTag);
        TextView textView3 = this.mTxtTimeAgo;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTimeAgo");
        }
        textView3.setText("2 giờ trước");
        if (this.isShowFooter) {
            View view = this.mViewFooter;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewFooter");
            }
            view.setVisibility(0);
        }
    }
}
