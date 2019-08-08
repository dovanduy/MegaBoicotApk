package com.startapp.common.p196c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.startapp.common.c.f */
/* compiled from: StartAppSDK */
public @interface C5548f {
    /* renamed from: a */
    boolean mo20534a() default false;

    /* renamed from: b */
    Class mo20535b() default Object.class;

    /* renamed from: c */
    Class mo20536c() default String.class;

    /* renamed from: d */
    Class mo20537d() default String.class;

    /* renamed from: e */
    Class mo20538e() default String.class;

    /* renamed from: f */
    String mo20539f() default "";
}
