package p20221031_inheritance;

public class Unit {
    int energy;

    Unit(int energy){
        this.energy = energy;
    }

    void attack(Unit unit){
        if(unit instanceof Enermy) {
            unit.energy -= 10;
        }
    }
}