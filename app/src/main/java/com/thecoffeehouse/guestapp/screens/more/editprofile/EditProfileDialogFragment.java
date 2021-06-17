package com.thecoffeehouse.guestapp.screens.more.editprofile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileRequest;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import com.thecoffeehouse.guestapp.views.TLImageView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0004H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\bH\u0014J\u0016\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0004J\u001c\u0010*\u001a\u00020\u000e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0,H\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\u001a\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020\u0004H\u0016J\b\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001fH\u0002J\"\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020\u001fH\u0002J\b\u0010<\u001a\u00020\u001fH\u0002J\b\u0010=\u001a\u00020\u001fH\u0002J\u001c\u0010>\u001a\u00020\u001f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001f0@H\u0002J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020CH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006D"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/editprofile/EditProfileDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "REQUEST_PICK_IMAGE", "", "REQUEST_READ_PHOTO", "REQUEST_TAKE_PHOTO", "currentPhotoPath", "", "getCurrentPhotoPath", "()Ljava/lang/String;", "setCurrentPhotoPath", "(Ljava/lang/String;)V", "isRequestCameraPermissionSuccess", "", "mBitmapAvatar", "Landroid/graphics/Bitmap;", "mImageFile", "Ljava/io/File;", "mUpdateProfileRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileRequest;", "mUriAvatar", "Landroid/net/Uri;", "viewModel", "Lcom/thecoffeehouse/guestapp/screens/more/editprofile/EditProfileViewModel;", "getViewModel", "()Lcom/thecoffeehouse/guestapp/screens/more/editprofile/EditProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createImageFile", "dispatchPickFileIntent", "", "dispatchTakePictureIntent", "encodeToBase64", "bitmap", "formatIntGender", "gender", "formatStringGender", "getAnalyticScreenName", "getResizedBitmap", MessengerShareContentUtility.MEDIA_IMAGE, "maxSize", "grantedCameraPermissions", "result", "", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "listenViews", "observeViewModel", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "openBottomSheetAvatar", "openBottomSheetGender", "registersAndCallsBackground", "requestCameraPermissionRuntimeListener", "onRequestSuccess", "Lkotlin/Function1;", "updateUserProfile", "userProfile", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: EditProfileDialogFragment.kt */
public final class EditProfileDialogFragment extends BaseFullScreenDialogFragment {
    private final int REQUEST_PICK_IMAGE = 1;
    private final int REQUEST_READ_PHOTO = 3;
    private final int REQUEST_TAKE_PHOTO = 2;
    private HashMap _$_findViewCache;
    public String currentPhotoPath;
    private boolean isRequestCameraPermissionSuccess;
    private Bitmap mBitmapAvatar;
    private File mImageFile;
    private UpdateProfileRequest mUpdateProfileRequest = new UpdateProfileRequest(null, null, null, null, null, 31, null);
    private Uri mUriAvatar;
    private final Lazy viewModel$delegate = LazyKt.lazy(new EditProfileDialogFragment$viewModel$2(this));

    /* access modifiers changed from: private */
    public final EditProfileViewModel getViewModel() {
        return (EditProfileViewModel) this.viewModel$delegate.getValue();
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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Update_Personal_Form;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_edit_profile;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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
        initToolbar();
        initViews();
        observeViewModel();
        listenViews();
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
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new EditProfileDialogFragment$initToolbar$1(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void registersAndCallsBackground() {
        requestCameraPermissionRuntimeListener(new EditProfileDialogFragment$registersAndCallsBackground$1(this));
    }

    private final void initViews() {
        TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_update");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new EditProfileDialogFragment$initViews$1(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final String encodeToBase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            System.gc();
            String encodeToString = Base64.encodeToString(byteArray, 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "Base64.encodeToString(byteArray, Base64.DEFAULT)");
            return encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            GeneralKt.log(Unit.INSTANCE);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream2);
            String encodeToString2 = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString2, "Base64.encodeToString(b, Base64.DEFAULT)");
            return encodeToString2;
        }
    }

    private final void observeViewModel() {
        getViewModel().getUserProfile().observe(this, new EditProfileDialogFragment$observeViewModel$1(this));
    }

    /* access modifiers changed from: private */
    public final void updateUserProfile(Profile profile) {
        ((EditText) _$_findCachedViewById(R.id.edt_first_name)).setText(profile.getFirstName());
        ((EditText) _$_findCachedViewById(R.id.edt_last_name)).setText(profile.getLastName());
        String email = profile.getEmail();
        int i = 0;
        if (email == null || StringsKt.isBlank(email)) {
            EditText editText = (EditText) _$_findCachedViewById(R.id.edt_email);
            Intrinsics.checkNotNullExpressionValue(editText, "edt_email");
            editText.setEnabled(true);
        } else {
            EditText editText2 = (EditText) _$_findCachedViewById(R.id.edt_email);
            Intrinsics.checkNotNullExpressionValue(editText2, "edt_email");
            editText2.setEnabled(false);
            ((EditText) _$_findCachedViewById(R.id.edt_email)).setText(profile.getEmail());
        }
        ((RequestBuilder) Glide.with(this).load(profile.getAvatar()).centerCrop()).into((TLImageView) _$_findCachedViewById(R.id.img_avatar));
        TextView textView = (TextView) _$_findCachedViewById(R.id.edt_user_phone_number);
        Intrinsics.checkNotNullExpressionValue(textView, "edt_user_phone_number");
        Phone phone = profile.getPhone();
        Date date = null;
        textView.setText(phone != null ? phone.getPhoneNumber() : null);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.edt_user_birthday);
        Intrinsics.checkNotNullExpressionValue(textView2, "edt_user_birthday");
        String birthday = profile.getBirthday();
        if (birthday != null) {
            date = StringDateUtilsKt.toDateObj(birthday, StringDateUtilsKt.DF_SERVER_FORMAT);
        }
        textView2.setText(StringDateUtilsKt.ToFormat(date, StringDateUtilsKt.DF_SERVER_FORMAT));
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.edt_user_gender);
        Intrinsics.checkNotNullExpressionValue(textView3, "edt_user_gender");
        Integer gender = profile.getGender();
        if (gender != null) {
            i = gender.intValue();
        }
        textView3.setText(formatStringGender(i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        Object obj = null;
        if (i == this.REQUEST_TAKE_PHOTO && i2 == -1) {
            this.mBitmapAvatar = (Bitmap) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("data"));
            ((RequestBuilder) Glide.with(this).load(this.mBitmapAvatar).centerCrop()).into((TLImageView) _$_findCachedViewById(R.id.img_avatar));
        }
        if (i == this.REQUEST_PICK_IMAGE && i2 == -1) {
            if (intent != null) {
                try {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        obj = extras2.get("data");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (obj != null) {
                Uri uri = (Uri) obj;
                GeneralKt.log("REQUEST_PICK_IMAGE imageBitmap: " + uri);
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                this.mBitmapAvatar = MediaStore.Images.Media.getBitmap(requireContext.getContentResolver(), uri);
                Intrinsics.checkNotNullExpressionValue(((RequestBuilder) Glide.with(this).load(uri).centerCrop()).into((TLImageView) _$_findCachedViewById(R.id.img_avatar)), "Glide.with(this).load(im…        .into(img_avatar)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.net.Uri");
            }
        }
        if (i == this.REQUEST_READ_PHOTO && i2 == -1 && intent != null) {
            Uri data = intent.getData();
            GeneralKt.log("REQUEST_READ_PHOTO imageBitmap: " + data);
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            this.mBitmapAvatar = MediaStore.Images.Media.getBitmap(requireContext2.getContentResolver(), data);
            ((RequestBuilder) Glide.with(this).load(data).centerCrop()).into((TLImageView) _$_findCachedViewById(R.id.img_avatar));
        }
    }

    private final void listenViews() {
        TLImageView tLImageView = (TLImageView) _$_findCachedViewById(R.id.img_avatar);
        Intrinsics.checkNotNullExpressionValue(tLImageView, "img_avatar");
        ContextExtsKt.setOnSafeClickListener$default(tLImageView, 0, new EditProfileDialogFragment$listenViews$1(this), 1, null);
        TextView textView = (TextView) _$_findCachedViewById(R.id.edt_user_gender);
        Intrinsics.checkNotNullExpressionValue(textView, "edt_user_gender");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new EditProfileDialogFragment$listenViews$2(this), 1, null);
    }

    private final void requestCameraPermissionRuntimeListener(Function1<? super Boolean, Unit> function1) {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new EditProfileDialogFragment$requestCameraPermissionRuntimeListener$requestPermissions$1(this, function1));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…missionSuccess)\n        }");
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0 && ContextCompat.checkSelfPermission(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && ContextCompat.checkSelfPermission(requireContext(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            this.isRequestCameraPermissionSuccess = true;
            function1.invoke(true);
            return;
        }
        registerForActivityResult.launch(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
    }

    private final File createImageFile() throws IOException {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyyMMdd_HHmmss\").format(Date())");
        MainActivity mainActivity = getMainActivity();
        File createTempFile = File.createTempFile("JPEG_" + format + '_', ".jpg", mainActivity != null ? mainActivity.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : null);
        String absolutePath = createTempFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "absolutePath");
        this.currentPhotoPath = absolutePath;
        Intrinsics.checkNotNullExpressionValue(createTempFile, "File.createTempFile(\n   … = absolutePath\n        }");
        return createTempFile;
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
                Intrinsics.checkNotNullExpressionValue(FileProvider.getUriForFile(requireContext(), "com.thecoffeehouse.guestapp.fileprovider", file), "FileProvider.getUriForFi… it\n                    )");
                startActivityForResult(intent, this.REQUEST_TAKE_PHOTO);
            }
        }
    }

    private final String formatStringGender(int i) {
        if (i == 1) {
            String string = getString(R.string.str_male);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_male)");
            return string;
        } else if (i != 2) {
            String string2 = getString(R.string.str_unknown);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_unknown)");
            return string2;
        } else {
            String string3 = getString(R.string.str_female);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.str_female)");
            return string3;
        }
    }

    /* access modifiers changed from: private */
    public final int formatIntGender(String str) {
        if (Intrinsics.areEqual(str, getString(R.string.str_male))) {
            return 1;
        }
        return Intrinsics.areEqual(str, getString(R.string.str_female)) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    public final boolean grantedCameraPermissions(Map<String, Boolean> map) {
        if (!Intrinsics.areEqual((Object) map.get("android.permission.CAMERA"), (Object) true) || !Intrinsics.areEqual((Object) map.get("android.permission.WRITE_EXTERNAL_STORAGE"), (Object) true) || !Intrinsics.areEqual((Object) map.get("android.permission.READ_EXTERNAL_STORAGE"), (Object) true)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void openBottomSheetAvatar() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_share_report_bottom_sheet, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutDialog");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutDialog.txt_share");
        textView.setText(getString(R.string.str_take_picture));
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutDialog.txt_share");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new EditProfileDialogFragment$openBottomSheetAvatar$1(this, bottomSheetDialog), 1, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutDialog.txt_report");
        textView3.setText(getString(R.string.str_from_gallery));
        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView4, "layoutDialog.txt_report");
        ContextExtsKt.setOnSafeClickListener$default(textView4, 0, new EditProfileDialogFragment$openBottomSheetAvatar$2(this, bottomSheetDialog), 1, null);
        TextView textView5 = (TextView) inflate.findViewById(R.id.txt_cancel);
        Intrinsics.checkNotNullExpressionValue(textView5, "layoutDialog.txt_cancel");
        ContextExtsKt.setOnSafeClickListener$default(textView5, 0, new EditProfileDialogFragment$openBottomSheetAvatar$3(bottomSheetDialog), 1, null);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
    }

    /* access modifiers changed from: private */
    public final void openBottomSheetGender() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_share_report_bottom_sheet, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutDialog");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutDialog.txt_share");
        textView.setText(getString(R.string.str_male));
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutDialog.txt_share");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new EditProfileDialogFragment$openBottomSheetGender$1(this, bottomSheetDialog), 1, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutDialog.txt_report");
        textView3.setText(getString(R.string.str_female));
        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView4, "layoutDialog.txt_report");
        ContextExtsKt.setOnSafeClickListener$default(textView4, 0, new EditProfileDialogFragment$openBottomSheetGender$2(this, bottomSheetDialog), 1, null);
        TextView textView5 = (TextView) inflate.findViewById(R.id.txt_cancel);
        Intrinsics.checkNotNullExpressionValue(textView5, "layoutDialog.txt_cancel");
        ContextExtsKt.setOnSafeClickListener$default(textView5, 0, new EditProfileDialogFragment$openBottomSheetGender$3(bottomSheetDialog), 1, null);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
    }

    public final Bitmap getResizedBitmap(Bitmap bitmap, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bitmap, MessengerShareContentUtility.MEDIA_IMAGE);
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        if (width > ((float) 1)) {
            i2 = (int) (((float) i) / width);
        } else {
            i2 = i;
            i = (int) (((float) i) * width);
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "Bitmap.createScaledBitma…age, width, height, true)");
        return createScaledBitmap;
    }
}
