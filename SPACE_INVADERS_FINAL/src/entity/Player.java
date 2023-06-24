package entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{
	
	GamePanel gp;
	KeyHandler keyH;
	
	public Player(GamePanel gp, KeyHandler keyH) { 
		this.gp = gp;
		this.keyH = keyH;
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues() { 
		x = 5;
		y = 525;
		speed = 4;
	}
	
	public void getPlayerImage() {
		
		try {
			ship = ImageIO.read(getClass().getResourceAsStream("/player/toppng.com-layer-space-ship-space-ship-png-pixel-art-301x281.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() { 
		
		if (keyH.leftPressed == true) {
			x -= speed;
		}
		else if(keyH.rightPressed == true) {
			x += speed;
		}
	}
	
	public void draw(Graphics2D g2) {
		
		BufferedImage image = ship;
		
		g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
		
	}

}
