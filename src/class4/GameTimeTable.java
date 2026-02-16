package class4;

public class GameTimeTable {
	public static void main(String[] args) {
		
	
		String day= "Tuesday";
		switch(day){
			case "Monday":
				System.out.println("Basketball");
			break;
			case "Tuesday":
				System.out.println("Tennis");
			break;
			case "Wednesday":
				System.out.println("Basketball");
			break;
			case "Thursday":
				System.out.println("cricket");
			break;
			case  "Friday":
				System.out.println("Tennis");
			break;
			case "Saturday":
				System.out.println("Exercise");
			break;
			case "Sunday":
				System.out.println("holiday");
			break;
			default:
				System.out.println("Invalid ");
				
			
			
		}	
	}

}
