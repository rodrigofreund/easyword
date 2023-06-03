package br.com.rodrigofreund.easyword;

import br.com.rodrigofreund.easyword.model.event.EventManager;
import br.com.rodrigofreund.easyword.model.event.EventType;
import br.com.rodrigofreund.easyword.view.ViewService;

public final class Application {

    public static void main(String[] args) {
        
        EventManager.instance().subscribe(EventType.START_APP, (data) -> {
            System.out.println("Starting application...");
        });

        EventManager.instance().subscribe(EventType.SEARCH_WORD, (data) -> {
            System.out.println(data.getValue().toString());
        });

        EventManager.instance().subscribe(EventType.CLOSE_APP, (data) -> {
            System.out.println("closing the application");
        });

        ViewService.getInstance().open();

    }

}
