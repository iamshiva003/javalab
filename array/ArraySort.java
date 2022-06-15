import java.util.Scanner;

class ArraySort {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Total no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        int temp;

        for (int j=1; j<n; j++) {
            for (int i=0; i<n-j; i++) {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        System.out.println("The elements after Sorting: ");
        for(int a:arr) {
            System.out.println(a);
        }
    }    
}
