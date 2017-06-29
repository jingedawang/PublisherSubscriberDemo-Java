import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjg on 2017/6/29.
 */
public class Publisher {

    private List<MessageArriveListener> listeners = new ArrayList<MessageArriveListener>();

    public interface MessageArriveListener {
        void MessageArrived(String message);
    }

    public void addOnMessageArriveListener(MessageArriveListener listener) {
        listeners.add(listener);
    }

    public void start()
    {
        while (true) {
            for (MessageArriveListener listener : listeners) {
                listener.MessageArrived("Some message from publisher.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
