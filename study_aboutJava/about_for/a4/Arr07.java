package a4;

public class Arr07 {
    public static void main(String[] args) {
        int[] a=new int[10];
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*10)+1;
            sum=sum+a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        double avg=(double)sum/(double)a.length;
        System.out.println("avg= "+avg);
    }
}
