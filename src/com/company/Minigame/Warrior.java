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