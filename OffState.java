public class OffState implements State {
    @Override
    public void handleEvent(Toaster toaster, String event) {
        if (event.equals("power_on")) {
            toaster.setState(new IdleState());
        }
    }

    @Override
    public String getName() {
        return "OFF";
    }
}
