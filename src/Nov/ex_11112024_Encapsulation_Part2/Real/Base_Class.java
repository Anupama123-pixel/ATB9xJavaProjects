package Nov.ex_11112024_Encapsulation_Part2.Real;

public class Base_Class {
    private String browser;


    Base_Class(){
        System.out.println("DC - BaseClass");
    }

    Base_Class(String b){
        System.out.println("CC - BaseClass");
    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Opening Browser!!");

//        Webdriver driver = new ChromeDriver();
//        driver.get("url");
//

    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");


    }
}
