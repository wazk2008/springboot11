package com.baizhi.single;

import com.baizhi.entity.User;
import sun.security.jca.GetInstance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Single {
    private static Single single;

    private Single(){
    }

    public synchronized Single getInstance(){
        if(single == null){
            single = new Single();
        }
        return single;
    }


    public static void  main(String[] args) throws Exception {

        Class<User> userClass = User.class;
        User user = userClass.newInstance();

    }






}
