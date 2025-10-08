package JavaPkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void func(){
        System.out.println("Abcd1");
    }

    @AfterTest
    public void func2(){
        System.out.println("AfterTest");
    }


    @BeforeSuite
    public void funcnv(){
        System.out.println("BeforeSuit");
    }


    @Test(groups = {"Smoke"})
    public void funcsd(){
        System.out.println("Smoke 1");
    }


}
