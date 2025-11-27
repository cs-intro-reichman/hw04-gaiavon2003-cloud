public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String strOut = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'A') && ((c <= 'Z'))) {
                c = (char) (c + 32);
                strOut = strOut + c;
            } else {
                strOut = strOut + c;
            }
        }
        return strOut;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            boolean check = true;
            for (int j = 0; j < str2.length(); j++) {
                if (i + j >= str1.length()) {
                    return false;
                }
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    check = false;

                    break;
                }

            }
            if (check) {
                return true;
            }

        }

        return false;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String strOut = "";
        String lowerSentence = "";
        String lowerKeyword = "";
        for (int i = 0; i < sentences.length; i++) {
            lowerSentence = lowerCase(sentences[i]);
            for (int j = 0; j < keywords.length; j++) {
                lowerKeyword = lowerCase(keywords[j]);
                if (contains(lowerSentence, lowerKeyword)) {
                    System.out.println(sentences[i]);
                }

            }
        }
    }
}
