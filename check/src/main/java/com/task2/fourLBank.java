package com.task2;

import java.util.Scanner;

public class fourLBank {

	
	private void check(int[][] a, int id, String[] customername,String[] cardtype) {
		int max=0,min=300,cardtypeno=0,cardno=0;String cardtypee= null;
     cardtypee=cardtype[id-1];
     for(int j=0;j<10;j++)
     {
    	 if(id==a[j][0]) {
    		 if(min>a[j][1])
    		 {
    			 min=a[j][1];
    			 cardno=a[j][2];
    		 }
    	 }
     }
     cardtypeno=min;
     if(cardtypeno==100)
     {
    	 cardtypee=cardtype[0];
     }
     else if(cardtypeno==200)
     {
    	 cardtypee=cardtype[1];
     }
     else if(cardtypeno==300)
     {
    	 cardtypee=cardtype[2];
     }
	for(int i=0;i<10;i++)
	{
		if(a[i][1]==cardtypeno && id==a[i][0])
		{
	if(max<a[i][3])
{
	max=a[i][3];
	
					
}
			
}
		
		
	}
	
	System.out.println("customer "+""+customername[id-1]+" "+"should use"+""+" cardnumber:"+""+cardno+" "+" of type "+""+cardtypee+""+" for this transaction");
	}
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Enter the customer name:");
		 fourLBank b=new fourLBank();
		 String cname = in.next(); 
		String[] customername= {"A","B","C"},cardtype= {"Platinum","Gold","Silver"};
		int[] customerid= {1,2,3};
		int flag=0,id = 0,i;
		int[][] a = {{1,100,1111,85},{2,100,2222,60},{2,100,3333,72},{1,200,4444,40},{1,200,5555,56},{1,200,6666,98},{3,200,7777,81},{1,300,8888,33},{2,300,9999,75},{3,300,1010,49}};
		int l=customername.length;
		//System.out.println(l);	
		for(i=0;i<l;i++)
		{
			if(customername[i].equals(cname))
			{
				id=customerid[i];
				flag=flag+1;
			}
		}
		if(flag==1)
		{
		  b.check(a,id,customername,cardtype);		
		}
		else
		{
			System.out.println("invalid customer name");
		}
		
		
	}

	

}
