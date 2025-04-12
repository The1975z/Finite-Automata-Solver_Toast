
public class ResetState implements State {

    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("reset")) {
            System.out.println("กำลังรีเซ็ตเครื่อง → กลับไป IDLE");
            toaster.setState(new IdleState());
        } else if (event.equals("power_off")) {
            toaster.setState(new OffState());
        } else {
            System.out.println("Event '" + event + "' ไม่รองรับในสถานะ RESET → คงสถานะ RESET");
        }
    }

    @Override
    public String getName() {
        return "RESET";

    }
}
