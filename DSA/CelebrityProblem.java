class CelebrityProblem {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
      for(int i = 0; i<mat.length; i++ )
        {
            boolean isUnknown = true; 
            for(int j=0;j<mat.length; j++)
            {
                if(mat[i][j] == 1)
                {
                    isUnknown= false;
                }
            }
            
            if(isUnknown)
                {
                    for(int k=0; k<mat.length; k++)
                    {
                        if(k!=i && mat[k][i] == 0) return -1;
                    }
                    return i;
                }
        }
        return -1;
        
    }
}
