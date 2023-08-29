package com.example.beans;

public abstract class AbstractLookupDemoBean implements DemoBean {
    @Override
    public abstract MyHelper getMyHelper();

    @Override
    public void someOperation() {
        getMyHelper().doIt("Abstract lookup demo bean");
    }
}
