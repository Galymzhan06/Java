public class Task16 {

    public static int maxX(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++)
            if(array[i]>max) max=array[i];
        return max;
    }

    public static void main(String[] args){
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=(int)(Math.random()*100);

        System.out.println("Максималды элемент: "+maxX(arr));
    }
}