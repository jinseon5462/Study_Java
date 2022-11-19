package p20221031_inheritance;

public class Enermy extends Unit {
    Enermy(int energy){
        super(energy);
    }

    @Override
    void attack(Unit unit) {
        super.attack(unit);
    }
}