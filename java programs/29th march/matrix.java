class matrix
{
    
    int rowWithMax1s(int arr[][], int n, int m)
    {
        int col=m-1;
        int row=0;
        //Traversing row by row
        for(int i=0;i<n;i++)
        {
            //last column to first
            for(int j=col;j>=0;j--)
            {
                if(arr[i][j]==1)
                {
                    row=i;
                    //we will not see same column again
                    col--;
                }
                //if you see zero 0 thenskip that row
                else{
                    break;
                }
            }

        }
        return row;
    }
}