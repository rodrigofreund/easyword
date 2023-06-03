package br.com.rodrigofreund.easyword.view;

final class MainFrame extends AbstractFrame {

    private static AbstractFrame instance;

    private static FrameState state;

    private MainFrame() {
        super("EasyWord");
    }

    public static AbstractFrame getInstance() {
        if (instance == null) {
            instance = new MainFrame();
        }
        return instance;
    }

    @Override
    public void start() {
        state = FrameState.START;
        state.doAction();
    }

    @Override
    protected void search() {
        state = state.nextState();
        state.doAction();
    }
}
