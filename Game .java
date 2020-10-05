import java.util.Scanner;

public class Game {

    public static void main(String args[])  //main program
    {

        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("***** WELCOME IN GAME*******");
        System.out.println("Please enter your Name :");
        String name = sc.next();
        int level; int lastlevel;
        do {
            System.out.println("***** WELCOME IN GAME*******");   //main menu
            System.out.println("1.PLAY");
            System.out.println("2.Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("****** WELCOME IN LEVEL 1 " + name + " ********");   //starting of level1
                    level = obj.level1();
                    if (level!= 0)       //condition for going level2
                    {
                      lastlevel = obj.level2();
                        if(lastlevel!=0) // Condion going for level3
                        {
                            obj.level3();
                        }
                    }
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("you enter wrong input");
            }
        } while (choice != 0);
    }


    public static int level1()  // bulding level1
    {
        String want="y";
        int level=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("#### LEVEL 1 ####");
            System.out.println("what is the sum of 459+253");
            int sum = sc.nextInt();
            if (sum == 712) {
                System.out.println("You completed LEVEL 1 :)");
                level=+1;
                want = "n";
            } else {
                System.out.println("Sorry you lose the game  :(");
                System.out.println("Want to restart the level (y/n) :");
                want = sc.next();
            }
        } while (want.equals("y"));
        return level;
    }

    public int level2() //building level2
    {
        String want="y";
        int level=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("#### LEVEL 2 ####");
            System.out.println("what is the sum of 459+253");
            int sum = sc.nextInt();
            if (sum == 712) {
                System.out.println("You completed LEVEL 2 :)");
                level++;
                want = "n";
            } else {
                System.out.println("Sorry you lose the game  :(");
                System.out.println("Want to restart the level (y/n) :");
                want = sc.next();
            }
        } while (want.equals("y"));
        return level;     // here returning level(what;s the performance of user)
    }

    public void level3() // building level3
    {
        String want="y";
        int level=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("#### LEVEL 3 ####");
            System.out.println("what is the sum of 459+253");
            int sum = sc.nextInt();
            if (sum == 712) {
                System.out.println("You completed LEVEL 3 :)");
                want = "n";
            } else {
                System.out.println("Sorry you lose the game  :(");
                System.out.println("Want to restart the level (y/n) :");
                want = sc.next();
            }
        } while (want.equals("y"));
    }
    
    public void showName() {
        String name = " ";
        
        System.out.println(name);
    }
}  //Ending clss 
