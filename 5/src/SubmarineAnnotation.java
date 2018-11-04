import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SubmarineAnnotation
{
    int missiles() default 10;
    String name() default "Admiral";
    boolean started() default false;
}