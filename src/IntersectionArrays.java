import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the array2: ");
        int m = sc.nextInt();

        int arr2[] = new int[m];
        System.out.println("Enter the elements of the array2: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = intersect(arr1, arr2);

        System.out.println("Intersection of arrays");
        for (int val: result) {
            System.out.print(val + " ");
        }
    }

    public static int[] intersect(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}
