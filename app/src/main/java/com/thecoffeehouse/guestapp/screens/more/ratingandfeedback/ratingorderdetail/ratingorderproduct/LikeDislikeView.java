package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.thecoffeehouse.guestapp.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\tJ\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderproduct/LikeDislikeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getDislikedRadioButton", "Landroid/widget/RadioButton;", "getLiked", "getLikedRadioButton", "getRadioGroup", "Landroid/widget/RadioGroup;", "setLike", "", "liked", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LikeDislikeView.kt */
public final class LikeDislikeView extends FrameLayout {
    private HashMap _$_findViewCache;

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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeDislikeView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_like_dislike_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeDislikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_like_dislike_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeDislikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_like_dislike_view, (ViewGroup) this, true);
    }

    public final RadioGroup getRadioGroup() {
        return (RadioGroup) _$_findCachedViewById(R.id.like_dislike_group);
    }

    public final RadioButton getLikedRadioButton() {
        return (RadioButton) _$_findCachedViewById(R.id.rbt_like);
    }

    public final RadioButton getDislikedRadioButton() {
        return (RadioButton) _$_findCachedViewById(R.id.rbt_dislike);
    }

    public final int getLiked() {
        RadioGroup radioGroup = (RadioGroup) _$_findCachedViewById(R.id.like_dislike_group);
        Intrinsics.checkNotNullExpressionValue(radioGroup, "like_dislike_group");
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == -1) {
            return 99;
        }
        RadioButton radioButton = (RadioButton) _$_findCachedViewById(R.id.rbt_like);
        Intrinsics.checkNotNullExpressionValue(radioButton, "rbt_like");
        if (checkedRadioButtonId == radioButton.getId()) {
            return 1;
        }
        RadioButton radioButton2 = (RadioButton) _$_findCachedViewById(R.id.rbt_dislike);
        Intrinsics.checkNotNullExpressionValue(radioButton2, "rbt_dislike");
        if (checkedRadioButtonId == radioButton2.getId()) {
            return 0;
        }
        return 99;
    }

    public final void setLike(int i) {
        if (i == 0) {
            RadioButton radioButton = (RadioButton) _$_findCachedViewById(R.id.rbt_like);
            Intrinsics.checkNotNullExpressionValue(radioButton, "rbt_like");
            ((RadioGroup) _$_findCachedViewById(R.id.like_dislike_group)).check(radioButton.getId());
        } else if (i == 1) {
            RadioButton radioButton2 = (RadioButton) _$_findCachedViewById(R.id.rbt_dislike);
            Intrinsics.checkNotNullExpressionValue(radioButton2, "rbt_dislike");
            ((RadioGroup) _$_findCachedViewById(R.id.like_dislike_group)).check(radioButton2.getId());
        } else if (i == 99) {
            ((RadioGroup) _$_findCachedViewById(R.id.like_dislike_group)).clearCheck();
        }
    }
}
