package com.thecoffeehouse.guestapp.screens.main;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/main/CardDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/thecoffeehouse/guestapp/screens/main/CardDialogAdapter$CardViewHolder;", "rankInfos", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RankInfoItem;", "cards", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/main/CardDialogAdapter$CardInfo;", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/util/ArrayList;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardInfo", "CardViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CardDialogAdapter.kt */
public final class CardDialogAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private final ArrayList<CardInfo> cards;
    private final List<RankInfoItem> rankInfos;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public CardDialogAdapter(List<RankInfoItem> list, ArrayList<CardInfo> arrayList) {
        Intrinsics.checkNotNullParameter(list, "rankInfos");
        Intrinsics.checkNotNullParameter(arrayList, "cards");
        this.rankInfos = list;
        this.cards = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_card_brown, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
        return new CardViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cards.size();
    }

    public void onBindViewHolder(CardViewHolder cardViewHolder, int i) {
        Intrinsics.checkNotNullParameter(cardViewHolder, "holder");
        CardInfo cardInfo = this.cards.get(i);
        Intrinsics.checkNotNullExpressionValue(cardInfo, "cards[position]");
        CardInfo cardInfo2 = cardInfo;
        View view = cardViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        Context context = view.getContext();
        TextView txtUsername = cardViewHolder.getTxtUsername();
        Intrinsics.checkNotNullExpressionValue(txtUsername, "holder.txtUsername");
        txtUsername.setText(cardInfo2.getName());
        TextView txtMembershipBarcode = cardViewHolder.getTxtMembershipBarcode();
        Intrinsics.checkNotNullExpressionValue(txtMembershipBarcode, "holder.txtMembershipBarcode");
        txtMembershipBarcode.setText(context.getString(R.string.str_membership_no));
        TextView txtBarcode = cardViewHolder.getTxtBarcode();
        Intrinsics.checkNotNullExpressionValue(txtBarcode, "holder.txtBarcode");
        txtBarcode.setText(cardInfo2.getBarcode());
        View view2 = cardViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
        if (!ViewCompat.isLaidOut(view2) || view2.isLayoutRequested()) {
            view2.addOnLayoutChangeListener(new CardDialogAdapter$onBindViewHolder$$inlined$doOnLayout$1(cardViewHolder, cardInfo2));
        } else {
            try {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                ImageView imgBarCode = cardViewHolder.getImgBarCode();
                Intrinsics.checkNotNullExpressionValue(imgBarCode, "holder.imgBarCode");
                GeneralKt.log(Integer.valueOf(imgBarCode.getWidth()));
                ImageView imgBarCode2 = cardViewHolder.getImgBarCode();
                Intrinsics.checkNotNullExpressionValue(imgBarCode2, "holder.imgBarCode");
                GeneralKt.log(Integer.valueOf(imgBarCode2.getHeight()));
                String barcode = cardInfo2.getBarcode();
                BarcodeFormat barcodeFormat = BarcodeFormat.CODE_128;
                ImageView imgBarCode3 = cardViewHolder.getImgBarCode();
                Intrinsics.checkNotNullExpressionValue(imgBarCode3, "holder.imgBarCode");
                int width = imgBarCode3.getWidth();
                ImageView imgBarCode4 = cardViewHolder.getImgBarCode();
                Intrinsics.checkNotNullExpressionValue(imgBarCode4, "holder.imgBarCode");
                cardViewHolder.getImgBarCode().setImageBitmap(barcodeEncoder.encodeBitmap(barcode, barcodeFormat, width, imgBarCode4.getHeight()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        View view3 = cardViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
        Context context2 = view3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "holder.itemView.context");
        Triple<RankInfoItem, String, GradientDrawable> rankInfoWithTheme = RewardExtsKt.getRankInfoWithTheme(context2, this.rankInfos, cardInfo2.getRank());
        TextView txtRank = cardViewHolder.getTxtRank();
        Intrinsics.checkNotNullExpressionValue(txtRank, "holder.txtRank");
        txtRank.setText(rankInfoWithTheme.getSecond());
        ConstraintLayout layoutCard = cardViewHolder.getLayoutCard();
        Intrinsics.checkNotNullExpressionValue(layoutCard, "holder.layoutCard");
        layoutCard.setBackground(rankInfoWithTheme.getThird());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/main/CardDialogAdapter$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgBarCode", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgBarCode", "()Landroid/widget/ImageView;", "layoutCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutCard", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "txtBarcode", "Landroid/widget/TextView;", "getTxtBarcode", "()Landroid/widget/TextView;", "txtMembershipBarcode", "getTxtMembershipBarcode", "txtRank", "getTxtRank", "txtUsername", "getTxtUsername", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CardDialogAdapter.kt */
    public static final class CardViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgBarCode;
        private final ConstraintLayout layoutCard;
        private final TextView txtBarcode;
        private final TextView txtMembershipBarcode;
        private final TextView txtRank;
        private final TextView txtUsername;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CardViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.imgBarCode = (ImageView) view.findViewById(R.id.img_bar_code);
            this.txtUsername = (TextView) view.findViewById(R.id.txt_username);
            this.txtMembershipBarcode = (TextView) view.findViewById(R.id.txt_membership_barcode);
            this.txtRank = (TextView) view.findViewById(R.id.txt_rank);
            this.layoutCard = (ConstraintLayout) view.findViewById(R.id.layout_card);
            this.txtBarcode = (TextView) view.findViewById(R.id.txt_barcode);
        }

        public final ImageView getImgBarCode() {
            return this.imgBarCode;
        }

        public final TextView getTxtUsername() {
            return this.txtUsername;
        }

        public final TextView getTxtMembershipBarcode() {
            return this.txtMembershipBarcode;
        }

        public final TextView getTxtRank() {
            return this.txtRank;
        }

        public final ConstraintLayout getLayoutCard() {
            return this.layoutCard;
        }

        public final TextView getTxtBarcode() {
            return this.txtBarcode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/main/CardDialogAdapter$CardInfo;", "", "name", "", "barcode", "rank", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getBarcode", "()Ljava/lang/String;", "getName", "getRank", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CardDialogAdapter.kt */
    public static final class CardInfo {
        private final String barcode;
        private final String name;
        private final int rank;

        public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = cardInfo.name;
            }
            if ((i2 & 2) != 0) {
                str2 = cardInfo.barcode;
            }
            if ((i2 & 4) != 0) {
                i = cardInfo.rank;
            }
            return cardInfo.copy(str, str2, i);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.barcode;
        }

        public final int component3() {
            return this.rank;
        }

        public final CardInfo copy(String str, String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "barcode");
            return new CardInfo(str, str2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardInfo)) {
                return false;
            }
            CardInfo cardInfo = (CardInfo) obj;
            return Intrinsics.areEqual(this.name, cardInfo.name) && Intrinsics.areEqual(this.barcode, cardInfo.barcode) && this.rank == cardInfo.rank;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.barcode;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + Integer.hashCode(this.rank);
        }

        public String toString() {
            return "CardInfo(name=" + this.name + ", barcode=" + this.barcode + ", rank=" + this.rank + ")";
        }

        public CardInfo(String str, String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "barcode");
            this.name = str;
            this.barcode = str2;
            this.rank = i;
        }

        public final String getBarcode() {
            return this.barcode;
        }

        public final String getName() {
            return this.name;
        }

        public final int getRank() {
            return this.rank;
        }
    }
}
