public class ClassA {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void number(int x) {
        class Number {
            private int x;

            public Number(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Number{" +
                        "x=" + x +
                        '}';
            }
        }
        Number num = new Number(x);
        System.out.println(num);
    }
}
