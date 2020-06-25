package Composite;

import java.util.List;

public class MainTest {
    public static void main(String[]args){
        //c盘
        Folder folder = new Folder("C:");
        //first目录
        Folder firstF = new Folder("first");
        Folder secondF = new Folder("second");
        //hello.txt文件
        File file = new File("hello.txt");
        File file1 = new File("hello1.txt");
        //把该文件和first目录放入c盘
        folder.add(firstF);
        secondF.add(file1);
        folder.add(file);
        firstF.add(secondF);
        displayTree(folder,0);
    }

    public static void displayTree(IFile rootFolder,int deep){
        //显示树名称
        rootFolder.display();
        //获得子树
        List<IFile> children = rootFolder.getChild();
        //遍历子树
        for (IFile file : children){
            if (file instanceof  File){
                for (int i = 0;i<=deep;i++){
                    System.out.print("-");
                }
                file.display();
            }else{
                for (int i = 0;i<=deep;i++){
                    System.out.print("-");
                }
                displayTree(file,deep+1);
            }
        }
    }
}
