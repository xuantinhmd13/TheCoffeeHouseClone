package com.thecoffeehouse.guestapp.utility;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedFile;
import androidx.security.crypto.MasterKeys;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: EncryptionUtils.kt */
public final class EncryptionUtils$writeLocalEncrypted$1 implements Runnable {
    final /* synthetic */ Context $context;
    final /* synthetic */ byte[] $data;
    final /* synthetic */ String $fileNameWithExtension;

    EncryptionUtils$writeLocalEncrypted$1(Context context, String str, byte[] bArr) {
        this.$context = context;
        this.$fileNameWithExtension = str;
        this.$data = bArr;
    }

    public final void run() {
        try {
            KeyGenParameterSpec keyGenParameterSpec = MasterKeys.AES256_GCM_SPEC;
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpec, "MasterKeys.AES256_GCM_SPEC");
            String orCreate = MasterKeys.getOrCreate(keyGenParameterSpec);
            Intrinsics.checkNotNullExpressionValue(orCreate, "MasterKeys.getOrCreate(keyGenParamenterSpec)");
            File file = new File(this.$context.getFilesDir(), this.$fileNameWithExtension);
            if (!file.exists()) {
                EncryptedFile build = new EncryptedFile.Builder(new File(this.$context.getFilesDir(), this.$fileNameWithExtension), this.$context, orCreate, EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB).build();
                Intrinsics.checkNotNullExpressionValue(build, "EncryptedFile.Builder(\n …                ).build()");
                FileOutputStream openFileOutput = build.openFileOutput();
                openFileOutput.write(this.$data);
                openFileOutput.flush();
                openFileOutput.close();
                Intrinsics.checkNotNullExpressionValue(openFileOutput, "encryptedFile.openFileOu…e()\n                    }");
            } else if (file.delete()) {
                EncryptedFile build2 = new EncryptedFile.Builder(new File(this.$context.getFilesDir(), this.$fileNameWithExtension), this.$context, orCreate, EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB).build();
                Intrinsics.checkNotNullExpressionValue(build2, "EncryptedFile.Builder(\n …                ).build()");
                FileOutputStream openFileOutput2 = build2.openFileOutput();
                openFileOutput2.write(this.$data);
                openFileOutput2.flush();
                openFileOutput2.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
