import java.util.ArrayList;
public class Debjit {
    public static void main(String[] args) {
        int arr1[]={1,3,3,2,4,5};
        int arr2[]={1,7,2,3,4,5};
        ArrayList<Integer> ans= common(arr1,arr2);
        System.out.println(ans);
    }
    static ArrayList<Integer> common(int arr1[], int arr2[]){
        ArrayList<Integer> ans= new ArrayList<>();
        int l1=arr1.length, l2=arr2.length;
        Debjit.sort(arr1);
        Debjit.sort(arr2);
        int i=0,j=0;
        while(i<l1&&j<l2){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i++]);
                j++;
                while(i+1<l1&&arr1[i]==arr1[i+1]){
                    i++;
                }
                while(j+1<l2&&arr2[j]==arr2[j+1]){
                    j++;
                }
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }
    static void sort(int arr[]){
        int end=arr.length-1;
        for(int i=end;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}