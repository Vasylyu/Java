
/**
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
package org.example.lesson5;
public class main {
    public static void main(String[] args) {
        int[] arr ={3,1,2,10,1};
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < result.length; i++) {
            result[i] += arr[i] + result[i-1];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }
    }
}
