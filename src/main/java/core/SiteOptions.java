package core;

public enum SiteOptions {
    SUCCESSFUL_MESSAGE("Thank You for your Message!");

    private String siteOptions;

    SiteOptions(String siteInfo) {
        this.siteOptions = siteInfo;
    }

    public String getSiteOptions() {
        return siteOptions;
    }
}
