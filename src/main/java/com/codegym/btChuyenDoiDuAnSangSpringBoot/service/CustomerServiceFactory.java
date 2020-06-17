package com.codegym.btChuyenDoiDuAnSangSpringBoot.service;

import com.codegym.btChuyenDoiDuAnSangSpringBoot.service.impl.SimpleCustomerServiceImpl;

public class CustomerServiceFactory {
    private static CustomerService singleton;

    public static synchronized CustomerService getInstance() {
        if (singleton == null) {
            singleton = new SimpleCustomerServiceImpl();
        }
        return singleton;
    }
}
