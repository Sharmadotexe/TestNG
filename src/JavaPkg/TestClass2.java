package JavaPkg;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
    @BeforeTest
    public void func3(){
        System.out.println("Abcd3");
    }

    @Test
    public void func4(){
        System.out.println("Abcd4");
    }

    @Test(groups = {"Smoke"})
    public void funcsdewf(){
        System.out.println("Smoke 2");
    }
}
