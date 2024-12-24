Created in 2016
**Features**
Ball Movement: The ball moves across the screen with adjustable velocities and bounces off the walls and paddles.
Paddle Control: Players can control paddles vertically using keyboard inputs.
Score Tracking: Keeps track of the score during the game.
Graphics: Uses Java's Graphics class to render the ball, paddles, and game panel.
Sound Effects: Plays sound when the ball hits the paddle (optional feature).
Responsive UI: Runs in a 600x600 pixel JFrame window.
**Project Structure**
The project consists of the following main components:

Ball (Ball.java)

Handles ball movement, velocity, and rendering.
Uses x and y coordinates to update the ball's position.
Player and Player2 (Player.java and Player2.java)

Represent the two paddles controlled by players.
Use velocity for vertical movement and update their positions accordingly.
GamePanel (GamePanel.java)

**Core game logic and rendering.**
Implements ActionListener and KeyListener for handling user inputs and updating the game state.
Pong (Pong.java)

**Entry point of the application.**
Sets up the game window and initializes the game panel.
**How to Run**
Ensure you have Java JDK installed on your machine.
Compile the source code using javac:
**bash**
javac Pong.java GamePanel.java Ball.java Player.java Player2.java
**Run the program:**
bash
java Pong
