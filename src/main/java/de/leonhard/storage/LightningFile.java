package de.leonhard.storage;

import de.leonhard.storage.base.LightningBase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

class LightningFile extends StorageCreator implements LightningBase {


    private Map<String, Object> data;
    private final ReloadSettings reloadSettings;
    private File file;

    public LightningFile(final String name, final String path) {
        try {
            create(path, name, FileType.LS);
        } catch (IOException e) {
            System.err.println("Exception while creating '" + file.getName() + "'");
            e.printStackTrace();
        }
        this.reloadSettings = ReloadSettings.intelligent;
    }

    public LightningFile(final String name, final String path, final ReloadSettings reloadSettings) {

        this.reloadSettings = reloadSettings;
    }

    LightningFile(final File file) {
        this.file = file;
        this.reloadSettings = ReloadSettings.intelligent;
    }


    @Override
    public Object get(String key) {
        return null;
    }

    /**
     * Get a String from a file
     *
     * @param key Path to String in file
     * @return Returns the value
     */
    @Override
    public String getString(String key) {
        return null;
    }

    /**
     * Gets a long from a file by key
     *
     * @param key Path to long in file
     * @return String from file
     */
    @Override
    public long getLong(String key) {
        return 0;
    }

    /**
     * Gets a int from a file
     *
     * @param key Path to int in file
     * @return Int from file
     */
    @Override
    public int getInt(String key) {
        return 0;
    }

    /**
     * Get a byte from a file
     *
     * @param key Path to byte in file
     * @return Byte from file
     */
    @Override
    public byte getByte(String key) {
        return 0;
    }

    /**
     * Get a boolean from a file
     *
     * @param key Path to boolean in file
     * @return Boolean from file
     */
    @Override
    public boolean getBoolean(String key) {
        return false;
    }

    /**
     * Get a float from a file
     *
     * @param key Path to float in file
     * @return Float from file
     */
    @Override
    public float getFloat(String key) {
        return 0;
    }

    /**
     * Get a double from a file
     *
     * @param key Path to double in file
     * @return Double from file
     */
    @Override
    public double getDouble(String key) {
        return 0;
    }

    /**
     * Get a List from a file
     *
     * @param key Path to StringList in file
     * @return List
     */
    @Override
    public List<?> getList(String key) {
        return null;
    }

    /**
     * Get String List
     *
     * @param key Path to String List in file
     * @return List
     */
    @Override
    public List<String> getStringList(String key) {
        return null;
    }

    /**
     * Get a IntegerList from a file
     *
     * @param key Path to Integer-List in file
     * @return Integer-List
     */
    @Override
    public List<Integer> getIntegerList(String key) {
        return null;
    }

    /**
     * Get a Byte-List from a file
     *
     * @param key Path to Byte-List from file
     * @return Byte-List
     */
    @Override
    public List<Byte> getByteList(String key) {
        return null;
    }

    /**
     * Get a Long-List from a file
     *
     * @param key Path to Long-List in file
     * @return Long-List
     */
    @Override
    public List<Long> getLongList(String key) {
        return null;
    }

    /**
     * Gets a Map
     *
     * @param key Path to Map-List in file
     * @return Map
     */
    @Override
    public Map getMap(String key) {
        return null;
    }

    /**
     * Returns the FilePath as String
     *
     * @return FilePath as String
     */
    @Override
    public String getFilePath() {
        return null;
    }

    /**
     * Set a object to your file
     *
     * @param key   The key your value should be associated with
     * @param value The value you want to set in your file
     */
    @Override
    public void set(String key, Object value) {

    }

    /**
     * Checks wheter a key exists in the file
     *
     * @param key Key to check
     * @return Returned value
     */
    @Override
    public boolean contains(String key) {
        return false;
    }

    /**
     * Sets a value to the file if the file doesn't already contain the value (Not mix up with Bukkit addDefault)
     *
     * @param key   Key to set the value
     * @param value Value to set
     */
    @Override
    public void setDefault(String key, Object value) {

    }

    @Override
    public <T> T getOrSetDefault(String path, T def) {
        return null;
    }

//    @Override
//    public void remove(String key) {
//
//    }

    /**
     * Reloads the file
     */
    @Override
    public void update() {

    }

    @Override
    public Set<String> getKeySet() {
        return null;
    }

    @Override
    public void removeKey(String key) {

    }
}
