package com.cg.cabUI;

import java.io.IOException;
import java.util.Scanner;

import com.cg.bean.CabBooking ;
import com.cg.exception.CabException;
import com.cg.helper.CabFileHelper;
import com.cg.helper.CabDataValidator;

public class CabUI {
	static Scanner sc=new Scanner(System.in);
	static CabFileHelper collectionhelper=null;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int choice=0;
 collectionhelper=new CabFileHelper();
		CabBooking cabbook= new CabBooking();
		
		while(true)
		{
			System.out.println("1: Book a Cab \n"+
					"2: Read Cab Details from File \n 3:Exit");

			System.out.println("\nEnter UR Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	entercustomerDetails();break;
			case 2:// try {
					collectionhelper.readCabDetails();
				//} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				break;
			default:System.exit(0);			
			}
		}
		
		}
	
	
	private static void entercustomerDetails() 
	{
		//System.out.println(" ");
		
		//int bcount=sc.nextInt();
		
		//while (bcount!=0) {
		System.out.println(" Please enter the cab details");
		System.out.println("Enter Otp");
	String otp=sc.next();
		try 
		{
			if(CabDataValidator.validateOtp(otp))
			System.out.println("Enter Pickup");
			String pickUp=sc.next();
			if(CabDataValidator.validatePickUp(pickUp))
			{
				System.out.println("Enter drop ");
				String drop =sc.next();
				if(CabDataValidator.validatedrop(drop))
				{
					System.out.println("Enter mobile");
				}
				String mobileNo =sc.next();
				if(CabDataValidator.validatemobileno(mobileNo))
				{
					System.out.println("Enter cabType");
				}
				String cabType =sc.next();
				if(CabDataValidator.validatecabtype(cabType))
				
				{
					
					CabBooking cab =new CabBooking (Integer.parseInt(otp), pickUp, drop,mobileNo, cabType );
						//try {
							collectionhelper.writeCabDetails(cab);
						//} catch (IOException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}
						
				}	
			//}
						
		} 
		catch (CabException e)
		{			
			System.out.println(e.getMessage());
		}
		//bcount--;

		
	}

}
