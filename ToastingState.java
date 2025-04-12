
public class ToastingState implements State {

    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("toast_done")) {
            toaster.setState(new DoneState());
        } else if (event.equals("error")) {
            toaster.setState(new ErrorState());
        } else if (event.equals("power_off")) {
            toaster.setState(new OffState());
        } else {
            System.out.println("Event '" + event + "' ไม่รองรับในสถานะ TOASTING → ไป RESET");
            toaster.setState(new ResetState());
        }
    }

    @Override
    public String getName() {
        return "TOASTING";
    }
}
