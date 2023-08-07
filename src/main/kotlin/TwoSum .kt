// 88. Merge Sorted Array

class `TwoSum ` {
    companion object {
        fun main() {
            val nums: IntArray = intArrayOf(2,7,11,15)
            val target = 9

            merge(nums, target)
        }

        fun merge(nums: IntArray, target: Int) {
            var list: List<Int> = listOf()
            for((i1, v1) in nums.withIndex()) {
                for(i2 in (i1 + 1 until nums.size)) {
                    val v2 = nums[i2]
                    if (v2 + v1 == target) {
                        list = listOf(i1, i2)
                        break
                    }
                }
                if(list.isNotEmpty()) {
                    break
                }
            }
            list.toIntArray()
            print(list)
        }

    }
}
