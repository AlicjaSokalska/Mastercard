package mastercard;

public class string {
	//Function to reverse a string
    static void reverse(String string)
    {
    	//n is the number of elements in a string
     int n = string.length();
     //array of characters toCharArray converts to character array
     char []ch = string.toCharArray();
     //set temp
     char temp;
 
    // loops from first 
     //first swaps first and last , the second and second last
     for (int i=0, j=n-1; i<j; i++,j--)
     {// temp charaters in fist i 
         temp = ch[i];
         //first = last
         
         ch[i] = ch[j];
       //  last is now temp
         ch[j] = temp;
     }
         
      //prin character each loop
     System.out.println(ch);
    }
 
    //Driver program
    public static void main(String[] args) {
         //set string
        String string = "hello World";
         reverse(string);
    }

}
