import java.util.Random;
public class Main {

    public static void main(String[] args){
        new Main();
    }
    public Main(){
        Random r = new Random();
        int searchSpaceSize = 1000;
        int maxValue = searchSpaceSize;
        int[] searchSpace = new int[searchSpaceSize];
        for(int i=0;i<searchSpace.length;i++){
            searchSpace[i] = r.nextInt(maxValue);
            System.out.println("Item " + i + " is " + searchSpace[i]);
        }
        int searchTerm = 0;
        if(r.nextBoolean()){
            searchTerm = searchSpace[r.nextInt(searchSpace.length)];
        } else {
            searchTerm = r.nextInt(maxValue);
        }
        Searcher s = new Searcher();
        int index = s.linearSearch(searchSpace, searchTerm);
        if(index<0){
            System.out.println("The term " + searchTerm + " is not in the search space");
        } else {
            System.out.println("The term " + searchTerm + " is at position " + index + " in  the search space");
        }
    }
}
