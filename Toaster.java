public class Toaster {
    private State currentState;

    public Toaster() {
        this.currentState = new OffState();
        System.out.println("Current state: " + currentState.getName());
    }

    public void setState(State newState) {
        this.currentState = newState;
        System.out.println("Current state: " + currentState.getName());
    }

    public void handleEvent(String event) {
        currentState.handleEvent(this, event);
    }
}
