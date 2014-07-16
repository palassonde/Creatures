package tools;

import java.util.Random;

public class Attack {

	public int min;
	public int max;
	public float critChance;
	
	public Attack(){
		
		this.min = 1;
		this.max = 5;
	}
	
	public Attack(int min, int max){
		
		this.min = min;
		this.max = max;
	}

	public int damage() {
		
		 Random rand = new Random();
		 int damage = rand.nextInt((max - min) + 1) + min;
		 
		 

		 return damage;	
	}

}
