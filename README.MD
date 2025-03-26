# Flappy Bird Game
### The project is a reproduction of the flappy bird game built in java and the library swing for the GUI. The game is based on an interactive panel where the user control the bird and must make it avoid obstacles and not let it fall to the ground.
## Main Features:
-  Logic of the project is based on java SE.
- GUI of the game is based on java swing library.
- frameTimer and pipeTimer handles the components movements in the panel.
- The project does not follow any specific design pattern.
## System Requirements:
- jdk 21 or next versions.
- IDE: Intellij idea, netbeans, vscode, eclipse...
- git(optional)
## Download:
Download the repository zip file and unzip it or download the repository using git by typing in your prompt:
               
      git clone https://github.com/roccofab/Flappy_Bird

## Running:
1. **Method 1:** Open your terminal and go to the folder **Flappy_Bird\out\artifacts\Flappy_Bird_jar** that contains the Flappy_Bird.jar file then run the jar file by typing:
 
         java -jar "Flappy_Bird.jar"
2. **Method 2:**  Go to the folder **Flappy_Bird\out\artifacts\Flappy_Bird_jar** and copy the Flappy_Bird.jar file then paste it wherever you want and double-click on it to run the program. 
## Source code details:
- **draw():** draw the panel 60 times every millisecond, draw the bird and draw the pipe every 1500 milliseconds.
- **paintComponent():** call the method paintChildren to ensure that the panel's child components are drawn correctly and call the method draw to draw custom elements on the panel.
- **move():** changes the bird's current position based on the current speed and gravity, pipes move to the left side.
- **insertPipes():** Insert pipes objects into a list and set location for top pipe and bottom pipe.
- **ActionPerformed():**  First call the method move() then the method repaint() that calls the method paintComponent() to draw background and the bird on each frame, then check for collisions between bird and pipe and then check if the game is over.

## Application Preview:
<p align="left">
<img src = "src\\resources\\Screenshot 2025-03-27 001514.png" width="80%">
</p>