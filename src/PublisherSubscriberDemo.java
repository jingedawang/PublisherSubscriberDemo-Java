/**
 * Created by wjg on 2017/6/29.
 */
public class PublisherSubscriberDemo {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.addOnMessageArriveListener(message -> { System.out.println("Subscriber 1: " + message); });
        publisher.addOnMessageArriveListener(message -> { System.out.println("Subscriber 2: " + message); });
        publisher.start();
    }

}
