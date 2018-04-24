package com.jp.springbootlesson12validation;

import org.apache.commons.validator.routines.IntegerValidator;

import java.util.Locale;

/**
 * Created by 张俊鹏 on 4/23/2018
 */
public class ApacheCommonsValidatorMain {
    public static void main(String[] args) {
        IntegerValidator integerValidator = new IntegerValidator();
        Integer value = integerValidator.validate( "10" );
        System.out.println( "value = " + value );
        value = integerValidator.validate( "a" );
        System.out.println( "value = " + value );

        System.out.println( integerValidator.format( 100000000, Locale.ENGLISH ) );
    }

}
