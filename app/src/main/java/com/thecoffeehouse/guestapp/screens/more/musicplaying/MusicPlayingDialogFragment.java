package com.thecoffeehouse.guestapp.screens.more.musicplaying;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.services.api.model.common.music.Next;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageView;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0003J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u001c\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mCountDownTimer", "Landroid/os/CountDownTimer;", "viewModel", "Lcom/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingViewModel;", "getViewModel", "()Lcom/thecoffeehouse/guestapp/screens/more/musicplaying/MusicPlayingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "convertSecToMinute", "", "sec", "", "disableTouchSeekBar", "", "getAnalyticScreenName", "getSongDuration", "starts", "ends", "initArtist", "artist", "initNextSong", "next", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/Next;", "initSongBackground", MessengerShareContentUtility.MEDIA_IMAGE, "initStartEndMusicPlaying", "(Ljava/lang/Long;Ljava/lang/Long;)V", "initTitleSong", "name", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "onDestroy", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MusicPlayingDialogFragment.kt */
public final class MusicPlayingDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private CountDownTimer mCountDownTimer;
    private final Lazy viewModel$delegate = LazyKt.lazy(new MusicPlayingDialogFragment$viewModel$2(this));

    private final MusicPlayingViewModel getViewModel() {
        return (MusicPlayingViewModel) this.viewModel$delegate.getValue();
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
        return TrackingScreenService.Store_Music_Player;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_music_playing;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        disableTouchSeekBar();
        getViewModel().m1getMusicPlaying();
        getViewModel().getMusicPlaying().observe(this, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new MusicPlayingDialogFragment$initViews$1(this), null, false, false, 14, null));
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new MusicPlayingDialogFragment$initToolbar$1(this), 1, null);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById2.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_music_playing));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private final String convertSecToMinute(long j) {
        int i = (int) (j / ((long) 60));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Long.valueOf(j - ((long) (i * 60)))}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final void disableTouchSeekBar() {
        ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekbar_playing)).setOnTouchListener(MusicPlayingDialogFragment$disableTouchSeekBar$1.INSTANCE);
    }

    private final String getSongDuration(long j, long j2) {
        return convertSecToMinute((new Date(j2 * 1000).getTime() - new Date(j * 1000).getTime()) / ((long) 1000));
    }

    /* access modifiers changed from: private */
    public final void initArtist(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_artist);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_artist");
        textView.setText(str);
    }

    /* access modifiers changed from: private */
    public final void initNextSong(Next next) {
        if (next != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_next_song);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_next_song");
            View findViewById = _$_findCachedViewById.findViewById(R.id.txt_title_music_playing);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(getString(R.string.str_next_song));
            RequestBuilder<Drawable> load = Glide.with(this).load(next.getThumbnail());
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_next_song);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_next_song");
            View findViewById2 = _$_findCachedViewById2.findViewById(R.id.layout_music);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "layout_next_song.layout_music");
            load.into((TLImageView) findViewById2.findViewById(R.id.img_background_thumbnail));
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_next_song);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_next_song");
            View findViewById3 = _$_findCachedViewById3.findViewById(R.id.layout_music);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "layout_next_song.layout_music");
            TextView textView = (TextView) findViewById3.findViewById(R.id.txt_song);
            Intrinsics.checkNotNullExpressionValue(textView, "layout_next_song.layout_music.txt_song");
            textView.setText(next.getName());
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_next_song);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_next_song");
            View findViewById4 = _$_findCachedViewById4.findViewById(R.id.layout_music);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "layout_next_song.layout_music");
            TextView textView2 = (TextView) findViewById4.findViewById(R.id.txt_artist);
            Intrinsics.checkNotNullExpressionValue(textView2, "layout_next_song.layout_music.txt_artist");
            textView2.setText(next.getArtist());
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.layout_next_song);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "layout_next_song");
            View findViewById5 = _$_findCachedViewById5.findViewById(R.id.layout_music);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "layout_next_song.layout_music");
            TextView textView3 = (TextView) findViewById5.findViewById(R.id.txt_time);
            Intrinsics.checkNotNullExpressionValue(textView3, "layout_next_song.layout_music.txt_time");
            textView3.setText(getSongDuration(next.getStart(), next.getEnd()));
        }
    }

    /* access modifiers changed from: private */
    public final void initSongBackground(String str) {
        try {
            Intrinsics.checkNotNullExpressionValue(Glide.with(this).load(str).listener(new MusicPlayingDialogFragment$initSongBackground$1(this)).into((TLImageView) _$_findCachedViewById(R.id.img_song_background)), "Glide.with(this)\n       …into(img_song_background)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void initStartEndMusicPlaying(Long l, Long l2) {
        if (l != null && l2 != null) {
            GeneralKt.log("end: " + l2);
            GeneralKt.log("start: " + l);
            String convertSecToMinute = convertSecToMinute(l2.longValue() - l.longValue());
            GeneralKt.log("duration: " + convertSecToMinute);
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_played_time);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_played_time");
            textView.setText(convertSecToMinute);
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_remaining_time);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_remaining_time");
            textView2.setText("-00:00");
        }
    }

    /* access modifiers changed from: private */
    public final void initTitleSong(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_title_song);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_title_song");
        textView.setText(str);
    }
}
