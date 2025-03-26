
import java.awt.Image;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roccofab
 */
public class Bird {
    //bird initial position
    int birdX = 1024/8;  // 128px from the left side of the panel
    int birdY = 768/2;   // 384px height 
    //bird dimension
    int birdwidth = 40;
    int birdheight = 30;
    Image birdImg;
    
    public Bird(Image birdImg){
        this.birdImg = birdImg;
    }
}
