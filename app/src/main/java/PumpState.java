/**
 * Created by USER1 on 16/01/2017.
 */
public class PumpState {
    public final int sugarLevel;
    public final int batteryLevel;
    public final double insulinLevel;
    public final int baseProfile;
    public final double ISIGvalue;

    public boolean isAlarm() {
        return alarm;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public double getInsulinLevel() {
        return insulinLevel;
    }

    public int getBaseProfile() {
        return baseProfile;
    }

    public double getISIGvalue() {
        return ISIGvalue;
    }

    public final boolean alarm;

    public PumpState(int sugarLevel, int batteryLevel, double insulinLevel, int baseProfile, double isiGvalue, boolean alarm) {

        this.sugarLevel = sugarLevel;
        this.batteryLevel = batteryLevel;
        this.insulinLevel = insulinLevel;
        this.baseProfile = baseProfile;
        ISIGvalue = isiGvalue;
        this.alarm = alarm;
    }



}
