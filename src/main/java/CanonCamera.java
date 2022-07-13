public class CanonCamera extends Camera {
    public CanonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    public String getName() {
        return "Canon";
    }
}