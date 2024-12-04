public static int secondLarget(int[] arr){
  int largest = a[0];
  int s_largest = -1;
  for(int i = 0;i<arr.length;i++){
    if(arr[i] > largest){
      s_largest = largest;
      largest = arr[i];
    } else if(arr[i] < largest && arr[i] > s_largest){
      s_largest = arr[i];
    }
  }
  return s_largest;
}
