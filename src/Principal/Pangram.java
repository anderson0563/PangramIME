package Principal;

import java.util.Arrays;

public class Pangram {
    private String phrase;

    public Pangram(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    private boolean internVerification(String phrase){
        phrase = phrase.toLowerCase();
        phrase = phrase.replace(" ", "");
        char[] phraseArray = phrase.toCharArray();
        Arrays.sort(phraseArray);
        for(int i=0; i< phraseArray.length-1; i++){
            if(!( phraseArray[i+1] - phraseArray[i] <= 1))
                return false;
        }
        return true;
    }

    public boolean verification(){
        return(internVerification(this.phrase));
    }
}
