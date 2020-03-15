/***
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    /***
     * 输入: 4
     * 输出: 2
     *
     * 输入: 8
     * 输出: 2
     * 说明: 8 的平方根是 2.82842...,
     * 由于返回类型是整数，小数部分将被舍去。
     * @param x
     * @return
     */
    public static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            long left = 0, right = x / 2 + 1, i;
            for (;true;) {
                i=(left + right) / 2;
                if (i * i <= x && (i + 1) * (i + 1) > x) {
                    return (int) i;
                }else if(i*i<x){
                    left = i;
                }else {
                    right = i;
                }
            }
        }
    }
}
