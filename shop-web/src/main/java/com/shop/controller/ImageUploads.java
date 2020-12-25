package com.shop.controller;

import com.shop.utils.ImageUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 * 图片上传
 */
@CrossOrigin
@Controller
public class ImageUploads {


    /**
     * 图片上传
     * @param file
     * @return
     */
    @RequestMapping("/ImageUpload.action")
    @ResponseBody
    public String ImageUploads(MultipartFile file){
        ImageUpload imageUpload=new ImageUpload();
        String value=imageUpload.save_image(file);
        return value;
    }
}
