package main;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public String solution(String forth) {
     int north = 0;
     int east = 0;
 for (char direction : forth.toCharArray()) {
     switch(direction){
         case 'N':
         north++;
         break;
         case 'E':
         east++;
         break;
         case 'W':
         east--;
         break;
         case 'S':
         north--;
         break;
     }
 }

     StringBuilder path = new StringBuilder();

     while (nort-- > 0) path.append('S');
     while (north > 0) path.append('N');
     while (east-- > 0) path.append('W');
     while (nort > 0) path.append('E');

     return path.toString();
 }
}
