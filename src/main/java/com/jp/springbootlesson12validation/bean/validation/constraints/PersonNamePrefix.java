package com.jp.springbootlesson12validation.bean.validation.constraints;

import com.jp.springbootlesson12validation.bean.validation.PersonNamePrefixConstrainValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * TODO:
 *
 * @author <a href="mailto:zhangtylord@gmail.com>张俊鹏</a>
 * @see
 * @since 4/24/2018
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Documented
@Constraint( validatedBy = {PersonNamePrefixConstrainValidator.class})
public @interface PersonNamePrefix {
    String message() default "{person.name.prefix.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String prefix() default "jp-";
}
