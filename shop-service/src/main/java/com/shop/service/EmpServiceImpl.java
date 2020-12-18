package com.shop.service;

import com.github.pagehelper.PageHelper;
import com.shop.dao.EmpDao;
import com.shop.vo.Emp;
import com.shop.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author "can"
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public PageVo<Emp> seEmp(String conditions, int rows, int page) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("conditions", conditions);

        PageVo<Emp> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(empDao.seEmp(map));
        //获取总的记录数量
        pageVo.setTotal(empDao.seEmpCount(map));
        return pageVo;
    }

    @Override
    public boolean upEmp(Integer id, String name, String sex, Integer age, String phone, String address, String img) {
        Map<String, Object> map = new HashMap<>(7);
        map.put("id", id);
        map.put("name", name);
        map.put("sex", sex);
        map.put("age", age);
        map.put("phone", phone);
        map.put("address", address);
        map.put("img", img);

        return empDao.upEmp(map) > 0;
    }


    @Override
    public boolean inEmp(String name, String sex, Integer age, String phone, String address, String img) {
        Map<String, Object> map = new HashMap<>(6);

        map.put("name", name);
        map.put("sex", sex);
        map.put("age", age);
        map.put("phone", phone);
        map.put("address", address);
        map.put("img", img);

        return empDao.inEmp(map) > 0;
    }

    @Override
    public boolean delEmp(Integer id) {
        return empDao.delEmp(id) > 0;
    }

    @Override
    public boolean inEmpRole(Integer eid, Integer rid) {
        Map<String, Object> map = new HashMap<>(6);
        map.put("eid", eid);
        map.put("rid", rid);

        return empDao.inEmpRole(map) > 0;
    }

    @Override
    public boolean delEmpRole(Integer eid, Integer rid) {
        Map<String, Object> map = new HashMap<>(6);
        map.put("eid", eid);
        map.put("rid", rid);

        return empDao.delEmpRole(map) > 0;
    }
}
