package lab10;

public class GenericPrint {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
 public static void main(String[] args) {
     Integer[] array = {1,2,3,4};
     System.out.println(array);
     printArray(array);

     Double[] array2 = {1.1,2.2,3.3,4.4};
     System.out.println(array2);
     printArray(array2);

     Character[] array3 = {'A','B','C','D'};
     System.out.println(array3);
     printArray(array3);

     String[] array4 = {"Hello","World"};
     System.out.println(array4);
     printArray(array4);

 }
}
