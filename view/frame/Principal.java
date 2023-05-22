package frame;

import controller.FrameController;

public class Principal {
    public static void main(String[] args) {
        FrameController.getInstance().init();
        FrameController.getInstance().mudarParaMenu();
    }
}
