
public class ReadyState implements State {

    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("start_toast")) {
            toaster.setState(new ToastingState());
        } else if (event.equals("power_off")) {
            toaster.setState(new OffState());
        } else {
            System.out.println("Event '" + event + "' ไม่รองรับในสถานะ READY → ไป RESET");
            toaster.setState(new ResetState());
        }
    }

    @Override
    public String getName() {
        return "READY";
    }
}
