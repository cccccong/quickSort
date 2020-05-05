/**
 * @Description:
 * @Author: ZhangCong
 * @Date: 2020/5/5 15:30
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,8,5,3,2,9,10,6,7};
        quickSort(arr,0,9);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    private static void quickSort(int[] arr, int p, int q){
        if (arr!=null&&arr.length>0){
            int start=p,end=q;
            //本次排序的目标
            int target=arr[start];
            while (start<end){
                //从后往前找到比target小的值
                while (start<end){
                    if (arr[end]<target){
                        swap(arr,end,start);
                        break;
                    }else {
                        end--;
                    }
                }
                //从前往后找到比target大的值
                while (start<end){
                    if (arr[start]>target){
                        swap(arr,end,start);
                        break;
                    }else {
                        start++;
                    }
                }
            }
            //如果target两侧还有长度大于2的数组时，继续递归
            if (start-p>1){
                quickSort(arr,p,start-1);
            }
            if (q-end>1){
                quickSort(arr,end+1,q);
            }
        }
    }

    private static void swap(int[] arr,int p,int q){
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
    }
}
