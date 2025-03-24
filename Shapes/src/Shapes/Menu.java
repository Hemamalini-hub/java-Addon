package Shapes;

import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
	
	PrintStream ps = System.out;
	Scanner in = new Scanner(System.in);
	
	private void displayHeader() {
		ps.println("SHAPES MANAGER PROJECT");
		}
	
	public void displayMainMenu() {
		
		int sel = 0;
		while(sel !=9) {
			displayHeader();
			ps.println("Main Menu");
			ps.println();
			ps.println("1.Add a shape");
			ps.println("2.Delete a shape");
			ps.println("3.List Shapes");
			ps.println("9.Exit");
			ps.println("Enter your choice:");
			sel = in.nextInt();
			
			//show the sub menu
			switch(sel) {
			case 1: //Add Shape
				displayShapesMenu();
				break;
			case 2://Delete Shape
				break;
			case 3://List Shapes
				break;
			case 9://Exit
				break;
			default:
				ps.println("Invalid selection. Try again!!!");
				break;
				}
			}
		}
	
	private void displayShapesMenu() {
		int sel = 0;
		while(sel !=9) {
			displayHeader();
			ps.print("Shapes Menu");
			ps.println();
			ps.println("1.Square");
			ps.println("2.Rectangle");
			ps.println("3.Cube");
			ps.println("4.Circle");
			ps.println("9.Exit");
			sel = in.nextInt();
			
			//show the sub menu
			switch(sel) {
			case 1: //Add Square
				break;
			case 2://Add Rectangle
				break;
			case 3://Add Cube
				break;
			case 4://Add Circle
				break;
			case 9://Exit
				break;
			default:
				ps.println("Invalid selection. Try again!!!");
				break;
			}
		}
	}
	
	
}

