import java.util.*;

public class Board {
    public boolean checkWon(int[][] board) {
        // write code here
        boolean a = true;
        for(int i = 0;i < board.length;i++) {
            a = true;
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j] == 0||board[i][j] == -1) {
                    a = false;
                }
            }
        }
        if(a==true) {return a;}
        for(int s = 0;s < board.length;s++) {
             a = true;
            for(int d = 0;d < board[s].length;d++){
                if(board[d][s] == 0||board[d][s] == -1) {
                    a = false;
                }
            }
        }
        if(a==true) {return a;}
        for(int k = 0;k < board.length;k++) {
            a = true;
            if(board[k][k] == 0||board[k][k] == -1){
                a = false;
            }
        }
        return a;
    }
}