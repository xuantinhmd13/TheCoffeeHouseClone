package com.thecoffeehouse.guestapp.screens.stores.interaction;

import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore;
import com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore;
import com.thecoffeehouse.guestapp.screens.stores.SearchStoreType;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ConvertVNCharacter;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\r\u001a\u00020\u00052\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0005J\r\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0016J\u001e\u0010\u0017\u001a\u00020\u00052\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u0010J0\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000fj\b\u0012\u0004\u0012\u00020\u001a`\u00102\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J(\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000fj\b\u0012\u0004\u0012\u00020\u001a`\u00102\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$J\u0006\u0010%\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchStoreInteraction;", "", "onClickSelectedStore", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "", "(Lkotlin/jvm/functions/Function1;)V", "mPhvSearchStores", "Lcom/mindorks/placeholderview/PlaceHolderView;", "getMPhvSearchStores$app_liveRelease", "()Lcom/mindorks/placeholderview/PlaceHolderView;", "setMPhvSearchStores$app_liveRelease", "(Lcom/mindorks/placeholderview/PlaceHolderView;)V", "addFoundStoreRow", "stores", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addNotFoundItem", "queryString", "", "addOnScrollListener", "addRecentlySearchHeader", "addRecentlySearchHeader$app_liveRelease", "addRecentlySearchRow", "recentlyStore", "createTextAttributesBoldAsQuery", "Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "fullAddress", "addressAccent", "generateFoundStoreTextAttributes", "store", "queryingString", "initPhvSearchStore", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "removeAllViews", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchStoreInteraction.kt */
public final class SearchStoreInteraction {
    public PlaceHolderView mPhvSearchStores;
    private final Function1<Store, Unit> onClickSelectedStore;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.stores.Store, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchStoreInteraction(Function1<? super Store, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onClickSelectedStore");
        this.onClickSelectedStore = function1;
    }

    public final PlaceHolderView getMPhvSearchStores$app_liveRelease() {
        PlaceHolderView placeHolderView = this.mPhvSearchStores;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        return placeHolderView;
    }

    public final void setMPhvSearchStores$app_liveRelease(PlaceHolderView placeHolderView) {
        Intrinsics.checkNotNullParameter(placeHolderView, "<set-?>");
        this.mPhvSearchStores = placeHolderView;
    }

    public final void addFoundStoreRow(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "stores");
        Iterator<Store> it = arrayList.iterator();
        while (it.hasNext()) {
            Store next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "store");
            ItemRowPickStore itemRowPickStore = new ItemRowPickStore(next, new SearchStoreInteraction$addFoundStoreRow$itemRowStore$1(this));
            PlaceHolderView placeHolderView = this.mPhvSearchStores;
            if (placeHolderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
            }
            placeHolderView.addView(itemRowPickStore);
        }
    }

    public final void addNotFoundItem(String str) {
        Intrinsics.checkNotNullParameter(str, "queryString");
        PlaceHolderView placeHolderView = this.mPhvSearchStores;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        String string = placeHolderView.getContext().getString(R.string.str_not_found);
        Intrinsics.checkNotNullExpressionValue(string, "mPhvSearchStores.context…g(R.string.str_not_found)");
        TextViewAttribute textViewAttribute = new TextViewAttribute(Typography.quote + str + "\" ", Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color838387), Integer.valueOf((int) R.font.sfpd_regular));
        ItemRowSearchStore itemRowSearchStore = new ItemRowSearchStore(SearchStoreType.NOT_FOUND, null, SearchStoreInteraction$addNotFoundItem$itemNotFound$1.INSTANCE, new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular)), textViewAttribute);
        PlaceHolderView placeHolderView2 = this.mPhvSearchStores;
        if (placeHolderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        placeHolderView2.addView(itemRowSearchStore);
    }

    public final void addOnScrollListener() {
        PlaceHolderView placeHolderView = this.mPhvSearchStores;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        placeHolderView.addOnScrollListener(new SearchStoreInteraction$addOnScrollListener$1(this));
    }

    public final void addRecentlySearchRow(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "recentlyStore");
        Iterator<Store> it = arrayList.iterator();
        while (it.hasNext()) {
            Store next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "store");
            ItemRowPickStore itemRowPickStore = new ItemRowPickStore(next, new SearchStoreInteraction$addRecentlySearchRow$itemRowRecentlySearch$1(this));
            PlaceHolderView placeHolderView = this.mPhvSearchStores;
            if (placeHolderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
            }
            placeHolderView.addView(itemRowPickStore);
        }
    }

    public final void addRecentlySearchHeader$app_liveRelease() {
        PlaceHolderView placeHolderView = this.mPhvSearchStores;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        String string = placeHolderView.getContext().getString(R.string.str_recent_search);
        Intrinsics.checkNotNullExpressionValue(string, "mPhvSearchStores.context…string.str_recent_search)");
        ItemRowSearchStore itemRowSearchStore = new ItemRowSearchStore(SearchStoreType.RECENTLY_SEARCH_HEADER, null, SearchStoreInteraction$addRecentlySearchHeader$itemRowHeader$1.INSTANCE, new TextViewAttribute(string, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.colorBlack), Integer.valueOf((int) R.font.sfpd_semibold)));
        PlaceHolderView placeHolderView2 = this.mPhvSearchStores;
        if (placeHolderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        placeHolderView2.addView(itemRowSearchStore);
    }

    public final void removeAllViews() {
        PlaceHolderView placeHolderView = this.mPhvSearchStores;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvSearchStores");
        }
        placeHolderView.removeAllViews();
    }

    private final ArrayList<TextViewAttribute> createTextAttributesBoldAsQuery(String str, String str2, String str3) {
        String str4;
        ArrayList<TextViewAttribute> arrayList = new ArrayList<>();
        boolean z = true;
        int indexOf = StringsKt.indexOf((CharSequence) str, str2, 0, true);
        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
        String substring = str3.substring(0, indexOf);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Integer valueOf = Integer.valueOf((int) R.dimen._17sp);
        int i = R.color.color323232;
        arrayList.add(new TextViewAttribute(substring, valueOf, Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular)));
        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
        String substring2 = str3.substring(indexOf, str2.length() + indexOf);
        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        arrayList.add(new TextViewAttribute(substring2, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_bold)));
        ArrayList arrayListOf = CollectionsKt.arrayListOf(Integer.valueOf(indexOf));
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring3 = str.substring(str2.length() + indexOf);
        Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
        String substring4 = str3.substring(str2.length() + indexOf);
        Intrinsics.checkNotNullExpressionValue(substring4, "(this as java.lang.String).substring(startIndex)");
        if (indexOf >= 0) {
            while (true) {
                if (indexOf < 0) {
                    break;
                }
                String str5 = substring3;
                int indexOf2 = StringsKt.indexOf(str5, str2, 0, z);
                if (indexOf2 >= 0) {
                    arrayListOf.add(Integer.valueOf(indexOf2));
                    Objects.requireNonNull(substring4, "null cannot be cast to non-null type java.lang.String");
                    String substring5 = substring4.substring(0, indexOf2);
                    Intrinsics.checkNotNullExpressionValue(substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    TextViewAttribute textViewAttribute = new TextViewAttribute(substring5, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf(i), Integer.valueOf((int) R.font.sfpd_regular));
                    Objects.requireNonNull(substring4, "null cannot be cast to non-null type java.lang.String");
                    String substring6 = substring4.substring(indexOf2, str2.length() + indexOf2);
                    Intrinsics.checkNotNullExpressionValue(substring6, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    TextViewAttribute textViewAttribute2 = new TextViewAttribute(substring6, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf(i), Integer.valueOf((int) R.font.sfpd_bold));
                    arrayList.add(textViewAttribute);
                    arrayList.add(textViewAttribute2);
                    Objects.requireNonNull(substring3, "null cannot be cast to non-null type java.lang.String");
                    substring3 = substring3.substring(str2.length() + indexOf2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                    Objects.requireNonNull(substring4, "null cannot be cast to non-null type java.lang.String");
                    substring4 = substring4.substring(str2.length() + indexOf2);
                    Intrinsics.checkNotNullExpressionValue(substring4, "(this as java.lang.String).substring(startIndex)");
                    indexOf = indexOf2;
                    z = true;
                    i = R.color.color323232;
                } else {
                    try {
                        int lastIndex = StringsKt.getLastIndex(substring3) + 1;
                        if (substring4 != null) {
                            str4 = substring4.substring(0, lastIndex);
                            Intrinsics.checkNotNullExpressionValue(str4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            arrayList.add(new TextViewAttribute(str4, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular)));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } catch (Exception unused) {
                        int lastIndex2 = StringsKt.getLastIndex(str5);
                        Objects.requireNonNull(substring4, "null cannot be cast to non-null type java.lang.String");
                        str4 = substring4.substring(0, lastIndex2);
                        Intrinsics.checkNotNullExpressionValue(str4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                }
            }
        }
        return arrayList;
    }

    private final ArrayList<TextViewAttribute> generateFoundStoreTextAttributes(Store store, String str) {
        String str2 = store.getFullAddress().toString();
        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj = StringsKt.trim((CharSequence) str2).toString();
        ConvertVNCharacter convertVNCharacter = ConvertVNCharacter.INSTANCE;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        String unaccent = convertVNCharacter.unaccent(StringsKt.trim((CharSequence) str).toString());
        ConvertVNCharacter convertVNCharacter2 = ConvertVNCharacter.INSTANCE;
        String str3 = store.getFullAddress().toString();
        Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
        return createTextAttributesBoldAsQuery(convertVNCharacter2.unaccent(StringsKt.trim((CharSequence) str3).toString()), unaccent, obj);
    }

    public final void initPhvSearchStore(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        View findViewById = view.findViewById(R.id.phv_search_stores);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.phv_search_stores)");
        this.mPhvSearchStores = (PlaceHolderView) findViewById;
    }
}
