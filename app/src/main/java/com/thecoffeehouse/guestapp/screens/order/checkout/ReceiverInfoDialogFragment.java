package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/ReceiverInfoDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "NAME_KEY", "", "PHONE_NUMBER_KEY", "mBtnDone", "Lcom/thecoffeehouse/guestapp/views/TLButton;", "mLayoutReceiverName", "Landroid/view/ViewGroup;", "mLayoutReceiverPhoneNumber", "nameAndPhoneTextWatcher", "com/thecoffeehouse/guestapp/screens/order/checkout/ReceiverInfoDialogFragment$nameAndPhoneTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/ReceiverInfoDialogFragment$nameAndPhoneTextWatcher$1;", "onChangeReceiverInfoListener", "Lkotlin/Function2;", "", "checkReceiverIsValid", "disableDoneButton", "enableDoneButton", "getAnalyticScreenName", "initToolbar", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "onDestroy", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ReceiverInfoDialogFragment.kt */
public final class ReceiverInfoDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private final String NAME_KEY = "name";
    private final String PHONE_NUMBER_KEY = "phone_number";
    private HashMap _$_findViewCache;
    private TLButton mBtnDone;
    private ViewGroup mLayoutReceiverName;
    private ViewGroup mLayoutReceiverPhoneNumber;
    private final ReceiverInfoDialogFragment$nameAndPhoneTextWatcher$1 nameAndPhoneTextWatcher = new ReceiverInfoDialogFragment$nameAndPhoneTextWatcher$1(this);
    private Function2<? super String, ? super String, Unit> onChangeReceiverInfoListener = ReceiverInfoDialogFragment$onChangeReceiverInfoListener$1.INSTANCE;

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
        return R.layout.layout_edit_receiver_info;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/ReceiverInfoDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/ReceiverInfoDialogFragment;", "name", "", "phoneNumber", "onChangeReceiverInfo", "Lkotlin/Function2;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ReceiverInfoDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReceiverInfoDialogFragment newInstance(String str, String str2, Function2<? super String, ? super String, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "onChangeReceiverInfo");
            ReceiverInfoDialogFragment receiverInfoDialogFragment = new ReceiverInfoDialogFragment();
            receiverInfoDialogFragment.onChangeReceiverInfoListener = function2;
            receiverInfoDialogFragment.setArguments(BundleKt.bundleOf(new Pair(receiverInfoDialogFragment.NAME_KEY, str), new Pair(receiverInfoDialogFragment.PHONE_NUMBER_KEY, str2)));
            return receiverInfoDialogFragment;
        }
    }

    /* access modifiers changed from: private */
    public final void checkReceiverIsValid() {
        EditText editText;
        EditText editText2;
        ViewGroup viewGroup = this.mLayoutReceiverName;
        Editable editable = null;
        String valueOf = String.valueOf((viewGroup == null || (editText2 = (EditText) viewGroup.findViewById(R.id.edt_info)) == null) ? null : editText2.getText());
        ViewGroup viewGroup2 = this.mLayoutReceiverPhoneNumber;
        if (!(viewGroup2 == null || (editText = (EditText) viewGroup2.findViewById(R.id.edt_info)) == null)) {
            editable = editText.getText();
        }
        String valueOf2 = String.valueOf(editable);
        boolean z = true;
        if (!(valueOf.length() == 0)) {
            if (valueOf2.length() != 0) {
                z = false;
            }
            if (!z) {
                enableDoneButton();
                return;
            }
        }
        disableDoneButton();
    }

    private final void enableDoneButton() {
        TLButton tLButton = this.mBtnDone;
        if (tLButton != null) {
            tLButton.setEnabled(true);
        }
        TLButton tLButton2 = this.mBtnDone;
        if (tLButton2 != null) {
            tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorC5671B)));
        }
    }

    private final void disableDoneButton() {
        TLButton tLButton = this.mBtnDone;
        if (tLButton != null) {
            tLButton.setEnabled(false);
        }
        TLButton tLButton2 = this.mBtnDone;
        if (tLButton2 != null) {
            tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorBBBBBB)));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar(view);
        this.mBtnDone = (TLButton) view.findViewById(R.id.btn_done);
        this.mLayoutReceiverName = (ViewGroup) view.findViewById(R.id.row_receiver_name);
        this.mLayoutReceiverPhoneNumber = (ViewGroup) view.findViewById(R.id.row_receiver_phone_number);
        Bundle arguments = getArguments();
        String str = null;
        String string = arguments != null ? arguments.getString(this.NAME_KEY) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString(this.PHONE_NUMBER_KEY);
        }
        ViewGroup viewGroup = this.mLayoutReceiverName;
        if (!(viewGroup == null || (textView2 = (TextView) viewGroup.findViewById(R.id.txt_title)) == null)) {
            textView2.setText(getString(R.string.str_receiver_name));
        }
        ViewGroup viewGroup2 = this.mLayoutReceiverPhoneNumber;
        if (!(viewGroup2 == null || (textView = (TextView) viewGroup2.findViewById(R.id.txt_title)) == null)) {
            textView.setText(getString(R.string.str_phone_number));
        }
        ViewGroup viewGroup3 = this.mLayoutReceiverName;
        if (!(viewGroup3 == null || (editText5 = (EditText) viewGroup3.findViewById(R.id.edt_info)) == null)) {
            editText5.setText(string);
        }
        ViewGroup viewGroup4 = this.mLayoutReceiverPhoneNumber;
        if (!(viewGroup4 == null || (editText4 = (EditText) viewGroup4.findViewById(R.id.edt_info)) == null)) {
            editText4.setText(str);
        }
        ViewGroup viewGroup5 = this.mLayoutReceiverName;
        if (!(viewGroup5 == null || (editText3 = (EditText) viewGroup5.findViewById(R.id.edt_info)) == null)) {
            editText3.addTextChangedListener(this.nameAndPhoneTextWatcher);
        }
        ViewGroup viewGroup6 = this.mLayoutReceiverPhoneNumber;
        if (!(viewGroup6 == null || (editText2 = (EditText) viewGroup6.findViewById(R.id.edt_info)) == null)) {
            editText2.setInputType(3);
        }
        ViewGroup viewGroup7 = this.mLayoutReceiverPhoneNumber;
        if (!(viewGroup7 == null || (editText = (EditText) viewGroup7.findViewById(R.id.edt_info)) == null)) {
            editText.addTextChangedListener(this.nameAndPhoneTextWatcher);
        }
        TLButton tLButton = this.mBtnDone;
        if (tLButton != null) {
            ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new ReceiverInfoDialogFragment$initViews$1(this), 1, null);
        }
    }

    private final void initToolbar(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.toolbar);
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.txt_title_sub_screen);
            if (textView != null) {
                textView.setText(getString(R.string.str_receiver));
            }
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.img_back);
            if (imageView != null) {
                imageView.setOnClickListener(new ReceiverInfoDialogFragment$initToolbar$$inlined$apply$lambda$1(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        EditText editText;
        EditText editText2;
        super.onDestroy();
        ViewGroup viewGroup = this.mLayoutReceiverName;
        if (!(viewGroup == null || (editText2 = (EditText) viewGroup.findViewById(R.id.edt_info)) == null)) {
            editText2.removeTextChangedListener(this.nameAndPhoneTextWatcher);
        }
        ViewGroup viewGroup2 = this.mLayoutReceiverPhoneNumber;
        if (viewGroup2 != null && (editText = (EditText) viewGroup2.findViewById(R.id.edt_info)) != null) {
            editText.removeTextChangedListener(this.nameAndPhoneTextWatcher);
        }
    }
}
