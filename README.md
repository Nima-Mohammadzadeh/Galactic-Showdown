# Galactic-Showdown
A Java Game Inspired by Space Invaders

**Code Structure**
The Space Invaders game project consists of several components and modules that work together to create the game experience. Here's an overview of the main files and their roles:

    Entity: The Entity class represents the base entity in the game, providing properties and functionalities shared by different entities, such as position, movement, and collision detection.

    Bullet: The Bullet class extends the Entity class and defines the properties and behavior of bullets fired from the ship. It includes attributes like speed and direction.

    BulletController: The BulletController class handles the management of bullets in the game. It controls the creation, movement, and collision detection of bullets, interacting with the Bullet and other entities.

    Player: The Player class represents the player-controlled ship entity. It extends the Entity class and defines additional functionalities specific to the player, such as input handling and shooting bullets.

    GamePanel: The GamePanel class is the main game interface, extending JPanel and containing the JFrame. It sets up the game window, manages the game loop, and renders the game elements. It interacts with various entities and handles user input through KeyHandler.

    ImagePanel: The ImagePanel class provides a background image for the game. It adds visual aesthetics to the game environment.

    KeyHandler: The KeyHandler class handles keyboard inputs for the game. It listens for key events and triggers actions based on the user's input, such as moving the player's ship or shooting bullets.

    Main: The Main class is the entry point of the game. It initializes the game components, creates an instance of GamePanel, and starts the game loop.

**Interactions**
The components mentioned above interact with each other to create the Space Invaders game experience. Here's a brief overview of their interactions:

    The GamePanel sets up the game window and manages the game loop. It renders the game elements, including the player's ship, bullets, and enemy entities.
    
    The Player class handles user input and controls the movement of the player's ship. It interacts with the Entity class to update the ship's position and collision detection.
    
    The BulletController manages the creation, movement, and collision detection of bullets. It interacts with the Bullet and other entities to update their positions and handle collisions.
    
    The KeyHandler listens for keyboard inputs and triggers actions based on user commands. It communicates with the Player class to move the ship or shoot bullets.
    
    The ImagePanel provides a visual background for the game, enhancing the overall game environment.

**Controls**
Use the following controls to navigate and play the Space Invaders game:

    Move Left: Press the A key to move the space ship to the left.
    Move Right: Press the D key to move the space ship to the right.
    Move Up: Press the W key to move the space ship upward.
    Move Down: Press the S key to move the space ship downward.
    Shoot: Press the Space Bar to shoot bullets from the space ship.

Avoid enemy fire and strategically eliminate the incoming invaders to achieve the highest score!
