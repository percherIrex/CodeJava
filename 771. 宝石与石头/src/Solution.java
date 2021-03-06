/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
    /***
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     * 示例 2:
     *
     * 输入: J = "z", S = "ZZ"
     * 输出: 0
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        int[] counts = new int[123];
        int result = 0;
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();

        for (char c1 : s) {
            counts[c1]++;
        }

        for (char c2 : j) {
            result+=counts[c2];
        }

        return result;
    }
}
