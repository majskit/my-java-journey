public class StringUtils  {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf(name.charAt(name.length() - 1));
        return code.toUpperCase();
    }

    public boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';

        return firstLetterOk && lastLetterOk;
    }

    public boolean isInvisibleName(String name) {
        return name.strip().isEmpty();
    }

    public String makeNamePositive(String name) {
        return name
                .replace("no", "yes")
                .replace("No", "yes")
                .replace("nO", "yes")
                .replace("NO", "yes");
    }

    public String makeNameClean(String name) {
        return "CLEAN" + name.strip() + "CLEAN";
    }
    
    public String makeHalfOfName(String name){
        int lettersQuantity = name.length();
        if (lettersQuantity % 2 == 0){
            int half = lettersQuantity / 2;

            return name.substring(0, half);
        }
        return name.substring(0, (lettersQuantity-1)/2);
    }

    public static void main(String[] args) {
        StringUtils names = new StringUtils ();

        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);

        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);

        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + halfOfName);
    }
}