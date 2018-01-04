
package adventday6.pkg1;

import java.util.ArrayList;
import java.util.Collections;

public class AdventDay61 {

    public static void main(String[] args) {
        String input = "5	1	10	0	1	7	13	14	3	12	8	10	7	12	0	6";
        input=input.replace("	", ",");
        String[] splitString=input.split(",");
        ArrayList<Integer> mainArray = new ArrayList<>();       //
        for (int i = 0; i < splitString.length; i++) {          // String formatting stuff
            mainArray.add(Integer.parseInt(splitString[i]));    //
        }

        ArrayList<String> dupeArr=(solution(mainArray));    //Calling solution method to return a arraylist with 1 repeat 
        String toFind = dupeArr.get(dupeArr.size()-1); //Finding last elemnt of arraylist - there are 2 of that result in the list and no other repeats
        int pos = (dupeArr.indexOf(toFind));  //Finding pos of the first time the element appears - we already know it's the last element as well
        int repDiff = (dupeArr.size()-1)-pos;
        System.out.println("\nFINAL SOLUTION TO PART 2");
        System.out.println("     DIFFERENCE: "+repDiff);
    }
    
    public static ArrayList<String> solution(ArrayList<Integer> mainArray){
        ArrayList<String> memList = new ArrayList<>();  //Arraylist of strings to serve as 'memory' of past loops
        int cycles=0;   //Counting var for loop cycles 
        boolean repetition = false; //Flag for finding a dupelicate
        
        while(!repetition){ //While no repetition, keep going until you find one
            cycles++;   //Step increment 
            int maxIndex=max(mainArray); //returns array index of max val
            ArrayList<Integer> newList = adding(mainArray,maxIndex);    //Retuns new int arraylist of correctly added results
          //  mainArray=newList; Doesn't look like I need this like, but it seems to important to remove
          
        String toAdd="";
        for(int x=0; x<newList.size();x++){ //Creating string to add to memory arraylist
            toAdd=toAdd+","+newList.get(x); //Formatting correct strng for mem arraylist
            }
        for(int y=0; y<memList.size();y++){ //For the size of the memeory arraylist
            if(memList.get(y).equals(toAdd)){   //If there are 2 strings the same
                repetition=true;    //There's a repetition!
            }
        }
        
        memList.add(toAdd); //Adding reult to memory so when it's called again the memory knows what was just done
    }
        System.out.println("FINAL ANSWER FOR PART 1:");
        System.out.println("      CYCLES: "+cycles);  //Amount of cycles it's taken to find a repeate (Day 6-1)
    return memList; //Returning updated memory list - only happens if while loop is stopped due to a repetition being found
}
    
    
    public static ArrayList<Integer> adding(ArrayList<Integer> array, int maxIndex){
        int toAdd = array.get(maxIndex);    //Value of highest num in arraylist
        array.set(maxIndex, 0); //Setting current highest indedx to 0
        int i=1;    //Starting at 1 to move to the next index to the right
        
        while(toAdd!=0){    //While number to add still
           int validIndex = maxIndex+i;
           while(validIndex>=array.size()){ //while num too big, loop around until it's small enough
               validIndex=validIndex-array.size(); //hhmmm
           } 
           array.set(validIndex, array.get(validIndex)+1);  //Adding +1 to all values that are in range
           i++; //Increasing index mover
           toAdd--; //Decreasing amount left to add
        }
        return array;
    }
    
    public static int max(ArrayList<Integer> array){    // returns idex position of first occurance of highest num in arraylist
        ArrayList<Integer> occurance = new ArrayList<>();
           for(int i=0;i<array.size();i++){
            if(array.get(i).equals(Collections.max(array))){
                occurance.add(i);   //Adding all occurances of highest number
            }
        } 
        return occurance.get(0);  //Getting index position of first occurance of highest num in arraylist  
    }  
}
