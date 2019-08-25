package examples.exceptionhandling;

import java.io.IOException;

public class CheckedExceptions {

    public void getData() throws IOException {
        throw new IOException();
    }
}
