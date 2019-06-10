package chapter14;

/**
 * 問題14-4<br>
 * 以下のMyMediaPlayableインタフェースを拡張して、MySoundPlayableという名前のサブインタフェースを宣言する<br>
 * また、次のメソッドを追加する<br>
 * String getSoundName();<br>
 * <pre>{@code
 * interface MyMediaPlayable {
 *     void play();
 *     void stop();
 *     void loop();
 * }
 * }</pre>
 */
interface MySoundPlayable extends MyMediaPlayable {
    String getSoundName();

}
