package chapter11;

/**
 * 問題11-9<br>
 * (1)フィールド<br>
 *    (1a) 指定がないときの幅と高さ（INITIAL_WIDTH,INITIAL_HEIGHT）<br>
 * (2)コンストラクタ<br>
 *    (2a) 引数がないもの（width,heightの初期値はINITIAL_WIDTH,INITIAL_HEIGHT、xとyは0）<br>
 *    (2b) width,heightだけを指定したもの（xとyは0）<br>
 *    (2c) x,y,width,heightを指定したもの<br>
 * (3)メソッド<br>
 *    (3a) 位置を指定するvoid setLocation(int x, iny y)メソッド<br>
 *    (3b) 大きさを指定するvoid setSize(int width,int height)メソッド<br>
 *    (3c) [x, y, width, height]の形式で文字列として表現するtoStringメソッド<br>
 *    (3d) 長方形の「重なり部分」（これも長方形）を得るintersect(Rectangle r)メソッド<br>
 *    ただし、重なりがない場合にはnullを返す
 */
public class Rectangle13 {
    /* 1a */
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;
    int width;
    int height;
    int x;
    int y;

    /* 2a */
    Rectangle13() {
        width = INITIAL_WIDTH;
        height = INITIAL_HEIGHT;
        x = 0;
        y = 0;
    }

    /* 2b */
    Rectangle13(int width, int height) {
        setSize(width, height);
        x = 0;
        y = 0;
    }

    /* 2c */
    Rectangle13(int x, int y, int width, int height) {
        setSize(width, height);
        setLocation(x, y);
    }

    /* 3a */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* 3b */
    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /* 3c */
    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + width + ", " + height + "]";
    }

    /* 3d */
    Rectangle13 intersect(Rectangle13 r) {
        int sx = Math.max(this.x, r.x);
        int sy = Math.max(this.y, r.y);
        int ex = Math.min(this.x + this.width, r.x + r.width);
        int ey = Math.min(this.y + this.height, r.y + r.height);
        int newwidth = ex - sx;
        int newheight = ey - sy;
        if (newwidth > 0 && newheight > 0) {
            return new Rectangle13(sx, sy, newwidth, newheight);
        } else {
            return new Rectangle13(0, 0, 0, 0);
        }
    }

    public static void main(String[] args) {
        Rectangle13 a, b, c, d, e;
        a = new Rectangle13(0, 0, 20, 10);
        b = new Rectangle13(5, 5, 20, 10);
        c = new Rectangle13(20, 10, 20, 10);
        d = new Rectangle13(-10, -20, 100, 200);
        e = new Rectangle13(21, 11, 20, 10);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("a と a との重なり = " + a.intersect(a));
        System.out.println(" a と b との重なり = " + a.intersect(b));
        System.out.println(" a と c との重なり = " + a.intersect(c));
        System.out.println(" a と d との重なり = " + a.intersect(d));
        System.out.println(" a と e との重なり = " + a.intersect(e));

    }
}
