package br.com.rodrigofreund.easyword.view;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import br.com.rodrigofreund.easyword.model.event.EventManager;
import br.com.rodrigofreund.easyword.model.event.EventType;

abstract class AbstractFrame {
	
	private JFrame frame;
	private AbstractView actualView;
	
	AbstractFrame(String title) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(title);
		frame.setSize(300, 200);
		frame.setLocationByPlatform(true);
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				EventManager.instance().notify(EventType.CLOSE_APP_ACTION, null);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	abstract void start();

	abstract void search();
	
	void changeView(AbstractView view) {
		if(actualView != null) {
			actualView.close();
		} else {
			frame.setVisible(true);
		}
		actualView = view;
		frame.getContentPane().add(actualView.getWindow());
	}

}
