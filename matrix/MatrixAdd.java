import java.util.Scanner;

class Matrix {

    int row, col;
    int mat1[][] = new int[10][10];
    int mat2[][] = new int[10][10];
    int res[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);

    void read() {
        System.out.println("Enter the Row and Column of the Matrix: ");
        row = scan.nextInt();
        col = scan.nextInt();

        System.out.println("Enter the Matrix 1 Elements: ");
        for(int i=0; i<row; i++) 
            for(int j=0; j<col; j++)
                mat1[i][j] = scan.nextInt();

        System.out.println("Enter the Matrix 2 Elements: ");
        for(int i=0; i<row; i++) 
            for(int j=0; j<col; j++)
                mat2[i][j] = scan.nextInt();
    }

    void display() {
        System.out.println("Addition two Matrices is: ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    void add() {
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                res[i][j] = mat1[i][j] + mat2[i][j];
                
    }
}

class MatrixAdd {
    public static void main(String[] args) {
        
        Matrix m = new Matrix();

        m.read();
        m.add();
        m.display();
    }
}