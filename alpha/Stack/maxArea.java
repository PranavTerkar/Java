
package Stack;

import java.util.Stack;

public class maxArea {
    public static void area(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller rignt

        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // nextSmaller Left

        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Area

        for (int i = 0; i < arr.length; i++) {
            int hight = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = hight * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        area(arr);
    }
}
