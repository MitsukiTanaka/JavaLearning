package chapter18;
import java.io.*;

/**
 * 問題18-2 ファイル中に特定の文字列を含んでいるかどうかを調べるプログラム<br>
 * 起動の時の引数は、<br>
 * java FindFile1 検索文字列 検索対象ファイル<br>
 * のようにして、文字列が見つかったらその行の行番号と、その行そのものを表示する<br>
 */
public class FindFile1 {
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("使用方法：java FindFile1 検索文字列 検索対象ファイル");
            System.out.println("例：java FindFile1 System FindFile1");
            System.exit(0);
        }
        String findstring = args[0];
        String filename = args[1];
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line;
            int linenum = 1;
            while ((line = reader.readLine()) != null) {
                int n = line.indexOf(findstring);
                if (n >= 0) {
                    System.out.println(linenum + ":" + line);
                }
                linenum++;
            }
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println(filename + "が見つかりません。");
        }catch (IOException e){
            System.out.println("I/Oエラーです。" );
        }
    }
}
