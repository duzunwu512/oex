package com.gzl.dge.common.exception;


/**
 * 演示模式异常
 * 
 * @author ruoyi
 */
public class BusinessException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public BusinessException()
    {
    }
    public BusinessException(String msg)
    {
        this(msg, null);
    }

    public BusinessException(String msg, Exception nestedEx)
    {
        super(msg, nestedEx);
    }
}
