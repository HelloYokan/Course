package com.company.Minigame;

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
