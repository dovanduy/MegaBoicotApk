package android.support.p028v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.ak */
/* compiled from: ResourcesWrapper */
class C0955ak extends Resources {

    /* renamed from: a */
    private final Resources f3122a;

    public C0955ak(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3122a = resources;
    }

    public CharSequence getText(int i) throws NotFoundException {
        return this.f3122a.getText(i);
    }

    public CharSequence getQuantityText(int i, int i2) throws NotFoundException {
        return this.f3122a.getQuantityText(i, i2);
    }

    public String getString(int i) throws NotFoundException {
        return this.f3122a.getString(i);
    }

    public String getString(int i, Object... objArr) throws NotFoundException {
        return this.f3122a.getString(i, objArr);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws NotFoundException {
        return this.f3122a.getQuantityString(i, i2, objArr);
    }

    public String getQuantityString(int i, int i2) throws NotFoundException {
        return this.f3122a.getQuantityString(i, i2);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f3122a.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) throws NotFoundException {
        return this.f3122a.getTextArray(i);
    }

    public String[] getStringArray(int i) throws NotFoundException {
        return this.f3122a.getStringArray(i);
    }

    public int[] getIntArray(int i) throws NotFoundException {
        return this.f3122a.getIntArray(i);
    }

    public TypedArray obtainTypedArray(int i) throws NotFoundException {
        return this.f3122a.obtainTypedArray(i);
    }

    public float getDimension(int i) throws NotFoundException {
        return this.f3122a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws NotFoundException {
        return this.f3122a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws NotFoundException {
        return this.f3122a.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f3122a.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        return this.f3122a.getDrawable(i);
    }

    public Drawable getDrawable(int i, Theme theme) throws NotFoundException {
        return this.f3122a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) throws NotFoundException {
        return this.f3122a.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Theme theme) {
        return this.f3122a.getDrawableForDensity(i, i2, theme);
    }

    public Movie getMovie(int i) throws NotFoundException {
        return this.f3122a.getMovie(i);
    }

    public int getColor(int i) throws NotFoundException {
        return this.f3122a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws NotFoundException {
        return this.f3122a.getColorStateList(i);
    }

    public boolean getBoolean(int i) throws NotFoundException {
        return this.f3122a.getBoolean(i);
    }

    public int getInteger(int i) throws NotFoundException {
        return this.f3122a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws NotFoundException {
        return this.f3122a.getLayout(i);
    }

    public XmlResourceParser getAnimation(int i) throws NotFoundException {
        return this.f3122a.getAnimation(i);
    }

    public XmlResourceParser getXml(int i) throws NotFoundException {
        return this.f3122a.getXml(i);
    }

    public InputStream openRawResource(int i) throws NotFoundException {
        return this.f3122a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws NotFoundException {
        return this.f3122a.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws NotFoundException {
        return this.f3122a.openRawResourceFd(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f3122a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f3122a.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f3122a.getValue(str, typedValue, z);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f3122a.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.f3122a != null) {
            this.f3122a.updateConfiguration(configuration, displayMetrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f3122a.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.f3122a.getConfiguration();
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f3122a.getIdentifier(str, str2, str3);
    }

    public String getResourceName(int i) throws NotFoundException {
        return this.f3122a.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws NotFoundException {
        return this.f3122a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws NotFoundException {
        return this.f3122a.getResourceTypeName(i);
    }

    public String getResourceEntryName(int i) throws NotFoundException {
        return this.f3122a.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f3122a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f3122a.parseBundleExtra(str, attributeSet, bundle);
    }
}
