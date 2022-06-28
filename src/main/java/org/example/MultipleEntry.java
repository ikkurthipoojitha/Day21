package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MultipleEntry {
    public static boolean validateMail(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }
}