/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class PasswordValidator {

    private Pattern pattern;
//    private Pattern patternLower;
//    private Pattern patternUpper;
//    private Pattern patternNumber;
//    private Pattern patternMark;
//    private Pattern patternSize;
    private Matcher matcher;
//    private Matcher matcherLower;
//    private Matcher matcherUpper;
//    private Matcher matcherNumber;
//    private Matcher matcherMark;
//    private Matcher matcherSize;

    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[,.;:-]).{4,20})";

//    private static final String PASSWORD_PATTERN_LOWER = "(([a-z]{1,}))"; //must contains one lowercase characters
//
//    private static final String PASSWORD_PATTERN_UPPER = "(([A-Z]{1,}))"; //must contains one uppercase characters
//
//    private static final String PASSWORD_PATTERN_NUMBER = "(([0-9]{1,}))"; //must contains one digit from 0-9
//
//    private static final String PASSWORD_PATTERN_MARK = "(([,.;:-]{1,}))"; //must contains one special symbols in the list ,.;:-
//
//    private static final String PASSWORD_PATTERN_SIZE = "({4,20})"; //length at least 4 characters and maximum of 20
    
    public PasswordValidator() {
       
        pattern = Pattern.compile(PASSWORD_PATTERN);

//        patternLower = Pattern.compile(PASSWORD_PATTERN_LOWER);
//        patternUpper = Pattern.compile(PASSWORD_PATTERN_UPPER);
//        patternNumber = Pattern.compile(PASSWORD_PATTERN_NUMBER);
//        patternMark = Pattern.compile(PASSWORD_PATTERN_MARK);
//        patternSize = Pattern.compile(PASSWORD_PATTERN_SIZE);
    }

    /**
     * Validate password with regular expression
     *
     * @param password password for validation
     * @return true valid password, false invalid password
     */
    public boolean validate(final String password) {

        matcher = pattern.matcher(password);
        
//        matcherLower = patternLower.matcher(password);
//        matcherUpper = patternUpper.matcher(password);
//        matcherNumber = patternNumber.matcher(password);
//        matcherMark = patternMark.matcher(password);
//        matcherSize = patternSize.matcher(password);

//        if (matcherLower.matches() == false) {
//            throw new IllegalArgumentException("ERRO: Password deve conter minúsculas!");
//
//        } else if (matcherUpper.matches() == false) {
//            throw new IllegalArgumentException("ERRO: Password deve conter maiúsculas!");
//
//        } else if (matcherNumber.matches() == false) {
//            throw new IllegalArgumentException("ERRO: Password deve conter números!");
//
//        } else if (matcherMark.matches() == false) {
//            throw new IllegalArgumentException("ERRO: Password deve conter pontuação (,.;:-) !");
//
//        } else if (matcherSize.matches() == false) {
//            throw new IllegalArgumentException("ERRO: Password deve conter 4 a 20 caracteres!");
//        }

//        return true;
        return matcher.matches();
    }
}
