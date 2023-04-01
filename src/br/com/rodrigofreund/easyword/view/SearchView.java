package br.com.rodrigofreund.easyword.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.rodrigofreund.easyword.model.event.EventManager;
import br.com.rodrigofreund.easyword.model.event.EventType;
import br.com.rodrigofreund.easyword.model.event.TextParam;

class SearchView extends AbstractView {
	
	
	public SearchView() {
		super();
		JLabel helloLabel = new JLabel("Search!");
		JTextField searchTextField = new JTextField(10);
		JButton openSearchViewButton = new JButton("Search");
		openSearchViewButton.addActionListener((action) -> {
			EventManager.instance().notify(EventType.SEARCH_BUTTON_ACTION, new TextParam(searchTextField.getText()));
		});
		
		addComponent(helloLabel);
		addComponent(searchTextField);
		addComponent(openSearchViewButton);
	}

}
