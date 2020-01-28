package utils;
//package br.com.omni.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Thread.sleep;

/**
 * Encapsulamento do FluentWait para usos no formato:
 * perform a given task -> check for completion
 */
public class Awaiter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private ToDoOperator toDo;
    private Integer timeout = 5;
    private Integer pollingTime = 25;
    private Boolean mustIgnoreTimeout = false;
    private String message = "A operação esperada não ocorreu dentro do tempo estipulado.";

    private Awaiter(ToDoOperator toDo) {
        this.toDo = toDo;
    }

    public static Awaiter doThis(ToDoOperator toDo) {
        return new Awaiter(toDo);
    }

    public static Awaiter doNothing() {
        return new Awaiter(() -> {
        });
    }

    public Awaiter withTimeoutOf(Integer seconds) {
        this.timeout = seconds;
        return this;
    }

    public Awaiter withPollingOf(Integer miliseconds) {
        this.pollingTime = miliseconds;
        return this;
    }

    public Awaiter withMessage(String message) {
        this.message = message;
        return this;
    }

    public Awaiter ignoreTimeout() {
        this.mustIgnoreTimeout = true;
        return this;
    }

    public void until(UntilOperator until) {
        try {
            for (int timePassed = 0; timePassed < timeout * 1000; timePassed += pollingTime) {
                if (verify(until)) {
                    return;
                }
                sleep(pollingTime);
            }
        } catch (InterruptedException e) {
            logger.error("Problema na chamada do método de espera.", e);
        }
        if (!mustIgnoreTimeout) {
            throw new RuntimeException(message);
        }
    }

    private boolean verify(UntilOperator until) {
        try {
            toDo.apply();
            return until.apply();
        } catch (Exception e) {
            logger.warn("Problema ao esperar uma ação.", e);
            return false;
        }
    }

    public interface ToDoOperator {
        void apply();
    }

    public interface UntilOperator {
        boolean apply();
    }
}
