public class Searcher {
    public int linearSearch(int[] searchSpace, int searchTerm){
        // If the term is in the search space, find the index 
        // of the term. If it is not in the search space, 
        // return -1
        for(int i=0; i<searchSpace.length; i++){
            if(searchSpace[i]==searchTerm){
                return i;
            }
        }
        return -2;
    }
}
