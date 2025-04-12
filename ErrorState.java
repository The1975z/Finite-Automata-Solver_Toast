
public class ErrorState implements State {

    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("reset")) {
            toaster.setState(new ResetState());
        } else if (event.equals("power_off")) {
            toaster.setState(new OffState());
        } else {
            System.out.println("Event '" + event + "' ไม่รองรับในสถานะ ERROR → ไป RESET");
            toaster.setState(new ResetState());
        }
    }

    @Override
    public String getName() {
        return "ERROR";
    }
}
