import java.util.ArrayList;
import java.util.Scanner;

public class RectangleArrayList {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
	
		ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>(3);
		
		/*
		rectangleList.add(new Rectangle(20, 10));
		rectangleList.add(new Rectangle(30, 15));
		rectangleList.add(new Rectangle(40, 20));
		*/
		
		for(int index = 0; index < rectangleList.size(); index++) {
			int length, width;
			System.out.print("What is the length of rectangle " + (index + 1) + " ? ");
			length = keyboard.nextInt();
			System.out.print("What is the width of rectangle " + (index + 1) + " ? ");
			width  = keyboard.nextInt();
			keyboard.nextLine();
			
			Rectangle rectangle = new Rectangle(length, width);
			rectangleList.add(index, rectangle);
			
			
		}
		
		
		for(int index = 0; index < rectangleList.size(); index++) {
			System.out.println(rectangleList.get(index).getArea());
		}
		

	}

}
