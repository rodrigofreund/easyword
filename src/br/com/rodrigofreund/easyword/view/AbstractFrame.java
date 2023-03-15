package br.com.rodrigofreund.easyword.view;

import javax.swing.JFrame;

abstract class AbstractFrame {
	
	private JFrame frame;
	private AbstractView actualView;
	
	void init(String title) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(title);
		frame.setSize(300, 200);
		frame.setLocationByPlatform(true);
	}
	
	abstract void start();

	abstract void search();
	
	void changeView(AbstractView view) {
		
	}

}
