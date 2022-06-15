import java.util.Scanner;

class ReadArray {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Total no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The elements in the Array are: ");
        for(int a:arr) {
            System.out.println(a);
        }
    }    
}
