package L3.annatation.animals;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface FeatureGiraffe {
    String sound();
    int color();
}
