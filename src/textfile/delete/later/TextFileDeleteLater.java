/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfile.delete.later;

import java.util.Scanner;

/**
 *
 * @author ardol7945
 */
public class TextFileDeleteLater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x[] = new int[2000];
       int x1[] = new int[4];
       int harambeX = 7;
       for(int h =0;h<=4; h++){
           x1[h] = input.nextInt();
           x[x1[h]] = x1[h];
       }
       
       for(int p = 0; p<= harambeX; p++){
           int newHarambe = harambeX - p;
           if(x[newHarambe] == newHarambe){
              
           }
       }
     
    
      
       
       
       
       
       
       
       
       
       
       
       // TODO code application logic here
    }
    
}
