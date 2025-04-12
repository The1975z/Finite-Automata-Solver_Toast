
public class IdleState implements State {

    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("insert_bread")) {
            toaster.setState(new ReadyState());
        } else if (event.equals("power_off")) {
            toaster.setState(new OffState());
        } else {
            System.out.println("Event '" + event + "' ไม่รองรับในสถานะ IDLE");
        }
    }

    @Override
    public String getName() {
        return "IDLE";
    }
}
