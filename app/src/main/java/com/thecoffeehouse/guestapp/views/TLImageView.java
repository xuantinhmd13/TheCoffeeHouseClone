package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.base.ICornerView;
import com.thecoffeehouse.guestapp.views.base.IStrokeView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bJ\u0012\u00101\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020/2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u00105\u001a\u00020/H\u0002J(\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000bH\u0014J\u0006\u0010;\u001a\u00020/J\u000e\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020\u001eR\u001a\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\u001a\u0010(\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001a\u0010+\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011¨\u0006>"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/TLImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/thecoffeehouse/guestapp/views/base/IStrokeView;", "Lcom/thecoffeehouse/guestapp/views/base/ICornerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerBotLeft", "getCornerBotLeft", "()I", "setCornerBotLeft", "(I)V", "cornerBotRight", "getCornerBotRight", "setCornerBotRight", "cornerTopLeft", "getCornerTopLeft", "setCornerTopLeft", "cornerTopRight", "getCornerTopRight", "setCornerTopRight", "mCornerRadius", "", "mDrawable", "Landroid/graphics/drawable/Drawable;", "mHeight", "mIsRound", "", "mWidth", "path", "Landroid/graphics/Path;", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeColorEnd", "getStrokeColorEnd", "setStrokeColorEnd", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "cornerImage", "", "radius", "draw", "canvas", "Landroid/graphics/Canvas;", "initDeclareStylable", "initDrawable", "onSizeChanged", "w", "h", "oldw", "oldh", "roundImage", "setTLDrawable", "drawable", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TLImageView.kt */
public final class TLImageView extends AppCompatImageView implements IStrokeView, ICornerView {
    private HashMap _$_findViewCache;
    private int cornerBotLeft;
    private int cornerBotRight;
    private int cornerTopLeft;
    private int cornerTopRight;
    private float[] mCornerRadius;
    private Drawable mDrawable;
    private final int mHeight;
    private boolean mIsRound;
    private final int mWidth;
    private final Path path = new Path();
    private int strokeColor;
    private int strokeColorEnd;
    private int strokeWidth;

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

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public void setStrokeWidth(int i) {
        this.strokeWidth = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public int getStrokeColor() {
        return this.strokeColor;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public void setStrokeColor(int i) {
        this.strokeColor = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public int getStrokeColorEnd() {
        return this.strokeColorEnd;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public void setStrokeColorEnd(int i) {
        this.strokeColorEnd = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerTopLeft() {
        return this.cornerTopLeft;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerTopLeft(int i) {
        this.cornerTopLeft = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerTopRight() {
        return this.cornerTopRight;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerTopRight(int i) {
        this.cornerTopRight = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerBotLeft() {
        return this.cornerBotLeft;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerBotLeft(int i) {
        this.cornerBotLeft = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerBotRight() {
        return this.cornerBotRight;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerBotRight(int i) {
        this.cornerBotRight = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLImageView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        initDeclareStylable(attributeSet);
        initDrawable();
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            switch (i2) {
                case 0:
                case 1:
                    i = getCornerTopLeft();
                    break;
                case 2:
                case 3:
                    i = getCornerTopRight();
                    break;
                case 4:
                case 5:
                    i = getCornerBotRight();
                    break;
                case 6:
                case 7:
                    i = getCornerBotLeft();
                    break;
                default:
                    f = 0.0f;
                    continue;
                    fArr[i2] = f;
            }
            f = (float) i;
            fArr[i2] = f;
        }
        this.mCornerRadius = fArr;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initDeclareStylable(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TLImageView);
        this.mDrawable = obtainStyledAttributes.getDrawable(4);
        this.mIsRound = obtainStyledAttributes.getBoolean(5, false);
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelOffset(8, 0));
        setStrokeColor(obtainStyledAttributes.getColor(6, 0));
        setStrokeColorEnd(obtainStyledAttributes.getColor(7, 0));
        setCornerBotLeft(obtainStyledAttributes.getDimensionPixelOffset(0, 0));
        setCornerBotRight(obtainStyledAttributes.getDimensionPixelOffset(1, 0));
        setCornerTopLeft(obtainStyledAttributes.getDimensionPixelOffset(2, 0));
        setCornerTopRight(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        if (this.mIsRound) {
            setCornerBotLeft(999);
            setCornerBotRight(999);
            setCornerTopRight(999);
            setCornerTopLeft(999);
        }
        obtainStyledAttributes.recycle();
    }

    private final void initDrawable() {
        float f;
        int i;
        Bitmap drawableToBitmap = TLImageViewKt.drawableToBitmap(this.mDrawable);
        if (drawableToBitmap != null) {
            getStrokeColorEnd();
            if (this.mIsRound) {
                setImageDrawable(new RoundDrawable(drawableToBitmap, (float) getStrokeWidth(), getStrokeColor(), 0, 8, null));
                return;
            }
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                switch (i2) {
                    case 0:
                    case 1:
                        i = getCornerTopLeft();
                        break;
                    case 2:
                    case 3:
                        i = getCornerTopRight();
                        break;
                    case 4:
                    case 5:
                        i = getCornerBotRight();
                        break;
                    case 6:
                    case 7:
                        i = getCornerBotLeft();
                        break;
                    default:
                        f = 0.0f;
                        continue;
                        fArr[i2] = f;
                }
                f = (float) i;
                fArr[i2] = f;
            }
            this.mCornerRadius = fArr;
            float strokeWidth2 = (float) getStrokeWidth();
            int strokeColor2 = getStrokeColor();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float[] fArr2 = this.mCornerRadius;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCornerRadius");
            }
            setImageDrawable(new RectDrawable(drawableToBitmap, strokeWidth2, strokeColor2, measuredWidth, measuredHeight, fArr2));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.path.reset();
    }

    public void draw(Canvas canvas) {
        int i;
        float[] fArr = new float[8];
        int i2 = 0;
        while (true) {
            float f = 0.0f;
            if (i2 < 8) {
                switch (i2) {
                    case 0:
                    case 1:
                        i = getCornerTopLeft();
                        break;
                    case 2:
                    case 3:
                        i = getCornerTopRight();
                        break;
                    case 4:
                    case 5:
                        i = getCornerBotRight();
                        break;
                    case 6:
                    case 7:
                        i = getCornerBotLeft();
                        break;
                    default:
                        fArr[i2] = f;
                        i2++;
                }
                f = (float) i;
                fArr[i2] = f;
                i2++;
            } else {
                this.mCornerRadius = fArr;
                Path path2 = this.path;
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float[] fArr2 = this.mCornerRadius;
                if (fArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCornerRadius");
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                Intrinsics.checkNotNull(canvas);
                canvas.clipPath(this.path);
                super.draw(canvas);
                return;
            }
        }
    }

    public final void setTLDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.mDrawable = drawable;
        initDrawable();
    }

    public final void cornerImage(int i) {
        float f;
        int i2;
        setCornerBotLeft(i);
        setCornerBotRight(i);
        setCornerTopRight(i);
        setCornerTopLeft(i);
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            switch (i3) {
                case 0:
                case 1:
                    i2 = getCornerTopLeft();
                    break;
                case 2:
                case 3:
                    i2 = getCornerTopRight();
                    break;
                case 4:
                case 5:
                    i2 = getCornerBotRight();
                    break;
                case 6:
                case 7:
                    i2 = getCornerBotLeft();
                    break;
                default:
                    f = 0.0f;
                    continue;
                    fArr[i3] = f;
            }
            f = (float) i2;
            fArr[i3] = f;
        }
        this.mCornerRadius = fArr;
        initDrawable();
    }

    public final void roundImage() {
        float f;
        int i;
        this.mIsRound = true;
        setCornerBotLeft(999);
        setCornerBotRight(999);
        setCornerTopRight(999);
        setCornerTopLeft(999);
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            switch (i2) {
                case 0:
                case 1:
                    i = getCornerTopLeft();
                    break;
                case 2:
                case 3:
                    i = getCornerTopRight();
                    break;
                case 4:
                case 5:
                    i = getCornerBotRight();
                    break;
                case 6:
                case 7:
                    i = getCornerBotLeft();
                    break;
                default:
                    f = 0.0f;
                    continue;
                    fArr[i2] = f;
            }
            f = (float) i;
            fArr[i2] = f;
        }
        this.mCornerRadius = fArr;
        initDrawable();
    }
}
