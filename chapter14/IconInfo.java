package chapter14;

import java.awt.*;

/**
 * 問題14-3 次のメソッドとフィールドを持つ、IconInfoというインタフェースを宣言する<br>
 * ・引数はint型で仮引数の名前はiconType、戻り値の型はImage型で、名前がgetIconであるメソッド<br>
 * ・型はintで名前はICON_16x16、値は1であるフィールド<br>
 * ・型はintで名前はICON_32x32、値は2であるフィールド<br>
 */
public interface IconInfo {
    Image getIcon(int iconType);

    int ICON_16x16 = 1;
    int ICON_32x32 = 2;
}
