package android.support.p017v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.g */
/* compiled from: FragmentController */
public class C0252g {

    /* renamed from: a */
    private final C0253h<?> f526a;

    /* renamed from: a */
    public static C0252g m782a(C0253h<?> hVar) {
        return new C0252g(hVar);
    }

    private C0252g(C0253h<?> hVar) {
        this.f526a = hVar;
    }

    /* renamed from: a */
    public C0254i mo837a() {
        return this.f526a.mo864i();
    }

    /* renamed from: a */
    public Fragment mo836a(String str) {
        return this.f526a.f528b.mo911b(str);
    }

    /* renamed from: a */
    public void mo841a(Fragment fragment) {
        this.f526a.f528b.mo904a((C0253h) this.f526a, (C0251f) this.f526a, fragment);
    }

    /* renamed from: a */
    public View mo838a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f526a.f528b.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public void mo846b() {
        this.f526a.f528b.mo950n();
    }

    /* renamed from: c */
    public Parcelable mo850c() {
        return this.f526a.f528b.mo947m();
    }

    /* renamed from: a */
    public void mo840a(Parcelable parcelable, C0274k kVar) {
        this.f526a.f528b.mo896a(parcelable, kVar);
    }

    /* renamed from: d */
    public C0274k mo851d() {
        return this.f526a.f528b.mo943k();
    }

    /* renamed from: e */
    public void mo852e() {
        this.f526a.f528b.mo951o();
    }

    /* renamed from: f */
    public void mo853f() {
        this.f526a.f528b.mo955p();
    }

    /* renamed from: g */
    public void mo854g() {
        this.f526a.f528b.mo956q();
    }

    /* renamed from: h */
    public void mo855h() {
        this.f526a.f528b.mo957r();
    }

    /* renamed from: i */
    public void mo856i() {
        this.f526a.f528b.mo958s();
    }

    /* renamed from: j */
    public void mo857j() {
        this.f526a.f528b.mo959t();
    }

    /* renamed from: k */
    public void mo858k() {
        this.f526a.f528b.mo962v();
    }

    /* renamed from: a */
    public void mo842a(boolean z) {
        this.f526a.f528b.mo906a(z);
    }

    /* renamed from: b */
    public void mo848b(boolean z) {
        this.f526a.f528b.mo918b(z);
    }

    /* renamed from: a */
    public void mo839a(Configuration configuration) {
        this.f526a.f528b.mo894a(configuration);
    }

    /* renamed from: l */
    public void mo859l() {
        this.f526a.f528b.mo963w();
    }

    /* renamed from: a */
    public boolean mo844a(Menu menu, MenuInflater menuInflater) {
        return this.f526a.f528b.mo908a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo843a(Menu menu) {
        return this.f526a.f528b.mo907a(menu);
    }

    /* renamed from: a */
    public boolean mo845a(MenuItem menuItem) {
        return this.f526a.f528b.mo909a(menuItem);
    }

    /* renamed from: b */
    public boolean mo849b(MenuItem menuItem) {
        return this.f526a.f528b.mo920b(menuItem);
    }

    /* renamed from: b */
    public void mo847b(Menu menu) {
        this.f526a.f528b.mo917b(menu);
    }

    /* renamed from: m */
    public boolean mo860m() {
        return this.f526a.f528b.mo938h();
    }
}
