package br.com.rodrigofreund.easyword.view;

import javax.swing.JButton;
import javax.swing.JLabel;

class MainView extends AbstractView {
	
	
	public MainView() {
		super();

		JLabel helloLabel = new JLabel("Hello!");
		JButton openSearchViewButton = new JButton("Open");
		openSearchViewButton.addActionListener((action) -> {
			MainFrame.getInstance().search();
		});
		addComponent(helloLabel);
		addComponent(openSearchViewButton);
	}

}
