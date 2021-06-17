package com.thecoffeehouse.guestapp.utility;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.security.crypto.EncryptedFile;
import androidx.security.crypto.MasterKeys;
import com.google.android.gms.stats.CodePackage;
import com.thecoffeehouse.guestapp.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0011\u001a\u0004\u0018\u00010\u00122\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012`\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ2\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012`\u00152\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0006J\b\u0010 \u001a\u00020\u001eH\u0002J\u001a\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\n\u0010(\u001a\u0004\u0018\u00010'H\u0002J,\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012`\u00152\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J.\u0010*\u001a\u0004\u0018\u00010\u00122\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012`\u0015H\u0002J\u0016\u0010+\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0006J\u001e\u0010-\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/EncryptionUtils;", "", "()V", "AUTHEN_TAG_LEN", "", "CIPHER_TRANSFORMATION_DATA_NAME", "", "CIPHER_TRANSFORMATION_KEYSTORE_NAME", "ENCRYPTED_KEY", "INITIALIZATION_VECTOR_KEY", "ITERATION_COUNT", "KEY_LENGTH", "KEY_STORE_ALIAS", "KEY_STORE_TYPE", "SALT_KEY", "SECRET_KEY_ALGORITHM", "SECRET_KEY_FACTORY_ALGORITHM", "decrypt", "", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "password", "", "decryptUserToken", "context", "Landroid/content/Context;", "encrypt", "data", "encryptUserToken", "", "token", "generateKeyStore", "generateSecretKeySpec", "Ljavax/crypto/spec/SecretKeySpec;", EncryptionUtils.SALT_KEY, "getSecretKey", "Ljavax/crypto/SecretKey;", "keyStore", "Ljava/security/KeyStore;", "initKeystore", "keyStoreEncrypt", "keystoreDecrypt", "readLocalEncrypted", "fileNameWithExtension", "writeLocalEncrypted", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: EncryptionUtils.kt */
public final class EncryptionUtils {
    private static final int AUTHEN_TAG_LEN = 128;
    private static final String CIPHER_TRANSFORMATION_DATA_NAME = "AES/CBC/PKCS7Padding";
    private static final String CIPHER_TRANSFORMATION_KEYSTORE_NAME = "AES/GCM/NoPadding";
    private static final String ENCRYPTED_KEY = "encrypted";
    private static final String INITIALIZATION_VECTOR_KEY = "iv";
    public static final EncryptionUtils INSTANCE = new EncryptionUtils();
    private static final int ITERATION_COUNT = 1024;
    private static final int KEY_LENGTH = 256;
    private static final String KEY_STORE_ALIAS = "TCHKeyStoreAlias";
    private static final String KEY_STORE_TYPE = "AndroidKeyStore";
    private static final String SALT_KEY = "salt";
    private static final String SECRET_KEY_ALGORITHM = "AES";
    private static final String SECRET_KEY_FACTORY_ALGORITHM = "PBKDF2WithHmacSHA1";

    private EncryptionUtils() {
    }

    private final HashMap<String, byte[]> keyStoreEncrypt(byte[] bArr) {
        HashMap<String, byte[]> hashMap = new HashMap<>();
        try {
            SecretKey secretKey = getSecretKey(initKeystore());
            Cipher instance = Cipher.getInstance(CIPHER_TRANSFORMATION_KEYSTORE_NAME);
            instance.init(1, secretKey);
            Intrinsics.checkNotNullExpressionValue(instance, "cipher");
            byte[] iv = instance.getIV();
            byte[] doFinal = instance.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(iv, "ivBytes");
            hashMap.put(INITIALIZATION_VECTOR_KEY, iv);
            Intrinsics.checkNotNullExpressionValue(doFinal, "encryptedBytes");
            hashMap.put(ENCRYPTED_KEY, doFinal);
        } catch (Exception e) {
            GeneralKt.log("keystoreEncrypt error");
            e.printStackTrace();
        }
        return hashMap;
    }

    private final SecretKey getSecretKey(KeyStore keyStore) {
        KeyStore.Entry entry = null;
        if (keyStore != null) {
            entry = keyStore.getEntry(KEY_STORE_ALIAS, null);
        }
        Objects.requireNonNull(entry, "null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
        return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
    }

    private final KeyStore initKeystore() {
        KeyStore instance = KeyStore.getInstance(KEY_STORE_TYPE);
        instance.load(null);
        return instance;
    }

    private final byte[] keystoreDecrypt(HashMap<String, byte[]> hashMap) {
        byte[] bArr = null;
        try {
            SecretKey secretKey = getSecretKey(initKeystore());
            Cipher instance = Cipher.getInstance(CIPHER_TRANSFORMATION_KEYSTORE_NAME);
            instance.init(2, secretKey, new GCMParameterSpec(128, hashMap.get(INITIALIZATION_VECTOR_KEY)));
            return instance.doFinal(hashMap.get(ENCRYPTED_KEY));
        } catch (Exception e) {
            GeneralKt.log("keystore decrypt error");
            e.printStackTrace();
            return bArr;
        }
    }

    private final void generateKeyStore() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance(SECRET_KEY_ALGORITHM, KEY_STORE_TYPE);
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(KEY_STORE_ALIAS, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "KeyGenParameterSpec.Buil…\n                .build()");
            instance.init(build);
            instance.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final SecretKeySpec generateSecretKeySpec(char[] cArr, byte[] bArr) {
        SecretKey generateSecret = SecretKeyFactory.getInstance(SECRET_KEY_FACTORY_ALGORITHM).generateSecret(new PBEKeySpec(cArr, bArr, 1024, 256));
        Intrinsics.checkNotNullExpressionValue(generateSecret, "secretKeyFactory.generateSecret(pbKeySpec)");
        return new SecretKeySpec(generateSecret.getEncoded(), SECRET_KEY_ALGORITHM);
    }

    public final HashMap<String, byte[]> encrypt(byte[] bArr, char[] cArr) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        Intrinsics.checkNotNullParameter(cArr, "password");
        HashMap<String, byte[]> hashMap = new HashMap<>();
        try {
            byte[] bArr2 = new byte[256];
            new SecureRandom().nextBytes(bArr2);
            SecretKeySpec generateSecretKeySpec = generateSecretKeySpec(cArr, bArr2);
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            Cipher instance = Cipher.getInstance(CIPHER_TRANSFORMATION_DATA_NAME);
            instance.init(1, generateSecretKeySpec, ivParameterSpec);
            byte[] doFinal = instance.doFinal(bArr);
            hashMap.put(SALT_KEY, bArr2);
            hashMap.put(INITIALIZATION_VECTOR_KEY, bArr3);
            Intrinsics.checkNotNullExpressionValue(doFinal, ENCRYPTED_KEY);
            hashMap.put(ENCRYPTED_KEY, doFinal);
        } catch (Exception e) {
            GeneralKt.log("error encryption");
            e.printStackTrace();
        }
        return hashMap;
    }

    public final byte[] decrypt(HashMap<String, byte[]> hashMap, char[] cArr) {
        Intrinsics.checkNotNullParameter(hashMap, "map");
        Intrinsics.checkNotNullParameter(cArr, "password");
        byte[] bArr = null;
        try {
            SecretKeySpec generateSecretKeySpec = generateSecretKeySpec(cArr, hashMap.get(SALT_KEY));
            Cipher instance = Cipher.getInstance(CIPHER_TRANSFORMATION_DATA_NAME);
            instance.init(2, generateSecretKeySpec, new IvParameterSpec(hashMap.get(INITIALIZATION_VECTOR_KEY)));
            return instance.doFinal(hashMap.get(ENCRYPTED_KEY));
        } catch (Exception e) {
            GeneralKt.log("decrypt data error");
            e.printStackTrace();
            return bArr;
        }
    }

    public final void encryptUserToken(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "token");
        generateKeyStore();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        for (Map.Entry<String, byte[]> entry : keyStoreEncrypt(bytes).entrySet()) {
            SharePrefs.INSTANCE.putString(context, R.string.prefs_encrypt_token, entry.getKey(), Base64.encodeToString(entry.getValue(), 2));
        }
    }

    public final String decryptUserToken(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap<String, byte[]> hashMap = new HashMap<>();
        if (SharePrefs.INSTANCE.getString(context, R.string.prefs_encrypt_token, INITIALIZATION_VECTOR_KEY) != null) {
            byte[] decode = Base64.decode(SharePrefs.INSTANCE.getString(context, R.string.prefs_encrypt_token, INITIALIZATION_VECTOR_KEY), 2);
            byte[] decode2 = Base64.decode(SharePrefs.INSTANCE.getString(context, R.string.prefs_encrypt_token, ENCRYPTED_KEY), 2);
            if (decode == null || decode2 == null) {
                throw new Exception("There is no token");
            }
            HashMap<String, byte[]> hashMap2 = hashMap;
            hashMap2.put(INITIALIZATION_VECTOR_KEY, decode);
            hashMap2.put(ENCRYPTED_KEY, decode2);
            byte[] keystoreDecrypt = keystoreDecrypt(hashMap);
            if (keystoreDecrypt != null) {
                return new String(keystoreDecrypt, Charsets.UTF_8);
            }
        }
        return "";
    }

    public final String readLocalEncrypted(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "fileNameWithExtension");
        try {
            KeyGenParameterSpec keyGenParameterSpec = MasterKeys.AES256_GCM_SPEC;
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpec, "MasterKeys.AES256_GCM_SPEC");
            String orCreate = MasterKeys.getOrCreate(keyGenParameterSpec);
            Intrinsics.checkNotNullExpressionValue(orCreate, "MasterKeys.getOrCreate(keyGenParamenterSpec)");
            File file = new File(context.getFilesDir(), str);
            if (file.exists()) {
                EncryptedFile build = new EncryptedFile.Builder(file, context, orCreate, EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB).build();
                Intrinsics.checkNotNullExpressionValue(build, "EncryptedFile.Builder(\n …                ).build()");
                FileInputStream openFileInput = build.openFileInput();
                Intrinsics.checkNotNullExpressionValue(openFileInput, "encryptedFile.openFileInput()");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int read = openFileInput.read(); read != -1; read = openFileInput.read()) {
                    byteArrayOutputStream.write(read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "byteArrayOutputStream.toByteArray()");
                return new String(byteArray, Charsets.UTF_8);
            }
        } catch (Exception e) {
            GeneralKt.log("error: readLocaluserInfo");
            e.printStackTrace();
        }
        return "";
    }

    public final void writeLocalEncrypted(Context context, String str, byte[] bArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "fileNameWithExtension");
        Intrinsics.checkNotNullParameter(bArr, "data");
        new Thread(new EncryptionUtils$writeLocalEncrypted$1(context, str, bArr)).start();
    }
}
