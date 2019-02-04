package com.cg.helper;

import java.util.regex.Pattern;

import com.cg.exception.CabException;


public class CabDataValidator {
	public  static  boolean validatePickUp(String pickUp)throws CabException
	{
		String custPattern="[a-z]{2,20}";
		if(Pattern.matches(custPattern, pickUp))
		{
			return true;
		}
		else
		{
			throw new CabException("Pickup should start with CAPITAL & Min 6 and Max 20 characters Allowed");
		}
	}
	
	public  static  boolean validateOtp(String otp)throws CabException
	{
		String IdPattern="\\d{4}";
		if(Pattern.matches(IdPattern, otp))
		{
			return true;
		}
		else
		{
			throw new CabException("Only 3-digit Otp is Allowed");
		}
	}
	
	public  static  boolean validatedrop(String drop)throws CabException
	{
		String dropPattern="[a-z]{2,20}";
		if(Pattern.matches(dropPattern, drop))
		{
			return true;
		}
		else
		{
			throw new CabException("Only letters");
		}
	}	
	
	public  static  boolean validatemobileno(String mobileNo)throws CabException
	{
		String mobileNoPattern="[6789][0-9]{9}";
		if(Pattern.matches(mobileNoPattern,mobileNo))
		{
			return true;
		}
		else
		{
			throw new CabException("Only numbers");
		}
	}
	
	public  static  boolean validatecabtype(String cabType)throws CabException
	{
		String typePattern="[a-z]{2,20}";
		if(Pattern.matches(typePattern, cabType))
		{
			return true;
		}
		else
		{
			throw new CabException("Only letters ");
		}
	}	


}
