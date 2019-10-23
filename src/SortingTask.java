public class SortingTask extends Task{

    private int[] vector;
    private AbstractSorter sorter;
    private SortMethod sortMethod;


    public SortingTask(String taskId, String description, int[] vector) {
        super(taskId, description);
        this.vector = vector;
        sorter = new AbstractSorter();
        sortMethod = SortMethod.BubbleSort;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public AbstractSorter getSorter() {
        return sorter;
    }

    public void setSorter(AbstractSorter sorter) {
        this.sorter = sorter;
    }

    public SortMethod getSortMethod() {
        return sortMethod;
    }

    public void setSortMethod(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    @Override
    public void execute() {

    }
}

enum SortMethod{
    BubbleSort,MergeSort;
}

class AbstractSorter{
    public int[] sort(int[] vector,SortMethod sort){
        if(sort == SortMethod.BubbleSort)
            return bubbleSort(vector);
        return mergeSort(vector,0,vector.length);
    }

    private int[] bubbleSort(int[] vector){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i =0 ;i < vector.length-1; i++){
                if(vector[i] > vector[i+1]){
                    isSorted = false;
                    int aux = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1]=aux;
                }
            }
        }
        return vector;
    }

    private int[] merge_arrays(int[] first,int[] second){

        int[] vector = new int[first.length + second.length];
        int dim=0;

        int i,j;
        i=j=0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j])
                vector[dim++] = first[i++];
            else
                vector[dim++] = second[j++];
        }

        while(i<first.length)
            vector[dim++] = first[i++];

        while(j<second.length)
            vector[dim++] = second[j++];

        return vector;

    }

    private int[] mergeSort(int[] vector,int start,int end){
        if(end>start){
            int mid = (start+end)/2;
            int first[] = mergeSort(vector,start,mid);
            int second[] = mergeSort(vector,mid+1,end);

            vector = merge_arrays(first,second);
        }
        return vector;
    }


}
