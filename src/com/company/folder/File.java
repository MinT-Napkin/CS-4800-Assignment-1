package com.company.folder;

class File {
    private String name;

    public File()
    {
        this("defaultFile.txt");
    }

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
