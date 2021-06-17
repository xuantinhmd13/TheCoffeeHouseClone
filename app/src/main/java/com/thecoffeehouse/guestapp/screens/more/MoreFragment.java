package com.thecoffeehouse.guestapp.screens.more;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.EventSource;
import com.thecoffeehouse.guestapp.configs.trackingevents.LocationEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.more.contact.ContactFragment;
import com.thecoffeehouse.guestapp.screens.more.editprofile.EditProfileDialogFragment;
import com.thecoffeehouse.guestapp.screens.more.musicplaying.MusicPlayingDialogFragment;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.NewsAndPromotionsDialogFragment;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.RatingAndFeedbackFragment;
import com.thecoffeehouse.guestapp.screens.more.savedaddresses.SavedAddressesFragment;
import com.thecoffeehouse.guestapp.screens.more.settings.SettingsDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.RecentOrderDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.WebLinks;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006'"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/MoreFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/more/MoreViewModel;", "()V", "mLayoutMore", "Lcom/mindorks/placeholderview/PlaceHolderView;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "getAnalyticScreenName", "", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initGuestUI", "", "initLoggedInUser", "initViewUser", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "onLoggedInUserListener", "openContactFragment", "openEditProfileFragment", "openMusicPlayingFragment", "openNewsAndPromotionFragment", "openRatingAndFeedbackFragment", "openRecentOrdersFragment", "openSettingDialogFragment", "openTermAndConditionsFragment", "openUserSavedAddresses", "sendEventTracking", "source", "Lcom/thecoffeehouse/guestapp/configs/trackingevents/EventSource;", "showLogoutDialog", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MoreFragment.kt */
public final class MoreFragment extends BaseFragment<MoreViewModel> {
    private HashMap _$_findViewCache;
    private PlaceHolderView mLayoutMore;
    private final Class<MoreViewModel> viewModelClass = MoreViewModel.class;

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
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
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Tab_More;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_more;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<MoreViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new MoreViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mLayoutMore = (PlaceHolderView) view.findViewById(R.id.layout_more);
        initViewUser();
    }

    private final void initViewUser() {
        ClientManager requireClientManager;
        PlaceHolderView placeHolderView = this.mLayoutMore;
        if (placeHolderView != null) {
            placeHolderView.removeAllViews();
        }
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            initGuestUI();
        } else {
            initLoggedInUser();
        }
    }

    private final void initGuestUI() {
        ClientManager requireClientManager;
        ItemRowToolsMore itemRowToolsMore = new ItemRowToolsMore(new MoreFragment$initGuestUI$itemRowToolsMore$1(this), new MoreFragment$initGuestUI$itemRowToolsMore$2(this), new MoreFragment$initGuestUI$itemRowToolsMore$3(this), new MoreFragment$initGuestUI$itemRowToolsMore$4(this));
        ItemRowSupportMore itemRowSupportMore = new ItemRowSupportMore(new MoreFragment$initGuestUI$itemRowSupportMore$1(this), new MoreFragment$initGuestUI$itemRowSupportMore$2(this));
        TCHApplication requireTCHApplication = requireTCHApplication();
        ItemRowAccountsMore itemRowAccountsMore = new ItemRowAccountsMore((requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null) ? false : requireClientManager.isLoggedIn(), new MoreFragment$initGuestUI$itemRowAccountsMore$1(this), new MoreFragment$initGuestUI$itemRowAccountsMore$2(this), new MoreFragment$initGuestUI$itemRowAccountsMore$4(this), new MoreFragment$initGuestUI$itemRowAccountsMore$3(this));
        PlaceHolderView placeHolderView = this.mLayoutMore;
        if (placeHolderView != null) {
            placeHolderView.addView(itemRowToolsMore);
        }
        PlaceHolderView placeHolderView2 = this.mLayoutMore;
        if (placeHolderView2 != null) {
            placeHolderView2.addView(itemRowSupportMore);
        }
        PlaceHolderView placeHolderView3 = this.mLayoutMore;
        if (placeHolderView3 != null) {
            placeHolderView3.addView(itemRowAccountsMore);
        }
    }

    /* access modifiers changed from: private */
    public final void openUserSavedAddresses() {
        TrackingEventService.Companion.updateSourceTrackingEvent(LocationEvents.EventCreateNewAddressSubmitted.name, LocationEvents.EventCreateNewAddressSubmitted.Value.Tab_More);
        SavedAddressesFragment newInstance = SavedAddressesFragment.Companion.newInstance();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    private final void initLoggedInUser() {
        ClientManager requireClientManager;
        ItemRowToolsMore itemRowToolsMore = new ItemRowToolsMore(new MoreFragment$initLoggedInUser$itemRowToolsMore$1(this), new MoreFragment$initLoggedInUser$itemRowToolsMore$2(this), new MoreFragment$initLoggedInUser$itemRowToolsMore$3(this), new MoreFragment$initLoggedInUser$itemRowToolsMore$4(this));
        ItemRowSupportMore itemRowSupportMore = new ItemRowSupportMore(new MoreFragment$initLoggedInUser$itemRowSupportMore$1(this), new MoreFragment$initLoggedInUser$itemRowSupportMore$2(this));
        TCHApplication requireTCHApplication = requireTCHApplication();
        ItemRowAccountsMore itemRowAccountsMore = new ItemRowAccountsMore((requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null) ? false : requireClientManager.isLoggedIn(), new MoreFragment$initLoggedInUser$itemRowAccountsMore$1(this), new MoreFragment$initLoggedInUser$itemRowAccountsMore$2(this), new MoreFragment$initLoggedInUser$itemRowAccountsMore$4(this), new MoreFragment$initLoggedInUser$itemRowAccountsMore$3(this));
        PlaceHolderView placeHolderView = this.mLayoutMore;
        if (placeHolderView != null) {
            placeHolderView.addView(itemRowToolsMore);
        }
        PlaceHolderView placeHolderView2 = this.mLayoutMore;
        if (placeHolderView2 != null) {
            placeHolderView2.addView(itemRowSupportMore);
        }
        PlaceHolderView placeHolderView3 = this.mLayoutMore;
        if (placeHolderView3 != null) {
            placeHolderView3.addView(itemRowAccountsMore);
        }
    }

    /* access modifiers changed from: private */
    public final void sendEventTracking(EventSource eventSource) {
        TrackingEventService.Companion.updateSourceTrackingEvent(eventSource.getEventName(), eventSource.getSource());
        TrackingEventService.Companion.triggerSendTrackingEvent(eventSource.getEventName());
    }

    /* access modifiers changed from: private */
    public final void showLogoutDialog() {
        new AlertDialog.Builder(requireContext()).setTitle(getString(R.string.str_confirm_title_dialog)).setMessage(getString(R.string.str_confirm_logout_content)).setNegativeButton(getString(R.string.str_cancel), MoreFragment$showLogoutDialog$1.INSTANCE).setPositiveButton(getString(R.string.str_logout), new MoreFragment$showLogoutDialog$2(this)).show();
    }

    /* access modifiers changed from: private */
    public final void openSettingDialogFragment() {
        SettingsDialogFragment settingsDialogFragment = new SettingsDialogFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            settingsDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void openEditProfileFragment() {
        EditProfileDialogFragment editProfileDialogFragment = new EditProfileDialogFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            editProfileDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void openContactFragment() {
        ContactFragment contactFragment = new ContactFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            contactFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void openRatingAndFeedbackFragment() {
        RatingAndFeedbackFragment ratingAndFeedbackFragment = new RatingAndFeedbackFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            ratingAndFeedbackFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void openRecentOrdersFragment() {
        RecentOrderDialogFragment recentOrderDialogFragment = new RecentOrderDialogFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            recentOrderDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void openNewsAndPromotionFragment() {
        NewsAndPromotionsDialogFragment newsAndPromotionsDialogFragment = new NewsAndPromotionsDialogFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newsAndPromotionsDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void openTermAndConditionsFragment() {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        WebLinks webLinks;
        LiveData<GetMetadataResponse> metadata2;
        GetMetadataResponse value2;
        WebLinks webLinks2;
        WebViewDialogFragment.Companion companion = WebViewDialogFragment.Companion;
        String string = getString(R.string.str_terms);
        TCHApplication requireTCHApplication = requireTCHApplication();
        String help = (requireTCHApplication == null || (metadata2 = requireTCHApplication.m0getMetadata()) == null || (value2 = metadata2.getValue()) == null || (webLinks2 = value2.getWebLinks()) == null) ? null : webLinks2.getHelp();
        TCHApplication requireTCHApplication2 = requireTCHApplication();
        WebViewDialogFragment newInstance$default = WebViewDialogFragment.Companion.newInstance$default(companion, new PostsItem(null, null, help, null, null, string, (requireTCHApplication2 == null || (metadata = requireTCHApplication2.m0getMetadata()) == null || (value = metadata.getValue()) == null || (webLinks = value.getWebLinks()) == null) ? null : webLinks.getHelp(), null, 155, null), false, 2, null);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
        TrackingScreenService.Companion.logScreenViewByName(TrackingScreenService.Support_Page, TrackingScreenService.Support_Page);
    }

    /* access modifiers changed from: private */
    public final void openMusicPlayingFragment() {
        MusicPlayingDialogFragment musicPlayingDialogFragment = new MusicPlayingDialogFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            musicPlayingDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void onLoggedInUserListener() {
        super.onLoggedInUserListener();
        GeneralKt.log("initViewUser");
        initViewUser();
    }
}
