package examples.abstractclasses;

public abstract class AbstractRenderData {
    private String data;
    private int count;

    public final String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    abstract  String getRenderedData();
}
