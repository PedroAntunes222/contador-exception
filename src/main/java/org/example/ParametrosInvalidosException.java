package org.example;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("O segundo número não é maior que o primeiro número.");
    }

}
