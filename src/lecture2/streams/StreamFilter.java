package lecture2.streams;

import java.util.List;
import java.util.Set;

public class StreamFilter {
    static List<String> filterBadWords(List<String> words, Set<String> badWords) {
        return words.stream()
                .filter(word -> !badWords.contains(word))
                .toList();
    }

    static List<String> filterFalseStrings(List<String> strings) {
        return strings.stream()
                .filter(Boolean::valueOf)
                .toList();
    }

    static List<Character> keepDigits(List<Character> chars) {
        return chars.stream()
                .filter(Character::isDigit)
                .toList();
    }
}
