public class min_max {
    public int min(int[] arr){
        int minimum=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<minimum)
                minimum=arr[i];
        }
        return minimum;
    }
    public int max(int[] arr){
        int maximum=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>maximum)
                maximum=arr[i];
        }
        return maximum;
    }

}
