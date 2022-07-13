public class CanonMirror implements MirrorOperations {

    public void openMirror() {
        Logger.getInstance().log((getName() + " is open"));
    }


    public void closeMirror() {
        Logger.getInstance().log((getName() + " is closed"));
    }


    public String getName() {
        return "Canon Mirror";
    }
}