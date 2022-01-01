class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Long> sMap = List.of(s.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> tMap = List.of(t.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return sMap.equals(tMap);
    }
}