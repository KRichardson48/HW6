package HW6;

import java.util.ArrayList;
import java.util.List;

public class GameCmdInvoker {
	
	private List<GameCommandInterface> cmdList;
	private int index;
	
	public GameCmdInvoker() {
		cmdList = new ArrayList<>();
		index = -1;
	}
	
	public void setCommand(GameCommandInterface command)
	{
		cmdList.add(command);
		index++;
	}
	
	public void execute() {
		cmdList.get(index).execute();
	}
	
	public void redo() {
		cmdList.get(index).redo();
	}
	
	public void undo() {
		cmdList.get(index).undo();
	}
	
	
	
}
