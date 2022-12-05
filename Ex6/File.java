package com.metanit.Ex6;

import java.util.*;

public class File {

    public static String getLine(String s) {

        Queue<String> queue = new ArrayDeque<>(Arrays.asList(s.split(" ")));

        List <String> list = new ArrayList<>();

        list.add(queue.peek());
        StringBuilder sb = new StringBuilder(queue.remove());
        boolean LIST= true;

        while(!queue.isEmpty() && LIST){
            LIST = false;

            for (int i = 0; i <queue.size(); i++) {
                String Q = queue.remove();

                if(Q.startsWith(sb.substring(sb.length()-1).toLowerCase()) || Q.startsWith(sb.substring(sb.length()-1).toUpperCase())){
                    sb.append(" ").append(Q);
                    LIST = true;
                    list.add(Q);
                    break;
                }
                queue.add(Q);
            }

        }
        return sb.toString();
    }
}
