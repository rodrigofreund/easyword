package br.com.rodrigofreund.easyword.view;

/*Service responsable for all screen access and management 
 * It needs to be the only acesses for the screen access
 */
public final class ViewService {
	
	private static ViewService instance;
	
	private ApplicationFrame mainView;
	
	static {
		instance = new ViewService();
	}
	
	private ViewService() {
		mainView = MainView.getInstance();
	}
	
	public static ViewService getInstance() {
		return instance;
	}

	public void open() {
		mainView.start();
	}
}
