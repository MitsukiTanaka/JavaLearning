package chapter10;

/**
 * 問題10-5 List10-5<br>
 * 3教科の試験の合計点を学生ごとに表示するプログラム<br>
 */
public class Student {
    String name;    // 氏名
    int[] tens;     // 試験の点数

    public Student(String name, int x, int y, int z) {
        this.name = name;
        tens = new int[]{x, y, z,};
    }

    @Override
    public String toString() {
        String s = "[" + name;
        for (int i = 0; i < tens.length; i++) {
            s += ", " + tens[i];
        }
        s += "]";
        return s;
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < tens.length; i++) {
            sum += tens[i];
        }
        return sum;
    }
}
