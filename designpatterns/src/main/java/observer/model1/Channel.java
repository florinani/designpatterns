package observer.model1;

public class Channel  implements Observer{

    String channelName;

    NewsAgency observable;

    public Channel(String channelName, NewsAgency observable) {
        this.channelName = channelName;
        this.observable = observable;
    }

    @Override
    public void update() {
        String newArticle = observable.getArticle();
        System.out.println("Channel " + channelName +" posted a new article named :" + newArticle);
    }
}