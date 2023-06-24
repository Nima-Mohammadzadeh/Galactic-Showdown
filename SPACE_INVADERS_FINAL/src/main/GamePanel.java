package main;
import java.awt.*;

import javax.swing.*;
import main.GamePanel;
import entity.BulletController;
import entity.Player;

public class GamePanel extends JPanel implements Runnable{
	
	//SCREEN SETTINGS
	final int originalTileSize = 16;  // 16x16 tile
	 
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // 48 *48 tile
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;   // 768 pixels
	final int screenHeight = tileSize * maxScreenRow;  // 576 pixels
	
	
	
	//FPS
	int FPS = 60;
	
	KeyHandler keyH  = new KeyHandler();
	Thread gameThread;
	
	Player player = new Player(this, keyH);
	
	
	
	// Set players default position
	int playerX = 5;
	int playerY = 525;
	int playerSpeed = 4;
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
	}
	
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
		
	}

	@Override
	public void run() {
		
		while (gameThread != null) {
			
			double drawInterval = 1000000000/FPS;
			double nextDrawTime = System.nanoTime() + drawInterval;
			
			
			// 1 Update: update information such as character positions
			update();
			
			
			// 2 Draw: draw the screen with the updated information
			repaint();
			
			try {
				
			double remainingTime = nextDrawTime - System.nanoTime();
			remainingTime = remainingTime/1000000;
			Thread.sleep((long) remainingTime);
			
			nextDrawTime += drawInterval;
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void update() {
		
		player.update();
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		player.draw(g2);
		
		g2.dispose();
		
	}

}
