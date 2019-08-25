package examples.interfaces;

public interface ListenerInterface {
    int count = 0;
    void onDisplay();

    interface buttonListener{
        void onClick();
    }

    interface imageListener{
        void onTap();
    }
}
