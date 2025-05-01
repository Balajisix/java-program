import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be removed: ");
        int val = sc.nextInt();

        int newLength = removeElements(arr, val);

        System.out.println("Length: " + newLength);
        System.out.println("Modified Array");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static int removeElements(int[] arr, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(num != val){
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return list.size();
    }
}
