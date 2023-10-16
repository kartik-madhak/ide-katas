package practice;

import java.io.File;

public class CreateAField {

    private final String fileName;

    CreateAField(String fileName) {
        this.fileName = fileName;

        File file = new File(fileName); // TODO: use create field shortcut to create a field for this variable
        if (file.canRead()) {
            System.out.println("Can read file");
        } else {
            System.out.println("Cannot read file");
        }
    }

    public boolean canWrite() {
        File file = new File(fileName); // TODO: remove this line and use the field instead
        return file.canWrite();
    }
}
