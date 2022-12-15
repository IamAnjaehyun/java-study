package a4;

public class Arr08 {
    public static void main(String[] args) {
        int[][] a=new int[4][4];
        for(int i=1;i<=10;i++){
            int row=(int)(Math.random()*4);
            int col=(int)(Math.random()*4);
            int x=(int)(Math.random()*10)+1;
            while(a[row][col] != 0){
                row=(int)(Math.random()*4);
                col=(int)(Math.random()*4);
            }
            a[row][col]=x;
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
