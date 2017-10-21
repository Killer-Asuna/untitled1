public class main {
    public static void main(String[] args){
        int[] array = {1,8,6,7,5,3};
        main main = new main();
        main.sortArray(array);
    }
    private void showArray(int[] array){
        for (int i:array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private void sortArray(int[] array){
        int index;
        for (int i=1;i<array.length;i++){
            index = 0;
            for (int j=1;j<=array.length-i;j++){
                 if (array[j]>array[index]){
                     index = j;
                 }
            }
            int temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index] =temp;
        }
        showArray(array);
    }

}




