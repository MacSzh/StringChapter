import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: mac
 * Date: 13-11-5
 * Time: 下午8:26
 * To change this template use File | Settings | File Templates.
 */

public class Finding {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings") ;
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
        int i = 0;
        while (matcher.find(i)){
            System.out.print(matcher.group()+" ");
            i++  ;
        }
    }
}
