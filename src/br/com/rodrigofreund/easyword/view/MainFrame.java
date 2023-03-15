package br.com.rodrigofreund.easyword.view;

import javax.swing.JFrame;

final class MainFrame extends AbstractFrame {

	private static final long serialVersionUID = 1277419340819287945L;

	private static AbstractFrame instance;
	
	private static FrameState state;
	
	private final String title;
	
	private MainFrame() {
		title = "EasyWord";
		state = FrameState.START;
	}
	
	public static AbstractFrame getInstance() {
		if(instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}
	
	@Override
	public void start() {
		state.doAction();
	}

	@Override
	protected void search() {
		state = state.nextState();
		state.doAction();
	}
}
