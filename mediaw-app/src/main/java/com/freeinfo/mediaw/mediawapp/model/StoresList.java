package com.freeinfo.mediaw.mediawapp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class StoresList {

    private List<Store> stores = new ArrayList<>();

    @JsonAnySetter
    public void setStore(String name, Store s) {
        this.stores.add(s);
    }

    public List<Store> getStores() {
        return stores;
    }

}
