// 88. Merge Sorted Array

class MergeSortedArray {
    companion object {
        fun main() {
            val nums1: IntArray = intArrayOf(1,2,3,0,0,0)
            val m = 3
            val nums2: IntArray = intArrayOf(2,5,6)
            val n = 3

            merge(nums1, m, nums2, n)

        }

        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
            val newNums1 = removeZero(nums1, m)
            val newNums2 = removeZero(nums2, n)

            val result = (newNums1 + newNums2).sorted()
            println(result.joinToString(",", "[", "]") { it.toString() })
        }

        fun removeZero(number: IntArray, size: Int): IntArray {
//            if (number.size == size) {
//                return number
//            }

            return number.filter { it != 0 }.toIntArray()
        }
    }
}
