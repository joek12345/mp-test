package com.lazy.goods;

import com.lazy.enums.StatusEnum;
import com.lazy.mapper.ProductsMapper;
import com.lazy.pojo.Products;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Joe_Lazy
 * Date: 2023/4/28 23:45:20
 */
@SpringBootTest
public class TestPlugins {

    @Autowired
    private ProductsMapper productsMapper;

    @Test
    void testList() {
        List<Products> products = productsMapper.selectList(null);
        products.forEach(System.out::println);
    }


    //  乐观锁
    @Test
    void testProduct() {
        // 员工A查询数据
        Products productA = productsMapper.selectById(1);
        System.out.println("员工A查询到的商品价格：" + productA.getPrice());
        // 员工B查询数据
        Products productB = productsMapper.selectById(1);
        System.out.println("员工B查询到的商品价格：" + productB.getPrice());

        // 员工A将商品价格增加 50
        productA.setPrice(productA.getPrice() + 50);
        productsMapper.updateById(productA);
        // 员工B将商品价格减少 30
        productB.setPrice(productB.getPrice() - 30);
        productsMapper.updateById(productB);


        // 老板视角看价格
        Products boos = productsMapper.selectById(1);
        System.out.println("老板查询到的价格：" + boos.getPrice());
    }


    // 枚举类型
    @Test
    void testEnum() {
        Products product = new Products();
        product.setGoodName("联想");
        product.setPrice(3699);
        product.setVersion(0);
        product.setStatus(StatusEnum.EXIST);
        productsMapper.insert(product);
    }


}
