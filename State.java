public interface State {
    void handleEvent(Toaster toaster, String event);
    String getName();
}
