package Applications.ObjectRepository;

import org.openqa.selenium.By;

public interface AppObjects {
	
	
	
	
	//Login Page
	public static By txtLoginUserName = By.name("user-name");
	public static By txtLoginPassword = By.name("password");
	public static By btnLogin = By.className("btn_action");
	
	//Add to cart
	public static By btnAddtoCart = By.xpath("//div[@class='inventory_item'][1]//child::button");
	public static String btnAddtoCartContinue = "//div[@class='inventory_item'][value]//child::button";
	public static By btnAddtoBag = By.xpath("//*[name()='svg']/*[name()='path']");
	public static By btnContinueShop = By.xpath("//a[contains(text(),'Shopping')]");
	//Logout button
	public static By btnLogout = By.xpath("//a[@id='logout_sidebar_link']");
	
	//Inventory Page
	public static By btnValidateremove = By.xpath("//div[@class='inventory_item'][1]");
    public static By btnRemove = By.xpath("//button[@class='btn_secondary btn_inventory']");
    
    //Items menu
    public static By btnClickMenu = By.xpath("//div/button[contains(text(),'Open Menu')]");
    public static String btnItemsLists = "//*[@class='bm-item menu-item'][x]";
    public static By btnItemList = By.xpath("//div/nav[contains(text(),'')]");
    
    //verify error login
    public static By ViewErrormsg = By.xpath("//button[@class='error-button']/parent::h3");
    public static By Errormsg = By.xpath("//*[contains(text(),'Epic sadface:' )]");
}
