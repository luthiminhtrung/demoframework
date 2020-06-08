package dataProvider;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private FileReaderManager(){
    }
    /**
     * The FileReaderManager class maintains a static reference to its own instance and returns that reference from the static getInstance() method.
     * @return
     */
    public static FileReaderManager getInstance(){
        return fileReaderManager;
    }
    /**
     * getConfigReader() method returns the instance of the ConfigFileReader but this method is not static. So that client has to use the getInstance() method to access other public methods of the FileReaderManager like FileReaderManager.getInstance().getConfigReader()
     * An example of using this function: FileReaderManager.getInstance().getConfigReader().getDriverPath()
     * @return
     */
    public ConfigFileReader getConfigReader(){
        return  (configFileReader==null) ? new ConfigFileReader() : configFileReader;
    }
}
