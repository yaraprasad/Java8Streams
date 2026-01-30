package com.java.version.eight.custom.optional.classes;

import java.util.NoSuchElementException;

public final class MyCustomOptional<T> {

    private static final MyCustomOptional<?> EMPTY = new MyCustomOptional<>(null);

    private final T value;

    // private constructor → forces use of factory methods
    private MyCustomOptional(T value){
        this.value=value;
    }

    // ---------- of() ----------
    public static <T> MyCustomOptional<T> of(T value) {
        if (value == null) {
            throw new NullPointerException("Value cannot be null");
        }
        return new MyCustomOptional<>(value);
    }
    // ---------- of( VarArgs )  Not required ----------
    public static <T> MyCustomOptional<T> of(T... values) {

        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value is required");
        }

        if (values.length > 1) {
            throw new IllegalArgumentException(
                    "Optional can contain only one value"
            );
        }

        if (values[0] == null) {
            throw new NullPointerException("Value cannot be null");
        }

        return new MyCustomOptional<>(values[0]);
    }

    // ---------- empty() ----------
    @SuppressWarnings("unchecked")
    public static <T> MyCustomOptional<T> empty() {
        return (MyCustomOptional<T>) EMPTY;
    }

    // ---------- isPresent() ----------
    public boolean isPresent() {
        return value != null;
    }

    // ---------- get() ----------
    public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

}
