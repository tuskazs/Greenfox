/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageodd;
import java.util.Scanner;
/**
 *
 * @author Zsuzs
 */

public class AverageOdd {
    static double x;
    /**
     * @param args the command line arguments
     */
    public static double Average(int[] parameter){
        double j =0, m=0;
        double k = 0;
        for (int i=0; i< parameter.length; i++){
            if /*if Odd*/ (parameter[i]%2 ==1 || parameter[i]%2 == -1) {
                j = j+ parameter[i]; //ha páratlan, akkorj-ben tárolom a páratlan számok összegét
                m = m+1; //ha páratlan, akkor m-ban tárolom a páratlan számok darabszámát
            }
        }
        k = j/m; //átlgérték = számok összege oszta a számukkal
        return k;
    
    }   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {2,3,5,7,11,8}; // (3+5+7+11)/4 = 26/4 =6
        int[] array2 = {-1, 0, 0, 1,13,21,2};
    
        x = Average(array2);
        System.out.println(x);
    }
    
}
