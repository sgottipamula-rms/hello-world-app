/**
 * Created by sgottipamula on 2/14/17.
 */
public class FindUnion {

    int size;
    int[] arr;

    public FindUnion(int size) {
        this.size = size;
        arr = new int[size];

        //default it with index value
        for(int i=0; i<size; i++) {
            arr[i] = i;
        }
    }

    public void union(int startIndex, int endIndex) {
        int startVal = arr[startIndex];
        int endVal = arr[endIndex];
        arr[endIndex] = startVal;

        //replace endVal in nodes with startVal
        for(int i=0; i<size; i++) {
            if(arr[i] == endVal) {
                arr[i] = startVal;
            }
        }
    }

    public boolean find(int startIndex, int endIndex) {
        return arr[startIndex] == arr[endIndex];
    }
}
