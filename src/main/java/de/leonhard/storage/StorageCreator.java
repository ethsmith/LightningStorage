package de.leonhard.storage;

import de.leonhard.storage.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class StorageCreator {
    File file;
    private FileType fileType;
    long lastModified;

    /**
     * Creates an empty .yml or .json file.
     *
     * @param path     Absolute path where the file should be created
     * @param name     Name of the file
     * @param fileType .yml/.file  Uses the Enum FileType
     * @throws IOException Exception thrown if file could not be created.
     */

    synchronized void create(final String path, final String name, final FileType fileType) throws IOException {
        this.fileType = fileType;
        if (path == null || path.equals("")) {
            file = new File(name + fileType.getExtension());
        } else {
            String fixedPath = path.replace("\\", "/");
            ArrayList<String> parts = new ArrayList<>(Arrays.asList(fixedPath.split("/")));
            StringBuilder datafolder = new StringBuilder();

            for (String part : parts) {
                datafolder.append(part + "/");
            }
            File folders = new File(datafolder.toString());
            if (!folders.exists()) {
                folders.mkdirs();
            }

            file = new File(fixedPath + File.separator + name + fileType.getExtension());
        }

        if (!file.exists()) {
            file.createNewFile();
        }
        lastModified = System.currentTimeMillis();
    }

    synchronized void load(final File file) {
        this.file = file;
    }

    boolean shouldReload(ReloadSettings reloadSettings) {
        if (reloadSettings.equals(ReloadSettings.manually))
            return true;

        if (reloadSettings.equals(ReloadSettings.intelligent))
            if (FileUtils.hasNotChanged(file, lastModified))
                return true;
        return false;
    }

    public File getFile() {
        return file;
    }

    public String getFilePath() {
        return file.getAbsolutePath();
    }

    public FileType getFileType() {
        return fileType;
    }
}
