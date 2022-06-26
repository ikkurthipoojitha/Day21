package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleEntry {

    public boolean mailID(String test) {
        String mail = "^[a-z]{3}[_.+][a-z0-9]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][a-z]{2,5}$";
        Pattern regex = Pattern.compile(mail);
        Matcher mailIDMatcher = regex.matcher(test);
        if (mailIDMatcher.matches()) {
            System.out.println(test + " is valid email.");
            return true;
        }
        else {
            System.out.println(test + "  is invalid email");
            return false;
        }

    }
}
