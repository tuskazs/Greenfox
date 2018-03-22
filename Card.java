/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Zsuzs
 */
public class Card {
    // there are 13 values, and 4 colurs, all together 52 cards.
    //clubs = treff (♣), diamonds = káró (♦), hearts= kör (♥) and spades =pikk (♠), 
    //ace, king, queen and jack (bubi)
    private String color[]= {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String value[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private String[] cards = new String[52];
    
    int k =0;
    
    Card(){ 
        for (int i=0; i<4; i++){
        for (int j=0; j<13; j++){
         
            cards[k] = (String)(value[j]) + " " + (String) (color[i]);
            System.out.println(cards[k]);
            k += 1;
        }
        }
    }
    String getCard(int m){
        return cards[m];
    }
    String[] getDeck(){
        return cards;
    }
    int length(){
        return cards.length;
    }
}
