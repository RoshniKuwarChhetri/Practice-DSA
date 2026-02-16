package class4;

import java.util.Scanner;

public class BankApplication {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   System.out.println("welcome");
	   System.out.println("Select 1 for savings account");
	   System.out.println("Select 2 for current account");
	  
	   
	   int balance =5000;
	   int choice=sc.nextInt();
	      switch(choice) {
	      case 1:
	    	  System.out.println("select 1 for deposit");
	    	  System.out.println("select 2 for withdraw");
	    	  System.out.println("select 3 to check balance");
	    	  
	    	  int choice2= sc.nextInt();
	    	  switch(choice2) {
	    	  case 1:
	    		  System.out.println("enter the amount");
	    		  int amount=sc.nextInt();
	    		  balance+=amount;
	    		  System.out.println("deposited successfully");
	    		  System.out.println("balance :"+ balance);
	    		  break;
	    
	    	
	    	  case 2:
	    		  
	    		  System.out.println("enter the with_amount");
	    		  int with_amount = sc.nextInt();
	    		  if(with_amount>25000) {
	    			  System.out.println("can't withdraw more than 25000");
	    		  }
	    		  else if(with_amount>balance) {
	    			  System.out.println("insufficieny balance");
	    		  }
	    		  else {
	    		  System.out.println("withdraw successfull");
	    		  balance-=with_amount;
	    		  }
	    		  
	    		  break;
	    		  
	    	  case 3:
	    		  System.out.println(balance);
	    		  break;
	    	 default:
	    		 System.out.println("invalid");
	    		 break;
	      }
	    	  break;
	      case 2:
	    	  System.out.println("Enter 1 for deposit");
	    	  System.out.println("Enter 2 for withdraw");
	    	  System.out.println("enter 3 for checking balance");
	    	 int choice3=sc.nextInt();
	    	 
	    	 switch(choice3) {
	    	 case 1:
	    		 System.out.println("Enter the deposit amount");
	    		 int depo_amount=sc.nextInt();
	    		 balance=balance+depo_amount;
	    		 System.out.println("deposited succ");
	    		 System.out.println("balance is "+ balance);
	    		 break;
	    	 case 2:
	    		 System.out.println("Enter withdraw amount");
	    		 int amount =sc.nextInt();
	    		 if(balance<amount) {
	    			 System.out.println("insufficient balance");
	    		 }
	    		 else {
	    			 System.out.println("withdraw successful");
	    			 balance-=amount;
	    		 }
	    		 break;
	     	 
	    	  
	        case 3:
	    	  System.out.println(" balance is"+ balance);
	    	  break;
	        default :
	    	 System.out.println("invalid command");
	    	 break;
	    	 }
	   break;
	   default:
		   System.out.println("wrong command");
		   break;
	   
	   }
	      
	   
   }
   
   
}
