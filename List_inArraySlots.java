/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    public int[] ArrayList;
    public int filledElements;
    public int capacity;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      capacity = 10;
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
        return result += ArrayList[i] + ", ";
      return result + "]";
}

    public boolean add( int value) {
      if (filledElements == ArrayList.length)
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
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
      }


}
