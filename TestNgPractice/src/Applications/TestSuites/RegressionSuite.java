package Applications.TestSuites;
import org.testng.annotations.Test;

//import Applications.TestScripts.*;
import Applications.TestScripts.*;

public class RegressionSuite
{
	@Test
	public void TS_01() throws Throwable {
		TS_Swag_Remove_01 obj1 = new TS_Swag_Remove_01();
		obj1.main(null);
	}
	
	@Test
	public void TS_02() throws Throwable {
		TS_Swag_Validate_Menu_02 obj2 = new TS_Swag_Validate_Menu_02();
		obj2.main(null);
	}
	@Test
	public void TS_03() throws Throwable {
		TS_Swag_Validate_ErrorMsg_03 obj3 = new TS_Swag_Validate_ErrorMsg_03();
		obj3.main(null);
	}
	@Test
	public void TS_04() throws Throwable {
		TS_Swag_ContinueShop_04 obj4 = new TS_Swag_ContinueShop_04();
		obj4.main(null);
	}
	@Test
	public void TS_05() throws Throwable{
		TS_Swag_Validate_Logout_05 obj5 = new TS_Swag_Validate_Logout_05();
		obj5.main(null);
	}
	
	
}
	
	