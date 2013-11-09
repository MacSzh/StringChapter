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
    public static final String  STRING =
            "As long as there is injustice,whenever a\n"+
                    "Targathian baby cries out wherever a distress\n"+
                    "signal sounds among the stars ... We'll be there.\n"+
                    "This fine ship,and this fine crew ...\n"+
                    "Never give up!Never surrender!";
    public static void main(String[] args) {
       /* String s[] = {"abcabcabcddabc","abc+","(abc)+","(abc){2,}"};
        System.out.println("Input: \""+s[0]+"\"");
        for (String string :s){
            System.out.println("Regular expression : \""+string+"\"");
            Pattern pattern = Pattern.compile(string);
            Matcher matcher = pattern.matcher(s[0]) ;
            while (matcher.find()){
                System.out.println("Match \""+matcher.group()+"\" at positions "+ matcher.start()+"-"+(matcher.end()-1));
            }
        }*/

//        group
       /* Pattern pattern = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
         Matcher matcher = pattern.matcher(STRING);
        while (matcher.find()){
            for (int i = 0; i <=matcher.groupCount() ; i++) {
                System.out.print("["+matcher.group(i)+"]");
            }
            System.out.println();
        }*/

//        start() and end()
         Pattern pattern = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
         Matcher matcher = pattern.matcher(STRING);
        while (matcher.find()){
            for (int i = 0; i <=matcher.groupCount() ; i++) {
                System.out.print("["+matcher.group(i)+"]");
                System.out.println("===start="+matcher.start()+"--end="+matcher.end());
            }
        }
    }
}
