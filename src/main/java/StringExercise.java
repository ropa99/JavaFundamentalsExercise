public class StringExercise {

    public static void main(String[] args) {
        String str1 = "Java";
        System.out.println("Length of string \"Java\" is :" + str1.length());

        String str2 = "Long example sentence";
        System.out.println("Char at position 6: " + str2.charAt(6));

        String str3 = "Even longer example sentence";
        System.out.println("Index position of 'o' is: " + str3.indexOf('o'));

        String str4 = "Ok this is not as long!";
        System.out.println("Substring \"not as long \" of string \"Ok this is not as long!\" :" + str4.substring(11, 22));

        String str5 = "Java is the worst programming language!";
        System.out.println("Correct the worst with the best: " + str5.replace("worst", "best"));

        String str6 = "\tJ\ta\tv\ta\t";
        System.out.println("After trim: " + str6.trim());

        int value = 20;
        String str7 = "20";
        System.out.println("2020: " + str7 + Integer.toString(value));

        //Several ways of doing this, uncomment and try
        String str8 = "Oil and Water";
        String[] strArr = new String[]{str8.substring(0, 3), str8.substring(8, 13)};
        //String[] strArr = new String[]{"Oil", "Water"};
        /*String[] strArr = new String[2];
        strArr[0] = "Oil";
        strArr[1] = "Water";
         */
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("strArr[" + i + "] = " + strArr[i]);
        }
        System.out.println("*********************************");

        String str9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] strArr2 = str9.split(",", 5);
        for (int i = 0; i < strArr2.length; i++) {
            System.out.println("strArr2[" + i + "] = " + strArr2[i]);
        }

        System.out.println("*********************************");

        String str10 = "ThisShouldBeConverted";
        char[] charArr = str10.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            System.out.println("charArr[" + i + "] = " + charArr[i]);
        }

        char[] charArr2 = {'J', 'a', 'v', 'a'};
        String str11 = String.copyValueOf(charArr2);
        System.out.println("Char array to string(): " + str11);
    }
}
