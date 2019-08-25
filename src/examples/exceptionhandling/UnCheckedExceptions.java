package examples.exceptionhandling;

public class UnCheckedExceptions {

    public void getData() {
        throw new RuntimeException();
    }

    public void getData2() {
        throw new NullPointerException();
    }

    public void getData3() {
        throw new ArithmeticException();
    }
}
