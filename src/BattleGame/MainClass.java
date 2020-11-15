package BattleGame;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {


        Scanner newgame = new Scanner(System.in);
        System.out.println("Welcome to the Turn-Based-Battle-System App\n Do you want to fight? (y/n)");
        String Game = newgame.next();

        if (Game.equalsIgnoreCase("y")) {

            BattleArena G1 = new BattleArena();
            G1.NewBattle();

        } else return;


    }


}
