package com.company.folder;

import java.util.ArrayList;
import java.util.List;

class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder()
    {
        this("defaultFolder");
    }

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeSubFolder(Folder folder)
    {
        subFolders.remove(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void print()
    {
        print(0);
    }


    public void print(int folderDepth) {

        StringBuilder initialStartingSpace = new StringBuilder();

        int calculateDepth = folderDepth;
        while (calculateDepth > 0)
        {
            initialStartingSpace.append("\t");
            calculateDepth--;
        }

        System.out.println(initialStartingSpace.toString() + ">" + name);
        for (Folder subFolder : subFolders) {
            subFolder.print(folderDepth + 1);
        }

        initialStartingSpace.append("\t");
        for (File file : files) {
            System.out.print(initialStartingSpace.toString());
            file.print();
        }
    }
}