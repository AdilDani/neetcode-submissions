// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        if(pairs.isEmpty()){
            return result;
        }

        result.add(new ArrayList<>(pairs));

        for(int i=1;i<pairs.size();i++){
            if(pairs.get(i-1).key <= pairs.get(i).key){
                result.add(new ArrayList<>(pairs));
                continue;
            }
            else{
                for(int j=0;j<i;j++){
                    if(pairs.get(i).key <pairs.get(j).key){
                        Pair pair=pairs.get(i);
                        pairs.remove(i);
                        pairs.add(j, pair);

                        break;
                    }

                }
                result.add(new ArrayList<>(pairs));
            }
        }
        return result;
    }
}
