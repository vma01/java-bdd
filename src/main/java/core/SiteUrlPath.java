package core;

public enum SiteUrlPath {
    CONTACT_PAGE_URL("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

    private String getUrl;

    SiteUrlPath(String siteInfo) {
        this.getUrl = siteInfo;
    }

    public String getUrl() {
        return getUrl;
    }
}
