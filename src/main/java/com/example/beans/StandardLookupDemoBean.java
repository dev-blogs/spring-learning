package com.example.beans;

public class StandardLookupDemoBean implements DemoBean {
    private MyHelper myHelper;

    public void setMyHelper(MyHelper myHelper) {
        this.myHelper = myHelper;
    }

    @Override
    public MyHelper getMyHelper() {
        return null;
    }

    @Override
    public void someOperation() {
        this.myHelper.doIt("Standard lookup demo bean");
    }
}
