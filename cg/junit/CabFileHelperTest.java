package com.cg.junit;

//import java.io.IOException;

//import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;




import com.cg.bean.CabBooking;
import com.cg.exception.CabException;
import com.cg.helper.CabFileHelper;

public class CabFileHelperTest {
	static CabFileHelper collectionHelper;
	static CabBooking cab=null;
	
	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new CabFileHelper();
		cab =new CabBooking(888,"lil","net","9776710466","app");		
	}
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		cab=null;
	}	
	
	
	@Test 
	public void displaycab() throws CabException
	{
		//try {
			collectionHelper.writeCabDetails(cab);
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		//Assert.assertEquals(1, collectionHelper.readCabDetails());
		//Assert.assertNotNull(collectionHelper.toString());
		
	}

//}
