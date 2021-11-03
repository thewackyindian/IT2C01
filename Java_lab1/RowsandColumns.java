/**
 * Java Program to print the number of rows in the given two-dimensional array, or the length of the
 * outer array.Then print the number of columns, or the length of each inner array.to demonstrate how 
 * to loop over two-dimensional array.
 * 
 * @author : Raj Karan Singh Chhabra
 */
public class RowsandColumns {

    public static void main(String[] args)
    {
        String[][] arr = { {"hello","there","world"},
                            {"how","are","you"} };
        //TO PRINT NUMBER OF ROWS
        System.out.println("Number of  Rows: " + arr.length);

        // TO PRINT NUMBER OF COLUMNS
        System.out.println("Number of Columns: " + arr[0].length);
        

    }
}