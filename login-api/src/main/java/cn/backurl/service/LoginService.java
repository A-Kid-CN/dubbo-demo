package cn.backurl.service;

/**
* <p>
* 登录接口业务类
* </p>
* @author: akid
* @create: 2019-05-26 01:02
*/
public interface LoginService {
    /**
     * <p>
     * 功能描述: 获取用户登录信息
     * </p>
     * @param id
     * @Author: akid
     * @Date: 2019-05-26 01:03
     * @Return: java.lang.String
     */
    String getLoginUser(Long id);
}
