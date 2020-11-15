package BattleGame;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Player {

    private double Health = 100;
    private double Mana = 35;

    public void setHealth(double health) {
        Health = health;
    }

    public void setMana(double mana) {
        Mana = mana;
    }

    public double getHealth() {
        return BigDecimal.valueOf(Health).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public double getMana() {
        return BigDecimal.valueOf(Mana).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
