package com.shop.utils;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author "can"
 */
public class ImageUpload {

    /**
     * 获取项目绝对路径
     * @return
     */
    public Map<String, String> path() {
        Map<String, String> map = new HashMap<>();
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();

        //编译文件 img 绝对路径
        String path=servletContext.getRealPath("/img");
        //String path=request.getServletContext().getRealPath("/img");

        //webapp/img 绝对路径
        File path2=new File(path.replace("target\\shop-web\\img", "src\\main\\webapp\\img"));

        //判断webapp/img 是否存在
        if (!path2.exists()){
            path2.isDirectory(); //来判断这是不是一个文件夹。
            path2.mkdirs();//创建目录
        }

        map.put("path",path);
        map.put("path2",path2.toString());
        return map;
    }

    /**
     * 封装的将图片存入本地的方法
     *
     * @param image MultipartFile
     * @return 图片名
     */
    public String save_images(MultipartFile image) {

        // 图片名
        String image_name = null;
        // 用户选择了图片
        if (image != null) {
            image_name = System.currentTimeMillis() +
                    image.getOriginalFilename().
                            substring(image.getOriginalFilename().lastIndexOf("."));

            // 保存路径
//            String path = "D:\\upload\\";
            // 存入图片服务器
            try {
                image.transferTo(new File(path().get("path"), image_name));
                image.transferTo(new File(path().get("path2"), image_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return image_name;
    }

    /**
     * 封装的将图片存入本地的方法
     *
     * @param image MultipartFile
     * @return 图片名
     */
    public String save_image(MultipartFile image) {
        // 图片名
        String image_name = null;
        // 用户选择了图片
        if (image != null) {
            image_name = System.currentTimeMillis() +
                    image.getOriginalFilename().
                            substring(image.getOriginalFilename().lastIndexOf("."));

            // 保存路径
            String path = "F:\\upload\\";
            // 存入图片服务器
            try {
                image.transferTo(new File(path, image_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return image_name;
    }
}
