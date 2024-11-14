package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //적용대상 method
@Retention(RetentionPolicy.RUNTIME) //유지정책 runtime
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
