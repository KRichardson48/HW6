package HW6;

public class DeleteCommand implements GameCommandInterface {
	
	private String myString;
	
	public DeleteCommand(String myString) {
		this.myString = myString;
	}
	
	@Override
	public void execute() {
		ListOfWords.getInstance().removeWord(myString);
	}
	@Override
	public void undo() {
		ListOfWords.getInstance().addWord(myString);
	}
	@Override
	public void redo() {
		ListOfWords.getInstance().removeWord(myString);
	}

}
