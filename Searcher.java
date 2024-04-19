public class Searcher {
    public int linearSearch(int[] searchSpace, int searchTerm){
        // If the term is in the search space, find the index 
        // of the term. If it is not in the search space, 
        // return -1

        int i = 0;
    

        if (searchSpace == null) { 
            return -2; 
        } 
       
        while (i < searchSpace.length) { 
  
          
            if (searchSpace[i] == searchTerm) { 
                return i; 
            } 
            else { 

            i++;
                
            } 
        } 
        return -1; 
    }
}
