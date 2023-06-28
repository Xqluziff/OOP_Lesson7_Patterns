package calculator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

public class Log implements Logger{

    @Override
    public void writeLog(String str) {

        try {
            File file = new File("Logi.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
