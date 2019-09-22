package utils.constant;

public enum SiteOption {
    SUCCESSFUL_MESSAGE("Thank You for your Message!");

    private String siteOption;

    SiteOption(String siteInfo) {
        this.siteOption = siteInfo;
    }

    public String getSiteOption() {
        return siteOption;
    }
}
