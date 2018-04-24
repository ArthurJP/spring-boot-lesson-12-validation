package com.jp.springbootlesson12validation.spring.validator;

import com.jp.springbootlesson12validation.domain.Person;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *  spring的检验类，功能较弱
 *
 * {@link Person} {@link Validator}
 * @author <a href="mailto:zhangtylord@gmail.com>张俊鹏</a>
 *
 * @see Person
 * @see Validator
 * @since 4/23/2018
 */
public class PersonValidattor implements Validator{

//    优先判断这里，如果返回true才进行验证
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.isAssignableFrom( clazz );
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = Person.class.cast( target );
        String name = person.getName();
        if (!StringUtils.hasLength( name )){
            errors.reject( "person.name.not.null","人的名称不能为空" );
        }
    }
}
