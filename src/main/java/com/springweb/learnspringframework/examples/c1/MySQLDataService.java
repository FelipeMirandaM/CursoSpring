package com.springweb.learnspringframework.examples.c1;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements IDataService{
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
