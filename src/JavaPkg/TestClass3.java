package JavaPkg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 {
    @Test
    public void func5(){
        System.out.println("Abcd5");
    }

    @BeforeMethod
    public void ajkls(){
        System.out.println("BeforeMethod");
    }

    @Test
    public void fun6(){
        System.out.println("Abcd6");
    }

    @AfterSuite
    public void funff(){
        System.out.println("AfteSuite");
    }
}
