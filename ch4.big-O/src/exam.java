public class exam {
    int sum ( int n){
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }
    int pairSum(int a, int b) {
        return a + b;
    }

// 최소와 최대
//  최소와 최대1
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int x : array) {
        if (x < min) min = x;
        if (x > max) max = x;
    }

//  최소와 최대2
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int x : array) {
        for (int x : array) {
            if (x < min) min = x;
        }
        for (int x : array) {
            if (x > max) max = x;
        }
    }

// 덧셈 vs 곱셈
// 덧셈 수행 시간: O(A + B)
//  A의 일을 한 뒤 B의 일을 한다.
// "A의 일을 모두 끝마친 후 B의 일을 수행하라": A와 B의 수행 시간을 더한다.
    for (int a : arrA) {
        print(a);
    }

    for (int b : arrB) {
        print(b);
    }

// 곱셈 수행 시간: O(A * B)
// A의 각 원소에 대해 B의 일을 한다.
// "A 일을 할 때마다 B 일을 수행하라.": A와 B의 수행 시간을 곱한다.
    for (int a : arrA) {
        for (int b : arrB) {
            print(a + "," + b);
        }
    }

// 이진 탐색
// 총 수행 시간은 N을 절반씩 나누는 과정에서 몇 단계 만에 1이 되는지에 따라 결정된다.

// 재귀적으로 수행 시간 구하기
    int f(int n) {
        if (n <= 1) {
            return 1;
        }
        return f(n-1) + f(n-1);
    }
/*
f가 2번 호출된 것을 보고 O(N*2)이라고 성급하게 결론 내릴 것이다. But, 틀리다!
f(4)는 f(3)을 2번 호출한다.
f(3)은 f(2)를 거쳐서 결국 f(1)까지 호출한다.
*/
}

