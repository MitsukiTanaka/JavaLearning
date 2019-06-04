package chapter11;

/**
 * 問題11-6  引数を1つにする<br>
 * <pre>{@code
 *  public class Rectangle10 {
 *     ...
 *
 *     // 2つのRectangleを比較して、等しかったらture,
 *     // 等しくなかったらfalseを返す
 *     boolean areSame(Rectangle10 a, Rectangle10 b) {
 *         if (a == null || b == null) {
 *             return false;
 *         } else if (a.width == b.width && a.height == b.height) {
 *             return true;
 *         } else {
 *             return false;
 *         }
 *     }
 * }
 * }</pre>
 */
public class Rectangle10 {
    int width;
    int height;

    Rectangle10(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    boolean equals(Rectangle10 r) {
        if (r == null) {
            return false;
        } else if (this.width == r.width && this.height == this.height) {
            return true;
        } else {
            return false;
        }
    }
}
