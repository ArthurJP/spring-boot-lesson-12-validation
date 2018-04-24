package com.jp.springbootlesson12validation.bean.validation;
import com.jp.springbootlesson12validation.bean.validation.constraints.PersonNamePrefix;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * {@link PersonNamePrefix} {@link ConstraintValidator}
 *
 * @author <a href="mailto:zhangtylord@gmail.com>张俊鹏</a>
 *  @see PersonNamePrefix
 *  @see ConstraintValidator
 * @since 4/24/2018
 */
public class PersonNamePrefixConstrainValidator implements ConstraintValidator<PersonNamePrefix,String>{
    private String prefix;

    @Override
    public void initialize(PersonNamePrefix constraintAnnotation) {
        this.prefix=constraintAnnotation.prefix();
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        if (!name.startsWith( prefix )){

            /**
             * 以下可以覆盖掉源注释，以防特殊需求。正常环境使用逻辑语句即可
             * start
             */
            context.disableDefaultConstraintViolation();
            ConstraintValidatorContext.ConstraintViolationBuilder builder=
                    context.buildConstraintViolationWithTemplate( "人的名称必须以\""+prefix+"\"起始！" );
            builder.addConstraintViolation();
            /**
             * end
             */

            return false;
        }
        return true;
    }
}
