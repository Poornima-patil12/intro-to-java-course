package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    public Boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("File name cannot be null or empty");
        }

        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex != -1) {
            String extension = filename.substring(dotIndex);

            return extension.equals(".java");
        }

        return false;
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String fileName : filenames) {
            try {
                boolean isJavaFile = this.check(fileName);

                resultMap.put(fileName, isJavaFile ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(fileName, -1);
            }
        }

        return resultMap;
    }
}