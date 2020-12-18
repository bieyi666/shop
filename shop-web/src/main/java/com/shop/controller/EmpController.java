package com.shop.controller;

import com.shop.service.EmpService;
import com.shop.vo.Emp;
import com.shop.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author "can"
 */
@CrossOrigin
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "seEmp.action")
    public PageVo<Emp> seEmp(String conditions,
                             @RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "rows", defaultValue = "5") Integer rows) {
        return empService.seEmp(conditions, rows, page);
    }

    @RequestMapping(value = "upEmp.action")
    public boolean upEmp(Integer id, String name, String sex, Integer age, String phone,
                         String address, MultipartFile img) {

        String imgName = save_image(img);
        return empService.upEmp(id, name, sex, age, phone, address, imgName);
    }

    @RequestMapping(value = "inEmp.action")
    public boolean inEmp(String name, String sex, Integer age, String phone,
                         String address, MultipartFile img) {

        String imgName = save_image(img);
        if (imgName == null) {
            imgName = "3.png";
        }
        return empService.inEmp(name, sex, age, phone, address, imgName);
    }

    @RequestMapping(value = "delEmp.action")
    public boolean delEmp(Integer id) {
        return empService.delEmp(id);
    }

    @RequestMapping(value = "inEmpRole.action")
    public boolean inEmpRole(Integer eid, Integer rid) {
        return empService.inEmpRole(eid, rid);
    }

    @RequestMapping(value = "delEmpRole.action")
    public boolean delEmpRole(Integer eid, Integer rid) {
        return empService.delEmpRole(eid, rid);
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
