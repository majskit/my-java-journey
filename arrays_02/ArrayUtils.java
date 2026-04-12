package arrays_02;

import java.util.Arrays;

public class ArrayUtils {
    public String[] createEmptyNameArray() {
        return new String[0];
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[] {
                results[2],
                results[3],
                results[4]
        };
    }

    public char[][] createKeyboard() {
        return new char[][]  {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    public void printKeyboard() {
        char[][] keyboard = createKeyboard();

        System.out.println(Arrays.toString(keyboard[0]));
        System.out.println(Arrays.toString(keyboard[1]));
        System.out.println(Arrays.toString(keyboard[2]));
        System.out.println(Arrays.toString(keyboard[3]));
    }

    public String[] makeCopy(String[] names){
        System.out.println("Copied!");
        return Arrays.copyOf(names, names.length);
    }

    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();

        String[] emptyArray = utils.createEmptyNameArray();
        System.out.println("Empty array: " + Arrays.toString(emptyArray));

        int[] ageArray = utils.createAgeArray(20, 25, 30, 35);
        System.out.println(Arrays.toString(ageArray));

        String[] names = {"Rio", "Bob", "Cala", "Dan", "Lan"};
        String[] toReplace = {"Max", "Mio"};
        utils.fixNames(names, toReplace);
        System.out.println("Fixed names: " + Arrays.toString(names));

        String[] namesTogether = {"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(utils.firstAndLastTogether(namesTogether));

        String[] results = {"First", "Second", "Third"};
        utils.changeElectResult(results);
        System.out.println("Swapped: " + Arrays.toString(results));

        String[] results2 = {"One", "Two", "Three", "Four", "Five"};
        String[] trimmedResults = utils.changeElectResultAgain(results2);
        System.out.println("Trimmed: " + Arrays.toString(trimmedResults));

        utils.printKeyboard();

        String[] source = {"Hero", "Mihu"};
        String[] copy = utils.makeCopy(source);
        source[0] = "CHANGED!";
        System.out.println("Copy after source changed: " + Arrays.toString(copy));
    }
}