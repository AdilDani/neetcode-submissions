class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(map.put(board[i][j], 1) != null){
                        return false;
                    }
                }
            }
            map.clear();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(map.put(board[j][i], 1) != null){
                        return false;
                    }
                }
            }
            map.clear();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                map.clear();
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        if(board[k+i*3][l+j*3]!='.'){
                            if(map.put(board[k+i*3][l+j*3], 1) != null){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    } 
}
