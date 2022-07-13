public class Photographer {
    private Camera camera;
    private DigitalCameraAdapter digitalCamera;

    public Photographer() {
        this.camera = CameraFactory.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);
        this.digitalCamera = new DigitalCameraAdapter(this.camera);
    }

    public void takePhotograph(){
        camera.takePhotograph(0.2);
        digitalCamera.takePhotograph(0.1);
    };

}
