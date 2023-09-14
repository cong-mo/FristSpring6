package com.slm.bean;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class MyAnnotationApplicationContexr implements MyApplicationContext{

    //创建Map集合，存储Bean对象
    private Map<Class,Object> BeanFactory = new HashMap<>();
    private String rootpath;

    @Override
    public Object getBean(Class clazz) {
        return BeanFactory.get(clazz);
    }

    private void loadBean(File file){

    }

    public MyAnnotationApplicationContexr(String Path) {
        String PackagePath=Path.replaceAll("\\.","\\\\");

        try {
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(PackagePath);

            while (urls.hasMoreElements()){
                URL url = urls.nextElement();

                String filepath = URLDecoder.decode(url.getFile(), "utf-8");
                rootpath = filepath.substring(0,filepath.length()-PackagePath.length());
                loadBean(new File(filepath));
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
