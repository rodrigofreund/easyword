package br.com.rodrigofreund.easyword;

import javax.swing.JOptionPane;

import br.com.rodrigofreund.easyword.model.event.EventManager;
import br.com.rodrigofreund.easyword.model.event.EventType;
import br.com.rodrigofreund.easyword.view.ViewService;

public class Application {

	public static void main(String[] args) {

		EventManager.instance().subscribe(EventType.SEARCH_BUTTON_ACTION, (data) -> {
			JOptionPane.showMessageDialog(null, "efetua a busca por ".concat(data.getValue()));
		});
		
		

		ViewService.getInstance().open();

	}

}
