class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>(); 
        for(int i=0; i<strs.length; i++) {
        	String Key = GetKey(strs[i]);
        	if (!map.containsKey(Key)) {
				map.put(Key, new ArrayList<>());
			}
        	map.get(Key).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet()) {
        	ans.add(map.get(key));
        }
        return ans;
    }
	
	public static String GetKey(String str) {
		int[] count = new int[26];
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			count[ch-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<26; i++) {
			sb.append(count[i]+" ");
		}
		return sb.toString();
	}
}
