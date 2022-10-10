package mastercard;

public class main {
	
	public static int getFrequent(int[] x)
	{
	  int count = 1, tempCount;
	  int mostFreq = x[0];
	  int temp = 0;
	  //cycle through the lenght of the array
	  for (int i = 0; i < (x.length - 1); i++)
	  {
	    temp = x[i];
	    tempCount = 0;
	    //cycle through loop
	    for (int j = 1; j < x.length; j++)
	    {//if temp number ==to the element in array x
	      if (temp == x[j])
	        tempCount++;
	    }
	    //if the temp count is bigger than the counter
	    if (tempCount > count)
	    {// the most frequent == to temp number 
	    	//count == temp counter
	     mostFreq = temp;
	      count = tempCount;
	    }
	  }
	  return mostFreq;
	}
	
	public static void main(String[] args) {
	    System.out.println(getFrequent(new int[]{1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6,7,7,7,7,4,5,5,5,5,5}));
	}
	}