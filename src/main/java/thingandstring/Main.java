package thingandstring;

public class Main {

    //1
    public static int countYZ(String input) {
        int yzCount = 0;
        input.toLowerCase();
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.charAt(word.length() - 1) == 'y' || word.charAt(word.length() - 1) == 'z') {
                yzCount++;
            }
        }
        return yzCount;
    }

    //2
    public static String removeString(String base, String remove) {
        if (base.contains(remove)) {
            base = base.replaceAll(remove, "");
            return base;
        }
        return "Remove string not found within base string!";
    }


    //3

    public static boolean containsEqualNumberOfIsAndNot(String input) {
        int numberOfIs = 0;
        int numberOfNot = 0;
        int index = input.indexOf("is");
        while (index != -1) {
            numberOfIs++;
            index = input.indexOf("is", index + 1);
        }
        index = input.indexOf("not");
        while (index != -1) {
            numberOfNot++;
            index = input.indexOf("not", index + 1);
        }
        return numberOfIs == numberOfNot; //simplified if statement
    }

    //4

    public static boolean gIsHappy(String input) {
        char[] stringToCharArray = input.toCharArray();
        if (stringToCharArray[0] == 'g') {
            if (stringToCharArray[1] != 'g') {
                return false;
            }
        }
        for (int i = 1; i < stringToCharArray.length; i++) {
            if (stringToCharArray[i] == 'g') {
                if (stringToCharArray[i - 1] == 'g' || stringToCharArray[i + 1] == 'g') {
                    continue;
                }
                return false;
            }

        }
        return true;
    }

    //5

    public static int countTriple(String input){
        char[] stringToCharArray = input.toCharArray();
        int numbOfTriple = 0;
        if (stringToCharArray.length >= 3){
            for (int i = 0 ; i < stringToCharArray.length - 2; i++){
                if (stringToCharArray[i] == stringToCharArray[i + 1] && stringToCharArray[i] == stringToCharArray[i + 2]){
                    numbOfTriple++;
                }
            }
            return numbOfTriple;
        }
        return 0;
    }

    public static void main(String[] args) {

        //1
        String str = "fez day";
        System.out.println(countYZ(str));

        //2
        System.out.println(removeString("Hello there", "x"));

        //3
        System.out.println(containsEqualNumberOfIsAndNot("noisxxnotyynotxisi"));

        //4
        System.out.println(gIsHappy("xxggyygxx"));

        //5
        System.out.println(countTriple("bbbbb"));
    }
}
