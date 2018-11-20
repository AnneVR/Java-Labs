import java.util.List;
import static java.util.Arrays.asList;


public class JavaKeywords
{
    static final List<String> keyword = asList
            (
                    "abstract",	"continue",	"for",	"new",	"switch",
                    "assert",	"default",	"goto*",	"package",	"synchronized",
                    "boolean",	"do",	"if",	"private",	"this",
                    "break",	"double",	"implements",	"protected",	"throw",
                    "byte",	"else", "import",	"public",	"throws",
                    "case",	"enum",	"instanceof",	"return",	"transient",
                    "catch",	"extends",	"int",	"short",	"try",
                    "char",	"final",	"interface",	"static",	"void",
                    "class",	"finally",	"long",	"strictfp",	"volatile",
                    "const*",	"float",	"native",	"super",	"while"
            );

    public static boolean isKeyword(String word_)
    {
        for(int i = 0; i < keyword.size(); i++)
        {
            if (word_.equals(keyword.get(i)))
            {
                return true;
            }
        }
        return false;
    }

}
