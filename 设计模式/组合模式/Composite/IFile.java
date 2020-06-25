package Composite;

import java.util.List;

/*
文件节点抽象
 */
public interface IFile {
    //显示文件或文件夹
    public void display();

    //添加
    public boolean add(IFile file);

    //移除
    public boolean remove(IFile file);

    //获取子节点
    public List<IFile> getChild();
}
