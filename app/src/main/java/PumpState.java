import java.util.Date;

/**
 * Created by USER1 on 16/01/2017.
 */
public class PumpState {
    public final int sugarLevel;
    public final int batteryLevel;
    public final double insulinLevel;
    public final int baseProfile;
    public final double ISIGvalue;
    public final boolean alarm;
    public final Date timeStamp;

    public PumpState(int sugarLevel, int batteryLevel, double insulinLevel, int baseProfile, double isiGvalue, boolean alarm, Date timeStamp) {
        this.sugarLevel = sugarLevel;
        this.batteryLevel = batteryLevel;
        this.insulinLevel = insulinLevel;
        this.baseProfile = baseProfile;
        ISIGvalue = isiGvalue;
        this.alarm = alarm;
        this.timeStamp = timeStamp;
    }
    public PumpState(int sugarLevel, int batteryLevel, double insulinLevel, int baseProfile, double isiGvalue, boolean alarm, long timeStamp) {
        this.sugarLevel = sugarLevel;
        this.batteryLevel = batteryLevel;
        this.insulinLevel = insulinLevel;
        this.baseProfile = baseProfile;
        ISIGvalue = isiGvalue;
        this.alarm = alarm;
        this.timeStamp = new Date(timeStamp);
    }
}
