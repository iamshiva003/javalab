import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Total no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int largest = arr[0];

        for(int i=1; i<n; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }           
        }
        System.out.println("Largest element in Array is: " + largest);
    }    
}
