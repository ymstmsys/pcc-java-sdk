package jp.primecloud.auto.sdk.model.platform;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Platform {

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("PlatformName")
    private String platformName;

    @JsonProperty("Internal")
    private Boolean internal;

    @JsonProperty("PlatformType")
    private String platformType;

    @JsonProperty("Aws")
    private PlatformAws aws;

    @JsonProperty("Vmware")
    private PlatformVmware vmware;

    @JsonProperty("Nifty")
    private PlatformNifty nifty;

    @JsonProperty("Cloudstack")
    private PlatformCloudstack cloudstack;

    @JsonProperty("Vcloud")
    private PlatformVcloud vcloud;

    @JsonProperty("Openstack")
    private PlatformOpenstack openstack;

    @JsonProperty("Azure")
    private PlatformAzure azure;

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public PlatformAws getAws() {
        return aws;
    }

    public void setAws(PlatformAws aws) {
        this.aws = aws;
    }

    public PlatformVmware getVmware() {
        return vmware;
    }

    public void setVmware(PlatformVmware vmware) {
        this.vmware = vmware;
    }

    public PlatformNifty getNifty() {
        return nifty;
    }

    public void setNifty(PlatformNifty nifty) {
        this.nifty = nifty;
    }

    public PlatformCloudstack getCloudstack() {
        return cloudstack;
    }

    public void setCloudstack(PlatformCloudstack cloudstack) {
        this.cloudstack = cloudstack;
    }

    public PlatformVcloud getVcloud() {
        return vcloud;
    }

    public void setVcloud(PlatformVcloud vcloud) {
        this.vcloud = vcloud;
    }

    public PlatformOpenstack getOpenstack() {
        return openstack;
    }

    public void setOpenstack(PlatformOpenstack openstack) {
        this.openstack = openstack;
    }

    public PlatformAzure getAzure() {
        return azure;
    }

    public void setAzure(PlatformAzure azure) {
        this.azure = azure;
    }

}
