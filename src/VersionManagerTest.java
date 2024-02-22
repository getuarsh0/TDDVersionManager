import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VersionManagerTest {

    private VersionManager vm;


    @BeforeEach
    void setUp() {
        vm = new VersionManager();
    }
    @Test
    void major() {
        vm.major();
        assertEquals("101.0.0", vm.getVersion(), "Major version increment failed.");
    }

    @Test
    void minor() {
        vm.minor();
        assertEquals("100.11.0", vm.getVersion(), "Minor version increment failed.");
    }

    @Test
    void patch() {
        vm.patch();
        assertEquals("100.10.2", vm.getVersion(), "Patch version increment failed.");
    }

    @Test
    void getVersion() {
        assertEquals("100.10.1", vm.getVersion(), "Initial version is incorrect.");

    }

    @Test
    void setVersion() {
        vm.setVersion(2, 1, 1);
        assertEquals("2.1.1", vm.getVersion(), "Setting version failed.");

    }

    @Test
    void reset() {
        vm.reset();
        assertEquals("0.0.0", vm.getVersion(), "Reset version failed.");
    }
}