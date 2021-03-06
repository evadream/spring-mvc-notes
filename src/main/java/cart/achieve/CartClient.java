/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package cart.achieve;

import cart.CartRequest;
import cart.CartResponse;
import cart.ICartClinet;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.StringUtils;

/**
 * CartClient
 *
 * @author huangtao
 * @date 2017/9/29
 * desc：
 */
public class CartClient implements ICartClinet, ApplicationContextAware {
    private ApplicationContext applicationContext;

    public <T extends CartResponse> T execute(CartRequest<T> cartRequest) {
        String beanName = getBeanName(cartRequest.getClass());
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    private String getBeanName(Class z) {
        return StringUtils.replace(z.getSimpleName(), "", "");
    }
}

    