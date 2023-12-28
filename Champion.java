package desafios_propostos;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion() {
			
	}
	
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion champion) {
	    if (getLife() > 0 && champion.getLife() > 0) {
	        int damage = Math.max(1, champion.getAttack() - this.armor);

	        this.life = Math.max(0, getLife() - damage);
	    }
	}

	
	public String status() {
		String status;
		
		if(this.life > 0) {
			status = name + ": " + life + " de vida";
		} else {
			status = name + ": " + life + " de vida (morreu)";
		}
		return status;
		 
	}
	
	public String toString() {
		return name + ", "
				+ life + " de vida, "
				+ attack + " de ataque, "
				+ armor + " de armadura";
	}	
	

}
