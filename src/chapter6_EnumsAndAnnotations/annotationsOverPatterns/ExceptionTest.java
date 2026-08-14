package chapter6_EnumsAndAnnotations.annotationsOverPatterns;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTest{
  Class<? extends Exception>[] value();
}
