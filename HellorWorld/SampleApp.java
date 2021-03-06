import java.util.Random; // 乱数を使うためクラス
// import java.util.ArrayList;
import java.util.*; // utilクラス全てをインポート
import java.time.*;
import java.time.format.DateTimeFormatter;


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
            
            /* 抽象クラス 具象クラス */
            AmericanUser ameKen = new AmericanUser();
            JapaneseUser japKen = new JapaneseUser();
            ameKen.sayHi();
            japKen.sayHi();
            
            
            /* インターフェース */
            User8 ken8 = new User8();
            ken8.print();
            ken8.getInfo();
            
            
            /* 列挙型 */
            Result res;
            res = Result.ERROR;
            int resNum = (int)(Math.random()*3);
            if (resNum == 1) {
                res = Result.SUCCESS;
            }
            else if (resNum == 0) {
               res = Result.ERROR; 
            }

            switch (res) {
                case SUCCESS:
                    System.out.println("OK!");
                    System.out.println(res.ordinal());
                    break;
                case ERROR:
                    System.out.println("NG!");
                    System.out.println(res.ordinal());
                    break;
            }
            
            
            /* 例外処理 */
            
            // わざと0除算
            div(3,0);
            // わざとマイナス値
            div(5,-2);
            
            /* ラッバークラス */
            
            // 参照型クラス Integer 
            Integer i8 = new Integer(31);
            // intValueにてint型に変換できる
            int n = i8.intValue();
            System.out.println(n);
            
            // よしなにしてくれる
            Integer i9 = 32; // auto boxing機能
            //i9 = null; // このままint型に渡すとunboxingが動かずNullPointerExceptionになってしまう
            int n2 = i9; // auto unboxing
            System.out.println(n2);
            
            
            /* ジェネリクス */
            
            // ジェネリクス型なので<型>を指定する。参照型のみ
            MyData<Integer> i10 = new MyData<>();
            i10.getTree(33);
            
            MyData<String> s4 = new MyData<>();
            s4.getTree("hello!!Generics!");
            
            /* スレッド */
            // MyRnnable r = new MyRnnable();
            // Thread t = new Thread(r);
            // t.start();
            
            // for (int i11 = 0; i11 < 500 ;i11++ ) {
            //     System.out.print('.');
            // } 
            
            
            /* ラムダ式・無名クラス */
            
            // ラムダ式
            // 引数 -> {処理}
            // new Thread(new Runnable() {
            //     @Override
            //     public void run() {
            //         for (int i12 = 0; i12 < 500 ;i12++ ) {
            //             System.out.print('@');
            //         }
            //     }
            // }).start();
            
            new Thread(() -> {
                for (int i13 = 0; i13 < 500 ;i13++ ) {
                    System.out.print('-');
                } 
            }).start();
 
            for (int i14 = 0; i14 < 500 ;i14++ ) {
                System.out.print('~');
            }
            
            
            /* Stringクラス */
            String s5 = "abcdef";
            // 文字数
            System.out.println(s5.length());
            // 部分抜き出し
            System.out.println(s5.substring(2,5));
            // 文字列変換
            System.out.println(s5.replaceAll("ab", "AB"));
            
            String s6 = "ab";
            String s7 = "ab";

            //　文字列の比較
            if (s6.equals(s7)) {
                System.out.println("same!");
            }
            
            // 文字列データ予測比較 -> 文字列比較と同じように比較される
            if (s6 == s7) {
                System.out.println("same!same!");
            }
            
            String ss1 = new String("ab");
            String ss2 = new String("ab");
            
            // 文字列データ比較 -> 上記の書き方の場合はメモリ領域が比較される
            if (ss1 == ss2) {
                System.out.println("same!same!same!");
            }
            
            /* printf */
            int score2 = 50;
            double height = 165.8;
            String name = "taguchi";
            
            System.out.printf("name: %s, score: %d, height: %f\n", name, score2, height);
            System.out.printf("name: %-10s, score: %10d, height: %5.2f\n", name, score2, height);
            
            String s8 = String.format("name: %-10s, score: %10d, height: %5.2f\n", name, score2, height);
            System.out.println(s8);
            
            /* Math Random */
            double d3 = 53.234;
            System.out.println(Math.ceil(d3));  // 切り上げ
            System.out.println(Math.floor(d3)); // 切り下げ
            System.out.println(Math.round(d3)); // 四捨五入
            System.out.println(Math.PI); // 円周率
            System.out.println(Math.random()); // 乱数 
            
            // Randomクラス
            Random r = new Random();
            System.out.println(r.nextDouble()); // 0 - 1
            System.out.println(r.nextInt(100)); // 0 - 100
            System.out.println(r.nextBoolean()); // ランダムなbool値
            
            
            /* Array */
            // ArrayList<Integer> sales4 = new ArrayList<>();
            List<Integer> sales4 = new ArrayList<>();
            
            sales4.add(10);
            sales4.add(20);
            sales4.add(30);
            
            for (int i15 = 0; i15 < sales4.size(); i15++) {
                System.out.println(sales4.get(i15));
            }
                
            sales4.set(0, 100);
            sales4.remove(2);
            
            for (Integer sale: sales4) {
                System.out.println(sale);
            }
            
            
            /* Hash set */
            // HashSet 要素が順不同
            // TreeSet 要素が値順にソートされる
            // LinkedHashSet 要素が追加された順
            // Set<Integer> sales5 = new HashSet<>();
            // Set<Integer> sales5 = new TreeSet<>();
            Set<Integer> sales5 = new LinkedHashSet<>();
            
            sales5.add(10);
            sales5.add(20);
            sales5.add(30);
            sales5.add(10); // 重複する値は弾かれる
            
            System.out.println(sales5.size());
            for (Integer sale : sales5) {
                System.out.println(sale);
            }
            
            sales5.remove(30);
            
            for (Integer sale : sales5) {
                System.out.println(sale);                
            }
            
            
            /* HashMap */
            // HashMap 要素が順不同
            // TreeMap 要素が値順にソートされる
            // LinkedHashMap 要素が追加された順
            
            // HashMap<String, Integer> sales6 = new HashMap<>();
            Map<String, Integer> sales6 = new TreeMap<>();
            
            sales6.put("ken1", 123);
            sales6.put("ken2", 345);
            sales6.put("ken3", 678);
            
            System.out.println(sales6.get("ken1"));
            System.out.println(sales6.size());
            
            //全てを抜き出す[.entrySet]
            for (Map.Entry<String, Integer> sale: sales6.entrySet()) {
                System.out.println("1回目 = " + sale.getKey() + ":" + sale.getValue());
            }
            
            sales6.put("ken1", 912);
            sales6.remove("ken3");
            
            for (Map.Entry<String, Integer> sale: sales6.entrySet()) {
                System.out.println("2回目 = " + sale.getKey() + ":" + sale.getValue());
            }
            
            
            /* Stream API */
            List<Integer> sales7 = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
            // for (Integer sale : sales7) {
            //     System.out.println("Stream API = " + sale);
            // }
            
            sales7
                .stream()
                // 中間処理
                .filter(e -> e % 3 == 0)
                .map(e -> "(" + e + ")")
                // 終端処理
                .forEach(System.out::println);
            
            
            /* Java Time */
            LocalDateTime dateTime1 = LocalDateTime.now();
            LocalDateTime dateTime2 = LocalDateTime.of(2017, 1, 24, 14, 28,10);
            LocalDateTime dateTime3 = LocalDateTime.parse("2016-12-24T10:10:10");
            
            System.out.println("================================");
            
            System.out.println("dateTime1 Year       = " + dateTime1.getYear());
            System.out.println("dateTime1 Month      = " + dateTime1.getMonth());
            System.out.println("dateTime1 MonthValue = " + dateTime1.getMonth().getValue());
            
            System.out.println("================================");
            System.out.println("dateTime2 Year       = " + dateTime2.getYear());
            System.out.println("dateTime2 Month      = " + dateTime2.getMonth());
            System.out.println("dateTime2 MonthValue = " + dateTime2.getMonth().getValue());

            System.out.println("================================");
            System.out.println("dateTime3 Year       = " + dateTime3.getYear());
            System.out.println("dateTime3 Month      = " + dateTime3.getMonth());
            System.out.println("dateTime3 MonthValue = " + dateTime3.getMonth().getValue());

            System.out.println("================================");
            // 出力日時の操作
            System.out.println(dateTime1.plusMonths(2).minusDays(3));
            System.out.println("================================");
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
            System.out.println(dateTime1.format(dtf));
            System.out.println(dateTime2.format(dtf));
            System.out.println(dateTime3.format(dtf));
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
 
        /* 例外処理メソッド */
        public static void div(int a, int b) {
            try {
                if (b < 0) {
                    throw new MyException("not minus");
                }
                System.out.println(a / b);
            } catch(ArithmeticException e) {
                
                System.err.println(e.getMessage());
                
            } catch(MyException e) {
                
                System.err.println(e.getMessage());
                
            } finally {
                
                System.out.println("-- end --");
                
            }
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
        
        // final定数なので書きかえれない
        // User6.VERSION = 1.2;
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

/* 抽象クラス 具象クラス */
abstract class User7 {
    public abstract void sayHi();
}

class JapaneseUser extends User7 {
    @Override
    public void sayHi() {
        System.out.println("こんにちは");
    }
}

class AmericanUser extends User7 {
    @Override
    public void sayHi() {
        System.out.println("Hi!");
    }
}


/* インターフェース */
interface Printable {
    
    // 定数
    double VERSION = 1.2;
    
    // 抽象メソッド
    void print();
    
    // defaultメソッド
    public default void getInfo() {
        System.out.println("I/F ver. " + Printable.VERSION);
    }
    // staticメソッド
}

class User8 implements Printable {
    @Override
    public void print() {
        System.out.println("Now printing user profile...");
    }
}

/* 列挙型 */
enum Result {
    SUCCESS,
    ERROR,
}

/* 例外処理 */
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

/* ジェネリクス */
class MyData<T> {
    public void getTree(T x) {
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
    }    
}

/* スレッド */
class MyRnnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i < 500 ; i++ ) {
            System.out.print('*');
        } 
    }
}