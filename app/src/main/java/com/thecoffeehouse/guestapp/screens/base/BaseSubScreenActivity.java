package com.thecoffeehouse.guestapp.screens.base;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0014¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseSubScreenActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity;", "()V", "getTitleToolbar", "", "getToolbarLayoutId", "", "()Ljava/lang/Integer;", "initToolbar", "", "initViews", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseSubScreenActivity.kt */
public abstract class BaseSubScreenActivity<T extends ViewModel> extends BaseActivity<T> {
    private HashMap _$_findViewCache;

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
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

    public abstract String getTitleToolbar();

    public abstract Integer getToolbarLayoutId();

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void initViews() {
        super.initViews();
        initToolbar();
    }

    private final void initToolbar() {
        Integer toolbarLayoutId = getToolbarLayoutId();
        if (toolbarLayoutId != null) {
            toolbarLayoutId.intValue();
            FrameLayout frameLayout = (FrameLayout) findViewById(toolbarLayoutId.intValue());
            Intrinsics.checkNotNullExpressionValue(frameLayout, "toolbarView");
            FrameLayout frameLayout2 = frameLayout;
            ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbarView.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new BaseSubScreenActivity$initToolbar$$inlined$let$lambda$1(this, toolbarLayoutId), 1, null);
            TextView textView = (TextView) frameLayout2.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbarView.txt_title_sub_screen");
            textView.setText(getTitleToolbar());
        }
    }
}
