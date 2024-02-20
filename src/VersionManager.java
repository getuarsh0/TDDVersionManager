public class VersionManager {
    private int major;
    private int minor;
    private int patch;

    public VersionManager() {

        this.major = 100;
        this.minor = 10;
        this.patch = 1;
    }

    public void major() {
        this.major++;
        this.minor = 0;
        this.patch = 0;
    }

    public void minor() {
        this.minor++;
        this.patch = 0;
    }

    public void patch() {
        this.patch++;
    }

    public String getVersion() {
        return major + "." + minor + "." + patch;
    }

    public void setVersion(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }
}
