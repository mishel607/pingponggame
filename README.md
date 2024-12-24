**Ping Pong Game
Overview**
Ping Pong Game is a Java-based, two-player game that replicates the classic table tennis experience. It features smooth gameplay mechanics, graphical elements, and interactive features such as ball movement, paddle control, and scoring.
This project was originally created in 2016 and has been uploaded to GitHub in 2024 for preservation, sharing, and potential further enhancement.

**Features**
Ball Movement: The ball moves across the screen with adjustable velocities and bounces off walls and paddles.
Paddle Control: Players control paddles vertically using keyboard inputs for responsive gameplay.
Score Tracking: Tracks and displays scores during the game.
Graphics: Utilizes Java's Graphics class to render the ball, paddles, and game panel.
Optional Sound Effects: Plays sound when the ball hits the paddle (future addition).
**Project Structure**
The project consists of the following components:

Ball (Ball.java):
Manages the ball's position, movement, and collision detection.

Player and Player2 (Player.java, Player2.java):
Represent the paddles controlled by the two players.

GamePanel (GamePanel.java):
Core game logic, including updating game objects and handling input.

Pong (Pong.java):
The main class that sets up the game window and initializes the game panel.

**How to Run**
Ensure you have Java JDK installed.
Compile the source files:
javac src/*.java
**Run the game:**
java src/Pong
**Controls**
Player 1:
Move Up: UP ARROW
Move Down: DOWN ARROW
Player 2:
Move Up: A
Move Down: Z
**Future Improvements**
Add scoring display on the game screen.
Implement sound effects when the ball hits a paddle.
Introduce multiple difficulty levels and AI opponents.
Add a game menu and pause functionality.
