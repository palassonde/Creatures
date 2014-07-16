package tools;

public class Confrontation {

	/**
	 * @param args
	 */
	
	public static void attack(Creature a, Creature b){
		
		b.hp -= a.attack.damage();
	}
	
	public static Creature fight(Creature first, Creature second){
		
		Creature winner = new Creature();
		int turn = 0;
		
		while(first.hp >= 0 && second.hp >= 0){
			
			if(turn % 2 == 0)
			attack(first,second);
			else
			attack(second,first);
			
			turn++;
		}
		
		winner = first.hp > second.hp ? first : second;
		
		return winner;
	}
	
	public static void main(String[] args) {
		
		Creature a = new Creature("Armistide", 1);
		Creature b = new Creature("Deguerite", 2);

		System.out.print("The winner is : " + fight(a,b).name);
		
	}

}
