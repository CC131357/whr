package com.whr.common.exception.user;

/**
 * 用户锁定异常类
 * 
 * @author numberone
 */
public class UserBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserBlockedException()
    {
        super("user.blocked", null);
    }
}