// 3264. Final Array State After K Multiplication Operations I

fun main() {
    val nums = intArrayOf(2, 1, 3, 5, 6)
    val k = 5
    val multiplier = 2
    val result = Solution().getFinalState(nums, k, multiplier)
    println(result.joinToString(","))
}


class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        repeat(k) {
            var minValue = Int.MAX_VALUE
            var minValueIndex = Int.MAX_VALUE
            for (index in nums.indices) {
                val current = nums[index]
                if (current < minValue) {
                    minValue = current
                    minValueIndex = index
                }
            }
            val newValue = minValue * multiplier
            nums[minValueIndex] = newValue
        }
        return nums
    }
}