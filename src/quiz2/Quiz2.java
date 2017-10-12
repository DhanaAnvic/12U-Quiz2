/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author fabed2976
 */
public class Quiz2 {

    //create a string methos to return the word in reverse mode
    public String reverseString(String word){
        
        //create a Base Case
        //create an if statement that if  when the word length is 0, return it to the original word
        if(word.length() == 0){
            return word;
            
        } else {
            
        //Call in again the method
        //Return to the last letter and add it to the rest of the seperated word
        //And lastly print the word backwards
        return word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
    }
    }

    public static void main(String[] args) {
        
        // test out the boundaries
        Quiz2 test = new Quiz2();
        
        //print out the reverse string
        System.out.println(test.reverseString("cat"));
        System.out.println(test.reverseString("frog"));
        

}
}
