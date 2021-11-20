/*
This is matrix search problem. So we need to use either DFS or BFS. This is more of DFS problem. 
First double loop and find first char and cal dfs() function. in function pass word and it's index. 
If index and word length same; we are done. 
put standard boundry checks, 
and change current char to something else like blank so we don't visit same char again, 
go all four direction and do || and return boolean answer. before that change character again.

*/
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
