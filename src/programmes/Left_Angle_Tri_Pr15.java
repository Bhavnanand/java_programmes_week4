package programmes;
/**Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class Left_Angle_Tri_Pr15 {
    public static void main (String args [])
    {
        int rows = 5;

        for(int j=1;j <= rows;j++){
            for(int i=1;i <= rows-j;i++){
                System.out.print("  ");
            }

            for(int k=1;k<=j; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
