package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import android.widget.Filter;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.utility.ConvertVNCharacter;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchProductAdapter.kt */
public final class SearchProductRecyclerViewAdapter$getFilter$1 extends Filter {
    final /* synthetic */ SearchProductRecyclerViewAdapter this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SearchProductRecyclerViewAdapter$getFilter$1(SearchProductRecyclerViewAdapter searchProductRecyclerViewAdapter) {
        this.this$0 = searchProductRecyclerViewAdapter;
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        String str;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        String obj = charSequence.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = StringsKt.trim((CharSequence) obj).toString();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = obj2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (lowerCase.length() == 0) {
            this.this$0.mProductsFiltered.clear();
            this.this$0.mProductsFiltered.addAll(this.this$0.mProducts);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : this.this$0.mProducts) {
                ConvertVNCharacter convertVNCharacter = ConvertVNCharacter.INSTANCE;
                String name = ((Product) obj3).getName();
                if (name != null) {
                    Locale locale2 = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale2, "Locale.ROOT");
                    Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                    str = name.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    str = null;
                }
                String valueOf = String.valueOf(str);
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                if (StringsKt.contains((CharSequence) convertVNCharacter.unaccent(StringsKt.trim((CharSequence) valueOf).toString()), (CharSequence) ConvertVNCharacter.INSTANCE.unaccent(lowerCase), true)) {
                    arrayList.add(obj3);
                }
            }
            this.this$0.mProductsFiltered = arrayList;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = this.this$0.mProductsFiltered;
        filterResults.count = this.this$0.mProductsFiltered.size();
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(filterResults, "filterResults");
        GeneralKt.log(filterResults.values);
        Object obj = filterResults.values;
        if (obj != null) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.Product> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.Product> */");
            ArrayList arrayList = (ArrayList) obj;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((Collection) obj);
            this.this$0.mProductsFiltered = arrayList2;
            this.this$0.notifyDataSetChanged();
        }
    }
}
