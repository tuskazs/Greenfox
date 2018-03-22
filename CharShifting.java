/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charshifting;
import java.util.Scanner;
/**
 *
 * @author Zsuzs
 */
public class CharShifting {

    public static String Convert(String text){
        int occur = 0;
        String help ="";        // segéd string, ebbe mentjük el a konvertált stringet
        char [] chars = null;   // segéd "string"
        char firstChar;         //az első karakter
        help = text.toLowerCase();
        chars = help.toCharArray();
      
        firstChar = chars[0];
        for (int i =0; i< chars.length; i++){   //megszámoljuk, hányszor szerepel az első karakter az inputban
            if (firstChar == chars[i]) {
                occur += 1;
            }
        }
        for (int i=0; i < chars.length; i++){     //eltoljuk az előfordulás számával a karaktereket
           if (help.charAt(i)>= 97 && help.charAt(i) <= 122){ // ha nem speciális karakter
                if (help.charAt(i) == 122){                   // ha a karakterünk z betű, akkor vissza az abc elejére
                    chars[i] = (char) (occur-1+97);
                } else
                {                                             // ha nem z betű, akkor normál eltolás
                    chars[i] = (char) (occur + chars[i]);
                    System.out.println(chars[i]);
                }
            
            }
        }
       
        help = String.valueOf(chars); // a karakter tömbünket vissza másolom a stringbe, amit vissza akarok adni
        
        return help;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String orig_text ="";
        Scanner input = new
                Scanner(System.in);     //beolvasunk egy karakter sorozatot
        orig_text = input.nextLine();
        String final_text = "";
        final_text = Convert(orig_text);
        System.out.println(orig_text);  // kiíratjuk az eredeti szöveget / inputot
        System.out.println(final_text); // liíratjuk a konvertált szüveget
    }
    
}
