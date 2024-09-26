public class Operators{
    public static void main(String[] args) {

        System.out.println("********************Assignment  operator***********************");
        // asignment operator
        int a = 10;
        a += 5;
        System.out.println("a = " + a);
        
        // increment operator
        int b = 10;
        b = b + 1;
        System.out.println("b = " + b);
        
        // decrement operator
        int c = 10;
        c--;
        System.out.println("c = " + c);
        
        // multiplication operator
        int d = 10;
        int e = 2;
        int f = d * e;
        System.out.println("f = " + f);
        
        // division operator
        int g = 10;
        int h = 2;
        double i = (double)g / h;
        System.out.println("i = " + i);
        
        // modulus operator
        int j = 10;
        int k = 3;
        int l = j % k;
        System.out.println("j = " + l);


                System.out.println("********************bitwise operator***********************");
            
             // bitwise NOT operator
             int x = 10;
             int y = ~x;
             System.out.println("y = " + y);
             
             // bitwise complement operator
             int z = 10;
             int fa = ~z;
             System.out.println("a = " + fa);
        
             // bitwise AND operator
             int m = 10;
             int n = 5;
             int o = m & n;
             System.out.println("o = " + o);
             
             // bitwise OR operator
             int p = 10;
             int q = 5;
             int r = p | q;
             System.out.println("r = " + r);
             
             // bitwise XOR operator
             int s = 10;
             int t = 5;
             int u = s ^ t;
             System.out.println("u = " + u);
             
             // left shift operator
             int v = 10;
             int w = v << 1;
             System.out.println("w = " + w);
             
             // right shift operator
             int xa = 10;
             int yb = xa >> 1;
             System.out.println("y = " + yb);

             System.out.println("********************Arithmetic operator***********************");
        
              //arithmetic operator
              int ma = 10;
              int nb = 5;
              int oc = ma + nb;
              System.out.println("o = " + oc);
              
              // assignment operator
              int pa = 10;
              int qb = 5;
              p = qb;
              System.out.println("p = " + pa);
              
              // comparison operator
              int ra = 10;
              int sb = 5;
              boolean tc = ra == sb;
              System.out.println("t = " + tc);
              
              // logical operator
              boolean ua = true;
              boolean vb = false;
              boolean wc = ua && vb;
              System.out.println("w = " + wc);
              
              // ternary operator
              int xb = 10;
              int yc = 20;
              int zc = (xb > yc)? xb: yc;
              System.out.println("z = " + zc);


              System.out.println("******************** order of operation***********************");
              // order of operation
              int xd = 10;
              int yd = 20;
              int zd = (xd > yd)? xd: yd;
              System.out.println("z = " + zd);

              System.out.println("**************** ternary operator with shorthand operator***************");
              // ternary operator with shorthand operator
              int xe = 10;
              int ye = 20;
              int ze = (xe > ye)? xe: (ye = 100);
              System.out.println("z = " + ze);

              System.out.println("**************** order of operation with ternary operator***************");
              // order of operation with ternary operator
              int xf = 10;
              int yf = 20;
              int zf = (xf > yf)? xf: (yf = 100);
              System.out.println("z = " + zf);

              System.out.println("**************** ternary operator with shorthand operator and order of operation***************");
              // ternary operator with shorthand operator and order of operation
              int xg = 10;
              int yg = 20;
              int zg = (xg > yg)? (xg = 100): yg;
              System.out.println("z = " + zg);

              
              // ternary operator with shorthand operator, order of operation, and logical
              int xh = 10;
              int yh = 20;
              int zh = (xh > yh)? (xh = 100): (yh = 100);
              System.out.println("z = " + zh);
              // ternary operator with shorthand operator, order of operation, logical, and assignment
              int xi = 10;
              int yi = 20;
              int zi = (xi > yi)? (xi = 100): (yi = 100);
              System.out.println("z = " + zi);
              // ternary operator with shorthand operator, order of operation, logical, assignment, and comparison
              int xj = 10;
              int yj = 20;
              int zj = (xj > yj)? (xj = 100): (yj = 100);
              System.out.println("z = " + zj);

         

             
        }       
        }

    
