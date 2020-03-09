package observer.model1;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable {

    private String article;

    List<Observer> channels = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        channels.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        channels.remove(observer);
    }

    @Override
    public void nottifyAllObservers() {
        for(Observer channel: channels) {
            channel.update();
        }
    }

    public String getArticle(){
        return this.article;
    }

    public void postArticle(String article){
        this.article = article;
        nottifyAllObservers();
    }
}
