package day2;

public class exam_for3 {
    public static void main(String[] args){

        int[] arr = new int[6];

        for(int i=0; i<=5; i++) arr[i] = 0;

        for(int i=1; i<=5; i++){
            if(arr[i]==0){
                arr[i] = 1;
                for(int j=1; j<=5; j++){
                    if(arr[j]==0);{
                        arr[j] = 1;
                        for(int k=1; k<=5; k++){
                            if(arr[k]!=1){
                                System.out.println("a=" + i + ", b="+ j+", c=" + k);
                            }
                        }
                        arr[j] = 0;
                    }
                }
                arr[i] = 0;
            }
        }
    }
}
