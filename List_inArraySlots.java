/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
	public int filledElements;
	public int[] ArrayList;
	public int capacity = 5;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
    	ArrayList = new int[capacity];
    }


    /** 
      @return the number of elements in this list
     */
     public int size() {
    	 return filledElements;
     }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
     public String toString() {
    	 String result = "[";
         for (int i = 0; i < filledElements; i++)
           result += ArrayList[i] + ", ";
         return result + "]";
     }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int value) {
    	  if (filledElements >= ArrayList.length)
    		  expand();
    	  ArrayList[filledElements] = value;
		  filledElements++;
    	  return true;
      }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
      private void expand() {
         System.out.println( "expand... (for debugging)");
         int[] newArrayList = new int[capacity * 2];
         for (int i = 0; i < filledElements; i++) {
        	 newArrayList[i] = ArrayList[i];
         }
         ArrayList = newArrayList;
         capacity *= 2;
            /* S.O.P. rules for debugging:
               Working methods should be silent. But during 
               development, the programmer must verify that 
               this method is called when that is appropriate.
               So test using the println(), then comment it out.
               */
      }
}