package recursion;

/**
 * @description: 斐波那契数列
 * 斐波那契数列的是这样一个数列：1、1、2、3、5、8、13、21、34....，即第一项 f(1) = 1,第二项 f(2) = 1.....,第 n 项目为 f(n) = f(n-1) + f(n-2)。求第 n 项的值是多少。
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 *
 * 示例 1：
 * 输入：n = 2
 * 输出：1
 *
 * 示例 2：
 * 输入：n = 5
 * 输出：5
 *  
 * 提示：
 * 0 <= n <= 100
 */
public class Fibonacci {

    public int fib(int n) {
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

}