package onlyjava;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashset {


    public static void stringSet(){
        Set<String> st = new HashSet<>();
        st.add("Amit");
        st.add("Tomar");
        System.out.println(st);
    }

    public static void main(String[] args) {

        stringSet();

    }
}
