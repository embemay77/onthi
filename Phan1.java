public class PHAN1 {
    // 1. Tính tổng các số lẻ trong mảng
public static int sumOdd(int[] arr) {
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0) sum+=arr[i];
    }
    return sum;
}

// 2. Tìm số lớn thứ 2 trong mảng
public static int findSecondMax(int[] arr) {
    int a=arr[0];
    int b=arr[1];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>a){ 
            b=a;
            a=arr[i];

        }
    }
   return b ;
}

// 3. Kiểm tra mảng đối xứng
public static boolean isSymmetric(int[] arr) {
    int []arr1=new int[arr.length/2];
    int k=0;
    for(int i=arr.length-1;i>arr.length/2;i--){
       arr1[k++]=arr[i];
    }
    for(int i=0;i<arr.length/2;i++){
        if(arr[i]!=arr1[i]) return false;
    }
    return true;

}
public static void main(String[] args) {
    int[] arr = {1, 3, 5, 3, 1};

    System.out.println(sumOdd(arr));
    System.out.println(findSecondMax(arr));
    System.out.println(isSymmetric(arr));
}
    
}
