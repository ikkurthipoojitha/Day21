package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MultipleEntryTest {
    private String email;
    private boolean result;
    private MultipleEntry multipleEntry;

    @Before
    public void initialize() {
        multipleEntry = new MultipleEntry();
    }

    public TestMail(String email, boolean result) {
        this.email = email;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection mailInput() {
        return Arrays.asList(new Object[][]{{"abc.100@abc.com.au", false}, {"abc@1.com", false},
                {"abc@gmail.com.com", false}, {"abc+100@gmail.com", false}, {"abc@gmail.com", false}, {"abc-100@yahoo.com", false}, {"abc.100@yahoo.com", false}
                , {"abc111@abc.com", false}, {"abc-100@abc.net", false},});
    }

    @Test
    public void givenMailWhenCheckedThenReturnHappy() {
        Assertions.assertEquals(result, multipleEntry.validateMail("^(abc)[.+-]?[0-9]{0,3}(@)[a-z0-9]{1,}.[a-z]{1,}.?[a-z]{1,},?$", input));

    }
}

