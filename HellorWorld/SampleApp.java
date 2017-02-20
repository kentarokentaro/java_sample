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
        }
}