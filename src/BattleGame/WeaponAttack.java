package BattleGame;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

class WeaponAttack implements Attack {

    Random Sword = new Random();

    @Override
    public double Damage() {

        double damage = 0;
        while (true) {


            if (damage >= 7 && damage <= 9) {
                break;
            } else damage = Sword.nextDouble() * 10;


        }


        return BigDecimal.valueOf(damage).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
