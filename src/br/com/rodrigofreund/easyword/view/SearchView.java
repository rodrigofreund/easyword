package br.com.rodrigofreund.easyword.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.rodrigofreund.easyword.model.event.EventManager;
import br.com.rodrigofreund.easyword.model.event.EventParamFactory;
import br.com.rodrigofreund.easyword.model.event.EventType;

class SearchView extends AbstractView {
	
	
	public SearchView() {
		super();
		JLabel helloLabel = new JLabel("Search!");
		JTextField searchTextField = new JTextField(10);
		JButton openSearchViewButton = new JButton("Search");
		openSearchViewButton.addActionListener((action) -> {
			EventManager.instance().notify(EventType.SEARCH_WORD, EventParamFactory.of(searchTextField.getText()));
		});
		
		addComponent(helloLabel);
		addComponent(searchTextField);
		addComponent(openSearchViewButton);
	}

}
