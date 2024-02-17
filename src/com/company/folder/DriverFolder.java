package com.company.folder;

public class DriverFolder
{
    public static void main(String[] args) {

        Folder phpFolder = new Folder();
        phpFolder.setName("php_demo1");

        // php_demo1 folder contents
        Folder sourceFilesFolder = new Folder();
        sourceFilesFolder.setName("Source Files");
        Folder includePathFolder = new Folder();
        includePathFolder.setName("Include Path");
        Folder remoteFilesFolder = new Folder();
        remoteFilesFolder.setName("Remote Files");

        phpFolder.addSubFolder(sourceFilesFolder);
        phpFolder.addSubFolder(includePathFolder);
        phpFolder.addSubFolder(remoteFilesFolder);

        // source files folder contents
        Folder phalconFolder = new Folder();
        phalconFolder.setName(".phalcon");
        Folder appFolder = new Folder();
        appFolder.setName("app");
        Folder cacheFolder = new Folder();
        cacheFolder.setName("cache");
        Folder publicFolder = new Folder();
        publicFolder.setName("public");
        File htaccessFile = new File();
        htaccessFile.setName(".htaccess");
        File htrouterFile = new File();
        htrouterFile.setName(".htrouter.php");
        File indexHtmlFile = new File();
        indexHtmlFile.setName("index.html");

        sourceFilesFolder.addSubFolder(phalconFolder);
        sourceFilesFolder.addSubFolder(appFolder);
        sourceFilesFolder.addSubFolder(cacheFolder);
        sourceFilesFolder.addSubFolder(publicFolder);
        sourceFilesFolder.addFile(htaccessFile);
        sourceFilesFolder.addFile(htrouterFile);
        sourceFilesFolder.addFile(indexHtmlFile);

        // app folder contents
        Folder configFolder = new Folder();
        configFolder.setName("config");
        Folder controllersFolder = new Folder();
        controllersFolder.setName("controllers");
        Folder libraryFolder = new Folder();
        libraryFolder.setName("library");
        Folder migrationsFolder = new Folder();
        migrationsFolder.setName("migrations");
        Folder modelsFolder = new Folder();
        modelsFolder.setName("models");
        Folder viewsFolder = new Folder();
        viewsFolder.setName("views");

        appFolder.addSubFolder(configFolder);
        appFolder.addSubFolder(controllersFolder);
        appFolder.addSubFolder(libraryFolder);
        appFolder.addSubFolder(migrationsFolder);
        appFolder.addSubFolder(modelsFolder);
        appFolder.addSubFolder(viewsFolder);

        System.out.println("\nCOMPOSITION");

        System.out.println("\n1) Initial Folder Structure\n");
        phpFolder.print();

        System.out.println("\n2) 'app' Folder Deleted\n");
        sourceFilesFolder.removeSubFolder(appFolder);
        phpFolder.print();

        System.out.println("\n3) 'public' Folder Deleted\n");
        sourceFilesFolder.removeSubFolder(publicFolder);
        phpFolder.print();
    }
}
