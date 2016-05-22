import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// RAFAEL LI CHEN
public class Simulation {
    public static void main(String[] args) throws InterruptedException {
        Earth earth=new Earth();
        earth.initializeEarth();
        earth.growGrass();
        int round=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of cycles:");
        int time=input.nextInt();
        System.out.println("Initial state:");
        earth.printEarth();
        while(true) {
            earth.resetAttribute();
            earth.growGrass();
            earth.Eat();
            earth.Move();
            earth.Eat();
            earth.Reproduce();
            earth.Time();
            earth.Die();
            round+=1;
            System.out.println("Cycle: "+round);
            time-=1;
            if(earth.Count()) break;
            if(time<=0) break;
            earth.printEarth();
            Thread.sleep(400);
        }
        earth.printEarth();
        System.out.println("Simulation Ended");
    }
}
