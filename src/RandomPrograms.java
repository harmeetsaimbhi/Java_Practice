
import java.io.*;
public class RandomPrograms {
	
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	
	
	

	    
	    
	      public static void xraisedn(int x, int n)
	      {
	          int result = 1;
	          for(int i=1;i<=n;i++)
	          {
	              result = result * x;
	          }
	            System.out.println(result);
	      }
	      
	      public static void fact(int n)
	      {
	          int result = 1;
	          for(int i=1;i<=n;i++)
	          {
	              result = result * i;
	          }
	            System.out.println(result);
	      }
	      
	      public static void fibo(int[] arr)
	      {
	          arr[0] = 0;
	          arr[1] = 1;
	          int count= 15;
	          for(int i=2; i<count; i++){
	        	  
	        	  arr[i]=arr[i-1]+arr[i-2];
	        	  
	          }
	          
	          
	      }
	      
	      
	       public static void palindrome(String s)
	      {
	          boolean result = false;
	         
	          for(int i=1;i<=s.length()/2;i++)
	          {
	              if(s.charAt(i-1)== s.charAt(s.length()-i))
	              {
	                  result = true;
	              }
	              else{
	              result = false;
	              }
	          }
	          
	          if(result == true)
	          {
	                System.out.println("Palindrome");
	          }
	          else {System.out.println("not a palindrome");}
	      }
	       
	       public static void filewrite()
	       {
	           try
	           {
	             FileOutputStream fout = new FileOutputStream("C:\\Users\\SIMRAN\\Desktop\\abc.txt");
	             fout.write((byte)116);
	             fout.close();
	           }
	           catch(Exception e)
	           {
	               
	           }
	       }
	       
	       public static void fileread()
	       {
	           try
	           {
	               FileInputStream fin = new FileInputStream("C:\\Users\\SIMRAN\\Desktop\\abc.txt");
	            // FileOutputStream fout = new FileOutputStream("C:\\Users\\SIMRAN\\Desktop\\abc.txt");
	               char c = (char)fin.read();
	               System.out.println(c);
	               
	               
	               c = (char)fin.read();
	            // fout.write((byte)116);
	             //fout.close();
	               System.out.println(c);
	           }
	           catch(Exception e)
	           {
	               
	           }
	       }
	      
	      public static void same()
	      {
	          int a[]= {1,2,3};
	          System.out.println(a.length);
	           int check[] = new int[3];
	          boolean bool = false;
	          
	          
	          System.out.println(check[1]);
	      }
	      
	       public static void nullpointer()
	      {
	          String s;
	      //    System.out.println(s.length());
	      }
	       
	        public static void length()
	      {
	          int a[][] = new int[3][6];
	          System.out.println(a.length);
	          System.out.println(a[0].length);
	      }
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
