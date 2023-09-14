package com.slm.spring.resource;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;
import java.net.MalformedURLException;

public class URLResource {

    public void loadUrlResource(String path){
        try {
            UrlResource urlResource = new UrlResource(path);

            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            InputStream inputStream = urlResource.getInputStream();
            byte[] b = new byte[1024];
            while (inputStream.read(b) != -1){
                System.out.println(b.toString());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void tt(){
        loadUrlResource("file:test.txt");
    }

}
