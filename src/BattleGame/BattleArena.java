package BattleGame;

import java.util.Scanner;

public class BattleArena {
   private boolean GameOver = false;
   private int choice = 0;
   private double MonsterDamage;
   private double PlayerDamage;
   private boolean ManaUse = true;

    Player NewPlayer = new Player();
    Monster NewMonster = new Monster();
    WeaponAttack Sword = new WeaponAttack();
    MagicAttack FireBall = new MagicAttack();
    Scanner Input = new Scanner(System.in);


    public void printHealth() {

        System.out.println("############ New Round ############");
        System.out.println("Your Life is: " + NewPlayer.getHealth());
        System.out.println("Your Mana is: " + NewPlayer.getMana());
        System.out.println("Monster Life is: " + NewMonster.getHealth());

    }

    public void printAttackOptions() {

        System.out.println("Attack with Sword? Deals 7.0 to 9.0 Damage ( 1 )");
        System.out.println("Attack with Magic Spell called Fire Ball? Costs 10 Mana and deals 1.0 to 18.0 Damage ( 2 )");

    }


    public void NewBattle() {


        while (!GameOver) {

            printHealth();
            printAttackOptions();               // New Round

            while (true) {

                MonsterDamage = 0;
                PlayerDamage = 0;

                choice = Input.nextInt();


                if (choice == 1) {

                    MonsterDamage = Sword.Damage();
                    PlayerDamage = NewMonster.Damage();

                    System.out.println("Monster Got Damage: " + MonsterDamage);
                    NewMonster.setHealth(NewMonster.getHealth() - MonsterDamage);
                    if(NewMonster.getHealth()<=0) {

                        System.out.println("You Won");
                        GameOver = true;
                        break;
                    }
                    System.out.println("Monster Attacks!");
                    System.out.println("You Got Damage: " + PlayerDamage);
                    NewPlayer.setHealth(NewPlayer.getHealth() - PlayerDamage);
                    if(NewPlayer.getHealth()<=0) {

                        System.out.println("You Lost, Game Over!");
                        GameOver = true;
                        break;
                    }

                    break;



                } else if (choice == 2) {

                    if(ManaUse == false) {
                        System.out.println("Your Mana Credit is not Enough");
                        break;
                    }


                    MonsterDamage = FireBall.Damage();
                    PlayerDamage = NewMonster.Damage();

                    System.out.println("Monster Got Damage: " + MonsterDamage);
                    System.out.println("Monster Attacks!");
                    NewMonster.setHealth(NewMonster.getHealth() - MonsterDamage);
                    if(NewMonster.getHealth()<=0) {

                        System.out.println("You Won");
                        GameOver = true;
                        break;
                    }
                    System.out.println("You Got Damage: " + PlayerDamage);
                    NewPlayer.setHealth(NewPlayer.getHealth() - PlayerDamage);
                    NewPlayer.setMana(NewPlayer.getMana()-10);
                    if (NewPlayer.getMana()<10) {ManaUse = false;}
                    if(NewPlayer.getHealth()<=0) {

                        System.out.println("You Lost, Game Over!");
                        GameOver = true;
                        break;
                    }

                    break;


                } else {
                    System.out.println("Please Enter a Valid Number");
                }

            }

        }


    }


}
