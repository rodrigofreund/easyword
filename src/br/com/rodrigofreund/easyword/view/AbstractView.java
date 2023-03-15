package br.com.rodrigofreund.easyword.view;

import java.awt.Component;

import javax.swing.JPanel;

abstract class AbstractView {

	private JPanel panel;

	AbstractView() {
		panel = new JPanel();
	}

	void addComponent(Component comp) {
		panel.add(comp);
	}

}
