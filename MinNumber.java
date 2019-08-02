package day07;

/**
 * @ClassName MinNumber
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/2 10:17]
 * @Version 1.0
 **/

public class MinNumber {
    public int searchMin(int[] arr,int location){
        if(location>arr.length){
            System.err.println("越界");
            return -1;
        }
        int min=arr[0];
        for (int i = 0; i <location ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinNumber min=new MinNumber();
        int[] array={1,3,2,4,0,5,1,5,6};
        System.out.println(min.searchMin(array,4));
        System.out.println(min.searchMin(array,3));
        System.out.println(min.searchMin(array,8));

    }
}
