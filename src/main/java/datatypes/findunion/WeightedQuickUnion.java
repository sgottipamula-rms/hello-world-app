package datatypes.findunion;

/**
 * Created by sgottipamula on 2/15/17.
 */
public class WeightedQuickUnion {
    int size;
    int arr[];
    int weight[];

    public WeightedQuickUnion(int size) {
        this.size = size;
        arr = new int[size];
        weight = new int[size];
        
        for(int i=0; i<size; i++) {
            arr[i] = i;
            weight[i] = 1;
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

        if(weight[startIndexRoot] <= weight[endIndexRoot]) {
            arr[startIndexRoot] = endIndexRoot;
            weight[startIndexRoot] += weight[endIndexRoot];
        } else {
            arr[endIndexRoot] = startIndexRoot;
            weight[endIndexRoot] += weight[startIndexRoot];
        }
    }
}
