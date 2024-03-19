package org.error.Task03;

import java.nio.file.FileSystemNotFoundException;

public class NonExistedFileException extends FileSystemNotFoundException {
    public NonExistedFileException() {
        super("File is not found");
    }

    public NonExistedFileException(String msg) {
        super(msg);
    }
}
