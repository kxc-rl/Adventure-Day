package kenziec.jprinc.fin;

import java.util.Scanner;
public class Forest {
   public int game() {
       int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("You enter a forest with three of your closest friends. When nighttime comes around you go out to find some wood for a fire and you start to hear weird noises. Do you:");
        System.out.println("1. Continue looking for wood ");
        System.out.println("2. Run back to your friends and tell them");
        System.out.println("3. Start exploring");
        i = scan.nextInt();
        if (i == 1) {
            DeepWoods();
        }
        else if (i== 2) {
            Disappear();
        }
        else if (i == 3) {
            explore();
        }
        return 0 ;
       
   

    }
    public int DeepWoods(){
        System.out.print("You see stuff. Do you:"); 
        System.out.println("1.run");
        System.out.println("2. die");
        System.out.println("3. Scream");
      return -1;  
    }
    public int Disappear(){
         System.out.print("You run back to friends. Do you:"); 
        System.out.println("1.pretend nuthing happened");
        System.out.println("2. tell them");
        System.out.println("3. Scream");
        return -1;
    }
    public int explore(){
         System.out.print("You see something. Do you:"); 
        System.out.println("1.run towards it");
        System.out.println("2. run away from it");
        System.out.println("3. Scream");
        return -1;
    }
}

//3 Lives




