package Number;

public class ReverseSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array);
    }

    public void sort(int[] array){
        int temp;
        int length = array.length;;
        for (int i = 0;i < length / 2;i++){
            temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        System.out.print("反转排序后的内容:");
        showArray(array);
    }

    public void showArray(int[] array){
        for(int i : array){
            System.out.print(" " + i);
        }

        System.out.println();
    }
}
