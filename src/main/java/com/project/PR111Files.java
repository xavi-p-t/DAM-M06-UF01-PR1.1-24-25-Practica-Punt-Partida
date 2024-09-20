package com.project;

import java.io.File;
import java.io.IOException;

public class PR111Files {

    public static void main(String[] args) {
        String camiFitxer = System.getProperty("user.dir") + "/data/pr111";
        gestionarArxius(camiFitxer);
    }

    public static void gestionarArxius(String camiFitxer) {
        try {
            File carp = new File("myFiles");
            if (carp.mkdir()){
                System.out.println("Se ha creado la carpeta");
            }else {
                System.out.println("Ya existe");
            }
            File fix = new File("file1.txt");
            if (fix.createNewFile()){
                System.out.println("Se ha creado fix1");
            }else {
                System.out.println("Ya existe");
            }
            File segFix = new File("file2.txt");
            if (segFix.createNewFile()){
                System.out.println("Se ha creado fix2");
            }else {
                System.out.println("Ya existe");
            }
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
