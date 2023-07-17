package br.com.rodrigofreund.easyword.view;

import br.com.rodrigofreund.easyword.model.event.EventManager;
import br.com.rodrigofreund.easyword.model.event.EventType;

enum FrameState {

    CLOSE {

        @Override
        public FrameState nextState() {
            return START;
        }

        @Override
        public void doAction() {
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
            instance.changeView(new SearchView());
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
            instance.changeView(new MainView());
            EventManager.instance().notify(EventType.START_APP);
        }
    };

    private static AbstractFrame instance;

    public abstract FrameState nextState();

    public abstract void doAction();

    public abstract FrameState close();
}
