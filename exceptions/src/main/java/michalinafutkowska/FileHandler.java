package michalinafutkowska;

public class FileHandler {

    private String filePath;
    private int noConnectors;
    private int maxFileSize;

    public FileHandler(String filePath, int noConnectors, int maxFileSize) {
        this.filePath = filePath;
        this.noConnectors = noConnectors;
        this.maxFileSize = maxFileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getNoConnectors() {
        return noConnectors;
    }

    public void setNoConnectors(int noConnectors) {
        this.noConnectors = noConnectors;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    //readContent i saveToFile metody w których umieścisz, tzw. dummy printy (będziesz drukował dowolny tekst).
    public void readContent(){
        System.out.println("read content");
    }
    public void saveToFile(){
        System.out.println("save to file");
    }

}
