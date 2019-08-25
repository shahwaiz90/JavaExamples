package examples.abstractclasses;

public class LowLevelDevice extends AbstractRenderData {
    @Override
    String getRenderedData() {
        //Custom Implementation for Low Level Devices
        return getData();
    }
}
