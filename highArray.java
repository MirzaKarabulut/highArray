// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
   //-----------------------------------------------------------
   
   public boolean duplicatesExistAtRight(int k)
   {
     if (k < 0 || k >= nElems) {
      System.out.println("Error: Parameter is out of bounds.");
      return false;
     }
     int i = k + 1;
     while (i < nElems) {
       if (a[k] == a[i]) {
         return true;
       }
       i++;
     }
     return false;
   }
   
   public boolean duplicatesExistAtLeft(int k)
   {
     if (k < 0 || k >= nElems) {
        System.out.println("Error: Parameter is out of bounds.");
       return false;
     }
     int i = k - 1;
     while (i >= 0) {
       if (a[k] == a[i]) {
         return true;
       }
       i--;
     }
     return false;
   }
   
   // bunlarda sıkıntı var
   public void markDuplicatesAtRight(int k)
   {
     if (k < 0 || k >= nElems) 
     {
       System.out.println("Error: Parameter is out of bounds.");
       return;
     }
     int i = k + 1;
     while (i < nElems) 
     {
       if (a[k] == a[i]) {
         a[i] = -1;
       }
       i++;
     }
   
    }

   public void markDuplicatesAtLeft(int k)
   {
     if (k < 0 || k >= nElems) 
     {
        System.out.println("Error: Parameter is out of bounds.");
        return;
      }
     int i = k - 1;
     while (i >= 0) {
       if (a[k] == a[i]) {
         a[i] = -1;
       }
       i--;
     }
   }
   
   public void removeDuplicates1()
   {
     System.out.println("A new array in which repeated elements are deleted:");
     int i, j;
     i = 0;
     while (i < nElems) {
       j = i + 1;
       while (j < nElems) {
         if (a[i] == a[j]) {
           delete(a[j]);
         }
         j++;
       }
       i++;
     }
   }
   
   public void removeDuplicates2()
   {
     System.out.println("A new array in which repeated elements are deleted:");
     int i, j;
     i = nElems - 1;
     while (i > 0) {
       j = i - 1;
       while (j >= 0) {
         if (a[i] == a[j]) {
           delete(a[j]);
         }
         j--;
       }
       i--;
     }
   }

   public void removeDuplicates3()
   {
     int i = 0;
     int j = 0;
     while (i < nElems) {
       if (a[i] == -1) {
         i++;
         continue;
       }
       markDuplicatesAtRight(i);
       i++;
     }

     i = 0;
     while (i < nElems) {
       if (a[i] != -1) {
         a[j] = a[i];
         j++;
       }
       i++;
     }
     nElems = j;
   }
   
   public void removeDuplicates4()
   {
     int i = nElems - 1;
     int j = 0;
     while (i >= 0)
     {
       if (a[i] == -1) {
         i--;
         continue;
       }
       markDuplicatesAtLeft(i);
       i--;
     }
     
     i = 0;
     while (i < nElems)
     {
       if (a[i] != -1) {
         a[j] = a[i];
         j++;
       }
       i++;
     }
     nElems = j;
   }

   public boolean find(long searchKey)
      {                              // find specified value
      int j;
      for(j=0; j<nElems; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // end class HighArray
////////////////////////////////////////////////////////////////