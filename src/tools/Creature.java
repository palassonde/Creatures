package tools;

public class Creature {
	
	public String name;
	public int hp;
	public int initialHp;
	public Attack attack;
	public int victories;
	
	public Creature(){
		
		this.name = "Bastard";
		this.hp = 20;
		this.attack = new Attack();
		this.victories = 0;
		this.initialHp = hp;
	}
	
	public Creature(String name, int attack){
		
		this.name = name;
		this.hp = 20;
		this.attack = new Attack();
		this.victories = 0;
		this.initialHp = hp;
	}
	
	public Creature(String name, int hp, int attack){
		
		this.name = name;
		this.hp = hp;
		this.attack = new Attack();
		this.victories = 0;
		this.initialHp = hp;
	}

	public void resurrect() {

		this.hp = this.initialHp;
	}

}
