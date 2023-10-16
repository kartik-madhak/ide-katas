package practice;

import java.io.File;

public class WrapInsideFunction {
    public boolean isFileReadable(String fileName) {
        File file = new File(fileName); // TODO: Do a require not null check using rnn, pressing ctrl + space + space and using the wrap inside function shortcut to enclose fileName in the method
        return file.canRead();
    }
}
