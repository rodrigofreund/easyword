package br.com.rodrigofreund.easyword.view;

enum FrameState {
	
	
	CLOSE {

		@Override
		public FrameState nextState() {
			return START;
		}

		@Override
		public void doAction() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public FrameState close() {
			return CLOSE;
		}
		
	},
	SEARCH {
		@Override
		public FrameState nextState() {
			return null;
		}

		@Override
		public void doAction() {
			
			instance.setView(new SearchView());
		}

		@Override
		public FrameState close() {
			return null;
		}
	},
	START {
		@Override
		public FrameState nextState() {
			return SEARCH;
		}

		@Override
		public FrameState close() {
			return CLOSE;
		}

		@Override
		public void doAction() {
			instance = MainFrame.getInstance();
			instance.setView(new MainView());
			instance.setVisible(true);
		}
	};
	
	private static MainFrame instance;
	
	public abstract FrameState nextState();
	public abstract void doAction();
	public abstract FrameState close();
}