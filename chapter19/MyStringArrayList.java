package chapter19;

/**
 * 問題19-3　以下のようなクラス MyStringArrayList を作る<br>
 * ・コンストラクタの中でINITIAL_CAPACITY個の要素を持つStringの配列を、arフィールドに確保する<br>
 * ・addメソッドで要素を追加する。配列がいっぱいの場合は、長さを二倍にした新しい配列を確保したうえで追加する<br>
 * ・getメソッドで要素を参照する。添字が範囲外なら、例外IndexOutOfBoundsException を throw する<br>
 * ・sizeメソッドで格納されている要素数（ar.lengthではない）を返す<br>
 */
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        ar = new String[INITIAL_CAPACITY];
        sz = 0;
    }

    public void add(String s) {
        if (ar.length == sz) {
            String[] ar2 = new String[ar.length * 2];
            System.arraycopy(ar, 0, ar2, 0, ar.length);
            ar = ar2;
        }
        ar[sz] = s;
        sz++;
    }

    public String get(int n) {
        if (0 <= n && n < sz) {
            return ar[n];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return sz;
    }

    public static void main(String[] args) {
        MyStringArrayList myList = new MyStringArrayList();
        /* 要素の追加 */
        myList.add("テスト1");
        myList.add("テスト2");
        myList.add("テスト3");
        myList.add("テスト4");
        myList.add("テスト5");

        /* 要素の参照 */
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
