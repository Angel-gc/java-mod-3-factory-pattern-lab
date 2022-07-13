public class CameraFactory {
    public enum CameraManufacturer {
        NIKON_FILM("Nikon Film"),
        CANON_FILM("Canon Film");

        String name;

        private CameraManufacturer(String name) {
            this.name = name;
        }
    }

    public static Camera makeCamera(CameraManufacturer manufacturer) {
        if (manufacturer == CameraManufacturer.NIKON_FILM) {
            return new NikonCamera(new NikonFilm(), new NikonShutter(), new NikonMirror());
        } else if (manufacturer == CameraManufacturer.CANON_FILM) {
            return new CanonCamera(new CanonFilm(), new CanonShutter(), new CanonMirror());
        }

        return null; // will never happen because we're using an enum but required to satisfy the compiler
    }
}