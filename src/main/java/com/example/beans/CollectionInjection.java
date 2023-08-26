package com.example.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private Map<String, Object> map;
    private Set set;
    private List list;
    private Properties props;

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Map<String, Object> getMap() {
        return this.map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "CollectionInjection{" +
                "map=" + map +
                ", set=" + set +
                ", list=" + list +
                ", props=" + props +
                '}';
    }
}
