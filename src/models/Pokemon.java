package models;

public class Pokemon {
    private short hp, attack;
    private Type type;

    public Pokemon(Type type,short hp, short attack) {
        this.type = type;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Pokemon" + type ;
    }

    public Pokemon() {};

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public short getHp() {
        return hp;
    }

    public void setHp(short hp) {
        this.hp = hp;
    }

    public short getAttack() {
        return attack;
    }

    public void setAttack(short attack) {
        this.attack = attack;
    }
}
