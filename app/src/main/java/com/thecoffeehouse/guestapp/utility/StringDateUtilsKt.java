package com.thecoffeehouse.guestapp.utility;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u001a\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e\u001a \u0010!\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u0001\u001a\u0016\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001e\u001a\u000e\u0010&\u001a\u0004\u0018\u00010\u001b*\u00020\u0001H\u0007\u001a\u001a\u0010'\u001a\u00020\u0001*\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001\u001a\u0016\u0010*\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u001b2\u0006\u0010\"\u001a\u00020\u0001\u001a\u0012\u0010+\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010,\u001a\u00020\u001e\u001a\u0012\u0010-\u001a\u00020.*\u00020\u001b2\u0006\u0010/\u001a\u00020\u001e\u001a\u0012\u00100\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010/\u001a\u00020\u001e\u001a\u0012\u00101\u001a\u00020\u0001*\u00020\u001e2\u0006\u00102\u001a\u00020\u0001\u001a\n\u00103\u001a\u00020\u001e*\u00020\u001b\u001a\n\u00104\u001a\u00020\u001e*\u00020\u001b\u001a\u0014\u00105\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u0001\u001a\u0012\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\n\u00107\u001a\u00020\u0001*\u00020\u0001\u001a\n\u00108\u001a\u00020\u0001*\u00020\u001b\u001a\n\u00108\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u00109\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u0001\u001a\u0012\u0010:\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010;\u001a\u00020<\u001a\u0014\u0010=\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010;\u001a\u00020<\u001a\n\u0010>\u001a\u00020\u001e*\u00020\u001b\u001a\n\u0010?\u001a\u00020\u001e*\u00020\u001b\u001a\n\u0010@\u001a\u00020\u001e*\u00020\u001b\u001a\n\u0010A\u001a\u00020\u0001*\u00020\u001b\u001a\u0016\u0010B\u001a\u00020\u001e*\u00020\u001b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u001a\u0014\u0010E\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010F\u001a\u00020\u001e\u001a\u0014\u0010G\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u0001\u001a\n\u0010H\u001a\u00020\u001e*\u00020\u001b\u001a\n\u0010I\u001a\u00020\u0001*\u00020\u001b\u001a\n\u0010J\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010K\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\n\u0010L\u001a\u00020\u0001*\u00020\u001b\u001a\n\u0010M\u001a\u00020\u001e*\u00020\u001b\u001a\u0012\u0010N\u001a\u00020.*\u00020\u001b2\u0006\u0010,\u001a\u00020\u001e\u001a\u0012\u0010O\u001a\u00020.*\u00020\u001b2\u0006\u0010/\u001a\u00020\u001e\u001a\u0012\u0010P\u001a\u00020.*\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001e\u001a\u0014\u0010R\u001a\u00020\u001b*\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u0001\u001a\f\u0010S\u001a\u00020\u001b*\u00020\u0001H\u0007\u001a\u001e\u0010T\u001a\u0004\u0018\u00010\u001b*\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u001e\u001a\f\u0010V\u001a\u00020\u0001*\u00020\u001bH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"DF_DATE", "", "DF_DATE_PICK", "DF_DAY", "DF_ISO_8601", "DF_ISO_8601_WITHOUT_Z", "DF_MMMM_yyyy", "DF_MMM_dd", "DF_MMM_dd__yyyy", "DF_MMM_dd__yyyy_at_TIME", "DF_MMM_dd_yyyy", "DF_MM_dd_yyyy", "DF_MONTH", "DF_SERVER_FORMAT", "DF_SERVER_FORMAT_MINUTES", "DF_TIME", "DF_YYYY_MM_dd", "DF_dd_MM_YYYY", "DF_dd_MM_yyyy_hh_mm_a", "DF_hh_mm", "DF_hh_mm_a", "DF_hh_mm_dd_MM_yyyy", "DF_yyyy", "DF_yyyy_MM_dd", "DF_yyyy_MM_dd_hh_mm", "StartDateEndDateToStringDesign", "startDate", "Ljava/util/Date;", "endDate", "countLeapYear", "", "start", "end", "formatStringStartEndTour", "format", "getEndDateOfMonth", "fromDate", "nextMonthCount", "ISO_8601Obj", "TimeFormatToFormat", "current", "result", "ToFormat", "addHour", "hour", "addMinute", "", "minutes", "addMinutesToDate", "ago", "k", "countDayfrom1970", "getCurrentYear", "getDate", "getDateStandardFromFormat", "getDateTimeSpend", "getDateTimeSpendWithoutGMT", "getDay", "getDayMonth", "isBreak", "", "getDayMonthFromDate", "getDayOfMonth", "getDayOfWeek", "getDayOfYear", "getFullStandardString", "getHour", "locale", "Ljava/util/Locale;", "getMinute", "round", "getMonth", "getMonthExt", "getStandardString", "getTime", "getTimeStandardFromFormat", "getTimeZone", "getYearExt", "setHour", "setMinute", "setSecond", "second", "toDateObj", "toDateObjWithGMT", "toDateObjWithTimeZone", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "toServerFormat", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: StringDateUtils.kt */
public final class StringDateUtilsKt {
    public static final String DF_DATE = "EEE,dd MMM yyyy";
    public static final String DF_DATE_PICK = "EEE MMM dd HH:mm:ss z yyyy";
    public static final String DF_DAY = "dd";
    public static final String DF_ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss'Z";
    public static final String DF_ISO_8601_WITHOUT_Z = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final String DF_MMMM_yyyy = "MMMM, yyyy";
    public static final String DF_MMM_dd = "MMM dd";
    public static final String DF_MMM_dd__yyyy = "MMM dd, yyyy";
    public static final String DF_MMM_dd__yyyy_at_TIME = "MMM dd, yyyy 'at' hh:mm a";
    public static final String DF_MMM_dd_yyyy = "MMM dd yyyy";
    public static final String DF_MM_dd_yyyy = "MM/dd/yyyy";
    public static final String DF_MONTH = "MMM";
    public static final String DF_SERVER_FORMAT = "yyyy-MM-dd";
    public static final String DF_SERVER_FORMAT_MINUTES = "yyyy-MM-dd hh:mm";
    public static final String DF_TIME = "hh:mm a";
    public static final String DF_YYYY_MM_dd = "yyyy/MM/dd";
    public static final String DF_dd_MM_YYYY = "dd/MM/yyyy";
    public static final String DF_dd_MM_yyyy_hh_mm_a = "dd/MM/yyyy - HH:mm a";
    public static final String DF_hh_mm = "hh:mm";
    public static final String DF_hh_mm_a = "hh:mm a";
    public static final String DF_hh_mm_dd_MM_yyyy = "HH:mm - dd/MM/yyyy";
    public static final String DF_yyyy = "yyyy";
    public static final String DF_yyyy_MM_dd = "yyyy/MM/dd";
    public static final String DF_yyyy_MM_dd_hh_mm = "yyyy/MM/dd - HH:mm";

    public static final String getStandardString(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getStandardString");
        String format = new SimpleDateFormat(DF_dd_MM_YYYY, Locale.ENGLISH).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"dd/MM/…ale.ENGLISH).format(this)");
        return format;
    }

    public static final String getFullStandardString(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getFullStandardString");
        String format = new SimpleDateFormat(DF_SERVER_FORMAT, Locale.ENGLISH).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(DF_SERV…ale.ENGLISH).format(this)");
        return format;
    }

    public static final int countDayfrom1970(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$countDayfrom1970");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        int i = instance.get(1);
        return ((((i - 1970) * 365) + countLeapYear(1970, i)) + instance.get(6)) - 1;
    }

    public static /* synthetic */ Date toDateObj$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = DF_SERVER_FORMAT;
        }
        return toDateObj(str, str2);
    }

    public static final Date toDateObj(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$toDateObj");
        Intrinsics.checkNotNullParameter(str2, "format");
        String str3 = str;
        if ((str3.length() == 0) || StringsKt.isBlank(str3)) {
            return new Date();
        }
        Date parse = new SimpleDateFormat(str2, Locale.ENGLISH).parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "SimpleDateFormat(format,…cale.ENGLISH).parse(this)");
        return parse;
    }

    public static /* synthetic */ Date toDateObjWithTimeZone$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = DF_SERVER_FORMAT;
        }
        return toDateObjWithTimeZone(str, str2, i);
    }

    public static final Date toDateObjWithTimeZone(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "$this$toDateObjWithTimeZone");
        Intrinsics.checkNotNullParameter(str2, "format");
        String str3 = str;
        if ((str3.length() == 0) || StringsKt.isBlank(str3)) {
            return null;
        }
        Date parse = new SimpleDateFormat(str2, Locale.ENGLISH).parse(str);
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "cal");
        instance.setTime(parse);
        instance.add(11, i);
        return instance.getTime();
    }

    public static final Date toDateObjWithGMT(String str) {
        Intrinsics.checkNotNullParameter(str, "$this$toDateObjWithGMT");
        Date parse = ISO8601Utils.parse(str, new ParsePosition(0));
        Intrinsics.checkNotNullExpressionValue(parse, "ISO8601Utils.parse(this, ParsePosition(0))");
        return parse;
    }

    public static final String TimeFormatToFormat(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "$this$TimeFormatToFormat");
        Intrinsics.checkNotNullParameter(str2, "current");
        Intrinsics.checkNotNullParameter(str3, "result");
        String format = new SimpleDateFormat(str3, Locale.ENGLISH).format(toDateObj(str, str2));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(result,…ale.ENGLISH).format(date)");
        return format;
    }

    public static final String ToFormat(Date date, String str) {
        Intrinsics.checkNotNullParameter(str, "format");
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(str, Locale.ENGLISH).format(date);
    }

    public static final String getDateStandardFromFormat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$getDateStandardFromFormat");
        Intrinsics.checkNotNullParameter(str2, "format");
        String format = new SimpleDateFormat(DF_dd_MM_YYYY, Locale.ENGLISH).format(toDateObj(str, str2));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"dd/MM/…ale.ENGLISH).format(date)");
        return format;
    }

    public static final String getTimeStandardFromFormat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$getTimeStandardFromFormat");
        Intrinsics.checkNotNullParameter(str2, "format");
        String format = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(toDateObj(str, str2));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"HH:mm:…ale.ENGLISH).format(date)");
        return format;
    }

    public static /* synthetic */ String getDate$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = DF_SERVER_FORMAT;
        }
        return getDate(str, str2);
    }

    public static final String getDate(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$getDate");
        Intrinsics.checkNotNullParameter(str2, "format");
        String format = new SimpleDateFormat(DF_DATE, Locale.ENGLISH).format(toDateObj(str, str2));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(DF_DATE…ale.ENGLISH).format(date)");
        return format;
    }

    public static final String getDayMonth(Date date, boolean z) {
        Intrinsics.checkNotNullParameter(date, "$this$getDayMonth");
        String format = new SimpleDateFormat(DF_DAY, Locale.ENGLISH).format(date);
        String format2 = new SimpleDateFormat(DF_MONTH, Locale.ENGLISH).format(date);
        if (z) {
            return format + "\n" + format2;
        }
        return format + ' ' + format2;
    }

    public static /* synthetic */ String getDayMonthFromDate$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getDayMonthFromDate(str, z);
    }

    public static final String getDayMonthFromDate(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "$this$getDayMonthFromDate");
        Date dateObj = toDateObj(str, DF_DATE);
        String format = new SimpleDateFormat(DF_DAY, Locale.ENGLISH).format(dateObj);
        String format2 = new SimpleDateFormat(DF_MONTH, Locale.ENGLISH).format(dateObj);
        if (z) {
            return format2 + "\n" + format;
        }
        return format2 + ' ' + format;
    }

    public static /* synthetic */ String getDay$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = DF_SERVER_FORMAT;
        }
        return getDay(str, str2);
    }

    public static final String getDay(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$getDay");
        Intrinsics.checkNotNullParameter(str2, "format");
        String format = new SimpleDateFormat(DF_DAY, Locale.ENGLISH).format(toDateObj(str, str2));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(DF_DAY,…ale.ENGLISH).format(date)");
        return format;
    }

    public static /* synthetic */ String getMonth$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = DF_SERVER_FORMAT;
        }
        return getMonth(str, str2);
    }

    public static final String getMonth(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$getMonth");
        Intrinsics.checkNotNullParameter(str2, "format");
        String format = new SimpleDateFormat(DF_MONTH, Locale.ENGLISH).format(toDateObj(str, str2));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(DF_MONT…ale.ENGLISH).format(date)");
        return format;
    }

    public static final String getTime(String str) {
        Intrinsics.checkNotNullParameter(str, "$this$getTime");
        String format = new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(toDateObj$default(str, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(DF_TIME…ale.ENGLISH).format(date)");
        return format;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r3 = " minute";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r3.equals("y") != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r3.equals("w") != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r3.equals("s") != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r3.equals("m") != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r3.equals("h") != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r3.equals("d") != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r3.equals("Y") != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        r3 = " year";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r3.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r3 = " week";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r3.equals(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        r3 = " second";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r3.equals("M") != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r3 = " month";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        if (r3.equals("H") != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        r3 = " hour";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r3.equals("D") != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r3.equals("mi") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r3 = " day";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r3.equals("mI") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r3.equals("Mi") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r3.equals("MI") != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String ago(int r2, java.lang.String r3) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.utility.StringDateUtilsKt.ago(int, java.lang.String):java.lang.String");
    }

    public static final String getDateTimeSpend(String str) {
        Intrinsics.checkNotNullParameter(str, "$this$getDateTimeSpend");
        Date dateObjWithGMT = toDateObjWithGMT(str);
        String format = new SimpleDateFormat(DF_hh_mm, Locale.ENGLISH).format(dateObjWithGMT);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT-0:00"));
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(new Date(0));
        int i = instance.get(1);
        instance.setTime(new Date(new Date().getTime() - dateObjWithGMT.getTime()));
        int i2 = instance.get(1) - i;
        int i3 = instance.get(2);
        int i4 = instance.get(3);
        int i5 = instance.get(6);
        int i6 = instance.get(11);
        int i7 = instance.get(12);
        int i8 = instance.get(13);
        int i9 = i4 - 1;
        int i10 = i5 - 1;
        instance.setTime(new Date(dateObjWithGMT.getTime()));
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder();
            String ToFormat = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat);
            return sb.append(ToFormat).append(" at ").append(format).toString();
        } else if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            String ToFormat2 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat2);
            return sb2.append(ToFormat2).append(" at ").append(format).toString();
        } else if (i9 > 0) {
            StringBuilder sb3 = new StringBuilder();
            String ToFormat3 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat3);
            return sb3.append(ToFormat3).append(" at ").append(format).toString();
        } else if (i10 > 0) {
            StringBuilder sb4 = new StringBuilder();
            String ToFormat4 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat4);
            return sb4.append(ToFormat4).append(" at ").append(format).toString();
        } else if (i6 > 0) {
            return ago(i6, "h");
        } else {
            if (i7 > 0) {
                return ago(i7, "mi");
            }
            if (i8 > 0) {
                return "Just now";
            }
            String format2 = new SimpleDateFormat(DF_SERVER_FORMAT, Locale.ENGLISH).format(dateObjWithGMT);
            Intrinsics.checkNotNullExpressionValue(format2, "SimpleDateFormat(DF_SERV…ale.ENGLISH).format(date)");
            return format2;
        }
    }

    public static final String getDateTimeSpendWithoutGMT(String str) {
        Intrinsics.checkNotNullParameter(str, "$this$getDateTimeSpendWithoutGMT");
        Date dateObj$default = toDateObj$default(str, null, 1, null);
        String format = new SimpleDateFormat(DF_hh_mm, Locale.ENGLISH).format(dateObj$default);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT-0:00"));
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(new Date(0));
        int i = instance.get(1);
        instance.setTime(new Date(new Date().getTime() - dateObj$default.getTime()));
        int i2 = instance.get(1) - i;
        int i3 = instance.get(2);
        int i4 = instance.get(3);
        int i5 = instance.get(6);
        int i6 = instance.get(11);
        int i7 = instance.get(12);
        int i8 = instance.get(13);
        int i9 = i4 - 1;
        int i10 = i5 - 1;
        instance.setTime(new Date(dateObj$default.getTime()));
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder();
            String ToFormat = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat);
            return sb.append(ToFormat).append(" at ").append(format).toString();
        } else if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            String ToFormat2 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat2);
            return sb2.append(ToFormat2).append(" at ").append(format).toString();
        } else if (i9 > 0) {
            StringBuilder sb3 = new StringBuilder();
            String ToFormat3 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat3);
            return sb3.append(ToFormat3).append(" at ").append(format).toString();
        } else if (i10 > 0) {
            StringBuilder sb4 = new StringBuilder();
            String ToFormat4 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat4);
            return sb4.append(ToFormat4).append(" at ").append(format).toString();
        } else if (i6 > 0) {
            return ago(i6, "h");
        } else {
            if (i7 > 0) {
                return ago(i7, "mi");
            }
            if (i8 > 0) {
                return "Just now";
            }
            String format2 = new SimpleDateFormat(DF_SERVER_FORMAT, Locale.ENGLISH).format(dateObj$default);
            Intrinsics.checkNotNullExpressionValue(format2, "SimpleDateFormat(DF_SERV…ale.ENGLISH).format(date)");
            return format2;
        }
    }

    public static final String getDateTimeSpendWithoutGMT(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getDateTimeSpendWithoutGMT");
        String format = new SimpleDateFormat(DF_hh_mm, Locale.ENGLISH).format(date);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT-0:00"));
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(new Date(0));
        int i = instance.get(1);
        instance.setTime(new Date(new Date().getTime() - date.getTime()));
        int i2 = instance.get(1) - i;
        int i3 = instance.get(2);
        int i4 = instance.get(3);
        int i5 = instance.get(6);
        int i6 = instance.get(11);
        int i7 = instance.get(12);
        int i8 = instance.get(13);
        int i9 = i4 - 1;
        int i10 = i5 - 1;
        instance.setTime(new Date(date.getTime()));
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder();
            String ToFormat = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat);
            return sb.append(ToFormat).append(" at ").append(format).toString();
        } else if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            String ToFormat2 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat2);
            return sb2.append(ToFormat2).append(" at ").append(format).toString();
        } else if (i9 > 0) {
            StringBuilder sb3 = new StringBuilder();
            String ToFormat3 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat3);
            return sb3.append(ToFormat3).append(" at ").append(format).toString();
        } else if (i10 > 0) {
            StringBuilder sb4 = new StringBuilder();
            String ToFormat4 = ToFormat(instance.getTime(), "yyyy/MM/dd");
            Intrinsics.checkNotNull(ToFormat4);
            return sb4.append(ToFormat4).append(" at ").append(format).toString();
        } else if (i6 > 0) {
            return ago(i6, "h");
        } else {
            if (i7 > 0) {
                return ago(i7, "mi");
            }
            if (i8 > 0) {
                return "Just now";
            }
            String format2 = new SimpleDateFormat(DF_SERVER_FORMAT, Locale.ENGLISH).format(date);
            Intrinsics.checkNotNullExpressionValue(format2, "SimpleDateFormat(DF_SERV…ale.ENGLISH).format(date)");
            return format2;
        }
    }

    public static final String StartDateEndDateToStringDesign(Date date, Date date2) {
        Intrinsics.checkNotNullParameter(date, "startDate");
        Date date3 = date2 != null ? date2 : date;
        StringBuilder sb = new StringBuilder();
        Calendar instance = Calendar.getInstance();
        Date date4 = new Date();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date4);
        int i = instance.get(1);
        instance.setTime(date);
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        instance.setTime(date3);
        int i5 = instance.get(1);
        int i6 = instance.get(2);
        int i7 = instance.get(5);
        if (i2 == i) {
            sb.append(ToFormat(date, DF_MMM_dd));
        } else {
            sb.append(ToFormat(date, DF_MMM_dd_yyyy));
        }
        sb.append(" at ");
        sb.append(ToFormat(date, "hh:mm a"));
        if (date2 != null) {
            sb.append(" - ");
            if (!(i4 == i7 && i3 == i6 && i2 == i5)) {
                if (i5 == i) {
                    sb.append(ToFormat(date3, DF_MMM_dd));
                } else {
                    sb.append(ToFormat(date3, DF_MMM_dd_yyyy));
                }
                sb.append(" at ");
            }
            sb.append(ToFormat(date3, "hh:mm a"));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "ret.toString()");
        return sb2;
    }

    public static final Date addMinutesToDate(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$addMinutesToDate");
        return new Date(date.getTime() + (((long) i) * 60000));
    }

    public static final void setHour(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$setHour");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        instance.set(11, i);
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        date.setTime(time.getTime());
    }

    public static final Date addHour(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$addHour");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        instance.add(10, i);
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        date.setTime(time.getTime());
        return date;
    }

    public static final void setMinute(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$setMinute");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        instance.set(12, i);
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        date.setTime(time.getTime());
    }

    public static final void addMinute(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$addMinute");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        instance.add(12, i);
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        date.setTime(time.getTime());
    }

    public static final void setSecond(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$setSecond");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        instance.set(13, i);
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        date.setTime(time.getTime());
    }

    public static final int getDayOfWeek(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getDayOfWeek");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(7);
    }

    public static final int getDayOfYear(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getDayOfYear");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(6);
    }

    public static /* synthetic */ int getHour$default(Date date, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = null;
        }
        return getHour(date, locale);
    }

    public static final int getHour(Date date, Locale locale) {
        Intrinsics.checkNotNullParameter(date, "$this$getHour");
        Calendar instance = Calendar.getInstance(locale);
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(11);
    }

    public static final int getDayOfMonth(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getDayOfMonth");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(5);
    }

    public static final int getMonthExt(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getMonthExt");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(2);
    }

    public static final int getYearExt(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getYearExt");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(1);
    }

    public static final String getTimeZone(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getTimeZone");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        String str = TimeZone.getAvailableIDs(instance.get(15))[0];
        Intrinsics.checkNotNullExpressionValue(str, "TimeZone.getAvailableIDs…Calendar.ZONE_OFFSET))[0]");
        return str;
    }

    public static /* synthetic */ int getMinute$default(Date date, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return getMinute(date, i);
    }

    public static final int getMinute(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "$this$getMinute");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        int i2 = instance.get(12);
        int i3 = (i2 / i) * i;
        return i2 % i > 0 ? i3 + i : i3;
    }

    public static final int countLeapYear(int i, int i2) {
        int i3 = (i2 - i) + 1;
        int i4 = i3 % 4;
        int i5 = i3 / 4;
        return (i % 4) + i4 >= 4 ? i5 + 1 : i5;
    }

    public static final int getCurrentYear(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$getCurrentYear");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendar");
        instance.setTime(date);
        return instance.get(1);
    }

    public static final Date getEndDateOfMonth(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "fromDate");
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "cal");
        instance.setTime(date);
        instance.add(2, i);
        instance.set(5, 1);
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "cal.time");
        return time;
    }

    public static final String toServerFormat(Date date) {
        Intrinsics.checkNotNullParameter(date, "$this$toServerFormat");
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "df.format(this)");
        return format;
    }

    public static final Date ISO_8601Obj(String str) {
        Intrinsics.checkNotNullParameter(str, "$this$ISO_8601Obj");
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ String formatStringStartEndTour$default(Date date, Date date2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = DF_MMM_dd__yyyy;
        }
        return formatStringStartEndTour(date, date2, str);
    }

    public static final String formatStringStartEndTour(Date date, Date date2, String str) {
        Intrinsics.checkNotNullParameter(date, "startDate");
        Intrinsics.checkNotNullParameter(date2, "endDate");
        Intrinsics.checkNotNullParameter(str, "format");
        return ToFormat(date, str) + " - " + ToFormat(date2, str);
    }
}
