package com.v2fly.v2shop.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.v2fly.v2shop.common.utils.PageUtils;
import com.v2fly.v2shop.common.utils.Query;

import com.v2fly.v2shop.product.dao.CategoryDao;
import com.v2fly.v2shop.product.entity.CategoryEntity;
import com.v2fly.v2shop.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTrss() {
        //1.获取所有分类数据
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.组装成父子结构
        List<CategoryEntity> level1Menues = categoryEntities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu)->{
            menu.setChildren(getChildrens(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());
        return  level1Menues;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1.检查当前菜单是否被引用

        //
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){

        List<CategoryEntity> childrens = all.stream().filter(item -> {
            return item.getParentCid() == root.getCatId();
        }).map(item -> {
            item.setChildren(getChildrens(item, all));
            return item;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() ==null ? 0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return childrens;

    }
}