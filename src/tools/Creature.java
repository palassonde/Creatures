package tools;

public class Creature {
	
	public String name;
	public int hp;
	public Attack attack;
	
	public Creature(){
		
		this.name = "Bastard";
		this.hp = 20;
		this.attack = new Attack();
	}
	
	public Creature(String name, int attack){
		
		this.name = name;
		this.hp = 20;
		this.attack = new Attack();
	}
	
	public Creature(String name, int hp, int attack){
		
		this.name = name;
		this.hp = hp;
		this.attack = new Attack();
	}

}
