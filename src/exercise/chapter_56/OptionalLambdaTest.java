package exercise.chapter_56;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest { // 9
    public static void main(String[] args) {
        String str = "abc";
        Optional<String> stringOptional  = Optional.ofNullable(str);

        Supplier<String> stringSupplier = () -> "default";
        String str2= stringOptional.orElseGet(stringSupplier)
                .toUpperCase();
        System.out.println(str2);
    }
}
