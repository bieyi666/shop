package com.shop.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author "can"
 */
public class ImageUpload {

    /**
     * 封装的将图片存入本地的方法
     * @param image MultipartFile
     * @param path 存入的地址（可不填）
     * @return 图片名
     */
    public String save_image(MultipartFile image, String path) {
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
                image.transferTo(new File(path, image_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return image_name;
    }

    /**
     * 封装的将图片存入本地的方法
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
            String path = "D:\\upload\\";
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
