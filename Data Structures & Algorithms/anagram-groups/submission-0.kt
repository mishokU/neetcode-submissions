class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val data = hashMapOf<String, MutableList<String>>()
        strs.forEach {
            val sorted = it.toCharArray().sorted().toString()
            if (data.contains(sorted)) {
                data.put(sorted, data.getOrDefault(sorted, mutableListOf()).apply { add(it) })
            } else {
                data.put(sorted, mutableListOf(it))
            }
        }
        return data.values.toList()
    }
}
