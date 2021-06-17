package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/VerifyPhoneDialog;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mOnUpdatePhoneNumber", "Lkotlin/Function2;", "", "", "mPhoneNumberTextWatcher", "com/thecoffeehouse/guestapp/screens/login/phonenumber/VerifyPhoneDialog$mPhoneNumberTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/VerifyPhoneDialog$mPhoneNumberTextWatcher$1;", "getTheme", "", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "listenViews", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: VerifyPhoneDialog.kt */
public final class VerifyPhoneDialog extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Function2<? super String, ? super String, Unit> mOnUpdatePhoneNumber = VerifyPhoneDialog$mOnUpdatePhoneNumber$1.INSTANCE;
    private final VerifyPhoneDialog$mPhoneNumberTextWatcher$1 mPhoneNumberTextWatcher = new VerifyPhoneDialog$mPhoneNumberTextWatcher$1(this);

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

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.FullScreenDialogTheme;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.layout_verify_phone_dialog;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/VerifyPhoneDialog$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/VerifyPhoneDialog;", "onEnterLastCode", "Lkotlin/Function2;", "", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: VerifyPhoneDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VerifyPhoneDialog newInstance(Function2<? super String, ? super String, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "onEnterLastCode");
            VerifyPhoneDialog verifyPhoneDialog = new VerifyPhoneDialog();
            verifyPhoneDialog.mOnUpdatePhoneNumber = function2;
            return verifyPhoneDialog;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        setCancelable(false);
        ((EditText) _$_findCachedViewById(R.id.edt_phone_number)).requestFocus();
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(4);
        }
        ((EditText) _$_findCachedViewById(R.id.edt_phone_number)).addTextChangedListener(this.mPhoneNumberTextWatcher);
        initViews();
        listenViews();
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText("");
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new VerifyPhoneDialog$initToolbar$1(this), 1, null);
    }

    private final void initViews() {
        initToolbar();
    }

    private final void listenViews() {
        ((ConstraintLayout) _$_findCachedViewById(R.id.layout_root_verify_otp)).setOnTouchListener(new VerifyPhoneDialog$listenViews$1(this));
        TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_update");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new VerifyPhoneDialog$listenViews$2(this), 1, null);
    }
}
