
public class DoneState implements State {

    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("remove_bread")) {
            toaster.setState(new IdleState());
        } else if (event.equals("power_off")) {
            toaster.setState(new OffState());
        } else {
            System.out.println("Event '" + event + "' ไม่รองรับในสถานะ DONE → ไป RESET");
            toaster.setState(new ResetState());
        }
    }

    @Override
    public String getName() {
        return "DONE";
    }
}
