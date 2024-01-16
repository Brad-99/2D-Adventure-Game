package main;

public class Game {

    private GameWindow gameWindow; // Creat an object gameWindow of GameWindow Class.
    private GamePanel gamePanel;

    // Constructor: Head method of this Game class, we run any code in here
    //
    public Game() {
        gameWindow = new GameWindow();
        gamePanel = new GamePanel();
    }

}
