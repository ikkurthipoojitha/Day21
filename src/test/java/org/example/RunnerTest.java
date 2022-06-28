package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMail.class);

        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
