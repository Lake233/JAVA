import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int num = 100000;
        int[] array = new int[num];
        for(int i = 0;i < num;i++){
            int j = (int)(Math.random()*num);
            array[i] = j;
        }
        long startTime1 = System.currentTimeMillis();
        bubbleSort(array);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Sort Type: Bubble Sort");
        System.out.println("Time: " + (endTime1 - startTime1) + "ms");
        int[] array2 = new int[num];
        for(int i = 0;i < num;i++){
            int j = (int)(Math.random()*num);
            array2[i] = j;
        }
        long startTime2 = System.currentTimeMillis();
        Arrays.sort(array2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Sort Type: Default Method");
        System.out.println("Time: " + (endTime2 - startTime2) + "ms");
        int[] array3 = new int[num];
        for(int i = 0;i < num;i++){
            int j = (int)(Math.random()*num);
            array3[i] = j;
        }
        long startTime3 = System.currentTimeMillis();
        quickSort(array3, 0, array.length-1);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Sort Type: Quick Sort");
        System.out.println("Time: " + (endTime3 - startTime3) + "ms");
    }
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
    public static int[] quickSort(int[] array,int start,int end){
        if (array.length < 1 || start < 0 || end >= array.length || start > end)
            return null;
        int i = start, j = end, index = array[i];
        while (i < j){
            while(i < j && array[j] >= index)
                j--;
            if(i < j)
                array[i++] = array[j];
            while(i < j && array[i] < index)
                i++;
            if(i < j)
                array[j--] = array[i];
        }
        array[i] = index;
        quickSort(array, start, i - 1);
        quickSort(array, i + 1, end);
        return array;
    }
}
