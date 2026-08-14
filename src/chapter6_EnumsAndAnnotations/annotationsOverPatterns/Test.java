package chapter6_EnumsAndAnnotations.annotationsOverPatterns;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}

