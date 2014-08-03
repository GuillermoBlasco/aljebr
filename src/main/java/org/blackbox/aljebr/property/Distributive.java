package org.blackbox.aljebr.property;

import java.lang.annotation.*;

/**
 * @author guillermo
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface Distributive {
    String subject();
    String object();
}
