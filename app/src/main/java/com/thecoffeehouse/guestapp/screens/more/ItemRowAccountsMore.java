package com.thecoffeehouse.guestapp.screens.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ItemRowAccountsMore;", "", "isLoggedIn", "", "onClickProfileUpdate", "Lkotlin/Function0;", "", "onClickNotification", "onClickSavedAddresses", "onClickLogout", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "mTxtTitle", "Landroid/widget/TextView;", "getMTxtTitle", "()Landroid/widget/TextView;", "setMTxtTitle", "(Landroid/widget/TextView;)V", "rowLogout", "getRowLogout", "setRowLogout", "rowNotification", "getRowNotification", "setRowNotification", "rowProfileUpdate", "getRowProfileUpdate", "setRowProfileUpdate", "rowSavedAddress", "getRowSavedAddress", "setRowSavedAddress", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowAccountsMore.kt */
public final class ItemRowAccountsMore {
    private final boolean isLoggedIn;
    public TextView mTxtTitle;
    private final Function0<Unit> onClickLogout;
    private final Function0<Unit> onClickNotification;
    private final Function0<Unit> onClickProfileUpdate;
    private final Function0<Unit> onClickSavedAddresses;
    public TextView rowLogout;
    public TextView rowNotification;
    public TextView rowProfileUpdate;
    public TextView rowSavedAddress;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowAccountsMore> {
        public void bindLoadMore(ItemRowAccountsMore itemRowAccountsMore) {
        }

        public LoadMoreViewBinder(ItemRowAccountsMore itemRowAccountsMore) {
            super(itemRowAccountsMore);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowAccountsMore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsMore itemRowAccountsMore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAccountsMore itemRowAccountsMore, int i) {
        }

        public ViewBinder(ItemRowAccountsMore itemRowAccountsMore) {
            super(itemRowAccountsMore, R.layout.item_row_accounts_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsMore itemRowAccountsMore) {
            itemRowAccountsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAccountsMore != null && isNullable) {
                itemRowAccountsMore.mTxtTitle = null;
                itemRowAccountsMore.rowLogout = null;
                itemRowAccountsMore.rowSavedAddress = null;
                itemRowAccountsMore.rowNotification = null;
                itemRowAccountsMore.rowProfileUpdate = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsMore itemRowAccountsMore, View view) {
            itemRowAccountsMore.mTxtTitle = (TextView) view.findViewById(R.id.txt_title_account);
            itemRowAccountsMore.rowLogout = (TextView) view.findViewById(R.id.row_logout);
            itemRowAccountsMore.rowSavedAddress = (TextView) view.findViewById(R.id.row_saved_addresses);
            itemRowAccountsMore.rowNotification = (TextView) view.findViewById(R.id.row_notification);
            itemRowAccountsMore.rowProfileUpdate = (TextView) view.findViewById(R.id.row_profile_update);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsMore itemRowAccountsMore, View view) {
            view.findViewById(R.id.row_logout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickLogout();
                }
            });
            view.findViewById(R.id.row_notification).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickNotification();
                }
            });
            view.findViewById(R.id.row_profile_update).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickProfileUpdate();
                }
            });
            view.findViewById(R.id.row_saved_addresses).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickSavedAddresses();
                }
            });
        }
    }

    public ItemRowAccountsMore(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        Intrinsics.checkNotNullParameter(function0, "onClickProfileUpdate");
        Intrinsics.checkNotNullParameter(function02, "onClickNotification");
        Intrinsics.checkNotNullParameter(function03, "onClickSavedAddresses");
        Intrinsics.checkNotNullParameter(function04, "onClickLogout");
        this.isLoggedIn = z;
        this.onClickProfileUpdate = function0;
        this.onClickNotification = function02;
        this.onClickSavedAddresses = function03;
        this.onClickLogout = function04;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowAccountsMore, View> {
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
        public void bindCollapse(ItemRowAccountsMore itemRowAccountsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowAccountsMore itemRowAccountsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsMore itemRowAccountsMore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAccountsMore itemRowAccountsMore, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowAccountsMore itemRowAccountsMore) {
            super(itemRowAccountsMore, R.layout.item_row_accounts_more, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsMore itemRowAccountsMore) {
            itemRowAccountsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsMore itemRowAccountsMore, View view) {
            itemRowAccountsMore.mTxtTitle = (TextView) view.findViewById(R.id.txt_title_account);
            itemRowAccountsMore.rowLogout = (TextView) view.findViewById(R.id.row_logout);
            itemRowAccountsMore.rowSavedAddress = (TextView) view.findViewById(R.id.row_saved_addresses);
            itemRowAccountsMore.rowNotification = (TextView) view.findViewById(R.id.row_notification);
            itemRowAccountsMore.rowProfileUpdate = (TextView) view.findViewById(R.id.row_profile_update);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsMore itemRowAccountsMore, View view) {
            view.findViewById(R.id.row_logout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickLogout();
                }
            });
            view.findViewById(R.id.row_notification).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickNotification();
                }
            });
            view.findViewById(R.id.row_profile_update).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ExpandableViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickProfileUpdate();
                }
            });
            view.findViewById(R.id.row_saved_addresses).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ExpandableViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickSavedAddresses();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowAccountsMore itemRowAccountsMore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.ExpandableViewBinder.AnonymousClass5 */

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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ItemRowAccountsMore(boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, function0, function02, function03, function04);
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowAccountsMore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsMore itemRowAccountsMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAccountsMore itemRowAccountsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAccountsMore itemRowAccountsMore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowAccountsMore itemRowAccountsMore) {
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
        public void bindViewPosition(ItemRowAccountsMore itemRowAccountsMore, int i) {
        }

        public SwipeViewBinder(ItemRowAccountsMore itemRowAccountsMore) {
            super(itemRowAccountsMore, R.layout.item_row_accounts_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsMore itemRowAccountsMore) {
            itemRowAccountsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAccountsMore != null && isNullable) {
                itemRowAccountsMore.mTxtTitle = null;
                itemRowAccountsMore.rowLogout = null;
                itemRowAccountsMore.rowSavedAddress = null;
                itemRowAccountsMore.rowNotification = null;
                itemRowAccountsMore.rowProfileUpdate = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsMore itemRowAccountsMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowAccountsMore.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title_account);
            itemRowAccountsMore.rowLogout = (TextView) frameView.findViewById(R.id.row_logout);
            itemRowAccountsMore.rowSavedAddress = (TextView) frameView.findViewById(R.id.row_saved_addresses);
            itemRowAccountsMore.rowNotification = (TextView) frameView.findViewById(R.id.row_notification);
            itemRowAccountsMore.rowProfileUpdate = (TextView) frameView.findViewById(R.id.row_profile_update);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsMore itemRowAccountsMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.row_logout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickLogout();
                }
            });
            frameView.findViewById(R.id.row_notification).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.SwipeViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickNotification();
                }
            });
            frameView.findViewById(R.id.row_profile_update).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.SwipeViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickProfileUpdate();
                }
            });
            frameView.findViewById(R.id.row_saved_addresses).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.SwipeViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickSavedAddresses();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowAccountsMore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsMore itemRowAccountsMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAccountsMore itemRowAccountsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAccountsMore itemRowAccountsMore) {
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
        public void bindSwipeOut(ItemRowAccountsMore itemRowAccountsMore) {
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
        public void bindViewPosition(ItemRowAccountsMore itemRowAccountsMore, int i) {
        }

        public DirectionalViewBinder(ItemRowAccountsMore itemRowAccountsMore) {
            super(itemRowAccountsMore, R.layout.item_row_accounts_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsMore itemRowAccountsMore) {
            itemRowAccountsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAccountsMore itemRowAccountsMore = (ItemRowAccountsMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAccountsMore != null && isNullable) {
                itemRowAccountsMore.mTxtTitle = null;
                itemRowAccountsMore.rowLogout = null;
                itemRowAccountsMore.rowSavedAddress = null;
                itemRowAccountsMore.rowNotification = null;
                itemRowAccountsMore.rowProfileUpdate = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsMore itemRowAccountsMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowAccountsMore.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title_account);
            itemRowAccountsMore.rowLogout = (TextView) frameView.findViewById(R.id.row_logout);
            itemRowAccountsMore.rowSavedAddress = (TextView) frameView.findViewById(R.id.row_saved_addresses);
            itemRowAccountsMore.rowNotification = (TextView) frameView.findViewById(R.id.row_notification);
            itemRowAccountsMore.rowProfileUpdate = (TextView) frameView.findViewById(R.id.row_profile_update);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsMore itemRowAccountsMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.row_logout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickLogout();
                }
            });
            frameView.findViewById(R.id.row_notification).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.DirectionalViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickNotification();
                }
            });
            frameView.findViewById(R.id.row_profile_update).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.DirectionalViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickProfileUpdate();
                }
            });
            frameView.findViewById(R.id.row_saved_addresses).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsMore.DirectionalViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowAccountsMore.onClickSavedAddresses();
                }
            });
        }
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

    public final TextView getRowLogout() {
        TextView textView = this.rowLogout;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
        }
        return textView;
    }

    public final void setRowLogout(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rowLogout = textView;
    }

    public final TextView getRowSavedAddress() {
        TextView textView = this.rowSavedAddress;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowSavedAddress");
        }
        return textView;
    }

    public final void setRowSavedAddress(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rowSavedAddress = textView;
    }

    public final TextView getRowNotification() {
        TextView textView = this.rowNotification;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowNotification");
        }
        return textView;
    }

    public final void setRowNotification(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rowNotification = textView;
    }

    public final TextView getRowProfileUpdate() {
        TextView textView = this.rowProfileUpdate;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        return textView;
    }

    public final void setRowProfileUpdate(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rowProfileUpdate = textView;
    }

    public final void onClickLogout() {
        this.onClickLogout.invoke();
    }

    public final void onClickNotification() {
        this.onClickNotification.invoke();
    }

    public final void onClickProfileUpdate() {
        this.onClickProfileUpdate.invoke();
    }

    public final void onClickSavedAddresses() {
        this.onClickSavedAddresses.invoke();
    }

    public final void onResolve() {
        TextView textView = this.rowProfileUpdate;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        TextView textView2 = this.rowProfileUpdate;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        Drawable drawable = ContextCompat.getDrawable(textView2.getContext(), R.drawable.ic_update_account_profile);
        TextView textView3 = this.rowProfileUpdate;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, ContextCompat.getDrawable(textView3.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        TextView textView4 = this.rowProfileUpdate;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        TextView textView5 = this.rowProfileUpdate;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        textView4.setText(textView5.getContext().getString(R.string.str_personal_profile));
        TextView textView6 = this.rowSavedAddress;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowSavedAddress");
        }
        TextView textView7 = this.rowSavedAddress;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowSavedAddress");
        }
        Drawable drawable2 = ContextCompat.getDrawable(textView7.getContext(), R.drawable.ic_user_saved_addresses);
        TextView textView8 = this.rowSavedAddress;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowSavedAddress");
        }
        textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, ContextCompat.getDrawable(textView8.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        TextView textView9 = this.rowSavedAddress;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowSavedAddress");
        }
        TextView textView10 = this.rowProfileUpdate;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        textView9.setText(textView10.getContext().getString(R.string.str_saved_addresses));
        TextView textView11 = this.rowNotification;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowNotification");
        }
        TextView textView12 = this.rowNotification;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowNotification");
        }
        Drawable drawable3 = ContextCompat.getDrawable(textView12.getContext(), R.drawable.ic_settings);
        TextView textView13 = this.rowProfileUpdate;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowProfileUpdate");
        }
        textView11.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable3, (Drawable) null, ContextCompat.getDrawable(textView13.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        TextView textView14 = this.rowNotification;
        if (textView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowNotification");
        }
        TextView textView15 = this.rowNotification;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowNotification");
        }
        textView14.setText(textView15.getContext().getString(R.string.str_settings));
        if (this.isLoggedIn) {
            TextView textView16 = this.rowLogout;
            if (textView16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            TextView textView17 = this.rowLogout;
            if (textView17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            textView16.setText(textView17.getContext().getString(R.string.str_logout));
            TextView textView18 = this.rowLogout;
            if (textView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            TextView textView19 = this.rowLogout;
            if (textView19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            Drawable drawable4 = ContextCompat.getDrawable(textView19.getContext(), R.drawable.ic_logout);
            TextView textView20 = this.rowLogout;
            if (textView20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            textView18.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable4, (Drawable) null, ContextCompat.getDrawable(textView20.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        } else {
            TextView textView21 = this.rowLogout;
            if (textView21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            TextView textView22 = this.rowLogout;
            if (textView22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            textView21.setText(textView22.getContext().getString(R.string.str_login));
            TextView textView23 = this.rowLogout;
            if (textView23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            TextView textView24 = this.rowLogout;
            if (textView24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            Drawable drawable5 = ContextCompat.getDrawable(textView24.getContext(), R.drawable.ic_login);
            TextView textView25 = this.rowLogout;
            if (textView25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rowLogout");
            }
            textView23.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, (Drawable) null, ContextCompat.getDrawable(textView25.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        }
        TextView textView26 = this.mTxtTitle;
        if (textView26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        TextView textView27 = this.mTxtTitle;
        if (textView27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        textView26.setText(textView27.getContext().getString(R.string.str_title_account_more));
    }
}
