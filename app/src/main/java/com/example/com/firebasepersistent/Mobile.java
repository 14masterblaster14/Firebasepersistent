package com.example.com.firebasepersistent;

/**
 * Created by comp on 4/1/2017.
 */

public class Mobile {
    private Long mobId;
    private String name;
    private String imei;

    public Long getMobId() {
        return mobId;
    }

    public void setMobId(Long mobId) {
        this.mobId = mobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void values(Long id, String name, String imei) {
        this.mobId = id;
        this.name = name;
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobId=" + mobId +
                ", name='" + name + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }
}
