class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            val complement = target - num
            if (seen.containsKey(complement)) {
                return intArrayOf(seen[complement]!!, i)
            }
            seen[num] = i
        }
        return intArrayOf(-1, -1)
    }
}
