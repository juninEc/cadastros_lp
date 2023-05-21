package controller;

import frame.FrameTela;
import frame.PanelMenu;

public class FrameController {
    static PanelMenu pMenu;
    static FrameTela frame;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new FrameTela();
                pMenu = new PanelMenu();
                frame.setContentPane(pMenu);
            }
        });
    }
}
