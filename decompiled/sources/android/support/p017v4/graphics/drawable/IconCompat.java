package android.support.p017v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.exoplayer2.C2793C;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final Mode f1019h = Mode.SRC_IN;

    /* renamed from: a */
    public int f1020a;

    /* renamed from: b */
    Object f1021b;

    /* renamed from: c */
    public byte[] f1022c;

    /* renamed from: d */
    public Parcelable f1023d;

    /* renamed from: e */
    public int f1024e;

    /* renamed from: f */
    public int f1025f;

    /* renamed from: g */
    public ColorStateList f1026g = null;

    /* renamed from: i */
    Mode f1027i = f1019h;

    /* renamed from: j */
    public String f1028j;

    /* renamed from: a */
    private static String m1529a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public String mo1429a() {
        if (this.f1020a == -1 && VERSION.SDK_INT >= 23) {
            return m1530a((Icon) this.f1021b);
        }
        if (this.f1020a == 2) {
            return ((String) this.f1021b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public int mo1431b() {
        if (this.f1020a == -1 && VERSION.SDK_INT >= 23) {
            return m1531b((Icon) this.f1021b);
        }
        if (this.f1020a == 2) {
            return this.f1024e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        if (this.f1020a == -1) {
            return String.valueOf(this.f1021b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1529a(this.f1020a));
        switch (this.f1020a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1021b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1021b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(mo1429a());
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo1431b())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1024e);
                if (this.f1025f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1025f);
                    break;
                }
                break;
            case 4:
                sb.append(" uri=");
                sb.append(this.f1021b);
                break;
        }
        if (this.f1026g != null) {
            sb.append(" tint=");
            sb.append(this.f1026g);
        }
        if (this.f1027i != f1019h) {
            sb.append(" mode=");
            sb.append(this.f1027i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo1430a(boolean z) {
        this.f1028j = this.f1027i.name();
        int i = this.f1020a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    if (z) {
                        Bitmap bitmap = (Bitmap) this.f1021b;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                        this.f1022c = byteArrayOutputStream.toByteArray();
                        return;
                    }
                    this.f1023d = (Parcelable) this.f1021b;
                    return;
                case 2:
                    this.f1022c = ((String) this.f1021b).getBytes(Charset.forName(C2793C.UTF16_NAME));
                    return;
                case 3:
                    this.f1022c = (byte[]) this.f1021b;
                    return;
                case 4:
                    this.f1022c = this.f1021b.toString().getBytes(Charset.forName(C2793C.UTF16_NAME));
                    return;
                default:
                    return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        } else {
            this.f1023d = (Parcelable) this.f1021b;
        }
    }

    /* renamed from: c */
    public void mo1432c() {
        this.f1027i = Mode.valueOf(this.f1028j);
        int i = this.f1020a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    if (this.f1023d != null) {
                        this.f1021b = this.f1023d;
                        return;
                    }
                    this.f1021b = this.f1022c;
                    this.f1020a = 3;
                    this.f1024e = 0;
                    this.f1025f = this.f1022c.length;
                    return;
                case 2:
                case 4:
                    this.f1021b = new String(this.f1022c, Charset.forName(C2793C.UTF16_NAME));
                    return;
                case 3:
                    this.f1021b = this.f1022c;
                    return;
                default:
                    return;
            }
        } else if (this.f1023d != null) {
            this.f1021b = this.f1023d;
        } else {
            throw new IllegalArgumentException("Invalid icon");
        }
    }

    /* renamed from: a */
    private static String m1530a(Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: b */
    private static int m1531b(Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
