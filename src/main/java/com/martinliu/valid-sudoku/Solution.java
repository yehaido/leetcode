package com.martinliu.validsudoku;
import java.util.*;

/**
   Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
   1. Each row/column must have the numbers 1-9 occuring just once.
   2. And the numbers 1-9 must occur just once in each of the 9 sub-boxes of the grid.

   The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


   A partially filled sudoku which is valid.

   Note:
   A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
*/
public class Solution
{
    public boolean isValidSudoku(char[][] board) {
        if (null == board){
            return false;
        } else {
            for (int i = 0; i < board.length; i++) {
                int bitmapH = 0;
                int bitmapV = 0;
                for (int j = 0; j < board[i].length; j++) {
                    // rows
                    if (board[i][j] != '.'){
                        bitmapH = checkBitmap(board[i][j], bitmapH);
                        if (bitmapH == -1){
                            return false;
                        }
                    }
                    // columns
                    if (board[j][i] != '.'){
                        bitmapV = checkBitmap(board[j][i], bitmapV);
                        if (bitmapV == -1){
                            return false;
                        }
                    }
                    // subbox
                    if (i % 3 == 0 && j % 3 == 0){
                        int bitmap = 0;
                        for (int k = i; k < i + 3; k++) {
                            for (int g = j; g < j + 3; g++) {
                                if (board[k][g] != '.'){
                                    bitmap = checkBitmap(board[k][g], bitmap);
                                    if (bitmap == -1){
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private int checkBitmap(char c, int bitmap){
        int tmp = 1 << (c - 48 - 1);

        if ((bitmap & tmp) == 0){
            bitmap |= tmp;
            return bitmap;
        } else {
            return -1;
        }
    }
}
