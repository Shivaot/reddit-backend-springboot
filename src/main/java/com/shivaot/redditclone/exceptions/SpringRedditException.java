package com.shivaot.redditclone.exceptions;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringRedditException(String exception_occurred_while_sending_email) {
        super(exception_occurred_while_sending_email);
    }
}
