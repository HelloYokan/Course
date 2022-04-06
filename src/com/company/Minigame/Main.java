package com.company.Minigame;

abstract class Warrior {

    private final String name;
    private final String weapon;
    protected int hp;
    protected int medKit;


    public Warrior (String name, String weapon, int hp, int medKit) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.medKit = medKit;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHp() {
        return hp;
    }



    public abstract  boolean hasMedKit();

    public abstract boolean hasHp();

    public abstract  void hit(Warrior other);

    protected abstract void takeDamage(int damage);

    protected abstract void useMedKit();


}
class Rifleman extends Warrior{

    private final int damage;

    public Rifleman(String name, String weapon, int hp, int damage, int medKit) {
        super(name, weapon, hp, medKit);
        this.damage = damage;
        this.medKit = medKit;
    }

    public int getMedKit() {
        return medKit;
    }

    @Override
    public boolean hasMedKit() {
        return medKit > 0;
    }

    @Override
    public void hit(Warrior other) {
        other.takeDamage(damage);
    }

    @Override
    protected void takeDamage(int damage) {

        this.hp = this.hp - damage;
        System.out.println(getName() + " is hit!");
        System.out.println("HP of " + getName() + " : "  + this.hp);

    }

    public void useMedKit() {
        if (medKit > 0) {
            this.hp = hp + 300;
            medKit = medKit - 1;
            System.out.println(getName() + " just used medKit!\nNow his health is " + hp);
        }
    }

    @Override
    public boolean hasHp() {
        return hp > 0;
    }

    protected void getALLInfo() {
        System.out.println(getName() + " info: \nHP : " + getHp() + "\n" + "Weapon type : " + getWeapon() + "\n" + "MedKit amount:" + getMedKit() + "\n");
    }
}

class BazukaMan extends Warrior{

    private final int damage;

    public BazukaMan(String name, String weapon, int hp, int damage, int medKit) {
        super(name, weapon, hp, medKit);
        this.damage = damage;
        this.medKit = medKit;
    }

    public int getMedKit() {
        return medKit;
    }

    @Override
    public boolean hasMedKit() {
        return medKit > 0;
    }

    @Override
    public void hit(Warrior other) {
        other.takeDamage(damage);
    }

    @Override
    protected void takeDamage(int damage) {

        this.hp = this.hp - this.damage;
        System.out.println(getName() + " is hit!");
        System.out.println("HP of " + getName() + " : "  + this.hp);
    }

    public void useMedKit() {
        if (medKit > 0) {
            this.hp = hp + 300;
            medKit = medKit - 1;
            System.out.println(getName() + " just used medKit!\nNow his health is " + hp);

        }
    }

    @Override
    public boolean hasHp() {
        return hp > 0;
    }

    protected void getALLInfo() {
        System.out.println(getName() + " info: \nHP : " + getHp() + "\n" + "Weapon type : " + getWeapon() + "\n" + "MedKit amount:" + getMedKit() + "\n");
    }

}

class SecretAgent extends Warrior{

    private final int damage;

    public SecretAgent(String name, String weapon, int hp, int damage, int medKit) {
        super(name, weapon, hp, medKit);
        this.damage = damage;
        this.medKit = medKit;
    }

    public int getMedKit() {
        return medKit;
    }

    @Override
    public boolean hasMedKit() {
        return medKit >= 0;
    }

    @Override
    public void hit(Warrior other) {
        other.takeDamage(damage);
    }

    @Override
    protected void takeDamage(int damage) {

        this.hp = this.hp - this.damage;
        System.out.println(getName() + " is hit!");
        System.out.println("HP of " + getName() + " : "  + this.hp);
    }

    public void useMedKit() {
        if (medKit > 0) {
            this.hp = hp + 300;
        medKit = medKit - 1;
        System.out.println(getName() + " just used medKit!\nNow his health is " + hp);
    }
    }

    @Override
    public boolean hasHp() {
        return hp > 0;
    }

    protected void getALLInfo() {
        System.out.println(getName() + " info: \nHP : " + getHp() + "\n" + "Weapon type : " + getWeapon() + "\n" + "MedKit amount:" + getMedKit() + "\n");
    }

}



public class Main {
    public static void main(String[] args) {
    Rifleman rifleman = new Rifleman("Rifleman","rifle",1000,300,1);
    rifleman.getALLInfo();

    BazukaMan bazukaMan = new BazukaMan("Bazukaman", "bazuka",2000,600,1);
    bazukaMan.getALLInfo();

    SecretAgent secretAgent = new SecretAgent("SecretAgent","Sniper rifle", 900,700,2);
    secretAgent.getALLInfo();

    fight(rifleman,bazukaMan,secretAgent);
    }


    public static void fight(Warrior w1, Warrior w2, Warrior w3){
        System.out.println("FIGHT");
        while ((w1.hasHp() && w2.hasHp()) || (w1.hasHp() && w3.hasHp()) || (w2.hasHp() && w3.hasHp())) {
            if (w1.hasHp()) {
                if (w2.hasHp()) {
                    w1.hit(w2);
                }
                if (w3.hasHp()) {
                    w1.hit(w1);
                }
            }
            if (w2.hasHp()) {
                if (w1.hasHp()) {
                    w2.hit(w1);
                }
                if (w3.hasHp()) {
                    w2.hit(w3);
                }
            }

            if (w3.hasHp()) {
                if (w2.hasHp()) {
                    w3.hit(w2);
                }
                if (w1.hasHp()) {
                    w3.hit(w1);
                }
            }
            if (w1.hasMedKit()) {
                if (w1.hasHp()) {
                    w1.useMedKit();
                }
            }
            if (w2.hasMedKit()) {
                if (w2.hasHp()) {
                    w2.useMedKit();
                }
            }
            if (w3.hasMedKit()) {
                if (w3.hasHp()) {
                    w3.useMedKit();
                }
            }
        }
        if (!w1.hasHp() && !w2.hasHp()) {
            System.out.println("Winner is " + w3.getName());
        } else if (!w1.hasHp() && !w3.hasHp()) {
            System.out.println("Winner is " + w2.getName());
        } else {
            System.out.println("Winner is " + w1.getName());
        }
    }
}
