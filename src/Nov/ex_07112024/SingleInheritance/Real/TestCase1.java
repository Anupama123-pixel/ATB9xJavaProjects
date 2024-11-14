package Nov.ex_07112024.SingleInheritance.Real;

public class TestCase1 extends Common_baseTest{
    public TestCase1(){
        System.out.println("DC - Child");
    }

    public void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }

}