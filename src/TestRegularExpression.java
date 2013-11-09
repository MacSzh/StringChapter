import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: mac
 * Date: 13-11-4
 * Time: 下午9:41
 * To change this template use File | Settings | File Templates.
 */
public class TestRegularExpression {
    public static void main(String[] args) {
//        if (args.length<1){
//            System.out.println("Usage:\njava TestRegularExpression"+" characterSequence regularExpression");
//            System.exit(0);
//        }
        String s[] = {"abcabcabcddabc","abc+","(abc)+","(abc){2,}"};
        System.out.println("Input: \""+s[0]+"\"");
        for (String string :s){
            System.out.println("Regular expression : \""+string+"\"");
            Pattern pattern = Pattern.compile(string);
            Matcher matcher = pattern.matcher(s[0]) ;
            while (matcher.find()){
                System.out.println("Match \""+matcher.group()+"\" at positions "+ matcher.start()+"-"+(matcher.end()-1));
            }
        }
    }
}
