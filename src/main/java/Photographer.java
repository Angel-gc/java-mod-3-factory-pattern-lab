public class Photographer {
    private Camera camera;

    public Photographer() {
        this.camera = CameraFactory.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);
    }

    public void takePhotograph(){
        camera.takePhotograph(0.2);
    };

}
