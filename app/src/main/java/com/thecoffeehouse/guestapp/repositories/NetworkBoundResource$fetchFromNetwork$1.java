package com.thecoffeehouse.guestapp.repositories;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.services.api.model.ApiErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.Objects;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0004 \u0007*\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "ResultType", "", "RequestType", "response", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: NetworkBoundResource.kt */
public final class NetworkBoundResource$fetchFromNetwork$1<T> implements Observer<ApiResponse<RequestType>> {
    final /* synthetic */ LiveData $apiResponse;
    final /* synthetic */ NetworkBoundResource this$0;

    NetworkBoundResource$fetchFromNetwork$1(NetworkBoundResource networkBoundResource, LiveData liveData) {
        this.this$0 = networkBoundResource;
        this.$apiResponse = liveData;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((ApiResponse) ((ApiResponse) obj));
    }

    public final void onChanged(final ApiResponse<RequestType> apiResponse) {
        this.this$0.result.removeSource(this.$apiResponse);
        if (apiResponse instanceof ApiSuccessResponse) {
            this.this$0.appExecutors.getDiskIO().execute(new Runnable(this) {
                /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass1 */
                final /* synthetic */ NetworkBoundResource$fetchFromNetwork$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    NetworkBoundResource networkBoundResource = this.this$0.this$0;
                    Object body = ((ApiSuccessResponse) apiResponse).getBody();
                    Objects.requireNonNull(body, "null cannot be cast to non-null type ResultType");
                    networkBoundResource.saveCallResult(body);
                    this.this$0.this$0.appExecutors.getMainThread().execute(new Runnable(this) {
                        /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void run() {
                            this.this$0.this$0.this$0.result.addSource(this.this$0.this$0.$apiResponse, new Observer<ApiResponse<RequestType>>(this) {
                                /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass1.AnonymousClass1.AnonymousClass1 */
                                final /* synthetic */ AnonymousClass1 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // androidx.lifecycle.Observer
                                public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                    onChanged((ApiResponse) ((ApiResponse) obj));
                                }

                                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.thecoffeehouse.guestapp.repositories.Resource$Companion */
                                /* JADX WARN: Multi-variable type inference failed */
                                public final void onChanged(ApiResponse<RequestType> apiResponse) {
                                    Objects.requireNonNull(apiResponse, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.ApiSuccessResponse<RequestType>");
                                    this.this$0.this$0.this$0.this$0.setValue(Resource.Companion.success(this.this$0.this$0.this$0.this$0.convertRequestToResult(((ApiSuccessResponse) apiResponse).getBody())));
                                }
                            });
                        }
                    });
                }
            });
        } else if (apiResponse instanceof ApiErrorResponse) {
            this.this$0.appExecutors.getMainThread().execute(new Runnable(this) {
                /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass2 */
                final /* synthetic */ NetworkBoundResource$fetchFromNetwork$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    Integer errorCode = ((ApiErrorResponse) apiResponse).getErrorCode();
                    if (errorCode != null && errorCode.intValue() == 403) {
                        this.this$0.this$0.appExecutors.getMainThread().execute(new Runnable(this) {
                            /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void run() {
                                Activity currentActivity = this.this$0.this$0.this$0.getApplication().getCurrentActivity();
                                if (currentActivity != null) {
                                    ContextExtsKt.logout(currentActivity, true);
                                }
                            }
                        });
                    } else if (this.this$0.this$0.getCachedResponseClass() != null) {
                        final LiveData loadFromDb = this.this$0.this$0.loadFromDb();
                        if (loadFromDb.getValue() != null) {
                            this.this$0.this$0.result.addSource(loadFromDb, new Observer<ResultType>(this) {
                                /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass2.AnonymousClass2 */
                                final /* synthetic */ AnonymousClass2 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // androidx.lifecycle.Observer
                                public final void onChanged(ResultType resulttype) {
                                    this.this$0.this$0.this$0.result.removeSource(loadFromDb);
                                    this.this$0.this$0.this$0.setValue(Resource.Companion.success(resulttype));
                                }
                            });
                        } else {
                            this.this$0.this$0.result.addSource(this.this$0.$apiResponse, new Observer<ApiResponse<RequestType>>(this) {
                                /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass2.AnonymousClass3 */
                                final /* synthetic */ AnonymousClass2 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // androidx.lifecycle.Observer
                                public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                    onChanged((ApiResponse) ((ApiResponse) obj));
                                }

                                public final void onChanged(ApiResponse<RequestType> apiResponse) {
                                    Objects.requireNonNull(apiResponse, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.ApiErrorResponse<RequestType>");
                                    ApiErrorResponse apiErrorResponse = (ApiErrorResponse) apiResponse;
                                    this.this$0.this$0.this$0.setValue(Resource.Companion.error(((ApiErrorResponse) apiResponse).getServerError(), null));
                                }
                            });
                        }
                    } else {
                        this.this$0.this$0.result.addSource(this.this$0.$apiResponse, new Observer<ApiResponse<RequestType>>(this) {
                            /* class com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$fetchFromNetwork$1.AnonymousClass2.AnonymousClass4 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            {
                                this.this$0 = r1;
                            }

                            @Override // androidx.lifecycle.Observer
                            public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                onChanged((ApiResponse) ((ApiResponse) obj));
                            }

                            public final void onChanged(ApiResponse<RequestType> apiResponse) {
                                Objects.requireNonNull(apiResponse, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.ApiErrorResponse<RequestType>");
                                this.this$0.this$0.this$0.onErrorResponse((ApiErrorResponse) apiResponse);
                                this.this$0.this$0.this$0.setValue(Resource.Companion.error(((ApiErrorResponse) apiResponse).getServerError(), null));
                            }
                        });
                    }
                }
            });
        }
    }
}
