package Stack;

import java.util.Stack;

public class StockSpan {

    public static void satockspan(int Stocks[], int Span[]) {
        Stack<Integer> s = new Stack<>();

        Span[0] = 1;
        s.push(0);
        for (int i = 1; i < Stocks.length; i++) {

            int currPrice = Stocks[i];
            while (currPrice > Stocks[s.peek()] && !s.isEmpty()) {
                s.pop();
            }
            if (s.isEmpty()) {
                Span[i] = i + 1;
            } else {
                int preHigh = s.peek();
                Span[i] = i- preHigh;; 
            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int Stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int Span[] = new int[Stocks.length];

        satockspan(Stocks, Span);
        for (int i = 0; i < Span.length; i++) {
            System.out.print(Span[i] + " ");
        }
    }
}