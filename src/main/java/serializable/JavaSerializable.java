package serializable;

import java.io.*;
import java.util.ArrayList;

public class JavaSerializable implements Serializable {


    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("JavaMan","1234",30);
            UserInfo u2 = new UserInfo("JavaWoman","4321",26);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            // 객체를 직렬화한다.
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화가 잘 끝났습니다.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    } // main

    public static class UserInfo implements Serializable{
        String name;
        String password;
        int age;

        public UserInfo(String name, String password, int age) {
            this.name = name;
            this.password = password;
            this.age = age;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
