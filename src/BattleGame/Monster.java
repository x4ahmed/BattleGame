package BattleGame;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

class Monster implements Attack {

    Random MonsterDamage = new Random();

    private double Health = 100;

    public void setHealth(double health) {
        Health = health;
    }

    public double getHealth() {
        return BigDecimal.valueOf(Health).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public double Damage() {
        double damage = 0;
        while (true) {


            if (damage >= 1 && damage <= 10) {
                break;
            } else damage = MonsterDamage.nextDouble() * 50;


        }


        return BigDecimal.valueOf(damage).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
