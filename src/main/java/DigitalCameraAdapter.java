public class DigitalCameraAdapter implements CameraAdapter {
    private Camera traditionalCamera;

    public DigitalCameraAdapter(Camera camera) {
        this.traditionalCamera = camera;
    }

    public void takePhotograph(double shutterSpeed) {
        // implement a subset of the takePhotograph() functionality from the Camera class here
        Logger.getInstance().log(traditionalCamera.getName() + " is taking a photograph");
        MirrorOperations mirrorOps =  traditionalCamera.getMirrorOps();
        ShutterOperations shutterOps =  traditionalCamera.getShutterOps();

        mirrorOps.openMirror();;

        shutterOps.setShutterSpeedSetting(shutterSpeed);
        shutterOps.initializeShutter();
        shutterOps.activateShutter();
        shutterOps.releaseShutter();

        mirrorOps.closeMirror();

        Logger.getInstance().log(traditionalCamera.getName() + " is done taking this photograph");
    }

}