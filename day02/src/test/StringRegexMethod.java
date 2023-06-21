package test;

public class StringRegexMethod {
    public static void main(String[] args) {
        String s = "臣亮言：先帝(1)创业(2)未半而中道(3)崩殂(4)，今(5)天下三分(6)，益州疲弊(7)，此(8)诚危急存亡之秋也";
        String replace = s.replaceAll("[(]\\d[)]", "");
        System.out.println(replace);
    }
}
