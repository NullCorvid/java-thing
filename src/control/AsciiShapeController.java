package control;

import model.AsciiShape;
import model.*;

public class AsciiShapeController {

	boolean running;
	UserInputController userInput;
	AsciiShape shape;

	final String choices = "1. Triangle\n2. Square\n3. Diamond";
	final String inputErrorYesNo = "Invalid option: Please type either [Y] to proceed, or [N] to exit";
	final String inputErrorShapeChoice = "Invalid option: Select a shape by typing a number";

	public static void main(String[] args) {
		AsciiShapeController ascii = new AsciiShapeController();
		ascii.run();
	}

	public void run() {
		while (running) {
			System.out.println("Draw a shape?");
			switch (userInput.askForString("Y/N").toLowerCase()) {
			default:
				System.out.println(inputErrorYesNo);
				break;
			case "y":
				doShapes();
				break;
			case "n":
				running = false;
				System.out.println("Goodbye");
			}
		}
	}

	public AsciiShapeController() {
		userInput = new UserInputController();
		running = true;
	}

	private void doShapes() {
		switch (userInput.askForNumber("Which Shape would you like to draw?\n" + choices)) {
		default:
			System.out.println(inputErrorShapeChoice);
			break;
		case 1:
			shape = new Triangle();
			shapeTasks();
			break;
		case 2:
			shape = new Square();
			shapeTasks();
			break;
		case 3:
			shape = new Diamond();
			shapeTasks();
			break;
		}
	}

	private void shapeTasks() {
		shape.setHeight(userInput.askForNumber("Height of Square?"));
		shape.setWidth(userInput.askForNumber("Width of Square?"));
		shape.setLabel(userInput.askForString("Input a new label? Leave blank and hit [Enter] to skip"));
		shape.draw();
	}

}
