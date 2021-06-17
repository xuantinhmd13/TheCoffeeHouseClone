package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.chip.ChipGroup;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.HintTextView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.InputTextCharCountView;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u001a\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductNoteDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "LIMIT_NOTE_CHAR", "", "hints", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mSoftKeyboardToggleListener", "Lcom/thecoffeehouse/guestapp/utility/KeyboardUtils$SoftKeyboardToggleListener;", "note", "onEditNoteListener", "Lkotlin/Function1;", "", "getTheme", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductNoteDialogFragment.kt */
public final class ProductNoteDialogFragment extends BottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private static final String HINTS_KEY = "hints_key";
    private static final String NOTE_KEY = "note_key";
    private final int LIMIT_NOTE_CHAR = 50;
    private HashMap _$_findViewCache;
    private ArrayList<String> hints = new ArrayList<>();
    private final KeyboardUtils.SoftKeyboardToggleListener mSoftKeyboardToggleListener = new ProductNoteDialogFragment$mSoftKeyboardToggleListener$1(this);
    private String note = "";
    private Function1<? super String, Unit> onEditNoteListener = ProductNoteDialogFragment$onEditNoteListener$1.INSTANCE;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

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

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.AppBottomSheetDialogTheme;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductNoteDialogFragment$Companion;", "", "()V", "HINTS_KEY", "", "NOTE_KEY", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductNoteDialogFragment;", "note", "hints", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onEditNoteListener", "Lkotlin/Function1;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ProductNoteDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProductNoteDialogFragment newInstance(String str, ArrayList<String> arrayList, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onEditNoteListener");
            ProductNoteDialogFragment productNoteDialogFragment = new ProductNoteDialogFragment();
            productNoteDialogFragment.setArguments(BundleKt.bundleOf(new Pair(ProductNoteDialogFragment.NOTE_KEY, str), new Pair(ProductNoteDialogFragment.HINTS_KEY, arrayList)));
            productNoteDialogFragment.onEditNoteListener = function1;
            return productNoteDialogFragment;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Objects.requireNonNull(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) onCreateDialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        behavior.setState(3);
        behavior.setFitToContents(true);
        behavior.setSkipCollapsed(true);
        behavior.setHideable(true);
        behavior.setHalfExpandedRatio(1.0E-7f);
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_product_note_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(NOTE_KEY, "");
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(NOTE_KEY, \"\")");
            this.note = string;
            ArrayList<String> stringArrayList = arguments.getStringArrayList(HINTS_KEY);
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            this.hints = stringArrayList;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        ((ImageView) _$_findCachedViewById(R.id.img_close)).setOnClickListener(new ProductNoteDialogFragment$onViewCreated$1(this));
        KeyboardUtils.addKeyboardToggleListener(getActivity(), this.mSoftKeyboardToggleListener);
        ((InputTextCharCountView) _$_findCachedViewById(R.id.input_text_char_count)).setMaxChars(this.LIMIT_NOTE_CHAR);
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.input_text_char_count)).getEditTextInput();
        if (editTextInput != null) {
            editTextInput.setText(this.note);
        }
        EditText editTextInput2 = ((InputTextCharCountView) _$_findCachedViewById(R.id.input_text_char_count)).getEditTextInput();
        if (editTextInput2 != null) {
            Context context = getContext();
            editTextInput2.setBackground(context != null ? ContextCompat.getDrawable(context, R.drawable.background_corner_solid_light_gray) : null);
        }
        Context context2 = getContext();
        if (context2 != null) {
            if (!this.hints.isEmpty()) {
                Iterator<T> it = this.hints.iterator();
                while (it.hasNext()) {
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    HintTextView hintTextView = new HintTextView(context2);
                    hintTextView.updateData(it.next());
                    hintTextView.setId(ViewCompat.generateViewId());
                    hintTextView.setOnClickListener(new ProductNoteDialogFragment$onViewCreated$$inlined$let$lambda$1(hintTextView, context2, this));
                    ((ChipGroup) _$_findCachedViewById(R.id.flow_hints)).addView(hintTextView);
                }
            } else {
                TextView textView = (TextView) _$_findCachedViewById(R.id.txt_hint_title);
                Intrinsics.checkNotNullExpressionValue(textView, "txt_hint_title");
                textView.setVisibility(8);
                ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.flow_hints);
                Intrinsics.checkNotNullExpressionValue(chipGroup, "flow_hints");
                chipGroup.setVisibility(8);
            }
        }
        ((TextView) _$_findCachedViewById(R.id.txt_done)).setOnClickListener(new ProductNoteDialogFragment$onViewCreated$4(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        KeyboardUtils.removeKeyboardToggleListener(this.mSoftKeyboardToggleListener);
        _$_clearFindViewByIdCache();
    }
}
