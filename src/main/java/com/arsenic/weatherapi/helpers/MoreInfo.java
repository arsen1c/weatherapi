package com.arsenic.weatherapi.helpers;

import java.util.HashMap;

public class MoreInfo {
    HashMap<String, String> details;

    public HashMap<String, String> getMoreInfo() {
        return details;
    }

    public MoreInfo(HashMap<String, String> moreInfo) {
        this.details = moreInfo;
    }
}
