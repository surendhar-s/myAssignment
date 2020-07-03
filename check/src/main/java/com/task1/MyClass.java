package com.task1;

public class MyClass {
    public static void main(String args[]) {
    int array[]={1,2,5,3,6,1,2,7,8,9,8,1,3,6,7,8,3,5,7,8,2,3,5};
    int number[]=new int[23];
    int cnumber[]=new int[23];
    
    int i,j,k,count,size=-1,size1=-1,h,c,size2=-1,l,check,check1,max,n,y,x,z;
    for(i=0;i<23;i++)
    {
              
        c=0;k=0;
        if(i!=0)
        {
      for(k=0;k<i;k++)
      {
          if(array[i]==array[k])
          {
              c=c+1;
          }
          }
      }
        
    
      else
      {
          c=0;
      }
      if(c==0)
      {
        size=size+1;
        count=0;
          for(j=0;j<23;j++)
        {
            if(array[i]==array[j])
                count=count+1;
        }
        number[size]=array[i];
        cnumber[size]=count;
        
      }
     
        }
        
        max=cnumber[0];
        for (int m = 1; m < cnumber.length; m++) 
        {
             if (cnumber[m] > max) 
                 max = cnumber[m]; 
        }
        System.out.print("Maximun occured number(s):");
        for(y=0;y<=size;y++)
        {
            
            if(cnumber[y]==max)
            {
                
                System.out.print(" "+number[y]);
                if(size!=(y+1))
                {
                    System.out.print(" "+",");
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
         System.out.println("number"+"        "+"count of occurance");
     for(x=0;x<=max;x++)
     {
         for(z=0;z<=size;z++)
         {
             if(cnumber[z]==x)
             {
                 System.out.println("  "+""+number[z]+" "+"                 "+""+cnumber[z]);
             }
         }
     }
     
     }
    
    }