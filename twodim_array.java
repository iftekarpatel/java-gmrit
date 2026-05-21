public class twodim_array {
    public static void main(String[] args) {
        int[][] arr = new int[3][4]; // Declare a 2D array with 3 rows and 4 columns
        System.out.println(arr.length); // Print the number of rows
        System.out.println(arr[0].length); // Print the number of columns
        
        // Print the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
