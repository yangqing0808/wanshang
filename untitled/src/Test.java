import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("F：/a");
        showFile(file);
    }
    public static  void showFile(File file){
        if(file.isDirectory()){//出口
           File files[]=file.listFiles();
           for(File f:files){
                 //开始递归
               showFile(f);
           }
        }else{
            System.out.println(file.getName());
        }
    }

}
