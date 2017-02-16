package datatypes.findunion;

/**
 * Created by sgottipamula on 2/15/17.
 */
public class QuickUnion {
    int size;
    int arr[];

    public QuickUnion(int size) {
        this.size = size;
        arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = i;
        }
    }

    public int root(int index) {
        while(index != arr[index]) {
            index = arr[index];
        }

        return index;
    }

    public boolean find(int startIndex, int endIndex) {
        return root(startIndex) == root(endIndex);
    }

    public void union(int startIndex, int endIndex) {
        int startIndexRoot = root(startIndex);
        int endIndexRoot = root(endIndex);

        arr[startIndexRoot] = endIndexRoot;
    }
}
