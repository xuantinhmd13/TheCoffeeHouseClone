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
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.base.BackgroundConfig;
import com.thecoffeehouse.guestapp.views.base.BackgroundConfigKt;
import com.thecoffeehouse.guestapp.views.base.IBackgroundColor;
import com.thecoffeehouse.guestapp.views.base.ICornerView;
import com.thecoffeehouse.guestapp.views.base.IDayTimeTextView;
import com.thecoffeehouse.guestapp.views.base.INumberText;
import com.thecoffeehouse.guestapp.views.base.IStrokeView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0012\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\u0012\u0010X\u001a\u00020U2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J(\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0014J\b\u0010^\u001a\u00020UH\u0002J\u001c\u0010_\u001a\u00020U2\b\u0010`\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0012\u0010d\u001a\u0004\u0018\u00010a2\u0006\u0010e\u001a\u00020aH\u0002J\u0014\u0010f\u001a\u00020U2\n\u0010e\u001a\u00060gj\u0002`hH\u0002R\u001a\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R$\u0010!\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R$\u0010$\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010'\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u001a\u001a\u0004\u0018\u00010*@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00101\u001a\u0004\u0018\u0001002\b\u0010\u001a\u001a\u0004\u0018\u000100@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010*2\b\u0010\u001a\u001a\u0004\u0018\u00010*@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R$\u0010:\u001a\u0002092\u0006\u0010\u001a\u001a\u000209@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X.¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u000209X\u000e¢\u0006\u0002\n\u0000R$\u0010C\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0012\"\u0004\bE\u0010\u0014R\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010\u0014R\u001a\u0010K\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010\u0014R\u001a\u0010N\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014R\u001a\u0010Q\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010\u0014¨\u0006i"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/TLTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/thecoffeehouse/guestapp/views/base/IBackgroundColor;", "Lcom/thecoffeehouse/guestapp/views/base/ICornerView;", "Lcom/thecoffeehouse/guestapp/views/base/INumberText;", "Lcom/thecoffeehouse/guestapp/views/base/IStrokeView;", "Lcom/thecoffeehouse/guestapp/views/base/IDayTimeTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bgColor", "getBgColor", "()I", "setBgColor", "(I)V", "bgColorEnd", "getBgColorEnd", "setBgColorEnd", "bgConfig", "Lcom/thecoffeehouse/guestapp/views/base/BackgroundConfig;", "value", "cornerBotLeft", "getCornerBotLeft", "setCornerBotLeft", "cornerBotRight", "getCornerBotRight", "setCornerBotRight", "cornerTopLeft", "getCornerTopLeft", "setCornerTopLeft", "cornerTopRight", "getCornerTopRight", "setCornerTopRight", "cutWithNumberInRightDecimal", "getCutWithNumberInRightDecimal", "setCutWithNumberInRightDecimal", "", "dateInputFormat", "getDateInputFormat", "()Ljava/lang/String;", "setDateInputFormat", "(Ljava/lang/String;)V", "Ljava/util/Date;", "dateObject", "getDateObject", "()Ljava/util/Date;", "setDateObject", "(Ljava/util/Date;)V", "dateOutputFormat", "getDateOutputFormat", "setDateOutputFormat", "", "isThousandsSeparate", "()Z", "setThousandsSeparate", "(Z)V", "mCornerRadius", "", "mPaint", "Landroid/graphics/Paint;", "m_isSetDateObject", "minNumberInLeftDecimal", "getMinNumberInLeftDecimal", "setMinNumberInLeftDecimal", "path", "Landroid/graphics/Path;", "roundWithNumberInRightDecimal", "getRoundWithNumberInRightDecimal", "setRoundWithNumberInRightDecimal", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeColorEnd", "getStrokeColorEnd", "setStrokeColorEnd", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "initDeclareStyleable", "onSizeChanged", "w", "h", "oldw", "oldh", "refreshCornerList", "setText", ViewHierarchyConstants.TEXT_KEY, "", "type", "Landroid/widget/TextView$BufferType;", "textMinNumberInLeftSeparate", "t", "textThousandSeparate", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TLTextView.kt */
public final class TLTextView extends AppCompatTextView implements IBackgroundColor, ICornerView, INumberText, IStrokeView, IDayTimeTextView {
    private HashMap _$_findViewCache;
    private int bgColor;
    private int bgColorEnd;
    private final BackgroundConfig bgConfig;
    private int cornerBotLeft;
    private int cornerBotRight;
    private int cornerTopLeft;
    private int cornerTopRight;
    private int cutWithNumberInRightDecimal;
    private String dateInputFormat;
    private Date dateObject;
    private String dateOutputFormat;
    private boolean isThousandsSeparate;
    private float[] mCornerRadius;
    private final Paint mPaint;
    private boolean m_isSetDateObject;
    private int minNumberInLeftDecimal;
    private final Path path;
    private int roundWithNumberInRightDecimal;
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
    public int getBgColorEnd() {
        return this.bgColorEnd;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public void setBgColorEnd(int i) {
        this.bgColorEnd = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public int getStrokeColorEnd() {
        return this.strokeColorEnd;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IStrokeView
    public void setStrokeColorEnd(int i) {
        this.strokeColorEnd = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IDayTimeTextView
    public String getDateInputFormat() {
        return this.dateInputFormat;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IDayTimeTextView
    public void setDateInputFormat(String str) {
        this.dateInputFormat = str;
        invalidate();
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, ViewHierarchyConstants.TEXT_KEY);
        boolean z = false;
        if (text.length() > 0) {
            CharSequence text2 = getText();
            Intrinsics.checkNotNullExpressionValue(text2, ViewHierarchyConstants.TEXT_KEY);
            if (!StringsKt.isBlank(text2)) {
                String str2 = this.dateInputFormat;
                if (!(str2 == null || str2.length() == 0)) {
                    String str3 = this.dateInputFormat;
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        z = true;
                    }
                    if (!z) {
                        try {
                            setDateObject(new SimpleDateFormat(this.dateInputFormat, Locale.getDefault()).parse(getText().toString()));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IDayTimeTextView
    public String getDateOutputFormat() {
        return this.dateOutputFormat;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IDayTimeTextView
    public void setDateOutputFormat(String str) {
        this.dateOutputFormat = str;
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, ViewHierarchyConstants.TEXT_KEY);
        boolean z = false;
        if (text.length() > 0) {
            CharSequence text2 = getText();
            Intrinsics.checkNotNullExpressionValue(text2, ViewHierarchyConstants.TEXT_KEY);
            if (!StringsKt.isBlank(text2)) {
                String str2 = this.dateOutputFormat;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    String str3 = this.dateOutputFormat;
                    if (str3 == null || str3.length() == 0) {
                        String dateInputFormat2 = getDateInputFormat();
                        if (!(dateInputFormat2 == null || StringsKt.isBlank(dateInputFormat2))) {
                            String dateInputFormat3 = getDateInputFormat();
                            if (dateInputFormat3 == null || dateInputFormat3.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                try {
                                    this.m_isSetDateObject = true;
                                    setText(new SimpleDateFormat(getDateOutputFormat(), Locale.getDefault()).format(getDateObject()));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IDayTimeTextView
    public Date getDateObject() {
        return this.dateObject;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IDayTimeTextView
    public void setDateObject(Date date) {
        this.dateObject = date;
        String dateOutputFormat2 = getDateOutputFormat();
        boolean z = false;
        if (!(dateOutputFormat2 == null || StringsKt.isBlank(dateOutputFormat2))) {
            String dateOutputFormat3 = getDateOutputFormat();
            if (dateOutputFormat3 == null || dateOutputFormat3.length() == 0) {
                z = true;
            }
            if (!z) {
                try {
                    this.m_isSetDateObject = true;
                    setText(new SimpleDateFormat(getDateOutputFormat(), Locale.getDefault()).format(date));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public int getBgColor() {
        return this.bgColor;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.IBackgroundColor
    public void setBgColor(int i) {
        this.bgColor = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerTopLeft() {
        return this.cornerTopLeft;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerTopLeft(int i) {
        this.cornerTopLeft = i;
        this.bgConfig.setTopLeft(i);
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
        this.path.reset();
        refreshCornerList();
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

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerTopRight() {
        return this.cornerTopRight;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerTopRight(int i) {
        this.cornerTopRight = i;
        this.bgConfig.setTopRight(i);
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
        this.path.reset();
        refreshCornerList();
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

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerBotLeft() {
        return this.cornerBotLeft;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerBotLeft(int i) {
        this.cornerBotLeft = i;
        this.bgConfig.setBotLeft(i);
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
        this.path.reset();
        refreshCornerList();
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

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public int getCornerBotRight() {
        return this.cornerBotRight;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.ICornerView
    public void setCornerBotRight(int i) {
        this.cornerBotRight = i;
        this.bgConfig.setBotRight(i);
        BackgroundConfigKt.initBackground$default(this, this.bgConfig, null, 2, null);
        this.path.reset();
        refreshCornerList();
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

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public boolean isThousandsSeparate() {
        return this.isThousandsSeparate;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public void setThousandsSeparate(boolean z) {
        this.isThousandsSeparate = z;
        setText(getText());
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public int getMinNumberInLeftDecimal() {
        return this.minNumberInLeftDecimal;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public void setMinNumberInLeftDecimal(int i) {
        this.minNumberInLeftDecimal = i;
        if (getMinNumberInLeftDecimal() > 0) {
            CharSequence text = getText();
            Intrinsics.checkNotNullExpressionValue(text, ViewHierarchyConstants.TEXT_KEY);
            CharSequence textMinNumberInLeftSeparate = textMinNumberInLeftSeparate(text);
            GeneralKt.log(" number " + textMinNumberInLeftSeparate);
            setText(textMinNumberInLeftSeparate);
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public int getRoundWithNumberInRightDecimal() {
        return this.roundWithNumberInRightDecimal;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public void setRoundWithNumberInRightDecimal(int i) {
        this.roundWithNumberInRightDecimal = i;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public int getCutWithNumberInRightDecimal() {
        return this.cutWithNumberInRightDecimal;
    }

    @Override // com.thecoffeehouse.guestapp.views.base.INumberText
    public void setCutWithNumberInRightDecimal(int i) {
        this.cutWithNumberInRightDecimal = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgConfig = new BackgroundConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null);
        this.path = new Path();
        this.mPaint = new Paint();
        this.dateInputFormat = "";
        this.dateOutputFormat = "";
        this.minNumberInLeftDecimal = -1;
        this.roundWithNumberInRightDecimal = -1;
        this.cutWithNumberInRightDecimal = -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgConfig = new BackgroundConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null);
        this.path = new Path();
        this.mPaint = new Paint();
        this.dateInputFormat = "";
        this.dateOutputFormat = "";
        this.minNumberInLeftDecimal = -1;
        this.roundWithNumberInRightDecimal = -1;
        this.cutWithNumberInRightDecimal = -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TLTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        BackgroundConfig backgroundConfig = new BackgroundConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null);
        this.bgConfig = backgroundConfig;
        this.path = new Path();
        this.mPaint = new Paint();
        this.dateInputFormat = "";
        this.dateOutputFormat = "";
        this.minNumberInLeftDecimal = -1;
        this.roundWithNumberInRightDecimal = -1;
        this.cutWithNumberInRightDecimal = -1;
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
        BackgroundConfigKt.initBackground$default(this, backgroundConfig, null, 2, null);
        refreshCornerList();
    }

    private final void refreshCornerList() {
        float f;
        int i;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TLTextView);
        setBgColor(obtainStyledAttributes.getColor(0, 0));
        setBgColorEnd(obtainStyledAttributes.getColor(1, 0));
        setCornerTopLeft(obtainStyledAttributes.getDimensionPixelOffset(4, 0));
        setCornerTopRight(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        setCornerBotLeft(obtainStyledAttributes.getDimensionPixelOffset(2, 0));
        setCornerBotRight(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelOffset(14, 0));
        setStrokeColor(obtainStyledAttributes.getColor(12, 0));
        setStrokeColorEnd(obtainStyledAttributes.getColor(13, 0));
        setThousandsSeparate(obtainStyledAttributes.getBoolean(9, false));
        setMinNumberInLeftDecimal(obtainStyledAttributes.getInt(10, -1));
        setRoundWithNumberInRightDecimal(obtainStyledAttributes.getInt(11, -1));
        setCutWithNumberInRightDecimal(obtainStyledAttributes.getInt(6, -1));
        setDateOutputFormat(obtainStyledAttributes.getString(8));
        setDateInputFormat(obtainStyledAttributes.getString(7));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null) {
        }
        StringBuilder sb = new StringBuilder(charSequence);
        if (isThousandsSeparate()) {
            textThousandSeparate(sb);
        }
        super.setText(sb, bufferType);
        boolean z = false;
        if (this.m_isSetDateObject) {
            this.m_isSetDateObject = false;
            return;
        }
        String dateInputFormat2 = getDateInputFormat();
        if (!(dateInputFormat2 == null || dateInputFormat2.length() == 0)) {
            String dateInputFormat3 = getDateInputFormat();
            if (dateInputFormat3 == null || StringsKt.isBlank(dateInputFormat3)) {
                z = true;
            }
            if (!z) {
                try {
                    setDateObject(new SimpleDateFormat(getDateInputFormat(), Locale.getDefault()).parse(sb.toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private final void textThousandSeparate(StringBuilder sb) {
        int i;
        int minNumberInLeftDecimal2;
        GeneralKt.log(" text need format " + ((Object) sb));
        StringBuilder sb2 = sb;
        if (BackgroundConfigKt.isNumber(sb2)) {
            if (getRoundWithNumberInRightDecimal() <= 0) {
                if (sb.lastIndexOf(String.valueOf(',')) != -1) {
                    sb.replace(sb.lastIndexOf(String.valueOf(',')), sb2.length(), "");
                }
                if (sb.lastIndexOf(String.valueOf('.')) != -1) {
                    sb.replace(sb.lastIndexOf(String.valueOf('.')), sb2.length(), "");
                }
            }
            int indexOf$default = StringsKt.indexOf$default((CharSequence) sb2, ',', 0, false, 6, (Object) null);
            if (indexOf$default >= 0) {
                sb.replace(indexOf$default, indexOf$default + 1, String.valueOf('.'));
            }
            if (StringsKt.contains$default((CharSequence) sb2, '.', false, 2, (Object) null)) {
                i = StringsKt.indexOf$default((CharSequence) sb2, '.', 0, false, 6, (Object) null);
            } else {
                i = sb.length();
            }
            if (getMinNumberInLeftDecimal() > -1 && (minNumberInLeftDecimal2 = getMinNumberInLeftDecimal() - i) > 0) {
                for (int i2 = 0; i2 < minNumberInLeftDecimal2; i2++) {
                    sb.insert(0, AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    i++;
                }
            }
            int i3 = i - 1;
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (!((i3 - i4) % 3 != 0 || sb.charAt(i4) == '-' || sb.charAt(i4) == '+')) {
                    sb.insert(i4 + 1, ',');
                }
                GeneralKt.log(" text number " + ((Object) sb));
            }
        }
    }

    private final CharSequence textMinNumberInLeftSeparate(CharSequence charSequence) {
        int i;
        if (getMinNumberInLeftDecimal() <= -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(charSequence);
        StringBuilder sb2 = sb;
        StringsKt.removePrefix(sb2, String.valueOf(','));
        for (int indexOf$default = StringsKt.indexOf$default((CharSequence) sb2, ',', 0, false, 6, (Object) null); indexOf$default != -1; indexOf$default = StringsKt.indexOf$default((CharSequence) sb2, ',', 0, false, 6, (Object) null)) {
            sb.deleteCharAt(indexOf$default);
        }
        if (!BackgroundConfigKt.isNumber(sb2)) {
            return null;
        }
        if (StringsKt.contains$default((CharSequence) sb2, '.', false, 2, (Object) null)) {
            i = StringsKt.indexOf$default((CharSequence) sb2, '.', 0, false, 6, (Object) null);
        } else {
            i = sb.length();
        }
        int minNumberInLeftDecimal2 = getMinNumberInLeftDecimal() - i;
        if (minNumberInLeftDecimal2 > 0) {
            for (int i2 = 0; i2 < minNumberInLeftDecimal2; i2++) {
                sb.insert(0, AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
        }
        return sb2;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.path.reset();
        if (getStrokeWidth() <= 0) {
            return;
        }
        if (getStrokeColorEnd() != 0) {
            this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, (float) i, 0.0f, this.bgConfig.getStrokeColor(), this.bgConfig.getStrokeColorEnd(), Shader.TileMode.CLAMP));
        } else {
            this.mPaint.setColor(this.bgConfig.getStrokeColor());
        }
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
}
