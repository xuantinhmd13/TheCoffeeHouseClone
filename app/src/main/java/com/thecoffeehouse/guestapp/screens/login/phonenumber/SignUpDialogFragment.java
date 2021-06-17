package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.PreFill;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0016\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0003J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006+"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "REQUEST_PICK_IMAGE", "", "REQUEST_READ_PHOTO", "REQUEST_TAKE_PHOTO", "currentPhotoPath", "", "getCurrentPhotoPath", "()Ljava/lang/String;", "setCurrentPhotoPath", "(Ljava/lang/String;)V", "mAuthResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "mGender", "mImageFile", "Ljava/io/File;", "mOnUpdateProfile", "Lkotlin/Function5;", "", "mUserFirstNameTextWatcher", "com/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment$mUserFirstNameTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment$mUserFirstNameTextWatcher$1;", "createImageFile", "dispatchPickFileIntent", "dispatchTakePictureIntent", "formatStringGender", "gender", "(Ljava/lang/Integer;)Ljava/lang/String;", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "listenViews", "onDestroy", "openBottomSheetAvatar", "openBottomSheetGender", "preFillUserProfile", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SignUpDialogFragment.kt */
public final class SignUpDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private final int REQUEST_PICK_IMAGE = 1;
    private final int REQUEST_READ_PHOTO = 3;
    private final int REQUEST_TAKE_PHOTO = 2;
    private HashMap _$_findViewCache;
    public String currentPhotoPath;
    private AuthResponse mAuthResponse;
    private int mGender;
    private File mImageFile;
    private Function5<? super SignUpDialogFragment, ? super String, ? super String, ? super String, ? super Integer, Unit> mOnUpdateProfile = SignUpDialogFragment$mOnUpdateProfile$1.INSTANCE;
    private final SignUpDialogFragment$mUserFirstNameTextWatcher$1 mUserFirstNameTextWatcher = new SignUpDialogFragment$mUserFirstNameTextWatcher$1(this);

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
        return R.layout.activity_sign_up;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment;", "authResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "onEnterLastCode", "Lkotlin/Function5;", "", "", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SignUpDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SignUpDialogFragment newInstance(AuthResponse authResponse, Function5<? super SignUpDialogFragment, ? super String, ? super String, ? super String, ? super Integer, Unit> function5) {
            Intrinsics.checkNotNullParameter(authResponse, "authResponse");
            Intrinsics.checkNotNullParameter(function5, "onEnterLastCode");
            SignUpDialogFragment signUpDialogFragment = new SignUpDialogFragment();
            signUpDialogFragment.mAuthResponse = authResponse;
            signUpDialogFragment.mOnUpdateProfile = function5;
            return signUpDialogFragment;
        }
    }

    public final String getCurrentPhotoPath() {
        String str = this.currentPhotoPath;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentPhotoPath");
        }
        return str;
    }

    public final void setCurrentPhotoPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentPhotoPath = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        setCancelable(false);
        ((EditText) _$_findCachedViewById(R.id.edt_user_first_name)).addTextChangedListener(this.mUserFirstNameTextWatcher);
        initViews();
        listenViews();
    }

    private final void listenViews() {
        ((ScrollView) _$_findCachedViewById(R.id.layout_root_sign_up)).setOnTouchListener(new SignUpDialogFragment$listenViews$1(this));
        EditText editText = (EditText) _$_findCachedViewById(R.id.edt_user_gender);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_user_gender");
        ContextExtsKt.setOnSafeClickListener$default(editText, 0, new SignUpDialogFragment$listenViews$2(this), 1, null);
        EditText editText2 = (EditText) _$_findCachedViewById(R.id.edt_user_birthday);
        Intrinsics.checkNotNullExpressionValue(editText2, "edt_user_birthday");
        ContextExtsKt.setOnSafeClickListener$default(editText2, 0, new SignUpDialogFragment$listenViews$3(this), 1, null);
        TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_update");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new SignUpDialogFragment$listenViews$4(this), 1, null);
    }

    private final void initViews() {
        initToolbar();
        preFillUserProfile();
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_update_profile));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new SignUpDialogFragment$initToolbar$1(this), 1, null);
    }

    private final void preFillUserProfile() {
        PreFill preFill;
        PreFill preFill2;
        PreFill preFill3;
        String birthday;
        PreFill preFill4;
        String firstName;
        AuthResponse authResponse = this.mAuthResponse;
        if (!(authResponse == null || (preFill4 = authResponse.getPreFill()) == null || (firstName = preFill4.getFirstName()) == null)) {
            ((EditText) _$_findCachedViewById(R.id.edt_user_first_name)).setText(firstName);
        }
        AuthResponse authResponse2 = this.mAuthResponse;
        if (!(authResponse2 == null || (preFill3 = authResponse2.getPreFill()) == null || (birthday = preFill3.getBirthday()) == null)) {
            ((EditText) _$_findCachedViewById(R.id.edt_user_birthday)).setText(StringDateUtilsKt.TimeFormatToFormat(birthday, StringDateUtilsKt.DF_SERVER_FORMAT, StringDateUtilsKt.DF_dd_MM_YYYY));
        }
        AuthResponse authResponse3 = this.mAuthResponse;
        this.mGender = (authResponse3 == null || (preFill2 = authResponse3.getPreFill()) == null) ? 0 : preFill2.getGender();
        EditText editText = (EditText) _$_findCachedViewById(R.id.edt_user_gender);
        AuthResponse authResponse4 = this.mAuthResponse;
        editText.setText(formatStringGender((authResponse4 == null || (preFill = authResponse4.getPreFill()) == null) ? null : Integer.valueOf(preFill.getGender())));
    }

    private final String formatStringGender(Integer num) {
        if (num != null && num.intValue() == 1) {
            String string = requireContext().getString(R.string.str_male);
            Intrinsics.checkNotNullExpressionValue(string, "requireContext().getString(R.string.str_male)");
            return string;
        } else if (num != null && num.intValue() == 2) {
            String string2 = requireContext().getString(R.string.str_female);
            Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getString(R.string.str_female)");
            return string2;
        } else {
            String string3 = requireContext().getString(R.string.str_unknown);
            Intrinsics.checkNotNullExpressionValue(string3, "requireContext().getString(R.string.str_unknown)");
            return string3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
        }
    }

    private final void openBottomSheetAvatar() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_share_report_bottom_sheet, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutDialog");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutDialog.txt_share");
        textView.setText(requireContext().getString(R.string.str_take_picture));
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutDialog.txt_share");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new SignUpDialogFragment$openBottomSheetAvatar$1(this, bottomSheetDialog), 1, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutDialog.txt_report");
        textView3.setText(requireContext().getString(R.string.str_from_gallery));
        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView4, "layoutDialog.txt_report");
        ContextExtsKt.setOnSafeClickListener$default(textView4, 0, new SignUpDialogFragment$openBottomSheetAvatar$2(this, bottomSheetDialog), 1, null);
        TextView textView5 = (TextView) inflate.findViewById(R.id.txt_cancel);
        Intrinsics.checkNotNullExpressionValue(textView5, "layoutDialog.txt_cancel");
        ContextExtsKt.setOnSafeClickListener$default(textView5, 0, new SignUpDialogFragment$openBottomSheetAvatar$3(bottomSheetDialog), 1, null);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
    }

    /* access modifiers changed from: private */
    public final void dispatchPickFileIntent() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        startActivityForResult(intent, this.REQUEST_READ_PHOTO);
    }

    /* access modifiers changed from: private */
    public final void dispatchTakePictureIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (intent.resolveActivity(requireContext.getPackageManager()) != null) {
            try {
                this.mImageFile = createImageFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file = this.mImageFile;
            if (file != null) {
                Intrinsics.checkNotNullExpressionValue(FileProvider.getUriForFile(requireContext(), "com.example.android.fileprovider", file), "FileProvider.getUriForFi… it\n                    )");
                startActivityForResult(intent, this.REQUEST_TAKE_PHOTO);
            }
        }
    }

    private final File createImageFile() throws IOException {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyyMMdd_HHmmss\").format(Date())");
        File createTempFile = File.createTempFile("JPEG_" + format + '_', ".jpg", requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        String absolutePath = createTempFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "absolutePath");
        this.currentPhotoPath = absolutePath;
        Intrinsics.checkNotNullExpressionValue(createTempFile, "File.createTempFile(\n   … = absolutePath\n        }");
        return createTempFile;
    }

    /* access modifiers changed from: private */
    public final void openBottomSheetGender() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_share_report_bottom_sheet, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutDialog");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutDialog.txt_share");
        textView.setText(requireContext().getString(R.string.str_male));
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutDialog.txt_share");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new SignUpDialogFragment$openBottomSheetGender$1(this, bottomSheetDialog), 1, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutDialog.txt_report");
        textView3.setText(requireContext().getString(R.string.str_female));
        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView4, "layoutDialog.txt_report");
        ContextExtsKt.setOnSafeClickListener$default(textView4, 0, new SignUpDialogFragment$openBottomSheetGender$2(this, bottomSheetDialog), 1, null);
        TextView textView5 = (TextView) inflate.findViewById(R.id.txt_cancel);
        Intrinsics.checkNotNullExpressionValue(textView5, "layoutDialog.txt_cancel");
        ContextExtsKt.setOnSafeClickListener$default(textView5, 0, new SignUpDialogFragment$openBottomSheetGender$3(bottomSheetDialog), 1, null);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
    }
}
