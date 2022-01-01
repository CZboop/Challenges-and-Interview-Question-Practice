import static java.util.Map.entry; 
class Solution {
    public int romanToInt(String s) {
        int[] numbers = new int[s.length()];
        for (int i=0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    numbers[i] = 1;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'M':
                    numbers[i] = 1000;
                    break;        
            } 
        }
            int total = 0;
            for (int j = 0; j < numbers.length-1; j++){
                if (numbers[j]<numbers[j+1]){
                    total-=numbers[j];
                } else {
                    total+=numbers[j];
                }
}
        return total + numbers[numbers.length-1];
    }
    
}