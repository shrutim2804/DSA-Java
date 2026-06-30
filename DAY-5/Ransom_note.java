LEETCODE QS=383
-----------------------------------------------------------------------------------------------------------------------------------------  

Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in magazine
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check if ransomNote can be formed
        for (char ch : ransomNote.toCharArray()) {

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}
