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
}

