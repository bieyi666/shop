package com.shop.controller;

import com.shop.service.StoreService;
import com.shop.utils.ImageUpload;
import com.shop.vo.PageVo;
import com.shop.vo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//商户
@Controller
public class StoreController {

    @Autowired
    StoreService storeService;

    /**
     * 根据用户编号 查询商户信息
     * @param uid
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/queryStoreByUid.action")
    @ResponseBody
    public StoreInfo queryStoreByUid(int uid) {
        return storeService.queryStoreByUid(uid);
    }

    /**
     * 根据商户编号 修改商户信息
     * @param storeInfo
     * @return
     */
    @CrossOrigin //跨域
    @RequestMapping("/updateStoreInfoBySid.action")
    @ResponseBody
    public String updateStoreInfoBySid(StoreInfo storeInfo, MultipartFile image) {
        ImageUpload imageUpload=new ImageUpload();
        String img=imageUpload.save_image(image);
        storeInfo.setPhoto(img);
        int num=storeService.updateStoreInfoBySid(storeInfo);
        if (num>0){
            return "修改成功";
        }
        return "修改失败";
    }



//    public int storeApply(StoreInfo storeInfo);

    @CrossOrigin
    @RequestMapping("/storeApply.action")
    @ResponseBody
    public Map storeApply(StoreInfo storeInfo, MultipartFile img){
        Map<String,String> map =new HashMap<String,String>();

        ImageUpload imageUpload=new ImageUpload();
        String ImgName=imageUpload.save_image(img);
        storeInfo.setPhoto(ImgName);

        int num = storeService.storeApply(storeInfo);
        if(num == 1){
            map.put("code","0");
            map.put("msg","申请提交成功");
        }else {
            map.put("code","1");
            map.put("msg","申请提交失败");
        }
        return map;
    }
//    public PageVo<StoreInfo> queryStoreApply(StoreInfo storeInfo,int page, int rows);
    @CrossOrigin
    @RequestMapping("/queryStoreApplyData.action")
    @ResponseBody
    public PageVo queryStoreApplyData(StoreInfo storeInfo,
                                      @RequestParam(value = "page",defaultValue = "1") int page,
                                      @RequestParam(value = "rows",defaultValue = "5") int rows){
        PageVo<StoreInfo> pageVo = storeService.queryStoreApply(storeInfo,page,rows);
        return pageVo;
    }

//    public int applyAudit(@Param("storeid") int storeid, @Param("results") int results);
    @CrossOrigin
    @RequestMapping("/applyAudit.action")
    @ResponseBody
    public int applyAudit(int storeid,int results){
        return storeService.applyAudit(storeid,results);
    }

//    public PageVo<StoreInfo> queryAllStore(StoreInfo storeInfo,int page, int rows);
    @CrossOrigin
    @RequestMapping("/queryAllStore.action")
    @ResponseBody
    public PageVo<StoreInfo> queryAllStore(StoreInfo storeInfo,
                                           @RequestParam(value = "page",defaultValue = "1") int page,
                                           @RequestParam(value = "rows",defaultValue = "5") int rows){
        PageVo<StoreInfo> pageVo = storeService.queryAllStore(storeInfo,page,rows);
        return pageVo;
    }

    @CrossOrigin
    @RequestMapping("/pdStore.action")
    @ResponseBody
    public StoreInfo pdStore(int uid){
        return storeService.pdStore(uid);
    }
}
