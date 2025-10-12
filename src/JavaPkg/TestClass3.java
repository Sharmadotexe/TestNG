package JavaPkg;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class TestClass3 {

//    @Parameters ({"URL"})
//    @Test
//    public void func5(String urlname){
//        System.out.println("Abcd5");
//        System.out.println(urlname);
//    }

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


    @Test(dataProvider = "getData")
    public void printCreds(String userName, String Password){
        System.out.println(userName);
        System.out.println(Password);
    }


    @DataProvider
    public Object[][] getData(){
        Object[][] obj = new Object[3][2];
        //1st combination
        obj[0][0] = "firstUsername";
        obj[0][1] = "password";

        //2nd combination
        obj[1][0] = "secUsername";
        obj[1][1] = "secPassword";

        //3rd combination
        obj[2][0] = "thirdUsername";
        obj[2][1] = "thirdPassword";

        return obj;
    }


}
