import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
@Repeatable(value = Roles.class )
public @interface Role {
 String value();
}

@Retention( RetentionPolicy.RUNTIME )
@interface Roles {
 Role[] value() default{};
}