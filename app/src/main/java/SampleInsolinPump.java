import java.util.Date;

/**
 * Created by USER1 on 16/01/2017.
 */
class SampleIsolinPump implements InsolinPump{

    @Override
    public void init() {
        // connect the pump
    }

    @Override
    public PumpState getPumpState() {
        Date timeStamp = new Date();
        return new PumpState(176,85,50,0,36.82,false,timeStamp);
    }
}
