package Nov.ex_07112024.SingleInheritance.Real;

public class TestCase2 extends Common_baseTest {
    TestCase2(){
        System.out.println("DC - Child");
    }

    void testcase2(){
        startBrowser();
        System.out.println("TC2 Executing");
        readExcelFile();
        closeBrowser();
    }

}