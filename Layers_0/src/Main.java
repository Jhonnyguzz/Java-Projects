import logic.Logic;
import model.Model;
import view.ConsoleView;


public class Main {
	public static void main(String[] args) {
		Model model = new Model();
		Logic logic = new Logic(model);
		ConsoleView view = new ConsoleView(logic);
		view.runView();
	}
}
