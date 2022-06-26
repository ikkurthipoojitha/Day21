package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultipleEntryTest {

    MultipleEntry multipleEntryTest = new MultipleEntry();

    @BeforeEach
    public void initialize(){
         multipleEntryTest = new MultipleEntry();
    }

    @Test
    public void mailTest_forMultipleEntries(){
        Assertions.assertEquals(true, multipleEntryTest.mailID("abc.567@bl.co.in"));
        Assertions.assertEquals(false,multipleEntryTest.mailID("abc@gmail.co.in"));
        Assertions.assertEquals(true,multipleEntryTest.mailID("abc_100@ad.co.com"));
    }
}
