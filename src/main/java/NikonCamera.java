public class NikonCamera extends Camera {
    public NikonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    public String getName() {
        return "Nikon";
    }
}