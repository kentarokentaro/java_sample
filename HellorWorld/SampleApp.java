public class SampleApp {
        public static void main(String[] args) {
            
            // 変数
            String msg1;
            msg1 = "Hello World";
            
            System.out.println(msg1);
            
            /* 色々な型 */
            // 1文字
            char a = 'a';
            
            // 整数byte short int long
            int x = 10;
            long y = 555555555L;
            
            // 浮動小数点数 float double
            double d = 23445.44;
            float f = 32.33F;
            
            // 論理値
            boolean flag = true; //false
            
            //文字列
            String msg2 = "Hello \nWorld Again\t!!";
            System.out.println(msg2);
            
            /* 四則演算 */
            int i;
            
            // 除
            i = 10 / 3;
            System.out.println(i);
            // 余
            i = 10 % 3;
            System.out.println(i);
            
            // インクリメント/デクリメント
            int x1 = 5;
            x1++;
            System.out.println(x1);
            x1--;
            System.out.println(x1);
            
            // 加
            x1 = 5;
            x1 += 12;
            System.out.println(x1);
            
            
            /* データ型の変換 */
            
            // double → Int
            double d1 = 542325.45;
            int i1 = (int)d1;
            System.out.println(i1);
            
            // Int → double
            int i2 = 10;
            double d2 = (double)i2 / 4;
            System.out.println(d2);
            
            /* if */
            int score = 65;
            if (score > 80) {
                System.out.println("Great!");
            }
            else if (score > 60){
                System.out.println("Good!");
            }
            else
            {
                System.out.println("so so...");
            }
            
            //条件演算子
            String msg = score > 80 ? "Great!" : "so so...!";
            System.out.println(msg);
            
            /* switch */
            String signal = "green";
            
            switch (signal) {
                case "red":
                    System.out.println("stop!");
                    break;
                case "blue":
                case "green":
                    System.out.println("go!");
                    break;
                case "yellow":
                    System.out.println("caution!");
                    break;
                default:
                    System.out.println("wrong signal!");
                    break;
            }
            
            /* while */
            
            // while
            int i3 = 0;
            while (i3 < 10) {
                System.out.println(i3);
                i3++;
            }
         
            //do while
            int i4 = 100;
            do
            {
                System.out.println(i4);
                i4++;
            }
            while (i4 < 10);

            /* for */
            for (int i5 = 0; i5 < 10; i5++ ) {
                if (i5 == 5) {
                    break;
                }
                System.out.println("for count1 =" + i5);
            }
            
            for (int i6 = 0; i6 < 10; i6++ ) {
                if (i6 == 5) {
                    continue;
                }
                System.out.println("for count2 =" + i6);
            }

            /* 配列 */
            
            int[] sales;
            sales = new int[3];
            System.out.println(sales[0]);
            System.out.println(sales[1]);
            System.out.println(sales[2]); 
            
            int[] sales1;
            sales1 = new int[] {700, 400, 500};
            System.out.println(sales1[0]);
            System.out.println(sales1[1]);
            System.out.println(sales1[2]);            
            
            int[] sales2 = {700, 400, 500};
            System.out.println(sales2[0]);
            System.out.println(sales2[1]);
            System.out.println(sales2[2]); 
            
            // 代入 and 書き換え
            sales2[0] = 100;
            sales2[1] = 200;
            sales2[2] = 300;
            System.out.println(sales2[0]);
            System.out.println(sales2[1]);
            System.out.println(sales2[2]); 
            
            /* 配列の要素を操作 */
            int[] sales3 = {700,400,500};
            // .length = 要素数
            for (int i7 = 0; i7 < sales3.length; i7++) {
                System.out.println("配列の要素_for = " + sales3[i7]);
            }
            
            for(int sale : sales3) {
                System.out.println("配列の要素_forin = " + sale);
            }
            
            /* 基本データ型と参照型 */
            int x2 = 10;
            int y1 = x2;
            y1 = 5;
            System.out.println("データ型 = " + x2);
            System.out.println("データ型 = " + y1);
            
            int[] a1 = {3,5,7};
            int[] b  = a1;
            b[1] = 8;
            System.out.println("参照型 = "+a1[1]);
            System.out.println("参照型 = "+b[1]);
            
            // String型は参照型であってもメモリ領域への書き込みは禁止されている
            String s = "hello";
            String t1 = s;
            t1 = "world";
            System.out.println("参照型 = "+s);
            System.out.println("参照型 = "+t1);
            
            /* メソッド */

            // 返り値なし、引数なし
            sayHi1();

            // 返り値なし、引数あり
            sayHi2("kentaro");

            // 返り値あり、引数なし
            String s1 = sayHi3();
            System.out.println(s1);
            
            // 返り値あり、引数あり
            String s2 = sayHi4("male");
            System.out.println(s2);
            
            String s3 = sayHi4("female");
            System.out.println(s3);
            
            /* オーバーロード */
            sayHi5("Kentaro!");
            sayHi5();
            
            /* クラス */
            User ken; // 参照
            ken = new User(); //インスタンス
            System.out.println(ken.name);
            ken.classUserSayHi();
            
            /* クラスコンストラクタ */
            
            User1 ken1;
            ken1 = new User1();
            System.out.println(ken1.name);
            ken1.classUserSayHi();
            
            User1 ken12;
            ken12 = new User1("ken12");
            System.out.println(ken12.name);
            ken12.classUserSayHi();
            
            
            /* 継承とオーバーライド */
            //継承元クラス
            User2 ken2;
            ken2 = new User2("ken2");
            System.out.println(ken2.name);
            ken2.classUserSayHi();
            
            //継承クラス
            AdminUser adminKen;
            adminKen = new AdminUser("adminKen");
            System.out.println(adminKen.name);
            adminKen.adminUserSayHello();
            adminKen.classUserSayHi();
            
            /* getter setter */
            User3 ken3;
            ken3 = new User3("ken3",65);
            //ken3.setScore(85);
            //ken3.setScore(0);
            ken3.setScore((int)(Math.random()*10));
            ken3.setScore(-12);
            System.out.println(ken3.getScore());
            
            
            /* Static */
            User4.getInfo();
            User4 ken4 = new User4("ken4");
            User4.getInfo();
            User4 ken42 = new User4("ken42");
            User4.getInfo();
            
            
            /* イニシャライザ */
            User5.getInfo();
            User5 ken5 = new User5("ken5");
            User5.getInfo();
            User5 ken52 = new User5("ken52");
            User5.getInfo();
            
            
        }
        
        /* メソッド */
        
        // 返り値なし、引数なし
        public static void sayHi1() {
            System.out.println("Hi!!");
        }
        
        // 返り値なし、引数あり
        public static void sayHi2(String name) {
            System.out.println("Hi!! " + name);
        }
        
        // 返り値あり、引数なし
        public static String sayHi3() {
            return "Hi!! Mr.";
        }
        
        // 返り値あり、引数あり
        public static String sayHi4(String sex) {
            String str = "";
            if (sex == "male") {
                str = "Steve";                
            }
            else if (sex == "female") {
                str = "Jane";
            }
            return str;
        }
        
        /* オーバーロード */
        public static void sayHi5(String name) {
            int x = 10;
            System.out.println("Hi! " + name);
        }

        // overload
        public static void sayHi5(){
            System.out.println("Hi! Nobady! This is OverLoad!");
        }
        
}


/* クラス */ 
class User {
    String name = "Class Me!"; // フィールド
    
    void classUserSayHi() {
        System.out.println("Class Hi!");
    }
    
}

/* クラスコンストラクタ */
class User1 {
    String name;
    
    User1(String name) {
        this.name = name;
    }
    
    User1() {
        this("Class Constructor Me!");
    }
    
    void classUserSayHi() {
        System.out.println("Class Constructor Hi! " + this.name);
    }
} 


/* 継承とオーバーライド */

// 継承元クラス
class User2 {
    String name;
    
    User2(String name) {
        this.name = name;
    }
    
    void classUserSayHi() {
        System.out.println("Class Successor Hi! " + this.name);
    }
}
// 継承クラス
class AdminUser extends User2 {
    AdminUser(String name) {
        super(name);
    }
    
    void adminUserSayHello() {
        System.out.println("Hello! " + this.name);
    }
    
    // override
    @Override
    void classUserSayHi() {
        System.out.println("[admin] Hi! " + this.name);
    }
}

/* getter setter */
class User3 {
    
    private String name;
    private int score;
    
    public User3(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    public int getScore() { // getter
        return this.score;
    }

    public void setScore(int score) { // setter
        if (score >= 0) {
            this.score = score;            
        } 
        else {
            System.out.println("無効な値です");
        }
    }
}

/* Static */
class User4 {
    private String name;
    private static int count = 0;
    
    public User4(String name) {
        this.name = name;
        User4.count++;
    }
    
    public static void getInfo() {
        System.out.println("# of instances: " + User4.count);
    }
} 

/* イニシャライザ */
class User5 {
    private String name;
    private static int count;
    
    // スタティックイニシャライザ - 最初に一回だけ呼ばれる
    static {
        User5.count = 0;
        System.out.println("1_Static initializer");
    }
    
    // インスタンスイニシャライザ - インスタンス生成されるたびに呼ばれる
    {
        System.out.println("2_Instance initializer");
    }
 
    // コンストラクタ
    public User5(String name) {
        this.name = name;
        User5.count++;
        System.out.println("3_Constructor");
    }   
    
    // クラスメソッド
    public static void getInfo() {
        System.out.println("4_# of instances: " + User5.count);
    }
    
}

/* final */

// 継承できなくなる
final class User6 {
    protected String name;
    
    // 定数になる
    private static final double VERSION = 1.1;
        
    public User6(String name) {
        this.name = name;
        User6.VERSION = 1.2;
    }
    
    // overrideできなくなる 
    public final void sayHi() {
        System.out.println("Hi! " + this.name);
    }
}

// finalクラスは継承できないのでエラーになる
// class AdminUser2 extends User6 {
//     public AdminUser2(String name) {
//         super(name);
//     }
    
//     @Override
//     public void sayHi() {
//         System.out.println("[admin] hi! " + this.name);
//     }
// }