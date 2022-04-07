import java.util.ArrayList;

public class Main {

    private static final int[][] sudoku = {
    {5, 3 ,4 ,6 ,7 ,8 ,9 ,1 ,2},
    {6, 7 ,2 ,1 ,9 ,5 ,3 ,4 ,8},
    {1, 9 ,8 ,3 ,4 ,2 ,5 ,6 ,7},
    {8, 5 ,9 ,7 ,6 ,1 ,4 ,2 ,3},
    {4, 2 ,6 ,8 ,5 ,3 ,7 ,9 ,1},
    {7, 1 ,3 ,9 ,2 ,4 ,8 ,5 ,6},
    {9, 6 ,1 ,5 ,3 ,7 ,2 ,8 ,4},
    {2, 8 ,7 ,4 ,1 ,9 ,6 ,3 ,5},
    {3, 4 ,5 ,2 ,8 ,6 ,1 ,7 ,9}};


    public static void main(String[] args){

        boolean correct = true;

        for(int i = 0; i<9;i++) {
            if(!RowChecker(i) || !ColChecker(i)) {
                correct = false;
            }
        }

        System.out.println(correct);


    }

    public static boolean RowChecker(int row) { //this code will check if a value is repeated on a row
        ArrayList<Integer> tempRow = new ArrayList<>();
        for(int i = 0; i<9;i++) {
            if(!tempRow.contains(sudoku[row][i])) {
                tempRow.add(sudoku[row][i]);
            }
            else{return false;}
        }
        return true;
    }
    public static boolean ColChecker(int col) { //this code will check if a value is repeated on a column
        ArrayList<Integer> tempCol = new ArrayList<>();
        for(int i = 0; i<9;i++) {
            if(!tempCol.contains(sudoku[i][col])) {
                tempCol.add(sudoku[i][col]);
            }
            else{return false;}
        }
        return true;
    }
    public static boolean BoxChecker(int[][] board) { //this code will check if a value is repeated on a box

        return true;
    }


}
