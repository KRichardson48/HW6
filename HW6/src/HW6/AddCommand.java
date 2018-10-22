package HW6;

public class AddCommand implements GameCommandInterface {
	
	String myString;
	
	public AddCommand(String myString) {
		this.myString = myString;
	}
	@Override
	public void execute() {
		ListOfWords.getInstance().addWord(myString);
	}
	@Override
	public void undo() {
		ListOfWords.getInstance().removeWord(myString);
	}
	@Override
	public void redo() {
		ListOfWords.getInstance().addWord(myString);
	}

}
