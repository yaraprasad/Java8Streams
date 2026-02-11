package com.java.version.eight.streams.level.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

;

public class BiGramFrequencies {
    public static void main(String[] args) {
    //Q. Find Bigram frequencies (Pair of consecutive words) in Paragraphs.
        String paragraph= "Java is great and Java is fun. Java is powerful!. Java is Cool!!";

        String[] words = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ");
        System.out.println(words);
        //[java, is, great, and, java, is, fun, java, is, powerful, java, is, cool];
        List<String> out = IntStream.range(0, words.length - 1)
                .mapToObj(i -> words[i] + " " + words[i + 1])
                .collect(Collectors.toList());
        System.out.println(out);
        //[java is, is great, great and, and java, java is, is fun, fun java, java is, is powerful, powerful java, java is, is cool]
        Map<String, Long> result = out.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(result);
        //{is cool=1, and java=1, is great=1, powerful java=1, is fun=1, great and=1, fun java=1, is powerful=1, java is=4}
    }
}
  