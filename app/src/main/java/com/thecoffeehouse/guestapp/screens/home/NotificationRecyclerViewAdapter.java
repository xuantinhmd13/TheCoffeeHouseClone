package com.thecoffeehouse.guestapp.screens.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB7\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016R\u000e\u0010\f\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/NotificationRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mNotifications", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onItemClickListener", "Lkotlin/Function2;", "", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;)V", "VIEW_TYPE_BODY", "VIEW_TYPE_HEADER", "getItemCount", "getItemViewType", "position", "getUnreadCount", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NotificationHeaderViewHolder", "NotificationViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: NotificationRecyclerViewAdapter.kt */
public final class NotificationRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_BODY = 1;
    private final int VIEW_TYPE_HEADER;
    private final ArrayList<Object> mNotifications;
    private final Function2<Object, Integer, Unit> onItemClickListener;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationRecyclerViewAdapter(ArrayList<Object> arrayList, Function2<Object, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(arrayList, "mNotifications");
        Intrinsics.checkNotNullParameter(function2, "onItemClickListener");
        this.mNotifications = arrayList;
        this.onItemClickListener = function2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0015\u001a\u00020\u0014J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/NotificationRecyclerViewAdapter$NotificationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mImgIcon", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "mImgUnreadDot", "mTxtTime", "Landroid/widget/TextView;", "mTxtTitle", "viewLineBottom", "getViewLineBottom", "()Landroid/view/View;", "bind", "", "notification", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;", "onItemClickListener", "Lkotlin/Function2;", "", "p1", "orderProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: NotificationRecyclerViewAdapter.kt */
    public static final class NotificationViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final TLImageView mImgIcon;
        private final TLImageView mImgUnreadDot;
        private final TextView mTxtTime;
        private final TextView mTxtTitle;
        private final View viewLineBottom;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotificationViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.img_icon_noti);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.img_icon_noti)");
            this.mImgIcon = (TLImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.img_unread_dot);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.img_unread_dot)");
            this.mImgUnreadDot = (TLImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.txt_title_noti);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.txt_title_noti)");
            this.mTxtTitle = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.txt_time_noti);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.txt_time_noti)");
            this.mTxtTime = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.view_line_bottom);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.view_line_bottom)");
            this.viewLineBottom = findViewById5;
        }

        public final View getViewLineBottom() {
            return this.viewLineBottom;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/NotificationRecyclerViewAdapter$NotificationViewHolder$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/thecoffeehouse/guestapp/screens/home/NotificationRecyclerViewAdapter$NotificationViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: NotificationRecyclerViewAdapter.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NotificationViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_notification, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new NotificationViewHolder(inflate);
            }
        }

        public final void bind(Notification notification, Function2<? super Notification, ? super Integer, Unit> function2, int i) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            Intrinsics.checkNotNullParameter(function2, "onItemClickListener");
            Context context = this.mImgIcon.getContext();
            Glide.with(this.mImgIcon.getContext()).load(notification.getIcon()).transition(DrawableTransitionOptions.withCrossFade()).into(this.mImgIcon);
            if (Intrinsics.areEqual((Object) notification.getRead(), (Object) false)) {
                this.itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.colorFFFBF5));
                this.mImgUnreadDot.setVisibility(0);
            } else {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                view.setBackground(null);
                this.mImgUnreadDot.setVisibility(8);
            }
            this.mTxtTitle.setText(notification.getTitle());
            this.mTxtTime.setText(RewardExtsKt.convertSecondToTimeFormat(notification.getTime(), StringDateUtilsKt.DF_yyyy_MM_dd_hh_mm));
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ContextExtsKt.setOnSafeClickListener$default(view2, 0, new NotificationRecyclerViewAdapter$NotificationViewHolder$bind$1(function2, notification, i), 1, null);
        }

        public final void bind(OrderProcessing orderProcessing, Function2<? super OrderProcessing, ? super Integer, Unit> function2, int i) {
            Intrinsics.checkNotNullParameter(orderProcessing, "orderProcessing");
            Intrinsics.checkNotNullParameter(function2, "onItemClickListener");
            Context context = this.mImgIcon.getContext();
            Glide.with(context).load(Integer.valueOf((int) R.drawable.img_background_detail_subscription)).transition(DrawableTransitionOptions.withCrossFade()).into(this.mImgIcon);
            String shippingType = orderProcessing.getShippingType();
            boolean areEqual = Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI());
            Integer valueOf = Integer.valueOf((int) R.font.sfpd_semibold);
            Integer valueOf2 = Integer.valueOf((int) R.color.colorTextTitle);
            Integer valueOf3 = Integer.valueOf((int) R.dimen._16sp);
            if (areEqual) {
                TextView textView = this.mTxtTitle;
                String string = context.getString(R.string.str_delivery);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.str_delivery)");
                TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(string, valueOf3, valueOf2, valueOf));
            } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP())) {
                TextView textView2 = this.mTxtTitle;
                String string2 = context.getString(R.string.str_pick_up);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.str_pick_up)");
                TLTextViewKt.setTextMultipleFonts(textView2, new TextViewAttribute(string2, valueOf3, valueOf2, valueOf));
            } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
                TextView textView3 = this.mTxtTitle;
                String string3 = context.getString(R.string.str_at_table);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.str_at_table)");
                TLTextViewKt.setTextMultipleFonts(textView3, new TextViewAttribute(string3, valueOf3, valueOf2, valueOf));
            }
            String str = (context.getString(R.string.str_order_ref_title) + ": " + orderProcessing.getRef()) + "\n";
            ArrayList<OrderLineCreateOrder> orderlines = orderProcessing.getOrderlines();
            String str2 = (orderlines != null ? CollectionsKt.joinToString$default(orderlines, ", ", null, null, 0, null, NotificationRecyclerViewAdapter$NotificationViewHolder$bind$orderLines$1.INSTANCE, 30, null) : null) + "\n";
            this.mTxtTime.setText((str + str2) + ((context.getString(R.string.str_status) + ": ") + orderProcessing.getMessage()));
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ContextExtsKt.setOnSafeClickListener$default(view, 0, new NotificationRecyclerViewAdapter$NotificationViewHolder$bind$2(function2, orderProcessing, i), 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i != this.VIEW_TYPE_HEADER) {
            return NotificationViewHolder.Companion.from(viewGroup);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_header_noti, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "headerNotification");
        return new NotificationHeaderViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return this.VIEW_TYPE_HEADER;
        }
        return this.VIEW_TYPE_BODY;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/NotificationRecyclerViewAdapter$NotificationHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mTxtNotiHeader", "Landroid/widget/TextView;", "getMTxtNotiHeader", "()Landroid/widget/TextView;", "mTxtUnreadCount", "getMTxtUnreadCount", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: NotificationRecyclerViewAdapter.kt */
    public static final class NotificationHeaderViewHolder extends RecyclerView.ViewHolder {
        private final TextView mTxtNotiHeader;
        private final TextView mTxtUnreadCount;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotificationHeaderViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.txt_unread_count);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.txt_unread_count)");
            this.mTxtUnreadCount = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.txt_noti_header);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.txt_noti_header)");
            this.mTxtNotiHeader = (TextView) findViewById2;
        }

        public final TextView getMTxtUnreadCount() {
            return this.mTxtUnreadCount;
        }

        public final TextView getMTxtNotiHeader() {
            return this.mTxtNotiHeader;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mNotifications.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "p0");
        if (viewHolder instanceof NotificationViewHolder) {
            if (i == CollectionsKt.getLastIndex(this.mNotifications)) {
                ((NotificationViewHolder) viewHolder).getViewLineBottom().setVisibility(4);
            }
            Object obj = this.mNotifications.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "mNotifications[p1]");
            if (obj instanceof Notification) {
                ((NotificationViewHolder) viewHolder).bind((Notification) obj, this.onItemClickListener, i);
            } else if (obj instanceof OrderProcessing) {
                ((NotificationViewHolder) viewHolder).bind((OrderProcessing) obj, this.onItemClickListener, i);
            }
        } else if ((viewHolder instanceof NotificationHeaderViewHolder) && i == 0) {
            Object obj2 = this.mNotifications.get(i);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification");
            NotificationHeaderViewHolder notificationHeaderViewHolder = (NotificationHeaderViewHolder) viewHolder;
            notificationHeaderViewHolder.getMTxtNotiHeader().setText(((Notification) obj2).getTitle());
            if (getUnreadCount() > 0) {
                notificationHeaderViewHolder.getMTxtUnreadCount().setText(String.valueOf(getUnreadCount()));
            } else {
                notificationHeaderViewHolder.getMTxtUnreadCount().setVisibility(4);
            }
        }
    }

    private final int getUnreadCount() {
        Object last = CollectionsKt.last((List) this.mNotifications);
        if (last instanceof Notification) {
            ArrayList<Object> arrayList = this.mNotifications;
            Objects.requireNonNull(arrayList, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification> */");
            ArrayList arrayList2 = new ArrayList();
            for (T t : arrayList) {
                if (Intrinsics.areEqual((Object) t.getRead(), (Object) false)) {
                    arrayList2.add(t);
                }
            }
            return arrayList2.size();
        } else if (last instanceof OrderProcessing) {
            return this.mNotifications.size() - 1;
        } else {
            return 0;
        }
    }
}
