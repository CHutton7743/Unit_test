import java.util.ArrayList;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String word = getString();
        int caps = 0;
        for (int i = 0; i < word.length() ; i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                caps++;
            }
        }
        if(caps == 1 || caps == word.length() || caps == 0) {
            return true;
        } else {
            return false;
        }
    }
    public String[] getSubStrings(int startWord, int endWord){
        ArrayList<String> subStringCount = new ArrayList<>();
        StringBuilder word= new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == ' ') {
                subStringCount.add(word.toString().trim());
                word = new StringBuilder();
            }
            word.append(myString.charAt(i));
        }
        subStringCount.add(word.toString().trim());
        return subStringCount.toArray(new String[subStringCount.size()]);
    }
}

