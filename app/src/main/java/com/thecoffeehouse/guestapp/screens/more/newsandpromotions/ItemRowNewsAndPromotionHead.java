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
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\fJ\u0006\u0010\b\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/ItemRowNewsAndPromotionHead;", "", MessengerShareContentUtility.MEDIA_IMAGE, "", "title", "dateString", "", "hashTag", "onClick", "Lkotlin/Function0;", "", "onClickShare", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "mImgNews", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getMImgNews", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setMImgNews", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "mImgShare", "Landroid/widget/ImageView;", "getMImgShare", "()Landroid/widget/ImageView;", "setMImgShare", "(Landroid/widget/ImageView;)V", "mTxtHashTag", "Landroid/widget/TextView;", "getMTxtHashTag", "()Landroid/widget/TextView;", "setMTxtHashTag", "(Landroid/widget/TextView;)V", "mTxtTimeAgo", "getMTxtTimeAgo", "setMTxtTimeAgo", "mTxtTitle", "getMTxtTitle", "setMTxtTitle", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowNewsAndPromotionHead.kt */
public final class ItemRowNewsAndPromotionHead {
    private final int dateString;
    private final String hashTag;
    private final String image;
    public TLImageView mImgNews;
    public ImageView mImgShare;
    public TextView mTxtHashTag;
    public TextView mTxtTimeAgo;
    public TextView mTxtTitle;
    private final Function0<Unit> onClick;
    private final Function0<Unit> onClickShare;
    private final String title;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowNewsAndPromotionHead> {
        public void bindLoadMore(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
        }

        public LoadMoreViewBinder(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            super(itemRowNewsAndPromotionHead);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowNewsAndPromotionHead, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, int i) {
        }

        public ViewBinder(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            super(itemRowNewsAndPromotionHead, R.layout.item_row_news_and_promotions_head, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            itemRowNewsAndPromotionHead.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
            boolean isNullable = isNullable();
            if (itemRowNewsAndPromotionHead != null && isNullable) {
                itemRowNewsAndPromotionHead.mImgNews = null;
                itemRowNewsAndPromotionHead.mTxtTitle = null;
                itemRowNewsAndPromotionHead.mTxtHashTag = null;
                itemRowNewsAndPromotionHead.mTxtTimeAgo = null;
                itemRowNewsAndPromotionHead.mImgShare = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
            itemRowNewsAndPromotionHead.mImgNews = (TLImageView) view.findViewById(R.id.img_news);
            itemRowNewsAndPromotionHead.mTxtTitle = (TextView) view.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionHead.mTxtHashTag = (TextView) view.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionHead.mTxtTimeAgo = (TextView) view.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionHead.mImgShare = (ImageView) view.findViewById(R.id.img_share);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
            view.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClickShare();
                }
            });
            view.findViewById(R.id.layout_news_and_promotions_head_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.ViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowNewsAndPromotionHead, View> {
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
        public void bindCollapse(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            super(itemRowNewsAndPromotionHead, R.layout.item_row_news_and_promotions_head, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            itemRowNewsAndPromotionHead.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
            itemRowNewsAndPromotionHead.mImgNews = (TLImageView) view.findViewById(R.id.img_news);
            itemRowNewsAndPromotionHead.mTxtTitle = (TextView) view.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionHead.mTxtHashTag = (TextView) view.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionHead.mTxtTimeAgo = (TextView) view.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionHead.mImgShare = (ImageView) view.findViewById(R.id.img_share);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
            view.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClickShare();
                }
            });
            view.findViewById(R.id.layout_news_and_promotions_head_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.ExpandableViewBinder.AnonymousClass3 */

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

    public ItemRowNewsAndPromotionHead(String str, String str2, int i, String str3, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, MessengerShareContentUtility.MEDIA_IMAGE);
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "hashTag");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Intrinsics.checkNotNullParameter(function02, "onClickShare");
        this.image = str;
        this.title = str2;
        this.dateString = i;
        this.hashTag = str3;
        this.onClick = function0;
        this.onClickShare = function02;
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
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
        public void bindViewPosition(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, int i) {
        }

        public SwipeViewBinder(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            super(itemRowNewsAndPromotionHead, R.layout.item_row_news_and_promotions_head, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            itemRowNewsAndPromotionHead.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
            boolean isNullable = isNullable();
            if (itemRowNewsAndPromotionHead != null && isNullable) {
                itemRowNewsAndPromotionHead.mImgNews = null;
                itemRowNewsAndPromotionHead.mTxtTitle = null;
                itemRowNewsAndPromotionHead.mTxtHashTag = null;
                itemRowNewsAndPromotionHead.mTxtTimeAgo = null;
                itemRowNewsAndPromotionHead.mImgShare = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
            itemRowNewsAndPromotionHead.mImgNews = (TLImageView) frameView.findViewById(R.id.img_news);
            itemRowNewsAndPromotionHead.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionHead.mTxtHashTag = (TextView) frameView.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionHead.mTxtTimeAgo = (TextView) frameView.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionHead.mImgShare = (ImageView) frameView.findViewById(R.id.img_share);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClickShare();
                }
            });
            frameView.findViewById(R.id.layout_news_and_promotions_head_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.SwipeViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
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
        public void bindSwipeOut(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
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
        public void bindViewPosition(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, int i) {
        }

        public DirectionalViewBinder(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            super(itemRowNewsAndPromotionHead, R.layout.item_row_news_and_promotions_head, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead) {
            itemRowNewsAndPromotionHead.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead = (ItemRowNewsAndPromotionHead) getResolver();
            boolean isNullable = isNullable();
            if (itemRowNewsAndPromotionHead != null && isNullable) {
                itemRowNewsAndPromotionHead.mImgNews = null;
                itemRowNewsAndPromotionHead.mTxtTitle = null;
                itemRowNewsAndPromotionHead.mTxtHashTag = null;
                itemRowNewsAndPromotionHead.mTxtTimeAgo = null;
                itemRowNewsAndPromotionHead.mImgShare = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
            itemRowNewsAndPromotionHead.mImgNews = (TLImageView) frameView.findViewById(R.id.img_news);
            itemRowNewsAndPromotionHead.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title);
            itemRowNewsAndPromotionHead.mTxtHashTag = (TextView) frameView.findViewById(R.id.txt_hash_tag);
            itemRowNewsAndPromotionHead.mTxtTimeAgo = (TextView) frameView.findViewById(R.id.txt_time_ago);
            itemRowNewsAndPromotionHead.mImgShare = (ImageView) frameView.findViewById(R.id.img_share);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowNewsAndPromotionHead itemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClickShare();
                }
            });
            frameView.findViewById(R.id.layout_news_and_promotions_head_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ItemRowNewsAndPromotionHead.DirectionalViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowNewsAndPromotionHead.onClick();
                }
            });
        }
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
    }
}
