package com.shop.utils;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

/**
 * @author "can"
 */
public class ImageUpload {

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

            WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
            ServletContext servletContext = webApplicationContext.getServletContext();

            //编译文件 img 绝对路径
            String path = servletContext.getRealPath("/img").
                    replace("target\\shop-web\\img",
                            "src\\main\\webapp\\img");

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
