public class bubble_sort {
 public static void  main(String[] args) {
     int num[] = {10, 9, 8, 2, 7, 5, 4};
     int size = num.length;
     System.out.println("Before Sorting");
     for (int nums : num) {
         System.out.print(nums + " ");
     }
     System.out.println("After Sorting");
     for (int i = 0; i < size; i++) {
         int temp = 0;
         for (int j = 0; j < size - i - 1; j++) {
             if (num[j] > num[j + 1]) {
                 temp = num[j];
                 num[j] = num[j + 1];
                 num[j + 1] = temp;
             }
         }
         System.out.println("\nAfter pass " + (i + 1) + ":");
         for (int nums : num) {
             System.out.print(nums + " ");
         }
     }
     System.out.println("");
     for (int nums : num) {
         System.out.print(nums + " ");
     }
 }
}
