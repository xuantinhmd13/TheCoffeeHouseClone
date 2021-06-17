package com.thecoffeehouse.guestapp.services.api.model.profile;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tR&\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/profile/GetMergeProfilesResponse;", "", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "mergeProfiles", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/MergeProfile;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Error;Ljava/util/ArrayList;)V", "getError", "()Ljava/lang/Error;", "setError", "(Ljava/lang/Error;)V", "getMergeProfiles", "()Ljava/util/ArrayList;", "setMergeProfiles", "(Ljava/util/ArrayList;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Profile.kt */
public final class GetMergeProfilesResponse {
    @SerializedName("error")
    private Error error;
    @SerializedName("profiles")
    private ArrayList<MergeProfile> mergeProfiles;

    public GetMergeProfilesResponse(Error error2, ArrayList<MergeProfile> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "mergeProfiles");
        this.error = error2;
        this.mergeProfiles = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetMergeProfilesResponse(Error error2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : error2, arrayList);
    }

    public final Error getError() {
        return this.error;
    }

    public final void setError(Error error2) {
        this.error = error2;
    }

    public final ArrayList<MergeProfile> getMergeProfiles() {
        return this.mergeProfiles;
    }

    public final void setMergeProfiles(ArrayList<MergeProfile> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mergeProfiles = arrayList;
    }
}
