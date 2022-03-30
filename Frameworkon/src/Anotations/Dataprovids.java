package Anotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovids {

	
	@DataProvider
	public Object[][] testdata() {
		Object[][] data= new Object[2][2];
		data[0][0]="hi";
		data[0][1]="pushpa";
	    data[1][0]="helo";
	    data[1][1]="whatsup";
	    return data;
	}
	@DataProvider
	public Object[][] testdata2() {
		Object[][] data=new Object[3][3];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		
		data[1][0]=1;
		data[1][1]=2;
		data[1][2]=3;
		
		data[2][0]=1;
		data[2][1]=2;
		data[2][2]=3;
		return data;
	}
		
	@Test(dataProvider="testdata")	
	public void test(String s1,String s2)
	{
		System.out.println("s1"+" "+s1+"s2"+" "+s2);
	}
		
	@Test(dataProvider="testdata2")
	public void test(int s1,int s2, int s3) {
	System.out.println("s1"+" "+s1+"s2"+" "+s2+"s3"+" "+s3);
	}	
	
}
