/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shiftword;

import java.util.ArrayList;

/**
 *
 * @author ryota
 */
public class Main {
    
    public static void shift(String word,int num){
        //String result="";
        int letter_length = 26;
        
        ArrayList<Character> result = new ArrayList<Character>();

        for (int i = 0; i < word.length(); i++) {
            int str_num = (int)word.charAt(i);
            if(str_num>=65 && str_num<=90){
                int final_num = str_num+num;
                int op = final_num%90;
                if(op<65){
                    int add_num = 64+op;
                    char new_str = (char)add_num;
                    result.add(new_str);
                }
                else{
                    char new_str = (char)op;
                    result.add(new_str);
                }
            }
            
            else if(str_num>=97 && str_num<=122){
                int final_num = str_num+num;
                int op = final_num%122;
                if(op<97){
                    int add_num = 96+op;
                    char new_str = (char)add_num;
                    result.add(new_str);
                }
                else{
                    char new_str = (char)op;
                    result.add(new_str);
                }
            }
            
            else if(str_num == 32){
                result.add(' ');
            }
            
            
            //word.charAt(i);
            //System.out.println((char)final_num);
            
            
            
            
            
            
            
        }
        
        for(char a:result){
            System.out.print(a);
        }
        
        //return result;
    }
    public static void main(String[] main){
        shift("ZZZZ ",13);
        //a -> 97
        //A -> 65
        //Z -> 90
        //z -> 122
        
        //exemple : 80+15 = 95%90
        //char c = ' ';
        //System.out.println((int)c);
        //System.out.println((int)c);
    }
}