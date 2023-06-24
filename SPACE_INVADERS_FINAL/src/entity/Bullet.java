package entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Bullet extends Entity{
	
	GamePanel gp;
	KeyHandler keyH;
	
	private int x;
	private int y;
	
	
	
	public Bullet(int x, int y, GamePanel gp) {
		this.x = x;
		this.y = y;
		getBulletImage();
		
	}
	
	public void update() {
		y -= 10; 
	}
	
	public void getBulletImage() {
		try {
			bullet = ImageIO.read(getClass().getResourceAsStream("/player/200442b9509d362.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics2D g2) {
		
		BufferedImage image = bullet;
		
		g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
	}
	

}
