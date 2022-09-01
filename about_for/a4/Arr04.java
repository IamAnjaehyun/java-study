package a4;

public class Arr04 {
    public static void main(String[] args) {
        int[][] a=new int[5][];
        a[0]=new int[1];
        a[1]=new int[3];
        a[2]=new int[1];
        a[3]=new int[4];
        a[4]=new int[2];

        a[0][0]=1;
        a[1][0]=1;
        a[1][1]=2;
        a[1][2]=3;
        a[2][0]=1;
        a[3][0]=1;
        a[3][1]=2;
        a[3][2]=3;
        a[3][3]=4;
        a[4][0]=1;
        a[4][1]=2;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
