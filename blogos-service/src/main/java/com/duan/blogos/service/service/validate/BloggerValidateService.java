package com.duan.blogos.service.service.validate;

/**
 * Created on 2018/9/13.
 *
 * @author DuanJiaNing
 */
public interface BloggerValidateService {

    /**
     * 检查博主是否存在
     *
     * @param id 博主id
     * @return 存在返回true
     */
    boolean checkAccountExist(int id);

    /**
     * 检查博文类别是否存在
     *
     * @param bloggerId  博主id
     * @param categoryId 类别id
     * @return 存在时返回true
     */
    boolean checkBloggerBlogCategoryExist(int bloggerId, int categoryId);

    /**
     * 检查博主是否有权限操纵（新增，更新，删除）某些类别图片
     *
     * @param bloggerId 博主id
     * @param category  图片类别
     * @return 可以操纵返回true
     */
    boolean checkBloggerPictureLegal(int bloggerId, int category);

    /**
     * 检查当前博主是否登录
     *
     * @param bloggerId 博主id
     * @return 登录返回true
     */
    // TODO redis 中操作
    boolean checkBloggerSignIn(Integer bloggerId);

    /**
     * 检查博主是否有指定图片
     *
     * @param bloggerId 博主id
     * @param pictureId 图片id
     * @return 有返回true
     */
    boolean checkBloggerPictureExist(int bloggerId, int pictureId);

    /**
     * 注册时检查用户名合法性
     *
     * @param username 用户名
     * @return 合法返回true
     */
    boolean checkUserName(String username);

    /**
     * 校验密码：6-12 为，由字母和数字组成
     *
     * @param password 密码
     * @return 合法返回true
     */
    boolean checkPassword(String password);

    /**
     * 检查博主主页个人信息栏位置，0 在左，1 在右
     *
     * @param mainPageNavPos 位置
     * @return 非 0 或 1 时返回 false
     */
    boolean checkMainPageNavPos(int mainPageNavPos);

}
