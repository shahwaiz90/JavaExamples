package examples.interfaces;

public class ViewClass implements ListenerInterface.buttonListener{


    @Override
    public void onClick() {
        System.out.println("Button on Click Listener: "+ListenerInterface.count);
    }
}
