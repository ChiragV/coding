class LeetCode74Search2DMatrix 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row = matrix.length - 1;           
        int rowNumber = Integer.MAX_VALUE;
        if (row == 0) //if there is only one row, no point in checking row
        {
            rowNumber = 0;
        } 
        else 
        {
            for (int i = 0; i <= row; i++) 
            {
                if (matrix[i][0] > target ) 
                {
                    rowNumber = i - 1;
                    break;
                }
            }
        }
      
       //if target is greater than all row(row's first element)
        if (rowNumber == Integer.MAX_VALUE) 
            rowNumber = matrix.length - 1;
        //this case is when target is less than all row (row's first row's first element)
        if(rowNumber<0)
            return false;       
        
        //we know which row the element is, we just need to find which column
        
        for (int i = 0; i < matrix[0].length ; i++) {
           
            if (target == matrix[rowNumber][i]) {
                return true;
            }
        }
        
        return false;  
    }
}
