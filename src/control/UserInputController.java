package control;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputController {

	private InputStream inputMethod = System.in;

	public UserInputController() {

	}

	/**
	 * Returns a user input as a string. Default input is System.in.
	 * 
	 * @param toInput
	 * @return
	 */
	public String askForString(String requestInput) {
		System.out.println(requestInput);
		Scanner s = new Scanner(inputMethod);
		return s.nextLine();
	}

	public char askForCharacter(String requestInput) {
		System.out.println(requestInput);
		Scanner s = new Scanner(inputMethod);
		return s.next().charAt(0);
	}

	public int askForNumber(String requestInput) {
		System.out.println(requestInput);
		Scanner s = new Scanner(inputMethod);
		try {
			return s.nextInt();
		}catch(InputMismatchException e)
		{
			s.nextLine();
			return askForNumber(requestInput);
		}
	}

}
