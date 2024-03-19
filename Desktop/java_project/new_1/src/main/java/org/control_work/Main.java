package org.control_work;

import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Parsing parsData = new Parsing("0", "1" ,"2");
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new Data();
            } catch (Data e) {
                data = parsData.parsInputData();
            }
        }

        String newFileName = data.get("lastName") + "Error.txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }

        System.out.println(data);
        String filePath = newFileName;
        writeFile.writeData(String.valueOf(sb), filePath);

    }
}

