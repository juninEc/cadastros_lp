package controller;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import frame.FrameTela;
import frame.PanelCadastroAluno;
import frame.PanelMenu;

public class FrameController {
    static PanelMenu pMenu;  
    static PanelCadastroAluno pAluno; 
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FrameTela frame = new FrameTela();
                pMenu = new PanelMenu(); 
                frame.setContentPane(pMenu);
            }
        });
    }
}
