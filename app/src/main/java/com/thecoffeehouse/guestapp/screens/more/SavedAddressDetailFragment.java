package com.thecoffeehouse.guestapp.screens.more;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.trackingevents.LocationEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressType;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0016\u0018\u0000 62\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\fH\u0002J\u001a\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010-\u001a\u00020\fH\u0016J\b\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\fH\u0002J\u0016\u00100\u001a\u00020\f*\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u00101\u001a\u00020\f*\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002J\f\u00102\u001a\u00020\f*\u00020\bH\u0002J\u0016\u00103\u001a\u00020\f*\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u00104\u001a\u00020\f*\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u00105\u001a\u00020\f*\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/SavedAddressDetailFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "SAVED_ADDRESS_KEY", "", "btnDone", "Landroid/widget/TextView;", "layoutAddress", "Landroid/widget/LinearLayout;", "layoutUserInfo", "onCompleteListener", "Lkotlin/Function0;", "", "pickLocationViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "getPickLocationViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "pickLocationViewModel$delegate", "Lkotlin/Lazy;", "preFillAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "savedAddressTextWatcher", "com/thecoffeehouse/guestapp/screens/more/SavedAddressDetailFragment$savedAddressTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/more/SavedAddressDetailFragment$savedAddressTextWatcher$1;", "txtDeleteAddress", "checkSavedAddressIsValid", "disableDoneButton", "enableDoneButton", "initBtnDone", "initDeleteAddress", "initLayoutAddress", "addressSuggestion", "initLayoutUserInfo", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "isAddressDataFullFilled", "", "isCreateNewAddress", "layoutResId", "", "onCreate", "onDestroy", "prepareDataUpsert", "sendEventTrackingCreateNewAddresses", "setAddress", "setBuilding", "setChangeAddressListener", "setGate", "setShippingNote", "setTitle", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SavedAddressDetailFragment.kt */
public final class SavedAddressDetailFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private final String SAVED_ADDRESS_KEY = "saved_addresses_key";
    private HashMap _$_findViewCache;
    private TextView btnDone;
    private LinearLayout layoutAddress;
    private LinearLayout layoutUserInfo;
    private Function0<Unit> onCompleteListener = SavedAddressDetailFragment$onCompleteListener$1.INSTANCE;
    private final Lazy pickLocationViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PickLocationViewModel.class), new SavedAddressDetailFragment$$special$$inlined$activityViewModels$1(this), new SavedAddressDetailFragment$$special$$inlined$activityViewModels$2(this));
    private AddressSuggestion preFillAddress = new AddressSuggestion();
    private final SavedAddressDetailFragment$savedAddressTextWatcher$1 savedAddressTextWatcher = new SavedAddressDetailFragment$savedAddressTextWatcher$1(this);
    private TextView txtDeleteAddress;

    /* access modifiers changed from: private */
    public final PickLocationViewModel getPickLocationViewModel() {
        return (PickLocationViewModel) this.pickLocationViewModel$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
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

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_saved_addresses_detail;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/SavedAddressDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/more/SavedAddressDetailFragment;", "addresses", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "onCompleted", "Lkotlin/Function0;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SavedAddressDetailFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SavedAddressDetailFragment newInstance(AddressSuggestion addressSuggestion, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(addressSuggestion, "addresses");
            Intrinsics.checkNotNullParameter(function0, "onCompleted");
            SavedAddressDetailFragment savedAddressDetailFragment = new SavedAddressDetailFragment();
            savedAddressDetailFragment.onCompleteListener = function0;
            savedAddressDetailFragment.setArguments(BundleKt.bundleOf(new Pair(savedAddressDetailFragment.SAVED_ADDRESS_KEY, addressSuggestion)));
            return savedAddressDetailFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onCreate(Bundle bundle) {
        AddressSuggestion addressSuggestion;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (addressSuggestion = (AddressSuggestion) arguments.getParcelable(this.SAVED_ADDRESS_KEY)) != null) {
            Intrinsics.checkNotNullExpressionValue(addressSuggestion, "it");
            this.preFillAddress = addressSuggestion;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        this.layoutAddress = (LinearLayout) view.findViewById(R.id.layout_address_info);
        this.layoutUserInfo = (LinearLayout) view.findViewById(R.id.layout_user_info);
        this.txtDeleteAddress = (TextView) view.findViewById(R.id.txt_delete_this_address);
        this.btnDone = (TextView) view.findViewById(R.id.btn_done);
        initLayoutAddress(this.preFillAddress);
        initLayoutUserInfo();
        initDeleteAddress();
        initBtnDone();
    }

    private final void initToolbar() {
        String str;
        ViewGroup rootView = getRootView();
        if (rootView != null) {
            ViewGroup viewGroup = rootView;
            View findViewById = viewGroup.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById, "toolbar");
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
            if (isCreateNewAddress()) {
                str = getString(R.string.str_create_address);
            } else {
                str = getString(R.string.str_edit_address);
            }
            textView.setText(str);
            View findViewById2 = viewGroup.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "toolbar");
            ImageView imageView = (ImageView) findViewById2.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new SavedAddressDetailFragment$initToolbar$$inlined$apply$lambda$1(this), 1, null);
        }
    }

    private final void initBtnDone() {
        checkSavedAddressIsValid();
        TextView textView = this.btnDone;
        if (textView != null) {
            ContextExtsKt.setOnSafeClickListener$default(textView, 0, new SavedAddressDetailFragment$initBtnDone$1(this), 1, null);
        }
    }

    /* access modifiers changed from: private */
    public final void sendEventTrackingCreateNewAddresses() {
        TrackingEventService.Companion.triggerSendTrackingEvent(LocationEvents.EventCreateNewAddressSubmitted.name);
    }

    /* access modifiers changed from: private */
    public final void checkSavedAddressIsValid() {
        if (isAddressDataFullFilled()) {
            enableDoneButton();
        } else {
            disableDoneButton();
        }
    }

    private final void enableDoneButton() {
        TextView textView = this.btnDone;
        if (textView != null) {
            textView.setEnabled(true);
        }
        TextView textView2 = this.btnDone;
        if (textView2 != null) {
            textView2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorC5671B)));
        }
    }

    private final void disableDoneButton() {
        TextView textView = this.btnDone;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.btnDone;
        if (textView2 != null) {
            textView2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorBBBBBB)));
        }
    }

    private final boolean isAddressDataFullFilled() {
        View findViewById;
        EditText editText;
        View findViewById2;
        EditText editText2;
        LinearLayout linearLayout = this.layoutUserInfo;
        Editable editable = null;
        String valueOf = String.valueOf((linearLayout == null || (findViewById2 = linearLayout.findViewById(R.id.row_address_user_name)) == null || (editText2 = (EditText) findViewById2.findViewById(R.id.edt_info)) == null) ? null : editText2.getText());
        LinearLayout linearLayout2 = this.layoutUserInfo;
        if (!(linearLayout2 == null || (findViewById = linearLayout2.findViewById(R.id.row_address_user_phone)) == null || (editText = (EditText) findViewById.findViewById(R.id.edt_info)) == null)) {
            editable = editText.getText();
        }
        String valueOf2 = String.valueOf(editable);
        if (this.preFillAddress.getFullAddress().length() > 0) {
            if (valueOf.length() > 0) {
                if (valueOf2.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void prepareDataUpsert() {
        String str;
        LinearLayout linearLayout = this.layoutAddress;
        if (linearLayout != null) {
            AddressSuggestion addressSuggestion = this.preFillAddress;
            LinearLayout linearLayout2 = linearLayout;
            View findViewById = linearLayout2.findViewById(R.id.row_address_title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_title");
            EditText editText = (EditText) findViewById.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText, "row_address_title.edt_info");
            String obj = editText.getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (StringsKt.trim(obj).toString().length() == 0) {
                str = this.preFillAddress.getTitleAddress();
                if (str == null) {
                    str = this.preFillAddress.getFullAddress();
                }
            } else {
                View findViewById2 = linearLayout2.findViewById(R.id.row_address_title);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_title");
                EditText editText2 = (EditText) findViewById2.findViewById(R.id.edt_info);
                Intrinsics.checkNotNullExpressionValue(editText2, "row_address_title.edt_info");
                String obj2 = editText2.getText().toString();
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                str = StringsKt.trim((CharSequence) obj2).toString();
            }
            addressSuggestion.setTitle(str);
            AddressSuggestion addressSuggestion2 = this.preFillAddress;
            View findViewById3 = linearLayout2.findViewById(R.id.row_address_building_and_floor);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_building_and_floor");
            EditText editText3 = (EditText) findViewById3.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText3, "row_address_building_and_floor.edt_info");
            String obj3 = editText3.getText().toString();
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
            addressSuggestion2.setHouseDetail(StringsKt.trim((CharSequence) obj3).toString());
            AddressSuggestion addressSuggestion3 = this.preFillAddress;
            View findViewById4 = linearLayout2.findViewById(R.id.row_address_gate);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "row_address_gate");
            EditText editText4 = (EditText) findViewById4.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText4, "row_address_gate.edt_info");
            String obj4 = editText4.getText().toString();
            Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.CharSequence");
            addressSuggestion3.setGate(StringsKt.trim((CharSequence) obj4).toString());
            AddressSuggestion addressSuggestion4 = this.preFillAddress;
            View findViewById5 = linearLayout2.findViewById(R.id.row_address_deli_note);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "row_address_deli_note");
            EditText editText5 = (EditText) findViewById5.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText5, "row_address_deli_note.edt_info");
            addressSuggestion4.setNote(StringExtsKt.toStringOrNull(editText5.getText().toString()));
        }
        LinearLayout linearLayout3 = this.layoutUserInfo;
        if (linearLayout3 != null) {
            AddressSuggestion addressSuggestion5 = this.preFillAddress;
            LinearLayout linearLayout4 = linearLayout3;
            View findViewById6 = linearLayout4.findViewById(R.id.row_address_user_name);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "row_address_user_name");
            EditText editText6 = (EditText) findViewById6.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText6, "row_address_user_name.edt_info");
            addressSuggestion5.setName(editText6.getText().toString());
            AddressSuggestion addressSuggestion6 = this.preFillAddress;
            View findViewById7 = linearLayout4.findViewById(R.id.row_address_user_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "row_address_user_phone");
            EditText editText7 = (EditText) findViewById7.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText7, "row_address_user_phone.edt_info");
            addressSuggestion6.setPhone(new Phone(null, editText7.getText().toString(), 1, null));
        }
    }

    private final void initDeleteAddress() {
        if (isCreateNewAddress()) {
            TextView textView = this.txtDeleteAddress;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.txtDeleteAddress;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.txtDeleteAddress;
        if (textView3 != null) {
            ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new SavedAddressDetailFragment$initDeleteAddress$1(this), 1, null);
        }
    }

    /* access modifiers changed from: private */
    public final boolean isCreateNewAddress() {
        Bundle arguments = getArguments();
        String str = null;
        AddressSuggestion addressSuggestion = arguments != null ? (AddressSuggestion) arguments.getParcelable(this.SAVED_ADDRESS_KEY) : null;
        if (addressSuggestion != null) {
            str = addressSuggestion.getId();
        }
        return str == null;
    }

    private final void initLayoutUserInfo() {
        Phone phone;
        String phoneNumber;
        ClientManager requireClientManager;
        LinearLayout linearLayout = this.layoutUserInfo;
        if (linearLayout != null) {
            TCHApplication tCHApplication = getTCHApplication();
            String str = null;
            Profile userProfile = (tCHApplication == null || (requireClientManager = tCHApplication.requireClientManager()) == null) ? null : requireClientManager.getUserProfile();
            LinearLayout linearLayout2 = linearLayout;
            View findViewById = linearLayout2.findViewById(R.id.row_address_user_name);
            Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_user_name");
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_title);
            Intrinsics.checkNotNullExpressionValue(textView, "row_address_user_name.txt_title");
            textView.setText(getString(R.string.str_receiver_name) + "*");
            View findViewById2 = linearLayout2.findViewById(R.id.row_address_user_name);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_user_name");
            EditText editText = (EditText) findViewById2.findViewById(R.id.edt_info);
            String name = this.preFillAddress.getName();
            if (name == null) {
                name = userProfile != null ? userProfile.getFullName() : null;
            }
            editText.setText(name);
            View findViewById3 = linearLayout2.findViewById(R.id.row_address_user_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_user_phone");
            TextView textView2 = (TextView) findViewById3.findViewById(R.id.txt_title);
            Intrinsics.checkNotNullExpressionValue(textView2, "row_address_user_phone.txt_title");
            textView2.setText(getString(R.string.str_phone_number) + "*");
            View findViewById4 = linearLayout2.findViewById(R.id.row_address_user_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "row_address_user_phone");
            EditText editText2 = (EditText) findViewById4.findViewById(R.id.edt_info);
            Phone phone2 = this.preFillAddress.getPhone();
            if (phone2 != null && (phoneNumber = phone2.getPhoneNumber()) != null) {
                str = phoneNumber;
            } else if (!(userProfile == null || (phone = userProfile.getPhone()) == null)) {
                str = phone.getPhoneNumber();
            }
            editText2.setText(str);
            View findViewById5 = linearLayout2.findViewById(R.id.row_address_user_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "row_address_user_phone");
            EditText editText3 = (EditText) findViewById5.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText3, "row_address_user_phone.edt_info");
            editText3.setInputType(3);
            View findViewById6 = linearLayout2.findViewById(R.id.row_address_user_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "row_address_user_phone");
            View findViewById7 = findViewById6.findViewById(R.id.view_line_bottom);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "row_address_user_phone.view_line_bottom");
            findViewById7.setVisibility(4);
            View findViewById8 = linearLayout2.findViewById(R.id.row_address_user_name);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "row_address_user_name");
            ((EditText) findViewById8.findViewById(R.id.edt_info)).addTextChangedListener(this.savedAddressTextWatcher);
            View findViewById9 = linearLayout2.findViewById(R.id.row_address_user_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "row_address_user_phone");
            ((EditText) findViewById9.findViewById(R.id.edt_info)).addTextChangedListener(this.savedAddressTextWatcher);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        View findViewById;
        EditText editText;
        View findViewById2;
        EditText editText2;
        super.onDestroy();
        LinearLayout linearLayout = this.layoutUserInfo;
        if (!(linearLayout == null || (findViewById2 = linearLayout.findViewById(R.id.row_address_user_name)) == null || (editText2 = (EditText) findViewById2.findViewById(R.id.edt_info)) == null)) {
            editText2.removeTextChangedListener(this.savedAddressTextWatcher);
        }
        LinearLayout linearLayout2 = this.layoutUserInfo;
        if (linearLayout2 != null && (findViewById = linearLayout2.findViewById(R.id.row_address_user_phone)) != null && (editText = (EditText) findViewById.findViewById(R.id.edt_info)) != null) {
            editText.removeTextChangedListener(this.savedAddressTextWatcher);
        }
    }

    private final void initLayoutAddress(AddressSuggestion addressSuggestion) {
        LinearLayout linearLayout = this.layoutAddress;
        if (linearLayout != null) {
            setTitle(linearLayout, addressSuggestion);
            setAddress(linearLayout, addressSuggestion);
            setChangeAddressListener(linearLayout);
            setBuilding(linearLayout, addressSuggestion);
            setGate(linearLayout, addressSuggestion);
            setShippingNote(linearLayout, addressSuggestion);
        }
    }

    private final void setChangeAddressListener(LinearLayout linearLayout) {
        View findViewById = linearLayout.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_text");
        ContextExtsKt.setOnSafeClickListener$default(findViewById, 0, new SavedAddressDetailFragment$setChangeAddressListener$1(this, linearLayout), 1, null);
    }

    private final void setShippingNote(LinearLayout linearLayout, AddressSuggestion addressSuggestion) {
        LinearLayout linearLayout2 = linearLayout;
        View findViewById = linearLayout2.findViewById(R.id.row_address_deli_note);
        Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_deli_note");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title);
        Intrinsics.checkNotNullExpressionValue(textView, "row_address_deli_note.txt_title");
        textView.setText(getString(R.string.str_other_note));
        View findViewById2 = linearLayout2.findViewById(R.id.row_address_deli_note);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_deli_note");
        EditText editText = (EditText) findViewById2.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText, "row_address_deli_note.edt_info");
        editText.setHint(getString(R.string.str_deliver_instruction));
        View findViewById3 = linearLayout2.findViewById(R.id.row_address_deli_note);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_deli_note");
        ((EditText) findViewById3.findViewById(R.id.edt_info)).setText(addressSuggestion != null ? addressSuggestion.getNote() : null);
        View findViewById4 = linearLayout2.findViewById(R.id.row_address_deli_note);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "row_address_deli_note");
        View findViewById5 = findViewById4.findViewById(R.id.view_line_bottom);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "row_address_deli_note.view_line_bottom");
        findViewById5.setVisibility(4);
    }

    private final void setGate(LinearLayout linearLayout, AddressSuggestion addressSuggestion) {
        LinearLayout linearLayout2 = linearLayout;
        View findViewById = linearLayout2.findViewById(R.id.row_address_gate);
        Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_gate");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title);
        Intrinsics.checkNotNullExpressionValue(textView, "row_address_gate.txt_title");
        textView.setText(getString(R.string.str_gate));
        View findViewById2 = linearLayout2.findViewById(R.id.row_address_gate);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_gate");
        EditText editText = (EditText) findViewById2.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText, "row_address_gate.edt_info");
        editText.setHint(getString(R.string.str_gate));
        View findViewById3 = linearLayout2.findViewById(R.id.row_address_gate);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_gate");
        ((EditText) findViewById3.findViewById(R.id.edt_info)).setText(addressSuggestion != null ? addressSuggestion.getGate() : null);
    }

    private final void setBuilding(LinearLayout linearLayout, AddressSuggestion addressSuggestion) {
        LinearLayout linearLayout2 = linearLayout;
        View findViewById = linearLayout2.findViewById(R.id.row_address_building_and_floor);
        Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_building_and_floor");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title);
        Intrinsics.checkNotNullExpressionValue(textView, "row_address_building_and_floor.txt_title");
        textView.setText(getString(R.string.str_building_and_floor));
        View findViewById2 = linearLayout2.findViewById(R.id.row_address_building_and_floor);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_building_and_floor");
        EditText editText = (EditText) findViewById2.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText, "row_address_building_and_floor.edt_info");
        editText.setHint(getString(R.string.str_hint_building));
        View findViewById3 = linearLayout2.findViewById(R.id.row_address_building_and_floor);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_building_and_floor");
        ((EditText) findViewById3.findViewById(R.id.edt_info)).setText(addressSuggestion != null ? addressSuggestion.getHouseDetail() : null);
    }

    /* access modifiers changed from: private */
    public final void setAddress(LinearLayout linearLayout, AddressSuggestion addressSuggestion) {
        String str;
        String str2;
        String fullAddress;
        List split$default;
        String titleAddress;
        LinearLayout linearLayout2 = linearLayout;
        View findViewById = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_text");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title);
        Intrinsics.checkNotNullExpressionValue(textView, "row_address_text.txt_title");
        textView.setText(getString(R.string.str_address) + "*");
        View findViewById2 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_text");
        EditText editText = (EditText) findViewById2.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText, "row_address_text.edt_info");
        editText.setMaxLines(2);
        View findViewById3 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_text");
        EditText editText2 = (EditText) findViewById3.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText2, "row_address_text.edt_info");
        editText2.setSingleLine(false);
        String str3 = null;
        String fullAddress2 = addressSuggestion != null ? addressSuggestion.getFullAddress() : null;
        if (fullAddress2 == null || fullAddress2.length() == 0) {
            String titleAddress2 = addressSuggestion != null ? addressSuggestion.getTitleAddress() : null;
            if (titleAddress2 == null || titleAddress2.length() == 0) {
                View findViewById4 = linearLayout2.findViewById(R.id.row_address_text);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "row_address_text");
                EditText editText3 = (EditText) findViewById4.findViewById(R.id.edt_info);
                Intrinsics.checkNotNullExpressionValue(editText3, "row_address_text.edt_info");
                editText3.setHint(getString(R.string.str_hint_select_location));
                View findViewById5 = linearLayout2.findViewById(R.id.row_address_text);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "row_address_text");
                ((EditText) findViewById5.findViewById(R.id.edt_info)).setLineSpacing(4.0f, 1.2f);
                View findViewById6 = linearLayout2.findViewById(R.id.row_address_text);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "row_address_text");
                EditText editText4 = (EditText) findViewById6.findViewById(R.id.edt_info);
                Intrinsics.checkNotNullExpressionValue(editText4, "row_address_text.edt_info");
                editText4.setClickable(true);
                View findViewById7 = linearLayout2.findViewById(R.id.row_address_text);
                Intrinsics.checkNotNullExpressionValue(findViewById7, "row_address_text");
                EditText editText5 = (EditText) findViewById7.findViewById(R.id.edt_info);
                Intrinsics.checkNotNullExpressionValue(editText5, "row_address_text.edt_info");
                editText5.setFocusable(false);
                View findViewById8 = linearLayout2.findViewById(R.id.row_address_text);
                Intrinsics.checkNotNullExpressionValue(findViewById8, "row_address_text");
                EditText editText6 = (EditText) findViewById8.findViewById(R.id.edt_info);
                Intrinsics.checkNotNullExpressionValue(editText6, "row_address_text.edt_info");
                ContextExtsKt.setOnSafeClickListener$default(editText6, 0, new SavedAddressDetailFragment$setAddress$1(linearLayout), 1, null);
            }
        }
        View findViewById9 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "row_address_text");
        EditText editText7 = (EditText) findViewById9.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText7, "row_address_text.edt_info");
        EditText editText8 = editText7;
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
        if (addressSuggestion == null || (titleAddress = addressSuggestion.getTitleAddress()) == null || (titleAddress + "\n") == null) {
            if (!(addressSuggestion == null || (fullAddress = addressSuggestion.getFullAddress()) == null || (split$default = StringsKt.split$default((CharSequence) fullAddress, new char[]{','}, false, 0, 6, (Object) null)) == null)) {
                str3 = (String) split$default.get(0);
            }
            str = Intrinsics.stringPlus(str3, "\n");
        }
        textViewAttributeArr[0] = new TextViewAttribute(str, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
        if (addressSuggestion == null || (str2 = addressSuggestion.getFullAddress()) == null) {
            str2 = "";
        }
        textViewAttributeArr[1] = new TextViewAttribute(str2, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(editText8, textViewAttributeArr);
        View findViewById52 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById52, "row_address_text");
        ((EditText) findViewById52.findViewById(R.id.edt_info)).setLineSpacing(4.0f, 1.2f);
        View findViewById62 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById62, "row_address_text");
        EditText editText42 = (EditText) findViewById62.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText42, "row_address_text.edt_info");
        editText42.setClickable(true);
        View findViewById72 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById72, "row_address_text");
        EditText editText52 = (EditText) findViewById72.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText52, "row_address_text.edt_info");
        editText52.setFocusable(false);
        View findViewById82 = linearLayout2.findViewById(R.id.row_address_text);
        Intrinsics.checkNotNullExpressionValue(findViewById82, "row_address_text");
        EditText editText62 = (EditText) findViewById82.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText62, "row_address_text.edt_info");
        ContextExtsKt.setOnSafeClickListener$default(editText62, 0, new SavedAddressDetailFragment$setAddress$1(linearLayout), 1, null);
    }

    private final void setTitle(LinearLayout linearLayout, AddressSuggestion addressSuggestion) {
        LinearLayout linearLayout2 = linearLayout;
        View findViewById = linearLayout2.findViewById(R.id.row_address_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "row_address_title");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title);
        Intrinsics.checkNotNullExpressionValue(textView, "row_address_title.txt_title");
        textView.setText(getString(R.string.str_address_title));
        String str = null;
        Integer valueOf = addressSuggestion != null ? Integer.valueOf(addressSuggestion.getType()) : null;
        int home = AddressType.INSTANCE.getHOME();
        if (valueOf != null && valueOf.intValue() == home) {
            View findViewById2 = linearLayout2.findViewById(R.id.row_address_title);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "row_address_title");
            EditText editText = (EditText) findViewById2.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText, "row_address_title.edt_info");
            editText.setEnabled(false);
            View findViewById3 = linearLayout2.findViewById(R.id.row_address_title);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "row_address_title");
            ((EditText) findViewById3.findViewById(R.id.edt_info)).setText(addressSuggestion.getTitle());
            return;
        }
        int work = AddressType.INSTANCE.getWORK();
        if (valueOf != null && valueOf.intValue() == work) {
            View findViewById4 = linearLayout2.findViewById(R.id.row_address_title);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "row_address_title");
            EditText editText2 = (EditText) findViewById4.findViewById(R.id.edt_info);
            Intrinsics.checkNotNullExpressionValue(editText2, "row_address_title.edt_info");
            editText2.setEnabled(false);
            View findViewById5 = linearLayout2.findViewById(R.id.row_address_title);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "row_address_title");
            ((EditText) findViewById5.findViewById(R.id.edt_info)).setText(addressSuggestion.getTitle());
            return;
        }
        View findViewById6 = linearLayout2.findViewById(R.id.row_address_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "row_address_title");
        EditText editText3 = (EditText) findViewById6.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText3, "row_address_title.edt_info");
        editText3.setEnabled(true);
        View findViewById7 = linearLayout2.findViewById(R.id.row_address_title);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "row_address_title");
        EditText editText4 = (EditText) findViewById7.findViewById(R.id.edt_info);
        Intrinsics.checkNotNullExpressionValue(editText4, "row_address_title.edt_info");
        editText4.setHint(getString(R.string.str_hint_name_address));
        View findViewById8 = linearLayout2.findViewById(R.id.row_address_title);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "row_address_title");
        EditText editText5 = (EditText) findViewById8.findViewById(R.id.edt_info);
        if (addressSuggestion != null) {
            str = addressSuggestion.getTitle();
        }
        editText5.setText(str);
    }
}
