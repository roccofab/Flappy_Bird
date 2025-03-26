
import java.awt.Image;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Pipe {
    int pipeX = 1024;   //starting position of the pipe on the right side 
    int pipeY = 0;    //starting position of the pipe on the top 
    int pipeWidth = 64;  //pipe width
    int pipeHeight = 512;   //pipe height
    Image pipeImg;
    boolean passed = false;
    
    public Pipe(Image pipeImg){
        this.pipeImg = pipeImg;
    }
}
