package examples.abstractclasses;

public class HighLevelDevice extends AbstractRenderData {
    @Override
    String getRenderedData() {
        //Custom Implementation for High Level Devices
        return getData();
    }

}
