package com.shop.service;

import com.shop.dao.ShoppingCatDao;
import com.shop.vo.ShoppingCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author "can"
 */
@Service
public class ShoppingCatServiceImpl implements ShoppingCatService {

    @Autowired
    private ShoppingCatDao shoppingCatDao;

    @Override
    public List<List<Map>> seShoppingCat(Integer uid) {
        // 查出购物车数据
        List<ShoppingCat> list = shoppingCatDao.seShoppingCat(uid);

        List<Map> list1 = new ArrayList<>();
        List<List<Map>> list2 = new ArrayList<>();
        // 拼成我需要的数据 根据类型分类
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && !list.get(i - 1).getTid().equals(list.get(i).getTid())) {
                list2.add(list1);
                list1 = new ArrayList<>();
            }
            Map<String, Object> map = new HashMap<>(9);
            map.put("id", list.get(i).getId());
            map.put("name", list.get(i).getCommodity().getCName());
            map.put("inventory", list.get(i).getInventory());
            map.put("number", list.get(i).getNumber());
            map.put("price", list.get(i).getCommodity().getPrice());
            map.put("img", list.get(i).getCommodity().getPicture());
            map.put("type", list.get(i).getCommodityTypes().get(0) + "-" + list.get(i).getCommodityTypes().get(1));
            map.put("subtotal", list.get(i).getCommodity().getPrice() * list.get(i).getNumber());
            map.put("checked", false);
            map.put("sid", list.get(i).getCommodity().getCId());
            list1.add(map);
            if (i == list.size() - 1) {
                list2.add(list1);
            }
        }

        // 排序 id大的放前边
        // 内层list的map排序
        for (int i = 0; i < list2.size(); i++) {
            Collections.sort(list2.get(i), new Comparator<Map>() {
                @Override
                public int compare(Map o1, Map o2) {
                    int diff = (int) o1.get("id") - (int) o2.get("id");
                    if (diff < 0) {
                        return 1;
                    } else if (diff > 0) {
                        return -1;
                    }
                    return 0; // 相等为0
                }
            });
        }
        // 外层list的list排序
        Collections.sort(list2, new Comparator<List<Map>>() {
            @Override
            public int compare(List<Map> o1, List<Map> o2) {
                int diff = (int) o1.get(0).get("id") - (int) o2.get(0).get("id");
                if (diff < 0) {
                    return 1;
                } else if (diff > 0) {
                    return -1;
                }
                return 0; // 相等为0
            }
        });

        return list2;
    }

    @Override
    public boolean delShoppingCat(Integer id) {
        return shoppingCatDao.delShoppingCat(id) > 0;
    }

    @Override
    public boolean delShoppingCatBat(List<Integer> list) {
        return shoppingCatDao.delShoppingCatBat(list) > 0;
    }

    @Override
    public boolean inShoppingCat(Integer uid, Integer tid, Integer sid, Integer number, Integer inventory) {
        Map<String, Object> map = new HashMap<>(5);
        map.put("uid", uid);
        map.put("tid", tid);
        map.put("sid", sid);
        map.put("number", number);
        map.put("inventory", inventory);
        return shoppingCatDao.inShoppingCat(map) > 0;
    }

    @Override
    public boolean upShoppingCatGoodsNum(Integer uid, Integer sid) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("uid", uid);
        map.put("sid", sid);
        return shoppingCatDao.upShoppingCatGoodsNum(map) > 0;
    }
}
