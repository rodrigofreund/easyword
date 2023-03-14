package br.com.rodrigofreund.easyword.view;

final class MainView extends ApplicationFrame {

	private static final long serialVersionUID = 1277419340819287945L;

	private static MainView instance;
	
	private final String title;
	
	static {
		instance = new MainView();
	}
	
	private MainView() {
		title = "EasyWord";
	}
	
	public static MainView getInstance() {
		instance.setTitle(instance.title);
		instance.setSize(300, 200);
		instance.setLocationByPlatform(true);
		return instance;
	}
	
	@Override
	public void start() {
		instance.setVisible(true);
	}
}
