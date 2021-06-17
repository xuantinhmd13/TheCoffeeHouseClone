package com.thecoffeehouse.guestapp;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/Executor;", "getDiskIO", "()Ljava/util/concurrent/Executor;", "setDiskIO", "(Ljava/util/concurrent/Executor;)V", "mainThread", "getMainThread", "setMainThread", "networkIO", "getNetworkIO", "setNetworkIO", "MainThreadExecutor", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AppExecutors.kt */
public final class AppExecutors {
    private Executor diskIO;
    private Executor mainThread = new MainThreadExecutor();
    private Executor networkIO;

    public AppExecutors() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        this.diskIO = newSingleThreadExecutor;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "Executors.newFixedThreadPool(3)");
        this.networkIO = newFixedThreadPool;
    }

    public final Executor getDiskIO() {
        return this.diskIO;
    }

    public final void setDiskIO(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.diskIO = executor;
    }

    public final Executor getNetworkIO() {
        return this.networkIO;
    }

    public final void setNetworkIO(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.networkIO = executor;
    }

    public final Executor getMainThread() {
        return this.mainThread;
    }

    public final void setMainThread(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.mainThread = executor;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: AppExecutors.kt */
    private static final class MainThreadExecutor implements Executor {
        private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "command");
            this.mainThreadHandler.post(runnable);
        }
    }
}
