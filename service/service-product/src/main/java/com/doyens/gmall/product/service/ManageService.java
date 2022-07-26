package com.doyens.gmall.product.service;

import com.doyens.gmall.model.product.*;

import java.util.List;

public interface ManageService {


    //查询所有的一级分类信息
    List<BaseCategory1> getCategory1();
    //根据一级分类Id 查询二级分类数据
    List<BaseCategory2> getCategory2(Long category1Id);
    //根据二级分类Id 查询三级分类数据
    List<BaseCategory3> getCategory3(Long category2Id);

    List<BaseAttrInfo> getAttrInfoList(Long category1Id,Long category2Id,Long category3Id);


    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    List<BaseAttrValue> getAttrValueList(Long attrId);

    BaseAttrInfo getBaseAttrInfo(Long attrId);
}
