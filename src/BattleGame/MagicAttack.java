package BattleGame;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

class MagicAttack implements Attack {

    Random FireBall = new Random();

    @Override
    public double Damage() {
        double damage = 0;
        while (true) {


            if (damage >= 1 && damage <= 18) {
                break;
            } else damage = FireBall.nextDouble() * 20;


        }


        return BigDecimal.valueOf(damage).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
