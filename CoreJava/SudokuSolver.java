package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] in = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solution.solveSudoku(in);
        Arrays.stream(in).forEach(x->System.out.println(Arrays.toString(x)));
    }
}


class Solution {
    //markers if the number is used in rows, cols and diags
    List<int[]> rows = new ArrayList<>();
    List<int[]> cols = new ArrayList<>();
    List<int[]> diags = new ArrayList<>();

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            rows.add(new int[9]);
            cols.add(new int[9]);
            diags.add(new int[9]);
        }

        //initialize based on the exising numbers
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];
                if (ch == '.') continue;
                int num = ch - '0';
                rows.get(row)[num - 1] = 1;
                cols.get(col)[num - 1] = 1;
                diags.get(row / 3 * 3 + col / 3)[num - 1] = 1;
            }
        }

        //start to fill out value
        fill(board, 0, 0);
    }

    boolean fill(char[][] board, int row, int col) {
        //the terminal one
        if (row == 9 && col == 0) {
            // System.out.println("find the answer");
            return true;
        }

        //the next cell to check
        int newCol = col + 1;
        int newRow = row;
        if (newCol >= 9) {
            newRow = row + 1;
            newCol = 0;
        }

        //it is a fixed number, then move on to the next
        if (board[row][col] != '.') {
            return fill(board, newRow, newCol);
        }

        //check each number
        for (int i = 0; i < 9; i++) {
            //if it is not used in row, col and diag, then we attemp to fix out this number into the cell
            if (rows.get(row)[i] == 0
                    && cols.get(col)[i] == 0
                    && diags.get(row / 3 * 3 + col / 3)[i] == 0) {

                board[row][col] = (char) ('0' + i + 1);
                rows.get(row)[i]++;
                cols.get(col)[i]++;
                diags.get(row / 3 * 3 + col / 3)[i]++;

                //recursion to the next cell
                //here we make sure once we find the answer, we keep
                //bubble it up.
                if (fill(board, newRow, newCol)) {
                    return true;
                }

                //backtrace. reset the attemp and start to attempt the next available number
                board[row][col] = '.';
                rows.get(row)[i]--;
                cols.get(col)[i]--;
                diags.get(row / 3 * 3 + col / 3)[i]--;
            }
        }
        return false;
    }
}