package Nov.TaskEx.Task_07112024.Single_Inheritance.RealExample;

public class TestCase2 extends Common_BaseTest{
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
