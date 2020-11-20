import java.util.Scanner;

public class s194 {
    public  void s194() {
        String str = "//import java.util.Scanner;\n" +
                "\n" +
                " class s1944 {\n" +
                "    public static void main(String[] args) {\n" +
                "        //System.out.println();\n" +
                "        //System.out.print(\"Введите ваш код:\\n \");\n" +
                "        //int x =0;\n" +
                "        Scanner in = new Scanner(System.in);\n" +
                "        String str = in.nextLine();\n" +
                "        String partialFiltered = str.replaceAll(\"/\\\\*.*\\\\*/\", \"\");\n" +
                "        String fullFiltered = partialFiltered.replaceAll(\"//.*(?=\\\\n)\", \"\");\n" +
                "        System.out.println(\"Ваш код:\\n\"+fullFiltered);\n" +
                "    }\n" +
                "}";
        String partialFiltered = str.replaceAll("/\\*.*\\*/", "");
        String fullFiltered = partialFiltered.replaceAll("//.*(?=\\n)", "");
        System.out.println(fullFiltered);
    }
}
