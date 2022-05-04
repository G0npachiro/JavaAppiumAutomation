import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.StandardCharsets;


public class MainClassTest extends MainClass {
    @Before
    public void textStartTest() {
        System.out.println("Начинаем тест");
    }

    @After
    public void textEndTest() {
        System.out.println("Тест окончен");
    }

    @Test
    public void testGetLocalNumber() {
        int a = getLocalNumber();
        if (a == 14) {
            System.out.println("TestDone");
        } else {
            Assert.fail("FailTest");
        }
    }

    @Test

    public void testGetClassNumber() {
        int a = getClass_number();
        if (a < 45) {
            System.out.println("TestDone");
        } else {
            Assert.fail("FailTest");
        }

    }

    @Test
    public void testGetClassString() {
        String b = getClass_string();
        if (b.contains("Hello") || b.contains("hello")) {
            System.out.println("TestDone");
        } else {
            Assert.fail("FailTest");
        }
    }
}
