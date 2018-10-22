package HW6;

import java.util.Scanner;

public class RunHW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameCmdInvoker cmdInvoker = new GameCmdInvoker();
		Scanner scan = new Scanner(System.in);
		
		boolean quit = false;
		
		while (quit == false) {
			System.out.println("Command: ");
			
			String userInput = scan.nextLine();
			String [] wordList = userInput.split(" ");
			
			switch(wordList[0]) {
			case "add" :
				AddCommand addCommand = new AddCommand(wordList[1]);
				cmdInvoker.setCommand(addCommand);
				cmdInvoker.execute();
				break;
			case "delete" :
				DeleteCommand deleteCommand = new DeleteCommand(wordList[1]);
				cmdInvoker.setCommand(deleteCommand);
				cmdInvoker.execute();
				break;
			case "undo" :
				cmdInvoker.undo();
				break;
			
			case "redo" :
				cmdInvoker.redo();
				break;
			case "quit" :
				quit = true;
				break;
			default :
				System.out.println("Command not recognized");
			}
			System.out.print(ListOfWords.getInstance().toString());
		}
		scan.close();
	}

}
