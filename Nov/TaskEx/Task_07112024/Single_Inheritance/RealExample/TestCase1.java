package Nov.TaskEx.Task_07112024.Single_Inheritance.RealExample;

public class TestCase1 extends Common_BaseTest{
	public TestCase1(){
        System.out.println("DC - Child");
    }

    public void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
