public class Main {
    public static void main(String[] args) {

        int[] arr1 = {5,1,5,5,16,61,111};
        int[] arr2 = {4,2,4,5,6};
        arr1 = SortArray(arr1);
        arr2 = SortArray(arr2);
        int[] arrFinal = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrFinal[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrFinal[arr1.length + i] = arr2[i];
        }
        SortArray(arrFinal,false);
        System.out.println("First arr : ");
        for (int a:arr1
        ) {
            System.out.println(a);
        }
        System.out.println("Second arr : ");
        for (int a:arr2
        ) {
            System.out.println(a);
        }
        System.out.println("Result : ");
        for (int a:arrFinal
             ) {
            System.out.println(a);
        }
    }

    public static int[] SortArray(int[] arr1){
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return removeDuplicates(arr1);
    }
    public static int[] SortArray(int[] arr1,boolean choice){
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return choice ? removeDuplicates(arr1) : arr1;
    }

    public static int[] removeDuplicates(int[] arr){
        int temp = 0;
        int count = 0;
        arr[temp] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[temp] != arr[i]){
                temp++;
                arr[temp] = arr[i];
                count++;
            }
        }
        int[] result = new int[count + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
