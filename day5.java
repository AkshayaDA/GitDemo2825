package TEST;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	@Test(dependsOnMethods= {"Pineapple"})
	public void Apple()
	{
		System.out.println("Apple");
	}
	
////	 @Parameters({"URL","api"})
//	@Test
//	public void Orange(String un,String ap)
//	{
//		System.out.println("Orange");
//		System.out.println(un);
//		System.out.println(ap);
//	}
	@Test(enabled=false)
	public void Mango()
	{
		System.out.println("Mango");
	}
	@Test(timeOut=2000)
	public void Pineapple()
	{
		System.out.println("Pineapple");
	}
	@Test
	public void Grapes()
	{
		System.out.println("Grapes");
		Assert.assertTrue(false);
	}
	@Test(dataProvider="getdata")
	public void Watermelon(String usernname,String Password)
	{
		System.out.println("Watermelon");
		System.out.println(usernname);
		System.out.println(Password);
		
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Akshaya";
		data[0][1]="Aksha";
		
		data[1][0]="Kubi";
		data[1][1]="Akub";
		return data;
	}
	
	

}
