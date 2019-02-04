package com.cg.helper;



import com.cg.bean.CabBooking;



/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;*/
import java.util.ArrayList;
import java.util.Iterator;

public class CabFileHelper {
	
	/*public CabBooking writeCabDetails(CabBooking cb) throws IOException
	 {
		 FileOutputStream fout = new FileOutputStream("add.obj");
		 ObjectOutputStream oos = new ObjectOutputStream(fout);
		 oos.writeObject(cb);
		return cb; 
		 
	 }
		public void readCabDetailsFromFile() throws IOException{
			FileInputStream fi = new FileInputStream(new File("add.obj"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			CabBooking pr1 = null;
			try {
				pr1 = (CabBooking) oi.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			System.out.println(pr1.toString());
		}
		
*/
	private  static ArrayList<CabBooking> cabList=null;
	static
	{
		cabList=new ArrayList<CabBooking>();
		//CabBooking b1=new CabBooking(001,"airoli","Thane","9496710466","ola");
		//CabBooking b2=new CabBooking(011,"airi","Tusne","9496710333","uber");
		//CabBooking b3=new CabBooking(333,"rabale","Tusdaey","9496110333","auto");
		//cabList.add(b1);
		//cabList.add(b2);
		//cabList.add(b3);		

	}
	
	
public  CabFileHelper(){}
	
	/*************Add New cab in ArrayList************/
	public void writeCabDetails(CabBooking cab) 
	{			
			cabList.add(cab);				
	}
	
	public static ArrayList<CabBooking> getcabList() {
		return cabList;
	}

	public static void setcabList(ArrayList<CabBooking> cabList) {
		CabFileHelper.cabList = cabList;
	}
	/*************Fetch All cab Details ***********/

	public static  void readCabDetails()
	{
		Iterator<CabBooking> cabIt=cabList.iterator();
		CabBooking tempcab=null;
		
		int totalCount=0;
		while(cabIt.hasNext())
		{
			;
			totalCount++;
			tempcab=cabIt.next();
			System.out.println(tempcab);			
		}
		//System.out.println("Total Count of Books" + totalCount);
			//System.out.println(totalCount);
	}

	
	
}
