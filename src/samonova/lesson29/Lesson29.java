package samonova.lesson29;

import java.io.*;

public class Lesson29 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
        String text = "Our group is OverOne 89";
        byte[] bytes = text.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("1.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        while ((i = fileInputStream.read()) != -1) {
            char ch = (char) i;
            if (ch == ' ') {
                ch = '_';
            }
            stringBuilder.append(ch);
        }
        fileInputStream.close();
        System.out.println(stringBuilder);


        FileWriter writer = new FileWriter("D://1.txt", false);
        String text2 ="My group is OverOne 89";
        writer.write(text2);
        writer.append('\n');
        writer.write("Hello");
        writer.flush();
        writer.close();
        FileReader reader = new FileReader("D://1.txt");
        StringBuilder builder = new StringBuilder();
        int i1;
        while ((i1 = reader.read()) != -1) {

            builder.append((char)i1);
        }

        System.out.println(builder.toString());
        reader.close();

        File file1 = new File("D://1");
        boolean created = file1.mkdir();

        if (created){
            System.out.println("Папка создана");
        }
        File file2 = new File ("D://2");
        file1.renameTo(file2);
        boolean deleted = file2.delete();
        if (deleted)
            System.out.println("Папка удалена");

        File file3 = new File("D://testFolder");
        file3.mkdir(); //создали дерикторию
        if (file3.isDirectory()){
            for (File file:file3.listFiles()) {
                System.out.println(file.getName()
                        +" "+ (file.isDirectory()?"Directory ":"File"));//тернарный оператор
                if (!file.isDirectory()){
                    System.out.println("Имя файла: " + file.getName());
                    System.out.println("Родитель: " + file.getParent());
                    System.out.println("Полный путь: " + file.getAbsolutePath());
                    System.out.println("Размер файла: " + file.length());



                }
            }
    }
}}
