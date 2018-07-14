package project;

import java.util.Random;
import java.util.Arrays;

public class Main {

    /**
     * @param args
     */
    // public static void main(String[] args) {
    //     // TODO Auto-generated method stub
    //     System.out.println("Hello goorm!");
    // }
    
    public static void main(String[] args) {
        int[] result = new LottoGenerator().generate();
        System.out.println(Arrays.toString(result));
    }

}
