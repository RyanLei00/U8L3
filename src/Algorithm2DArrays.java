import java.util.ArrayList;

public class Algorithm2DArrays
{
    public static boolean isFound(int[][] arr, int target)
    {
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(arr[r][c] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int count = 0;
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
               if(!(arr[r][c].indexOf(searchStr) == -1))
               {
                   count++;
               }
            }
        }
        return count;
    }

    public static void replaceEvensWithZero(int[][] arr)
    {
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(arr[r][c] %  2 == 0)
                {
                    arr[r][c] = 0;
                }
            }
        }
    }

    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for(int c = 0; c < arr[0].length; c++)
        {
            sum += arr[row][c];
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for(int r = 0; r < arr.length; r++)
        {
            sum += arr[r][col];
        }
        return sum;
    }

    public static int[][] printNumberGrid(int rows, int cols)
    {
        int count = 0;
        int[][] arr = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                arr[r][c] = count;
                System.out.print(arr[r][c] + " ");
                count++;
            }
            System.out.println();
        }
        return arr;
    }

    public static String[][] gridOfXandO(int n)
    {
        String[][] arr = new String[n][n];
        for(int r = 0; r < n; r++)
        {
            for(int c = 0; c < n; c++)
            {
                if((c + r) % 2 == 0)
                {
                    arr[r][c] = "X";
                }
                else
                {
                    arr[r][c] = "O";
                }
            }
        }
        return arr;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    {
        ArrayList<String> arr = new ArrayList<String>();
        for(int r = 0; r < wordChart.length; r++)
        {
            for(int c = 0; c < wordChart[0].length; c++)
            {
                if(wordChart[r][c].length() == len)
                {
                    arr.add(wordChart[r][c]);
                }
            }
        }
        return arr;
    }

}