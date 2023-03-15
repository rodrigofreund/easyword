package br.com.rodrigofreund.easyword.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SearchView extends AbstractView {
	
	
	public SearchView() {
		super();
		JLabel helloLabel = new JLabel("Search!");
		JTextField searchTextField = new JTextField(10);
		JButton openSearchViewButton = new JButton("Search");
		openSearchViewButton.addActionListener((action) -> {
			
		});
		
		addComponent(helloLabel);
		addComponent(searchTextField);
		addComponent(openSearchViewButton);
	}

}
