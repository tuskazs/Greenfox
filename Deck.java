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
import java.util.Random;

public class Deck {
    Random rand = new Random();
    int  n, m;
    private String colors[]= {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String values[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    int[] deckcards = new int[52];
    String[] cards;
    String top = "";
    Deck(int num){
        cards = new String[num];
        Init();
        Shuffle();
        top = Draw(num);
        System.out.println(top);
    }
    
    void Init(){
        for (int i = 0; i < deckcards.length ; i++){
	deckcards[i] = i;
        }
    }
	
    void Shuffle(){
       
		for ( int i = 0; i < deckcards.length; i++){
                int index = (int)(Math.random() * deckcards.length);
                int temp = deckcards[i]; //change a card with a random card
                deckcards[i] = deckcards[index]; 
                deckcards[index] = temp; 
	
		}
    }
	
    String Draw(int num){
       
		// set "num" of cards, and return (show) the top one
        for (int i = 0; i < num; i++){
                String color = colors[deckcards[i] / 13];
                String value = values[deckcards[i] % 13];

                cards[i] = (String)(value) + " " + (String) (color);
                
        }
       
        return cards[num-1];
               
    }
    
}
