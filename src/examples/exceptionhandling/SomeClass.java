package examples.exceptionhandling;

import java.io.IOException;

public class SomeClass {

    public void executeMethod() {
        CheckedExceptions checkedExceptions = new CheckedExceptions();
        try {
            checkedExceptions.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        UnCheckedExceptions unCheckedExceptions = new UnCheckedExceptions();
        unCheckedExceptions.getData();
        unCheckedExceptions.getData2();
        unCheckedExceptions.getData3();
    }
}
