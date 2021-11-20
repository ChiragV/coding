class Leetcode77WordSearch {
    public boolean exist(char[][] board, String word) 
    {
        //is this BFS or DFS ? =>DFS
        //DFS means recursion
        
        // first find first letter
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(word.charAt(0)==board[i][j])          
                    if(dfs(board,i,j,0,word))
                        return true;                
            }
        }
        return false;
        
    }
    
    private boolean dfs(char[][] board,int i,int j,int count,String word)
    {
       
        //when I need to stop?
        if(word.length()==count) 
        return true;
        
        if(i>=board.length||i<0||board[0].length<=j||j<0 || board[i][j]!=word.charAt(count))
        {
            return false;
        }
       
        char ch=board[i][j];
        board[i][j]=' ';//change something else so we don't take same char again
        boolean found=
            dfs(board,i+1,j,count+1,word)||
            dfs(board,i-1,j,count+1,word)||
            dfs(board,i,j+1,count+1,word)||
            dfs(board,i,j-1,count+1,word);
        board[i][j]=ch; //backtrack
        
        return found;//final answer
    }
}