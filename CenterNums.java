package com.xiaobao.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
 //寻找数组的中心数
//myronirIdex不行的原因在于前面的累加乘以二不会得到总数的一半 他是去掉中心相等 不是加上中心
public class CenterNums {
    public static void main(String[] args) {
        int [] nums={1,7,3,6,5,6};
       System.out.println(providIndex(nums));

    }
    public  static int myronvirIdex(int[] nums){
        int sum=Arrays.stream(nums).sum();
        int total=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            sum1=total*2;
            if(sum1==sum){
                return i;
            }
        }
        return -1;
    }
    public static int providIndex(int[] nums){
        int sum= Arrays.stream(nums).sum();
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(total==sum){
                return i;
            }
            sum=sum-nums[i];
        }
        return  -1;
    }


}
