public class Main {
    public static void main(String[] args) {
        // byte = 1 Byte = 8 Bit
        // short = 2 Byte = 16 Bit
        // int = 4 Byte = 32 Bit
        // long = 8 Byte = 64 Bit
//        int myAgeInYears;
//        myAgeInYears = 21;
//
//        String birthMonth = "September";



        // ცვლადების გადაკასტვა
//        int x = 134;
//        long longX = x;
//        byte b = (byte) x;
//
//        System.out.println("int x = " + x);
//        System.out.println("long x = " + longX);
//        System.out.println("byte b = " + b);


        // long-ის "უცნაურობა"
//        int x = 10_000_000_000;
//        System.out.println(12);
//        long x = 1_000_000_000_000L;
//
//        long y = 1_000_000_000;
//        y = y * 1000;
//        System.out.println(y);
//        byte x = 23;

        // არითმეტიკული ოპერატორები
//        int x = 25;
//        int y = 5;
//
//        int result = x + y;
//        System.out.println("x + y = " + result);
//        result = x -  y;
//        System.out.println("x - y = " + result);
//        result = x * y;
//        System.out.println("x * y = " + result);
//        result = x / y;
//        System.out.println("x / y = " + result);
//        result = x % y;
//        System.out.println("x % y = " + result);
//        y++;
//        System.out.println("y++ = " + y);
//        y--;
//        System.out.println("y-- = " + y);
//        x += 35;
//        System.out.println("x += 35 = " + x);
//        x -= 45;
//        System.out.println("x -= 45 = " + x);
//        x *= 10;
//        System.out.println("x *= 10 = " + x);
//        x /= 15;
//        System.out.println("x /= 15 = " + x);
//        x %= 7;
//        System.out.println("x %= 7 = " + x);


        // შედარების ოპერატორები
//        int a = 5;
//        int b = 3;
//        int c = 5;
//
//        boolean result = a == b;
//        System.out.println("a == b => " + result); // false
//        result = a == c;
//        System.out.println("a == c => " + result); // true
//        result = a != b;
//        System.out.println("a != b => " + result); // true
//        result = a != c;
//        System.out.println("a != c => " + result); // false
//        result = a > b;
//        System.out.println("a > b => " + result); // true
//        result = a > c;
//        System.out.println("a > c => " + result); // false
//        result = a >= c;
//        System.out.println("a >= c => " + result); // true
//        result = b <= a;
//        System.out.println("b <= a => " + result); // true


        // ლოგიკური ოპერატორები
//        boolean t = true;
//        boolean f = false;
//
//        boolean result = t & t;
//        System.out.println("t & t => " + result);
//        result = t & f;
//        System.out.println("f & t => " + result);
//        result = f & f;
//        System.out.println("f & f => " + result);
//        result = t | t;
//        System.out.println("t | t => " + result);
//        result = f | t;
//        System.out.println("f | t => " + result);
//        result = f | f;
//        System.out.println("f | f => " + result);
//        result = !t;
//        System.out.println("!t => " + result);
//        result = !f;
//        System.out.println("!f => " + result);
//        result = t || f;
//        System.out.println("t || f => " + result);
//        result = f && t;
//        System.out.println("f && t => " + result);
//        result = f || t;
//        System.out.println("f || t => " + result);
//
//        result = t ^ t;
//        System.out.println("t ^ t => " + result);
//        result = t ^ f;
//        System.out.println("t ^ f => " + result);
//        result = f ^ t;
//        System.out.println("f ^ t => " + result);
//        result = f ^ f;
//        System.out.println("f ^ f => " + result);


        // 111
        // 011
        // xor
        // 100
        System.out.println(7 ^ 3);

        // 0111
        // 1000
        // xor
        // 1111 = 8 + 4 + 2 + 1 = 15
        System.out.println(7 ^ 8);

        // 11
        // << 2
        // 1100 = 8 + 4 + 0 + 0 = 12
        System.out.println(3 << 2);

        // 11
        // >> 2
        // 0
        System.out.println(3 >> 2);

        int x = 15;
        x <<= 2;
        
    }
}
