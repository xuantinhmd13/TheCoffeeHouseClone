package com.thecoffeehouse.guestapp.utility;

import java.text.Normalizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/ConvertVNCharacter;", "", "()V", "REGEX_UNACCENT", "Lkotlin/text/Regex;", "unaccent", "", "str", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ConvertVNCharacter.kt */
public final class ConvertVNCharacter {
    public static final ConvertVNCharacter INSTANCE = new ConvertVNCharacter();
    private static final Regex REGEX_UNACCENT = new Regex("\\p{InCombiningDiacriticalMarks}+");

    private ConvertVNCharacter() {
    }

    public final String unaccent(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Regex regex = REGEX_UNACCENT;
        Intrinsics.checkNotNullExpressionValue(normalize, "temp");
        return regex.replace(normalize, "");
    }
}
