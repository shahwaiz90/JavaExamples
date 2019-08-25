package examples.interfaces;

public class ViewClass2 implements ListenerInterface{

    @Override
    public void onDisplay() {
        System.out.println("View Component on Display Listener Callback");
    }
}
