package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.InputTextCharCountView;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderProduct;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u000b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderproduct/RatingOrderProductView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MAX_CHARS_COMMENT", "mRatingOrderProduct", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderProduct;", "getRatingProduct", "updateData", "", "ratingOrderProductData", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderProductView.kt */
public final class RatingOrderProductView extends FrameLayout {
    private final int MAX_CHARS_COMMENT = 50;
    private HashMap _$_findViewCache;
    private RatingOrderProduct mRatingOrderProduct = new RatingOrderProduct();

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
    public RatingOrderProductView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.row_item_rating_order_product, (ViewGroup) this, true);
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
        if (editTextInput != null) {
            editTextInput.setBackground(ContextCompat.getDrawable(editTextInput.getContext(), R.drawable.background_corner_stroke_light_gray));
        }
        ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).setMaxChars(50);
        RadioGroup radioGroup = ((LikeDislikeView) _$_findCachedViewById(R.id.like_dislike_view)).getRadioGroup();
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) {
                /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct.RatingOrderProductView.AnonymousClass2 */
                final /* synthetic */ RatingOrderProductView this$0;

                {
                    this.this$0 = r1;
                }

                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton dislikedRadioButton;
                    RadioButton likedRadioButton;
                    if (i == -1) {
                        InputTextCharCountView inputTextCharCountView = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                        Intrinsics.checkNotNullExpressionValue(inputTextCharCountView, "rating_order_products_input_text_char_count");
                        inputTextCharCountView.setVisibility(8);
                        View _$_findCachedViewById = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_line_divider_bottom");
                        _$_findCachedViewById.setVisibility(0);
                        return;
                    }
                    LikeDislikeView likeDislikeView = (LikeDislikeView) this.this$0._$_findCachedViewById(R.id.like_dislike_view);
                    if (likeDislikeView == null || (likedRadioButton = likeDislikeView.getLikedRadioButton()) == null || i != likedRadioButton.getId()) {
                        LikeDislikeView likeDislikeView2 = (LikeDislikeView) this.this$0._$_findCachedViewById(R.id.like_dislike_view);
                        if (likeDislikeView2 != null && (dislikedRadioButton = likeDislikeView2.getDislikedRadioButton()) != null && i == dislikedRadioButton.getId()) {
                            InputTextCharCountView inputTextCharCountView2 = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                            Intrinsics.checkNotNullExpressionValue(inputTextCharCountView2, "rating_order_products_input_text_char_count");
                            inputTextCharCountView2.setVisibility(0);
                            View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "view_line_divider_bottom");
                            _$_findCachedViewById2.setVisibility(8);
                            EditText editTextInput = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
                            if (editTextInput != null) {
                                editTextInput.setHint(editTextInput.getContext().getString(R.string.str_share_your_dislike_about_this_product));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    InputTextCharCountView inputTextCharCountView3 = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                    Intrinsics.checkNotNullExpressionValue(inputTextCharCountView3, "rating_order_products_input_text_char_count");
                    inputTextCharCountView3.setVisibility(0);
                    View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                    Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "view_line_divider_bottom");
                    _$_findCachedViewById3.setVisibility(8);
                    EditText editTextInput2 = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
                    if (editTextInput2 != null) {
                        editTextInput2.setHint(editTextInput2.getContext().getString(R.string.str_share_your_like_about_this_product));
                    }
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderProductView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.row_item_rating_order_product, (ViewGroup) this, true);
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
        if (editTextInput != null) {
            editTextInput.setBackground(ContextCompat.getDrawable(editTextInput.getContext(), R.drawable.background_corner_stroke_light_gray));
        }
        ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).setMaxChars(50);
        RadioGroup radioGroup = ((LikeDislikeView) _$_findCachedViewById(R.id.like_dislike_view)).getRadioGroup();
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) {
                /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct.RatingOrderProductView.AnonymousClass2 */
                final /* synthetic */ RatingOrderProductView this$0;

                {
                    this.this$0 = r1;
                }

                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton dislikedRadioButton;
                    RadioButton likedRadioButton;
                    if (i == -1) {
                        InputTextCharCountView inputTextCharCountView = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                        Intrinsics.checkNotNullExpressionValue(inputTextCharCountView, "rating_order_products_input_text_char_count");
                        inputTextCharCountView.setVisibility(8);
                        View _$_findCachedViewById = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_line_divider_bottom");
                        _$_findCachedViewById.setVisibility(0);
                        return;
                    }
                    LikeDislikeView likeDislikeView = (LikeDislikeView) this.this$0._$_findCachedViewById(R.id.like_dislike_view);
                    if (likeDislikeView == null || (likedRadioButton = likeDislikeView.getLikedRadioButton()) == null || i != likedRadioButton.getId()) {
                        LikeDislikeView likeDislikeView2 = (LikeDislikeView) this.this$0._$_findCachedViewById(R.id.like_dislike_view);
                        if (likeDislikeView2 != null && (dislikedRadioButton = likeDislikeView2.getDislikedRadioButton()) != null && i == dislikedRadioButton.getId()) {
                            InputTextCharCountView inputTextCharCountView2 = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                            Intrinsics.checkNotNullExpressionValue(inputTextCharCountView2, "rating_order_products_input_text_char_count");
                            inputTextCharCountView2.setVisibility(0);
                            View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "view_line_divider_bottom");
                            _$_findCachedViewById2.setVisibility(8);
                            EditText editTextInput = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
                            if (editTextInput != null) {
                                editTextInput.setHint(editTextInput.getContext().getString(R.string.str_share_your_dislike_about_this_product));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    InputTextCharCountView inputTextCharCountView3 = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                    Intrinsics.checkNotNullExpressionValue(inputTextCharCountView3, "rating_order_products_input_text_char_count");
                    inputTextCharCountView3.setVisibility(0);
                    View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                    Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "view_line_divider_bottom");
                    _$_findCachedViewById3.setVisibility(8);
                    EditText editTextInput2 = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
                    if (editTextInput2 != null) {
                        editTextInput2.setHint(editTextInput2.getContext().getString(R.string.str_share_your_like_about_this_product));
                    }
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingOrderProductView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.row_item_rating_order_product, (ViewGroup) this, true);
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
        if (editTextInput != null) {
            editTextInput.setBackground(ContextCompat.getDrawable(editTextInput.getContext(), R.drawable.background_corner_stroke_light_gray));
        }
        ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).setMaxChars(50);
        RadioGroup radioGroup = ((LikeDislikeView) _$_findCachedViewById(R.id.like_dislike_view)).getRadioGroup();
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) {
                /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct.RatingOrderProductView.AnonymousClass2 */
                final /* synthetic */ RatingOrderProductView this$0;

                {
                    this.this$0 = r1;
                }

                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton dislikedRadioButton;
                    RadioButton likedRadioButton;
                    if (i == -1) {
                        InputTextCharCountView inputTextCharCountView = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                        Intrinsics.checkNotNullExpressionValue(inputTextCharCountView, "rating_order_products_input_text_char_count");
                        inputTextCharCountView.setVisibility(8);
                        View _$_findCachedViewById = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_line_divider_bottom");
                        _$_findCachedViewById.setVisibility(0);
                        return;
                    }
                    LikeDislikeView likeDislikeView = (LikeDislikeView) this.this$0._$_findCachedViewById(R.id.like_dislike_view);
                    if (likeDislikeView == null || (likedRadioButton = likeDislikeView.getLikedRadioButton()) == null || i != likedRadioButton.getId()) {
                        LikeDislikeView likeDislikeView2 = (LikeDislikeView) this.this$0._$_findCachedViewById(R.id.like_dislike_view);
                        if (likeDislikeView2 != null && (dislikedRadioButton = likeDislikeView2.getDislikedRadioButton()) != null && i == dislikedRadioButton.getId()) {
                            InputTextCharCountView inputTextCharCountView2 = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                            Intrinsics.checkNotNullExpressionValue(inputTextCharCountView2, "rating_order_products_input_text_char_count");
                            inputTextCharCountView2.setVisibility(0);
                            View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "view_line_divider_bottom");
                            _$_findCachedViewById2.setVisibility(8);
                            EditText editTextInput = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
                            if (editTextInput != null) {
                                editTextInput.setHint(editTextInput.getContext().getString(R.string.str_share_your_dislike_about_this_product));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    InputTextCharCountView inputTextCharCountView3 = (InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count);
                    Intrinsics.checkNotNullExpressionValue(inputTextCharCountView3, "rating_order_products_input_text_char_count");
                    inputTextCharCountView3.setVisibility(0);
                    View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(R.id.view_line_divider_bottom);
                    Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "view_line_divider_bottom");
                    _$_findCachedViewById3.setVisibility(8);
                    EditText editTextInput2 = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
                    if (editTextInput2 != null) {
                        editTextInput2.setHint(editTextInput2.getContext().getString(R.string.str_share_your_like_about_this_product));
                    }
                }
            });
        }
    }

    public final RatingOrderProduct getRatingProduct() {
        RatingOrderProduct ratingOrderProduct = new RatingOrderProduct();
        ratingOrderProduct.setProductId(this.mRatingOrderProduct.getProductId());
        ratingOrderProduct.setName(this.mRatingOrderProduct.getName());
        ratingOrderProduct.setLike(Integer.valueOf(((LikeDislikeView) _$_findCachedViewById(R.id.like_dislike_view)).getLiked()));
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
        ratingOrderProduct.setComment(StringExtsKt.toStringOrEmpty(String.valueOf(editTextInput != null ? editTextInput.getText() : null)));
        return ratingOrderProduct;
    }

    public final void updateData(RatingOrderProduct ratingOrderProduct) {
        Intrinsics.checkNotNullParameter(ratingOrderProduct, "ratingOrderProductData");
        this.mRatingOrderProduct = ratingOrderProduct;
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_product_name);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_product_name");
        textView.setText(this.mRatingOrderProduct.getName());
        LikeDislikeView likeDislikeView = (LikeDislikeView) _$_findCachedViewById(R.id.like_dislike_view);
        Integer like = this.mRatingOrderProduct.getLike();
        likeDislikeView.setLike(like != null ? like.intValue() : 99);
        EditText editTextInput = ((InputTextCharCountView) _$_findCachedViewById(R.id.rating_order_products_input_text_char_count)).getEditTextInput();
        if (editTextInput != null) {
            editTextInput.setText(this.mRatingOrderProduct.getComment());
        }
    }
}
