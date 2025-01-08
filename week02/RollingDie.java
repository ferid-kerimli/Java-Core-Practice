package week02;

public class RollingDie {
    public static void main(String[] args) {
        
        int res = rollDice();
        System.out.println("The result: " + res);
    }

    public static int rollDice( ) {

        double randomValue = Math.random();

        if(randomValue < 1.0 / 8.0){    // 0 to 1/8
            return 1;
        }
        else if(randomValue < 2.0 / 8.0){ // 1/8 to 2/8 
            return 2;
        }
        else if(randomValue < 3.0 / 8.0){ // 2/8 to 3/8
            return 3;
        }
        else if(randomValue < 4.0 / 8.0){ // 3/8 to 4/8
            return 4;
        }
        else if(randomValue < 6.0 / 8.0){ // 4/8 to 6/8, cause the probability of it is 1/4
            return 5;
        }
        else {  // 6/8 to 1
            return 6;
        }
     } 
 }