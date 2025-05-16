class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList <Integer> ans = new ArrayList<>();
        
        ans.add(arr[arr.length-1]);
        int max = arr[arr.length-1];
        
        for(int i = arr.length-2; i>=0; i--){
           if (arr[i] >= max) {
                max = arr[i];
                ans.add(arr[i]);
            }    
        }
        Collections.reverse(ans);
        return ans;
    }
}
