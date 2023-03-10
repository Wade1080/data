package IO;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File folder = new File("./tmp/java/");
        System.out.println("path: "+folder.getAbsolutePath());
        deleteFolder(folder);

    }

    public static void deleteFolder(File folder){
        File[] files = folder.listFiles();
        if(files!=null){
            for (File f : files) {
                if(f.isDirectory()){
                    deleteFolder(f);
                }
                else {
                    f.delete();
                }
            }
        }
    }
}
