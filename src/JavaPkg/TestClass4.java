package JavaPkg;

import org.testng.annotations.Test;
//Helper Attributes
public class TestClass4 {
    @Test
    public void A(){
        System.out.println("1");
    }

    @Test(enabled = false)
    public void BB(){
        System.out.println("2");
    }

    @Test(dependsOnMethods = {"DD"})
    public void CC(){
        System.out.println("3");
    }

    @Test
    public void DD(){
        System.out.println("4");
    }
}
