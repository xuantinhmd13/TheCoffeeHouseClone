package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import com.thecoffeehouse.guestapp.views.TLTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/PaymentMethodSelectionDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "defaultPayment", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "mAllPaymentMethods", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mOrderViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getMOrderViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "mOrderViewModel$delegate", "Lkotlin/Lazy;", "mPaymentMethods", "onPaymentSelect", "Lkotlin/Function1;", "", "getAnalyticScreenName", "", "initHeaderPayment", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "paymentIsAllowed", "", "payment", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PaymentMethodSelectionDialogFragment.kt */
public final class PaymentMethodSelectionDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Payment defaultPayment;
    private ArrayList<Payment> mAllPaymentMethods = new ArrayList<>();
    private final Lazy mOrderViewModel$delegate = LazyKt.lazy(new PaymentMethodSelectionDialogFragment$mOrderViewModel$2(this));
    private ArrayList<Payment> mPaymentMethods = new ArrayList<>();
    private Function1<? super Payment, Unit> onPaymentSelect = PaymentMethodSelectionDialogFragment$onPaymentSelect$1.INSTANCE;

    private final OrderViewModel getMOrderViewModel() {
        return (OrderViewModel) this.mOrderViewModel$delegate.getValue();
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
        return TrackingScreenService.Order_SelectPaymentMethod;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.payment_selection_dialog;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/PaymentMethodSelectionDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/PaymentMethodSelectionDialogFragment;", "defaultPayment", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "onPaymentSelect", "Lkotlin/Function1;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: PaymentMethodSelectionDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.order.checkout.PaymentMethodSelectionDialogFragment$Companion */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodSelectionDialogFragment newInstance$default(Companion companion, Payment payment, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = null;
            }
            if ((i & 2) != 0) {
                function1 = PaymentMethodSelectionDialogFragment$Companion$newInstance$1.INSTANCE;
            }
            return companion.newInstance(payment, function1);
        }

        public final PaymentMethodSelectionDialogFragment newInstance(Payment payment, Function1<? super Payment, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onPaymentSelect");
            PaymentMethodSelectionDialogFragment paymentMethodSelectionDialogFragment = new PaymentMethodSelectionDialogFragment();
            paymentMethodSelectionDialogFragment.defaultPayment = payment;
            paymentMethodSelectionDialogFragment.onPaymentSelect = function1;
            return paymentMethodSelectionDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        CustomRadioGroup customRadioGroup;
        View rootView;
        CustomRadioGroup customRadioGroup2;
        CustomRadioGroup customRadioGroup3;
        CustomRadioGroup customRadioGroup4;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mAllPaymentMethods = getMOrderViewModel().getAllPaymentMethods();
        this.mPaymentMethods = getMOrderViewModel().getAvailablePayments();
        initToolbar();
        initHeaderPayment();
        View rootView2 = getRootView();
        if (!(rootView2 == null || (customRadioGroup4 = (CustomRadioGroup) rootView2.findViewById(R.id.rdg_payment_method)) == null)) {
            customRadioGroup4.setOrientation(1);
        }
        int size = this.mAllPaymentMethods.size();
        for (int i = 0; i < size; i++) {
            Payment payment = this.mAllPaymentMethods.get(i);
            Intrinsics.checkNotNullExpressionValue(payment, "mAllPaymentMethods[i]");
            Payment payment2 = payment;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OptionPaymentLayout optionPaymentLayout = new OptionPaymentLayout(payment2, requireContext);
            optionPaymentLayout.getRadioButton().setId(i);
            optionPaymentLayout.getRadioButton().setText(payment2.getText());
            View rootView3 = getRootView();
            if (!(rootView3 == null || (customRadioGroup3 = (CustomRadioGroup) rootView3.findViewById(R.id.rdg_payment_method)) == null)) {
                customRadioGroup3.addView(optionPaymentLayout);
            }
            Payment payment3 = this.defaultPayment;
            if (payment3 != null && paymentIsAllowed(payment3)) {
                Payment payment4 = this.defaultPayment;
                if (!(!Intrinsics.areEqual(payment4 != null ? payment4.getMethod() : null, payment2.getMethod()) || (rootView = getRootView()) == null || (customRadioGroup2 = (CustomRadioGroup) rootView.findViewById(R.id.rdg_payment_method)) == null)) {
                    customRadioGroup2.check(optionPaymentLayout.getRadioButton());
                }
            }
            if (!paymentIsAllowed(optionPaymentLayout.getPaymentMethod())) {
                optionPaymentLayout.getRadioButton().setEnabled(false);
                optionPaymentLayout.getRadioButton().setAlpha(0.6f);
                optionPaymentLayout.getRadioButton().setButtonTintList(ColorStateList.valueOf(Color.parseColor("#33666666")));
                optionPaymentLayout.getRadioButton().setText((optionPaymentLayout.getRadioButton().getText().toString() + " ") + getString(R.string.str_not_available));
            }
            if (i == CollectionsKt.getLastIndex(this.mAllPaymentMethods)) {
                optionPaymentLayout.getLineDivider().setVisibility(8);
            }
        }
        View rootView4 = getRootView();
        if (!(rootView4 == null || (customRadioGroup = (CustomRadioGroup) rootView4.findViewById(R.id.rdg_payment_method)) == null)) {
            customRadioGroup.setChildOnClickListener(new PaymentMethodSelectionDialogFragment$initViews$2(this));
        }
    }

    private final boolean paymentIsAllowed(Payment payment) {
        ArrayList<Payment> arrayList = this.mPaymentMethods;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getMethod());
        }
        return arrayList2.contains(payment.getMethod());
    }

    private final void initHeaderPayment() {
        View findViewById;
        TLTextView tLTextView;
        View findViewById2;
        TextView textView;
        View findViewById3;
        TextView textView2;
        View rootView = getRootView();
        if (!(rootView == null || (findViewById3 = rootView.findViewById(R.id.layout_header_payment)) == null || (textView2 = (TextView) findViewById3.findViewById(R.id.txt_option_name)) == null)) {
            textView2.setText(getString(R.string.str_payment_method));
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById2 = rootView2.findViewById(R.id.layout_header_payment)) == null || (textView = (TextView) findViewById2.findViewById(R.id.txt_option_desc)) == null)) {
            textView.setVisibility(8);
        }
        View rootView3 = getRootView();
        if (rootView3 != null && (findViewById = rootView3.findViewById(R.id.layout_header_payment)) != null && (tLTextView = (TLTextView) findViewById.findViewById(R.id.txt_option_must_have)) != null) {
            tLTextView.setVisibility(8);
        }
    }

    private final void initToolbar() {
        View findViewById;
        TextView textView;
        View findViewById2;
        ImageView imageView;
        View rootView = getRootView();
        if (!(rootView == null || (findViewById2 = rootView.findViewById(R.id.toolbar)) == null || (imageView = (ImageView) findViewById2.findViewById(R.id.img_back)) == null)) {
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new PaymentMethodSelectionDialogFragment$initToolbar$1(this), 1, null);
        }
        View rootView2 = getRootView();
        if (rootView2 != null && (findViewById = rootView2.findViewById(R.id.toolbar)) != null && (textView = (TextView) findViewById.findViewById(R.id.txt_title_sub_screen)) != null) {
            textView.setText(getString(R.string.str_payment_method));
        }
    }
}
