package Nov.ex_11112024_Encapsulation_Part2.Real;

public class Test_Case1 extends Base_Class {
    public Test_Case1(){
        super(); // Parent Constructor - Super - Means Parent
        // this - current Object
        System.out.println("DC - TC1");

    }

    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }


    @Override
    public String toString() {
        return "TestCase1{}";
    }
}
