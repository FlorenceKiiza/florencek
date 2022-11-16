package Courses;
import java.util.Scanner;

public class Courses {
	
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String s;
		String s1;
		String s2;
		
			System.out.println("Select subject below\n");
			
			System.out.println(""
					+ "1. Mathematics\n"
					+ "2. Physics\n"
					+ "3. Chemistry\n"
					+ "5. Biology\n"
					+ "6. history\n"
					+ "7. Agriculture\n"
					+ "8. Entrepreneurship\n"
					+ "9. Fine Art\n"
					+ "10. Luganda\n"
					+ "11. Literature\n");
		
		int opt = sc.nextInt();
		switch(opt) {
		case 1:
			s1 = "Mathematics";
			break;
		case 2:
			s1 = "Physics";
			break;
		case 3:
			s1 = "Chemistry";
			break;
		case 4:
			s1 = "Biology";
			break;
		case 5:
			s1 = "history";
			break;
		case 6:
			s1 = "Agriculture";
			break;
		case 7:
			s1 = "Entrepreneurship";
			break;
		case 8:
			s1 = "Fine Art";
			break;
		case 9:
			s1 = "Luganda";
			break;
		case 10:
			s1 = "Literature";
			break;
		default:
			System.out.println("Invalid input");
		}
		
		
		System.out.println("Select subject below\n");
		
		System.out.println(""
				+ "1. Mathematics\n"
				+ "2. Physics\n"
				+ "3. Chemistry\n"
				+ "5. Biology\n"
				+ "6. history\n"
				+ "7. Agriculture\n"
				+ "8. Entrepreneurship\n"
				+ "9. Fine Art\n"
				+ "10. Luganda\n"
				+ "11. Literature\n");
	
	int opt1 = sc.nextInt();
	switch(opt1) {
	case 1:
		s2 = "Mathematics";
		break;
	case 2:
		s2 = "Physics";
		break;
	case 3:
		s2 = "Chemistry";
		break;
	case 4:
		s2 = "Biology";
		break;
	case 5:
		s2 = "history";
		break;
	case 6:
		s2 = "Agriculture";
		break;
	case 7:
		s2 = "Entrepreneurship";
		break;
	case 8:
		s2 = "Fine Art";
		break;
	case 9:
		s2 = "Luganda";
		break;
	case 10:
		s2 = "Literature";
		break;
	default:
		System.out.println("Invalid input");
	}
	
	if(opt == 1 || opt == 2 || opt1 == 1 || opt1 == 2){
		
			System.out.println("Since you offered Mathematics or Physics or both, You qualify to do Computer Science course");
		
	}else {
		System.out.println("You cannot offer Computer Science program");
	}
	}
}
