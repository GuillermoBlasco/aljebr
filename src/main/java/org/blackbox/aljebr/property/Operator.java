package org.blackbox.aljebr.property;

import java.lang.annotation.*;

/**
 * @author guillermo
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface Operator {
    String value();
}
