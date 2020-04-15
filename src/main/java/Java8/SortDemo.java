package Java8;

import java.util.Arrays;
import java.util.Random;

public class SortDemo {
    public static void main(String[] args) {
//        int[] arr = new int[]{10,3,6,4,5,2,1,9,8,7,0};
        int[] arr = generalseek(100000);
//        int[] arr  = new int[]{3,5,7,9,4,6,1};
        //必须分开测试才能有效
        Long start = System.currentTimeMillis();


        arr = kuaisu(arr,0,arr.length-1);

        //arr = maopao(arr); 优化排序
//        arr = maopao2(arr);  //优化冒泡排序

        Long end = System.currentTimeMillis();
        System.out.println((end-start)+":"+Arrays.toString(arr));
    }

    private static int[] generalseek(int len){
        int[] arr = new int[len];
        Random random = new Random();
        while(len-->0){
            arr[len] = random.nextInt(arr.length);
        }
        return arr;
    }
    private static int[] maopao(int[] arr){
        int temp ;
        int flag = 0 ;
        int k = arr.length-1;
        int pos;
        for(int i=0;i<arr.length-1;i++){
            flag = 0;
            pos = 0;
            for(int j=0;j<k;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                    pos = j;
                }
            }
            if(flag==0){
                break;
            }
            k = pos;
        }
        return arr;
    }
    private static int[] maopao2(int[] arr){
        int i = 0;
        int j = 0;
        int n = 0;//同时找最大值的最小需要两个下标遍历
        int flag = 0;
        int pos = 0;//用来记录最后一次交换的位置
        int k = arr.length - 1;
        for (i = 0; i < arr.length - 1; i++)//确定排序趟数
        {
            pos = 0;
            flag = 0;
            //正向寻找最大值
            for (j = n; j < k; j++)//确定比较次数
            {
                if (arr[j]>arr[j + 1])
                {
                    //交换
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = 1;//加入标记
                    pos = j;//交换元素，记录最后一次交换的位置
                }
            }
            if (flag == 0)//如果没有交换过元素，则已经有序,直接结束
            {
                break;
            }
            k = pos;//下一次比较到记录位置即可
            //反向寻找最小值
            for (j = k; j > n; j--)
            {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                flag = 1;
            }
            n++;
            if (flag == 0)//如果没有交换过元素，则已经有序,直接结束
            {
                break;
            }
        }
        return arr;
    }

    public  static int[] kuaisu(int[] arr,int start,int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(pivot+":"+Arrays.toString(arr));
        }
        System.out.println("------------------");
        if (i-1>start) arr=kuaisu(arr,start,i-1);
        if (j+1<end) arr=kuaisu(arr,j+1,end);
        return (arr);
    }
}
