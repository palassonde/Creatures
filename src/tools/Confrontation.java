package tools;

import java.util.Random;

public class Confrontation {

	/**
	 * @param args
	 */
	
	public static boolean coinFlip(String choice){
		
		String coinFace;
		int result;
		
		Random rand = new Random();
		
		result = rand.nextInt(2);
		
		if(result == 0)
			coinFace = "heads";
		else
			coinFace = "tails";
		
		return coinFace == choice;
		
	}
	
	public static void attack(Creature a, Creature b){
		
		int hit = a.attack.damage();
		b.hp -= hit;
		System.out.print(a.name + " hits " + b.name + " for " + hit + " damage\n");
	}
	
	public static Creature fight(Creature first, Creature second){
		
		Creature winner;
		int turn = 0;
		
		while(first.hp >= 0 && second.hp >= 0){
			
			if(turn % 2 == 0)
			attack(first,second);
			else
			attack(second,first);
			
			turn++;
		}
		
		winner = first.hp > second.hp ? first : second;
		winner.victories++;
		return winner;
	}
	
	public static void main(String[] args) {
		
		
		// methode createCreature() en prenant les fichiers xml
		
		Creature a = new Creature("Armistide", 1);
		Creature b = new Creature("Deguerite", 1);
		
		Creature first;
		Creature second;
		
		
		// pourrait etre une methode pour juste savoir qui commence en premier
		if(coinFlip("tails")){
			first = a;
			second = b;
		}
		else{
			first = b;
			second = a;
		}
			
		for(int i = 0; i<1000; i++){
			
			//System.out.print("The winner is : " + fight(a,b).name + "\n");
			fight(first,second);
			a.resurrect();
			b.resurrect();
		}
		
		
		System.out.print(a.name + " Won " + a.victories + " times\n");
		System.out.print(b.name + " Won " + b.victories + " times\n");
		
	}

}
