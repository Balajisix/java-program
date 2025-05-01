import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = removeDuplicates(arr);
        System.out.println(result);
        sc.close();
    }

    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) return 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return list.size() + 1;
    }
}
