package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.base.BackgroundConfig;
import com.thecoffeehouse.guestapp.views.base.BackgroundConfigKt;
import com.thecoffeehouse.guestapp.views.base.IBackgroundColor;
import com.thecoffeehouse.guestapp.views.base.ICornerView;
import com.thecoffeehouse.guestapp.views.base.IStrokeView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u0002042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J(\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0014J\u001a\u0010=\u001a\u0002042\b\b\u0001\u0010>\u001a\u00020\u000b2\b\b\u0003\u0010?\u001a\u00020\u000bJ\u001a\u0010@\u001a\u0002042\b\b\u0001\u0010>\u001a\u00020\u000b2\b\b\u0003\u0010?\u001a\u00020\u000bJ\"\u0010@\u001a\u0002042\b\b\u0001\u0010>\u001a\u00020\u000b2\b\b\u0003\u0010?\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000bJ\u001a\u0010B\u001a\u0002042\b\b\u0001\u0010>\u001a\u00020\u000b2\b\b\u0003\u0010?\u001a\u00020\u000bR\u001a\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012¨\u0006C"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/TLButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lcom/thecoffeehouse/guestapp/views/base/IBackgroundColor;", "Lcom/thecoffeehouse/guestapp/views/base/ICornerView;", "Lcom/thecoffeehouse/guestapp/views/base/IStrokeView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bgColor", "getBgColor", "()I", "setBgColor", "(I)V", "bgColorEnd", "getBgColorEnd", "setBgColorEnd", "bgConfig", "Lcom/thecoffeehouse/guestapp/views/base/BackgroundConfig;", "cornerBotLeft", "getCornerBotLeft", "setCornerBotLeft", "cornerBotRight", "getCornerBotRight", "setCornerBotRight", "cornerTopLeft", "getCornerTopLeft", "setCornerTopLeft", "cornerTopRight", "getCornerTopRight", "setCornerTopRight", "mCornerRadius", "", "mPaint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeColorEnd", "getStrokeColorEnd", "setStrokeColorEnd", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "initDeclareStyleable", "onSizeChanged", "w", "h", "oldw", "oldh", "setBackgroundColor", "first", "last", "setBorderStrokeColor", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "setColors", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TLButton.kt */
public final class TLButton extends AppCompatButton implements IBackgroundColor, ICornerView, IStrokeView {
    private HashMap _$_findViewCache;
    private int bgColor;
    private int bgColorEnd;
    private final BackgroundConfig bgConfig;
    private int cornerBotLeft;
    private int cornerBotRight;
    private int cornerTopLeft;
    private int cornerTopRight;
    private float[] mCornerRadius;
    private final Paint mPaint;
    private final Path path;
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

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public int getBgColor() {
        return this.bgColor;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public void setBgColor(int i) {
        this.bgColor = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public int getBgColorEnd() {
        return this.bgColorEnd;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public void setBgColorEnd(int i) {
        this.bgColorEnd = i;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgConfig = new BackgroundConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null);
        this.path = new Path();
        this.mPaint = new Paint();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgConfig = new BackgroundConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null);
        this.path = new Path();
        this.mPaint = new Paint();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        BackgroundConfig backgroundConfig = new BackgroundConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null);
        this.bgConfig = backgroundConfig;
        this.path = new Path();
        this.mPaint = new Paint();
        initDeclareStyleable(attributeSet);
        backgroundConfig.setBgColor(getBgColor());
        backgroundConfig.setBgColorEnd(getBgColorEnd());
        backgroundConfig.setTopLeft(getCornerTopLeft());
        backgroundConfig.setTopRight(getCornerTopRight());
        backgroundConfig.setBotLeft(getCornerBotLeft());
        backgroundConfig.setBotRight(getCornerBotRight());
        backgroundConfig.setStrokeColor(getStrokeColor());
        backgroundConfig.setStrokeColorEnd(getStrokeColorEnd());
        backgroundConfig.setStrokeWidth(getStrokeWidth());
        if (getBgColor() != 0) {
            BackgroundConfigKt.initBackground$default(this, backgroundConfig, null, 2, null);
        }
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            switch (i2) {
                case 0:
                case 1:
                    i = this.bgConfig.getTopLeft();
                    break;
                case 2:
                case 3:
                    i = this.bgConfig.getTopRight();
                    break;
                case 4:
                case 5:
                    i = this.bgConfig.getBotRight();
                    break;
                case 6:
                case 7:
                    i = this.bgConfig.getBotLeft();
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

    private final void initDeclareStyleable(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TLButton);
        setBgColor(obtainStyledAttributes.getColor(0, 0));
        setBgColorEnd(obtainStyledAttributes.getColor(1, 0));
        setCornerTopLeft(obtainStyledAttributes.getDimensionPixelOffset(4, 0));
        setCornerTopRight(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        setCornerBotLeft(obtainStyledAttributes.getDimensionPixelOffset(2, 0));
        setCornerBotRight(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelOffset(8, 0));
        setStrokeColor(obtainStyledAttributes.getColor(6, 0));
        setStrokeColorEnd(obtainStyledAttributes.getColor(7, 0));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.path.reset();
        if (getStrokeWidth() <= 0) {
            return;
        }
        if (getStrokeColorEnd() != 0) {
            this.mPaint.setColor(this.bgConfig.getStrokeColor());
            this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, (float) i, 0.0f, this.bgConfig.getStrokeColor(), this.bgConfig.getStrokeColorEnd(), Shader.TileMode.CLAMP));
            return;
        }
        this.mPaint.setShader(null);
        this.mPaint.setColor(this.bgConfig.getStrokeColor());
    }

    public void draw(Canvas canvas) {
        if (getStrokeWidth() > 0) {
            Path path2 = this.path;
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            float[] fArr = this.mCornerRadius;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCornerRadius");
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
            Intrinsics.checkNotNull(canvas);
            canvas.clipPath(this.path);
            canvas.drawRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.mPaint);
        }
        super.draw(canvas);
    }

    public static /* synthetic */ void setColors$default(TLButton tLButton, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        tLButton.setColors(i, i2);
    }

    public final void setColors(int i, int i2) {
        setBgColor(i);
        setBgColorEnd(i2);
        this.bgConfig.setBgColor(getBgColor());
        this.bgConfig.setBgColorEnd(getBgColorEnd());
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
    }

    public static /* synthetic */ void setBorderStrokeColor$default(TLButton tLButton, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        tLButton.setBorderStrokeColor(i, i2);
    }

    public final void setBorderStrokeColor(int i, int i2) {
        setStrokeColor(i);
        setStrokeColorEnd(i2);
        this.bgConfig.setStrokeColor(getStrokeColor());
        this.bgConfig.setStrokeColorEnd(getStrokeColorEnd());
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
        if (getStrokeWidth() > 0) {
            if (getStrokeColorEnd() != 0) {
                this.mPaint.setColor(this.bgConfig.getStrokeColor());
                this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, (float) getWidth(), 0.0f, this.bgConfig.getStrokeColor(), this.bgConfig.getStrokeColorEnd(), Shader.TileMode.CLAMP));
            } else {
                this.mPaint.setShader(null);
                this.mPaint.setColor(this.bgConfig.getStrokeColor());
            }
        }
        invalidate();
    }

    public static /* synthetic */ void setBackgroundColor$default(TLButton tLButton, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        tLButton.setBackgroundColor(i, i2);
    }

    public final void setBackgroundColor(int i, int i2) {
        setBgColor(i);
        setBgColorEnd(i2);
        this.bgConfig.setBgColor(getBgColor());
        this.bgConfig.setBgColorEnd(getBgColorEnd());
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
    }

    public static /* synthetic */ void setBorderStrokeColor$default(TLButton tLButton, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        tLButton.setBorderStrokeColor(i, i2, i3);
    }

    public final void setBorderStrokeColor(int i, int i2, int i3) {
        setStrokeColor(i);
        setStrokeColorEnd(i2);
        setStrokeWidth(i3);
        this.bgConfig.setStrokeColor(getStrokeColor());
        this.bgConfig.setStrokeColorEnd(getStrokeColorEnd());
        this.bgConfig.setStrokeWidth(getStrokeWidth());
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
        if (getStrokeWidth() > 0) {
            if (getStrokeColorEnd() != 0) {
                this.mPaint.setColor(this.bgConfig.getStrokeColor());
                this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, (float) i3, 0.0f, this.bgConfig.getStrokeColor(), this.bgConfig.getStrokeColorEnd(), Shader.TileMode.CLAMP));
            } else {
                this.mPaint.setShader(null);
                this.mPaint.setColor(this.bgConfig.getStrokeColor());
            }
        }
        invalidate();
    }
}
